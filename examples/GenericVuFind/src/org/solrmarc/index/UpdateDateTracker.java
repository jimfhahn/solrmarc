package org.solrmarc.index;
/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.IOException;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class UpdateDateTracker
{
    private Connection db;
    private String core;
    private String id;
    private static SimpleDateFormat iso8601 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    private Timestamp firstIndexed;
    private Timestamp lastIndexed;
    private Timestamp lastRecordChange;

    /* Private support method: create a row in the change_tracker table.
     */
    private void createRow(Timestamp newRecordChange) throws SQLException
    {
        // Save new values to the object:
        java.util.Date rightNow = new java.util.Date();
        firstIndexed = lastIndexed = new Timestamp(rightNow.getTime());
        lastRecordChange = newRecordChange;
        
        // Save new values to the database:
        PreparedStatement sql = db.prepareStatement(
            "INSERT INTO change_tracker(core, id, first_indexed, last_indexed, last_record_change) " +
            "VALUES(?, ?, ?, ?, ?);");
        sql.setString(1, core);
        sql.setString(2, id);
        sql.setTimestamp(3, firstIndexed);
        sql.setTimestamp(4, lastIndexed);
        sql.setTimestamp(5, lastRecordChange);
        sql.executeUpdate();
    }

    /* Private support method: read a row from the change_tracker table.
     */
    private boolean readRow() throws SQLException
    {
        PreparedStatement sql = db.prepareStatement(
            "SELECT first_indexed, last_indexed, last_record_change " +
            "FROM change_tracker WHERE core = ? AND id = ?;");
        sql.setString(1, core);
        sql.setString(2, id);
        ResultSet result = sql.executeQuery();
        
        // No results?  Return false:
        if (!result.first()) {
            return false;
        }
        
        // If we got this far, we have results -- load them into the object:
        firstIndexed = result.getTimestamp(1);
        lastIndexed = result.getTimestamp(2);
        lastRecordChange = result.getTimestamp(3);
        return true;
    }

    /* Private support method: update a row in the change_tracker table.
     */
    private void updateRow(Timestamp newRecordChange) throws SQLException
    {
        // Save new values to the object:
        java.util.Date rightNow = new java.util.Date();
        lastIndexed = new Timestamp(rightNow.getTime());
        lastRecordChange = newRecordChange;

        // Save new values to the database:
        PreparedStatement sql = db.prepareStatement(
            "UPDATE change_tracker SET last_indexed = ?, last_record_change = ?, deleted = ? " +
            "WHERE core = ? AND id = ?;");
        sql.setTimestamp(1, lastIndexed);
        sql.setTimestamp(2, lastRecordChange);
        sql.setNull(3, java.sql.Types.NULL);
        sql.setString(4, core);
        sql.setString(5, id);
        sql.executeUpdate();
    }

    /* Constructor:
     */
    public UpdateDateTracker(Connection dbConnection)
    {
        db = dbConnection;
    }

    /* Get the first indexed date (IMPORTANT: index() must be called before this method)
     */
    public String getFirstIndexed()
    {
        return iso8601.format(new java.util.Date(firstIndexed.getTime()));
    }

    /* Get the last indexed date (IMPORTANT: index() must be called before this method)
     */
    public String getLastIndexed()
    {
        return iso8601.format(new java.util.Date(lastIndexed.getTime()));
    }

    /* Update the database to indicate that the record has just been received by the indexer:
     */
    public void index(String selectedCore, String selectedId, java.util.Date recordChange) throws SQLException
    {
        // If core and ID match the values currently in the class, we have already
        // indexed the record and do not need to repeat ourselves!
        if (core == selectedCore && id == selectedId) {
            return;
        }

        // If we made it this far, we need to update the database, so let's store
        // the current core/ID pair we are operating on:
        core = selectedCore;
        id = selectedId;

        // Convert incoming java.util.Date to a Timestamp:
        Timestamp newRecordChange = new Timestamp(recordChange.getTime());

        // No row?  Create one!
        if (!readRow()) {
            createRow(newRecordChange);
        // Row already exists?  See if it needs to be updated:
        } else {
            // Was stored record change date before current record change date?
            if (lastRecordChange.getTime() < newRecordChange.getTime()) {
                updateRow(newRecordChange);
            }
        }
    }
}