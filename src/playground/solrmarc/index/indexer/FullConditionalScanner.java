/* The following code was generated by JFlex 1.4.3 on 5/19/16 1:52 PM */

package playground.solrmarc.index.indexer;

import java_cup.runtime.SymbolFactory;
import java.util.List;
import java.util.ArrayList;
//import java.io.StringReader;
import playground.solrmarc.index.utils.StringReader;
import java_cup.runtime.ComplexSymbolFactory;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 5/19/16 1:52 PM from the specification file
 * <tt>C:/Users/rh9ec/Development/Projects/SolrMarc3.0-Github/src/playground/solrmarc/index/indexer/FullScanner.lex</tt>
 */
public class FullConditionalScanner extends playground.solrmarc.index.indexer.FullSym implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int CONSTANT = 18;
  public static final int SUBFIELDSPEC = 8;
  public static final int CUSTOMSPEC = 10;
  public static final int MAPSPEC = 16;
  public static final int STRING = 4;
  public static final int CUSTOMPARAM = 14;
  public static final int YYINITIAL = 0;
  public static final int STARTSPEC = 2;
  public static final int CONDITIONAL = 6;
  public static final int CUSTOMMETHOD = 12;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7,  8,  8, 
     9,  9, 10, 10
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\5\1\4\1\0\1\5\1\3\22\0\1\5\1\71\1\57"+
    "\1\45\1\67\1\0\1\77\1\100\1\61\1\62\2\0\1\43\1\42"+
    "\2\7\1\1\1\70\1\22\7\2\1\53\1\0\1\74\1\44\1\76"+
    "\1\54\1\0\1\32\4\52\1\25\2\52\1\40\1\52\1\51\1\47"+
    "\1\52\1\50\1\33\1\35\1\52\1\27\4\52\1\75\3\52\1\63"+
    "\1\101\1\65\1\64\1\41\1\0\1\14\1\36\1\30\1\31\1\24"+
    "\1\34\1\6\1\73\1\37\1\16\1\6\1\12\1\11\1\21\1\20"+
    "\1\55\1\6\1\13\1\17\1\23\1\26\1\56\1\15\1\10\2\6"+
    "\1\46\1\60\1\66\1\72\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\13\0\1\1\2\2\1\3\1\4\1\5\1\6\13\1"+
    "\1\7\1\10\1\1\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\2\17\5\1\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\1\1\27\1\1\1\30\1\31\1\32"+
    "\1\33\1\34\1\1\1\35\1\36\1\37\1\1\1\40"+
    "\1\1\1\41\1\42\1\43\1\17\1\44\1\45\1\1"+
    "\15\0\1\46\1\47\1\50\1\51\6\0\1\21\1\24"+
    "\1\0\1\52\1\53\1\34\4\0\1\54\1\0\1\54"+
    "\1\55\1\56\10\0\1\55\1\57\6\0\1\60\1\61"+
    "\1\0\1\35\1\54\1\62\1\56\3\0\1\63\6\0"+
    "\1\64\1\65\1\0\1\66\1\54\12\0\1\54\1\67"+
    "\1\0\1\70\7\0\1\54\15\0\1\71\1\54\5\0"+
    "\1\54\3\0\1\63\1\72\3\0\1\56\12\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[212];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\102\0\204\0\306\0\u0108\0\u014a\0\u018c\0\u01ce"+
    "\0\u0210\0\u0252\0\u0294\0\u02d6\0\u0318\0\u02d6\0\u035a\0\u02d6"+
    "\0\u02d6\0\u039c\0\u03de\0\u0420\0\u0462\0\u04a4\0\u04e6\0\u0528"+
    "\0\u056a\0\u05ac\0\u05ee\0\u0630\0\u0672\0\u02d6\0\u02d6\0\u06b4"+
    "\0\u02d6\0\u02d6\0\u02d6\0\u06f6\0\u02d6\0\u0738\0\u077a\0\u07bc"+
    "\0\u07fe\0\u0840\0\u0882\0\u08c4\0\u0906\0\u02d6\0\u0948\0\u02d6"+
    "\0\u02d6\0\u098a\0\u02d6\0\u02d6\0\u09cc\0\u02d6\0\u0a0e\0\u0a50"+
    "\0\u02d6\0\u02d6\0\u02d6\0\u0a92\0\u0ad4\0\u0b16\0\u02d6\0\u02d6"+
    "\0\u0b58\0\u02d6\0\u0b9a\0\u02d6\0\u02d6\0\u02d6\0\u0b9a\0\u02d6"+
    "\0\u02d6\0\u0bdc\0\u0c1e\0\u0c60\0\u0ca2\0\u0ce4\0\u0d26\0\u0d68"+
    "\0\u0daa\0\u0dec\0\u0e2e\0\u0e70\0\u0eb2\0\u0ef4\0\u0f36\0\u02d6"+
    "\0\u02d6\0\u02d6\0\u02d6\0\u0f78\0\u0fba\0\u0ffc\0\u103e\0\u1080"+
    "\0\u10c2\0\u02d6\0\u02d6\0\u1104\0\u02d6\0\u02d6\0\u02d6\0\u1146"+
    "\0\u1188\0\u11ca\0\u120c\0\u0b9a\0\u0b9a\0\u124e\0\u02d6\0\u02d6"+
    "\0\u1290\0\u12d2\0\u1314\0\u1356\0\u1398\0\u13da\0\u141c\0\u145e"+
    "\0\u14a0\0\u02d6\0\u14e2\0\u1524\0\u1566\0\u15a8\0\u15ea\0\u162c"+
    "\0\u02d6\0\u02d6\0\u166e\0\u02d6\0\u16b0\0\u02d6\0\u16f2\0\u1734"+
    "\0\u1776\0\u17b8\0\u17fa\0\u183c\0\u03de\0\u187e\0\u18c0\0\u1902"+
    "\0\u1944\0\u02d6\0\u02d6\0\u1986\0\u02d6\0\u19c8\0\u1a0a\0\u1a4c"+
    "\0\u1a8e\0\u1ad0\0\u1b12\0\u1b54\0\u1b96\0\u1bd8\0\u1c1a\0\u1c5c"+
    "\0\u1c9e\0\u02d6\0\u1ce0\0\u02d6\0\u1d22\0\u1d64\0\u1da6\0\u1de8"+
    "\0\u1e2a\0\u1e6c\0\u1eae\0\u1ef0\0\u1f32\0\u1f74\0\u1fb6\0\u1ff8"+
    "\0\u203a\0\u207c\0\u20be\0\u2100\0\u2142\0\u2184\0\u21c6\0\u2208"+
    "\0\u224a\0\u02d6\0\u228c\0\u22ce\0\u2310\0\u2352\0\u2394\0\u23d6"+
    "\0\u2418\0\u245a\0\u249c\0\u24de\0\u02d6\0\u0b9a\0\u2520\0\u2562"+
    "\0\u25a4\0\u25e6\0\u2628\0\u266a\0\u26ac\0\u26ee\0\u2730\0\u2772"+
    "\0\u27b4\0\u27f6\0\u2838\0\u287a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[212];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\3\14\1\15\2\16\1\17\1\14\12\17\1\14\16\17"+
    "\2\14\1\20\1\21\2\14\4\17\2\14\2\17\14\14"+
    "\1\17\1\14\1\17\7\14\1\15\2\16\1\17\1\14"+
    "\12\17\1\14\16\17\2\14\1\20\1\21\1\22\1\14"+
    "\4\17\2\14\2\17\14\14\1\17\1\14\1\17\5\14"+
    "\2\23\1\15\2\16\2\14\1\24\2\14\1\25\2\14"+
    "\1\26\1\27\2\14\1\23\1\30\1\14\1\31\1\14"+
    "\1\32\1\33\1\34\2\32\1\14\1\32\1\14\1\35"+
    "\1\32\2\14\1\36\2\14\1\37\1\40\3\32\1\41"+
    "\1\42\2\14\1\43\10\14\1\23\4\14\1\32\4\14"+
    "\3\44\2\14\52\44\1\45\21\44\1\46\1\14\1\47"+
    "\1\50\1\15\2\16\3\14\1\51\5\14\1\52\2\14"+
    "\1\50\1\14\1\53\3\14\1\54\6\14\1\55\3\14"+
    "\1\56\1\57\6\14\1\60\3\14\1\61\1\62\1\63"+
    "\1\64\1\65\2\14\1\66\1\67\1\50\1\70\1\71"+
    "\1\14\1\72\1\14\1\73\1\74\1\75\4\14\1\15"+
    "\2\16\1\76\1\14\12\76\1\14\2\76\1\14\1\76"+
    "\1\14\2\76\2\14\1\76\1\14\2\76\3\14\1\56"+
    "\7\14\1\77\1\100\2\76\4\14\1\101\2\14\1\102"+
    "\4\14\1\76\7\14\2\103\1\15\2\16\1\103\1\14"+
    "\31\103\2\14\1\104\3\14\4\103\2\14\2\103\2\14"+
    "\1\63\1\64\5\14\1\103\2\14\1\103\1\14\1\103"+
    "\5\14\2\103\1\15\2\16\1\103\1\14\31\103\2\14"+
    "\1\105\3\14\4\103\2\14\2\103\2\14\1\106\6\14"+
    "\1\103\2\14\1\103\1\14\1\103\5\14\2\107\1\15"+
    "\2\16\1\103\1\14\12\103\1\107\16\103\2\14\1\20"+
    "\3\14\4\103\2\14\2\103\1\110\1\14\1\63\1\111"+
    "\5\14\1\107\2\14\1\103\1\14\1\103\5\14\2\103"+
    "\1\15\2\16\1\103\1\14\20\103\1\112\10\103\2\14"+
    "\1\20\3\14\4\103\2\14\2\103\2\14\1\106\1\64"+
    "\5\14\1\103\2\14\1\103\1\14\1\103\7\14\1\15"+
    "\2\16\35\14\1\56\13\14\1\43\1\62\21\14\106\0"+
    "\1\16\76\0\2\17\3\0\1\17\1\0\33\17\4\0"+
    "\4\17\2\0\2\17\11\0\1\17\2\0\1\17\1\0"+
    "\1\17\4\0\4\22\1\0\75\22\1\0\2\113\17\0"+
    "\1\113\45\0\1\113\22\0\1\114\104\0\1\115\101\0"+
    "\1\116\2\0\1\117\112\0\1\120\75\0\1\121\102\0"+
    "\1\122\1\123\1\122\2\0\2\122\1\0\1\122\2\0"+
    "\1\122\6\0\4\122\22\0\1\122\31\0\1\122\1\0"+
    "\1\122\2\0\2\122\1\0\1\122\2\0\1\122\6\0"+
    "\4\122\22\0\1\122\32\0\1\124\67\0\1\125\106\0"+
    "\1\126\105\0\1\122\1\0\1\122\2\0\2\122\1\0"+
    "\1\122\2\0\1\122\6\0\1\122\1\127\2\122\22\0"+
    "\1\122\4\0\3\44\2\0\52\44\1\0\21\44\14\0"+
    "\1\130\5\0\1\131\1\0\1\132\33\0\1\133\23\0"+
    "\1\134\101\0\2\50\17\0\1\50\45\0\1\50\25\0"+
    "\1\135\110\0\1\136\77\0\1\137\100\0\1\140\102\0"+
    "\1\141\124\0\1\142\115\0\1\143\22\0\2\144\17\0"+
    "\1\144\45\0\1\144\12\0\2\145\3\0\1\145\1\0"+
    "\31\145\6\0\4\145\2\0\2\145\11\0\1\145\2\0"+
    "\1\145\1\0\1\145\50\0\1\146\134\0\1\147\2\0"+
    "\101\150\1\151\1\0\2\76\3\0\1\76\1\0\15\76"+
    "\1\0\1\76\1\0\2\76\2\0\1\76\1\0\2\76"+
    "\15\0\2\76\11\0\1\76\2\0\1\76\7\0\2\144"+
    "\3\0\1\152\1\0\12\152\1\144\2\152\1\0\1\152"+
    "\1\0\2\152\2\0\1\152\1\0\2\152\15\0\2\152"+
    "\5\0\1\153\3\0\1\144\2\0\1\152\7\0\2\154"+
    "\3\0\1\154\1\155\31\154\1\155\5\0\4\154\2\0"+
    "\2\154\11\0\1\154\2\0\1\154\1\0\1\154\3\0"+
    "\1\155\1\0\2\154\3\0\1\154\1\155\16\154\1\156"+
    "\12\154\1\155\5\0\4\154\2\0\2\154\11\0\1\154"+
    "\2\0\1\154\1\0\1\154\3\0\1\155\1\0\2\157"+
    "\17\0\1\157\45\0\1\157\23\0\1\160\104\0\1\160"+
    "\142\0\1\161\43\0\1\162\74\0\1\163\76\0\1\164"+
    "\116\0\1\157\1\0\1\157\2\0\2\157\1\0\1\157"+
    "\2\0\1\157\6\0\4\157\22\0\1\157\16\0\1\165"+
    "\106\0\1\166\105\0\1\167\107\0\1\170\75\0\1\157"+
    "\1\0\1\157\2\0\2\157\1\0\1\157\2\0\1\157"+
    "\6\0\2\157\1\171\1\157\22\0\1\157\5\0\2\172"+
    "\17\0\1\172\45\0\1\172\34\0\1\173\72\0\1\174"+
    "\116\0\1\175\71\0\1\176\111\0\1\177\51\0\2\144"+
    "\17\0\1\144\17\0\1\200\22\0\1\201\2\0\1\144"+
    "\111\0\1\202\1\0\4\203\1\0\75\203\1\0\2\152"+
    "\3\0\1\152\1\0\15\152\1\0\1\152\1\0\2\152"+
    "\2\0\1\152\1\0\2\152\2\0\1\152\12\0\2\152"+
    "\6\0\1\204\2\0\1\152\2\0\1\152\14\0\1\152"+
    "\1\0\12\152\1\0\2\152\1\0\1\152\1\0\2\152"+
    "\2\0\1\152\1\0\2\152\15\0\2\152\14\0\1\152"+
    "\7\0\2\154\3\0\1\154\1\155\7\154\1\205\21\154"+
    "\1\155\5\0\4\154\2\0\2\154\11\0\1\154\2\0"+
    "\1\154\1\0\1\154\3\0\1\155\14\0\1\206\106\0"+
    "\1\207\117\0\1\210\65\0\1\160\70\0\1\211\112\0"+
    "\1\212\102\0\1\213\101\0\1\214\56\0\2\215\17\0"+
    "\1\215\45\0\1\215\41\0\1\216\64\0\1\217\105\0"+
    "\1\220\105\0\1\221\57\0\2\222\17\0\1\223\45\0"+
    "\1\223\12\0\2\224\17\0\1\224\45\0\1\224\111\0"+
    "\1\225\2\0\2\154\3\0\1\154\1\155\13\154\1\226"+
    "\15\154\1\155\5\0\4\154\2\0\2\154\11\0\1\154"+
    "\2\0\1\154\1\0\1\154\3\0\1\155\22\0\1\160"+
    "\134\0\1\227\53\0\1\230\72\0\1\231\110\0\1\232"+
    "\3\0\1\233\56\0\1\234\164\0\1\235\31\0\1\236"+
    "\153\0\1\237\20\0\1\240\66\0\2\224\17\0\1\224"+
    "\42\0\1\201\2\0\1\224\12\0\2\154\3\0\1\154"+
    "\1\155\10\154\1\241\20\154\1\155\5\0\4\154\2\0"+
    "\2\154\11\0\1\154\2\0\1\154\1\0\1\154\3\0"+
    "\1\155\23\0\1\242\102\0\1\243\66\0\1\244\114\0"+
    "\1\245\111\0\1\246\106\0\1\247\64\0\1\250\74\0"+
    "\1\251\121\0\1\252\101\0\1\253\43\0\2\154\3\0"+
    "\1\154\1\155\1\154\1\254\27\154\1\155\5\0\4\154"+
    "\2\0\2\154\11\0\1\154\2\0\1\154\1\0\1\154"+
    "\3\0\1\155\30\0\1\255\101\0\1\256\106\0\1\257"+
    "\75\0\1\260\67\0\1\71\157\0\1\261\27\0\1\262"+
    "\77\0\1\263\61\0\2\154\3\0\1\154\1\155\31\154"+
    "\1\264\5\0\4\154\2\0\2\154\11\0\1\154\2\0"+
    "\1\154\1\0\1\154\3\0\1\155\20\0\1\265\101\0"+
    "\1\266\107\0\1\267\67\0\1\270\124\0\1\271\135\0"+
    "\1\73\25\0\1\272\63\0\2\154\3\0\1\154\1\155"+
    "\1\154\1\273\27\154\1\155\5\0\4\154\2\0\2\154"+
    "\11\0\1\154\2\0\1\154\1\0\1\154\3\0\1\155"+
    "\13\0\1\274\101\0\1\275\124\0\1\276\66\0\1\277"+
    "\101\0\1\300\57\0\2\154\3\0\1\154\1\155\4\154"+
    "\1\301\24\154\1\155\5\0\4\154\2\0\2\154\11\0"+
    "\1\154\2\0\1\154\1\0\1\154\3\0\1\155\31\0"+
    "\1\302\101\0\1\303\62\0\1\304\113\0\1\305\150\0"+
    "\1\72\7\0\2\154\3\0\1\154\1\155\31\154\1\155"+
    "\5\0\4\154\2\0\1\306\1\154\11\0\1\154\2\0"+
    "\1\154\1\0\1\154\3\0\1\155\32\0\1\307\107\0"+
    "\1\310\100\0\1\311\61\0\1\312\103\0\1\313\110\0"+
    "\1\314\52\0\2\312\3\0\1\312\1\0\31\312\6\0"+
    "\4\312\2\0\2\312\11\0\1\312\2\0\1\312\1\0"+
    "\1\312\35\0\1\315\64\0\1\316\111\0\1\317\100\0"+
    "\1\320\66\0\1\321\130\0\1\322\66\0\1\323\75\0"+
    "\1\324\112\0\1\305\71\0\1\305\60\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10428];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\13\0\1\11\1\1\1\11\1\1\2\11\14\1\2\11"+
    "\1\1\3\11\1\1\1\11\10\1\1\11\1\1\2\11"+
    "\1\1\2\11\1\1\1\11\2\1\3\11\3\1\2\11"+
    "\1\1\1\11\1\1\3\11\1\1\2\11\1\1\15\0"+
    "\4\11\6\0\2\11\1\0\3\11\4\0\1\1\1\0"+
    "\1\1\2\11\10\0\1\1\1\11\6\0\2\11\1\0"+
    "\1\11\1\1\1\11\1\1\3\0\1\1\6\0\2\11"+
    "\1\0\1\11\1\1\12\0\1\1\1\11\1\0\1\11"+
    "\7\0\1\1\15\0\1\11\1\1\5\0\1\1\3\0"+
    "\1\11\1\1\3\0\1\1\12\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[212];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    int save_zzLexicalState;
    
    List<String> scanner_errors = null;
    StringBuilder string = new StringBuilder();
    public FullConditionalScanner(ComplexSymbolFactory sf)
    {
		this(new StringReader(""));
		this.sf = sf;
		scanner_errors = new ArrayList<String>();
    }
    
    SymbolFactory sf;
    
    public void startParse(String strToParse)
    {
        yyreset(new StringReader(strToParse));
        scanner_errors = new ArrayList<String>();
    }
    
    private void error(String message) 
    {
        scanner_errors.add(message);
    }
    
    public List<String> getScannerErrors()
    {
    	return(scanner_errors);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public FullConditionalScanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public FullConditionalScanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 170) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      if (zzMarkedPosL > zzStartRead) {
        switch (zzBufferL[zzMarkedPosL-1]) {
        case '\n':
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          zzAtBOL = true;
          break;
        case '\r': 
          if (zzMarkedPosL < zzEndReadL)
            zzAtBOL = zzBufferL[zzMarkedPosL] != '\n';
          else if (zzAtEOF)
            zzAtBOL = false;
          else {
            boolean eof = zzRefill();
            zzMarkedPosL = zzMarkedPos;
            zzEndReadL = zzEndRead;
            zzBufferL = zzBuffer;
            if (eof) 
              zzAtBOL = false;
            else 
              zzAtBOL = zzBufferL[zzMarkedPosL] != '\n';
          }
          break;
        default:
          zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
        zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 2: 
          { /* ignore */
          }
        case 59: break;
        case 21: 
          { return sf.newSymbol("(",FullSym.LPAREN);
          }
        case 60: break;
        case 52: 
          { error("Illegal indicator specification <"+ yytext()+">");
          }
        case 61: break;
        case 37: 
          { yybegin(MAPSPEC); return sf.newSymbol(")",FullSym.RPAREN);
          }
        case 62: break;
        case 17: 
          { return sf.newSymbol("EQU",FullSym.EQU );
          }
        case 63: break;
        case 22: 
          { return sf.newSymbol(")",FullSym.RPAREN);
          }
        case 64: break;
        case 6: 
          { /* ignore as comment */
          }
        case 65: break;
        case 46: 
          { yybegin(MAPSPEC);      return sf.newSymbol("FULLRECORD", FullSym.FULLRECORD, yytext());
          }
        case 66: break;
        case 16: 
          { yybegin(MAPSPEC);  return sf.newSymbol(",", FullSym.COMMA);
          }
        case 67: break;
        case 40: 
          { string.append('\t');
          }
        case 68: break;
        case 18: 
          { yybegin(STARTSPEC);  return sf.newSymbol(":", FullSym.COLON);
          }
        case 69: break;
        case 53: 
          { return sf.newSymbol("IND",FullSym.IND, yytext().substring(3,4));
          }
        case 70: break;
        case 32: 
          { yybegin(STARTSPEC);   return sf.newSymbol("}",FullSym.RBRACE);
          }
        case 71: break;
        case 51: 
          { yybegin(MAPSPEC);      return sf.newSymbol("DATE", FullSym.DATE, yytext());
          }
        case 72: break;
        case 49: 
          { return sf.newSymbol("CHAR",FullSym.CHAR, yytext().substring(1, 2));
          }
        case 73: break;
        case 25: 
          { return sf.newSymbol("MATCH",FullSym.MATCH);
          }
        case 74: break;
        case 42: 
          { return sf.newSymbol("SUBFIELD",FullSym.SUBFIELD, yytext().substring(1,2));
          }
        case 75: break;
        case 55: 
          { yybegin(CUSTOMSPEC);   return sf.newSymbol("SCRIPT", FullSym.SCRIPT, yytext() );
          }
        case 76: break;
        case 14: 
          { string.append('\\');
          }
        case 77: break;
        case 48: 
          { return sf.newSymbol("POSITION", FullSym.POSITION, yytext());
          }
        case 78: break;
        case 38: 
          { string.append('\r');
          }
        case 79: break;
        case 11: 
          { save_zzLexicalState = CONSTANT; string.setLength(0); yybegin(STRING);
          }
        case 80: break;
        case 23: 
          { yybegin(STARTSPEC);  return sf.newSymbol("}", FullSym.RBRACE);
          }
        case 81: break;
        case 10: 
          { yybegin(CONDITIONAL);  return sf.newSymbol("?",FullSym.QUESTION);
          }
        case 82: break;
        case 29: 
          { return sf.newSymbol("SUBFIELDSPEC",FullSym.SUBFIELDSPEC, yytext());
          }
        case 83: break;
        case 35: 
          { yybegin(CUSTOMPARAM); return sf.newSymbol("(",FullSym.LPAREN);
          }
        case 84: break;
        case 24: 
          { return sf.newSymbol("NOT",FullSym.NOT);
          }
        case 85: break;
        case 30: 
          { yybegin(STARTSPEC);   return sf.newSymbol(":",FullSym.COLON);
          }
        case 86: break;
        case 5: 
          { yybegin(STARTSPEC); return sf.newSymbol("EQU", FullSym.EQU );
          }
        case 87: break;
        case 33: 
          { yybegin(CUSTOMMETHOD); return sf.newSymbol(",", FullSym.COMMA);
          }
        case 88: break;
        case 57: 
          { return sf.newSymbol("CONTAINS",FullSym.CONTAINS);
          }
        case 89: break;
        case 41: 
          { string.append('\"');
          }
        case 90: break;
        case 26: 
          { return sf.newSymbol("LE",FullSym.LT);
          }
        case 91: break;
        case 3: 
          { return sf.newSymbol("FIELDNAME", FullSym.FIELDNAME, yytext());
          }
        case 92: break;
        case 8: 
          { return sf.newSymbol("{",FullSym.LBRACE);
          }
        case 93: break;
        case 28: 
          { return sf.newSymbol("AND",FullSym.AND);
          }
        case 94: break;
        case 13: 
          { yybegin(save_zzLexicalState); 
                                   return sf.newSymbol("QUOTEDSTR",FullSym.QUOTEDSTR,string.toString());
          }
        case 95: break;
        case 56: 
          { yybegin(CUSTOMSPEC);   return sf.newSymbol("CUSTOM", FullSym.CUSTOM, yytext() );
          }
        case 96: break;
        case 36: 
          { save_zzLexicalState = CUSTOMPARAM; string.setLength(0); yybegin(STRING);
          }
        case 97: break;
        case 50: 
          { yybegin(CUSTOMSPEC);   return sf.newSymbol("JAVA", FullSym.JAVA, yytext() );
          }
        case 98: break;
        case 54: 
          { return sf.newSymbol("CHAR",FullSym.CHAR, yytext().substring(1, 3));
          }
        case 99: break;
        case 1: 
          { /* throw new Error("Illegal character <"+ yytext()+">");*/
		    		String scannerStateStr = "initial";
		    		switch (yystate() ) {
		    			case YYINITIAL:    scannerStateStr = "initial";      break;
		    			case STARTSPEC:    scannerStateStr = "startspec";    break;
		    			case STRING:       scannerStateStr = "string";       break;
		    			case CONDITIONAL:  scannerStateStr = "conditional";  break; 
		    			case SUBFIELDSPEC: scannerStateStr = "subfield";     break;
		    			case CUSTOMSPEC:   scannerStateStr = "customspec";   break;
		    			case CUSTOMMETHOD: scannerStateStr = "custommethod"; break;
		    			case CUSTOMPARAM:  scannerStateStr = "customparam";  break;
		    			case MAPSPEC:      scannerStateStr = "mapspec";      break;
		    			default:           scannerStateStr = "unknown";      break; 
		    		}
		    		error("Error: Illegal character <"+ yytext()+">  found in scanner state "+ scannerStateStr);
          }
        case 100: break;
        case 39: 
          { string.append('\n');
          }
        case 101: break;
        case 45: 
          { yybegin(SUBFIELDSPEC); return sf.newSymbol("FIELDSPEC",FullSym.FIELDSPEC, yytext());
          }
        case 102: break;
        case 20: 
          { return sf.newSymbol("OR",FullSym.OR);
          }
        case 103: break;
        case 27: 
          { return sf.newSymbol("GT",FullSym.GT);
          }
        case 104: break;
        case 31: 
          { yybegin(CONDITIONAL); return sf.newSymbol("?",FullSym.QUESTION);
          }
        case 105: break;
        case 44: 
          { return sf.newSymbol("IDENTIFIER", FullSym.IDENTIFIER, yytext());
          }
        case 106: break;
        case 47: 
          { return sf.newSymbol("FIELDSPEC", FullSym.FIELDSPEC, yytext());
          }
        case 107: break;
        case 4: 
          { return sf.newSymbol(",", FullSym.COMMA);
          }
        case 108: break;
        case 34: 
          { yybegin(MAPSPEC); return sf.newSymbol(",", FullSym.COMMA);
          }
        case 109: break;
        case 9: 
          { yybegin(STARTSPEC);    return sf.newSymbol(":",FullSym.COLON);
          }
        case 110: break;
        case 58: 
          { return sf.newSymbol("CUSTOM_MAP", FullSym.CUSTOM_MAP, yytext());
          }
        case 111: break;
        case 19: 
          { string.setLength(0); save_zzLexicalState = CONDITIONAL; yybegin(STRING);
          }
        case 112: break;
        case 43: 
          { return sf.newSymbol("NEQ",FullSym.NEQ);
          }
        case 113: break;
        case 15: 
          { return sf.newSymbol("NUMBER",FullSym.NUMBER, yytext());
          }
        case 114: break;
        case 12: 
          { string.append( yytext() );
          }
        case 115: break;
        case 7: 
          { yybegin(MAPSPEC);      return sf.newSymbol(",", FullSym.COMMA);
          }
        case 116: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            switch (zzLexicalState) {
            case STRING: {
              yybegin(save_zzLexicalState); error("Error: End of input encountered in quoted string: "+ string.toString());
            }
            case 213: break;
            default:
              {      return sf.newSymbol("EOF", FullSym.EOF);
 }
            }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}