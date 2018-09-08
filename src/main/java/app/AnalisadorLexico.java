/* The following code was generated by JFlex 1.6.1 */

package app;

import model.Token;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/rafae/eclipse-workspace/AnalizadorLexico/src/main/resources/especificacoes/MiniC.lex</tt>
 */
class AnalisadorLexico {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\1\1\12\1\12\1\2\22\0\1\15\1\22\1\13"+
    "\1\27\2\0\1\25\1\7\1\35\1\36\1\17\1\14\1\27\1\16"+
    "\1\6\1\20\12\4\2\27\1\23\1\21\1\24\2\0\32\5\1\0"+
    "\1\10\2\0\1\5\1\0\1\31\1\46\1\50\1\41\1\47\1\43"+
    "\1\5\1\51\1\32\2\5\1\44\1\30\1\11\1\40\1\54\1\5"+
    "\1\52\1\53\1\42\1\45\1\37\1\55\3\5\1\33\1\26\1\34"+
    "\7\0\1\12\u1fa2\0\1\12\1\12\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\0\1\1\1\3\1\4\1\5"+
    "\5\1\1\6\1\7\1\1\1\5\1\1\2\4\1\10"+
    "\1\11\1\12\1\13\11\4\5\0\1\14\1\15\1\0"+
    "\2\16\1\0\1\1\1\0\1\17\1\20\2\4\1\21"+
    "\1\4\1\21\10\4\1\22\1\23\1\14\2\0\12\4"+
    "\1\0\1\1\12\4";

  private static int [] zzUnpackAction() {
    int [] result = new int[88];
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
    "\0\0\0\56\0\56\0\134\0\134\0\212\0\270\0\56"+
    "\0\346\0\u0114\0\u0142\0\u0170\0\u019e\0\u01cc\0\u01cc\0\u01cc"+
    "\0\u01fa\0\u0228\0\u0256\0\u0284\0\56\0\56\0\56\0\56"+
    "\0\u02b2\0\u02e0\0\u030e\0\u033c\0\u036a\0\u0398\0\u03c6\0\u03f4"+
    "\0\u0422\0\u0450\0\u047e\0\u04ac\0\u0114\0\u04da\0\u0508\0\56"+
    "\0\u0142\0\56\0\u0536\0\u0564\0\u0592\0\u05c0\0\56\0\56"+
    "\0\u05ee\0\u061c\0\270\0\u064a\0\u0678\0\u06a6\0\u06d4\0\u0702"+
    "\0\u0730\0\u075e\0\u078c\0\u07ba\0\u07e8\0\u0450\0\56\0\56"+
    "\0\u0816\0\u0844\0\u0872\0\u08a0\0\u08ce\0\u08fc\0\u092a\0\u0958"+
    "\0\u0986\0\u09b4\0\u09e2\0\u0a10\0\u0a3e\0\u0816\0\u0a6c\0\u0a9a"+
    "\0\u0ac8\0\u0af6\0\u0b24\0\u0b52\0\u0b80\0\u0bae\0\u0bdc\0\u0c0a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[88];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\2\1\7\1\0\1\12\1\13\1\14\2\2\1\15"+
    "\1\16\1\17\1\20\1\2\1\21\1\22\1\10\1\23"+
    "\1\7\1\24\1\25\1\26\1\27\1\30\1\31\1\7"+
    "\1\32\1\7\1\33\3\7\1\34\1\35\1\7\1\36"+
    "\1\37\1\40\1\41\57\0\1\3\60\0\1\6\1\0"+
    "\1\42\53\0\2\7\3\0\1\7\16\0\3\7\4\0"+
    "\17\7\7\43\1\0\1\44\1\0\44\43\10\45\1\46"+
    "\2\45\1\47\42\45\15\0\1\50\56\0\2\51\1\50"+
    "\2\0\1\52\1\53\50\0\1\54\1\55\56\0\1\56"+
    "\61\0\1\57\56\0\1\60\33\0\2\7\3\0\1\7"+
    "\16\0\1\7\1\61\1\7\4\0\17\7\4\0\2\7"+
    "\3\0\1\62\16\0\3\7\4\0\4\7\1\63\12\7"+
    "\4\0\2\7\3\0\1\7\16\0\3\7\4\0\1\7"+
    "\1\64\15\7\4\0\2\7\3\0\1\7\16\0\3\7"+
    "\4\0\1\7\1\65\15\7\4\0\2\7\3\0\1\7"+
    "\16\0\3\7\4\0\1\7\1\66\3\7\1\67\11\7"+
    "\4\0\2\7\3\0\1\7\16\0\3\7\4\0\5\7"+
    "\1\70\11\7\4\0\2\7\3\0\1\7\16\0\3\7"+
    "\4\0\12\7\1\71\4\7\4\0\2\7\3\0\1\7"+
    "\16\0\3\7\4\0\10\7\1\72\6\7\4\0\2\7"+
    "\3\0\1\7\16\0\3\7\4\0\3\7\1\73\13\7"+
    "\4\0\2\7\3\0\1\7\16\0\3\7\4\0\13\7"+
    "\1\74\3\7\4\0\2\7\3\0\1\7\16\0\3\7"+
    "\4\0\12\7\1\75\4\7\4\0\1\76\60\0\1\77"+
    "\46\0\1\43\2\0\7\43\1\0\43\43\10\45\1\46"+
    "\45\45\13\0\1\100\63\0\1\52\34\0\17\101\1\102"+
    "\36\101\1\55\2\2\53\55\15\0\1\52\44\0\2\7"+
    "\3\0\1\7\16\0\2\7\1\103\4\0\17\7\4\0"+
    "\2\7\3\0\1\7\16\0\3\7\4\0\3\7\1\63"+
    "\5\7\1\104\5\7\4\0\2\7\3\0\1\7\16\0"+
    "\2\7\1\105\4\0\17\7\4\0\2\7\3\0\1\7"+
    "\16\0\3\7\4\0\6\7\1\106\10\7\4\0\2\7"+
    "\3\0\1\7\16\0\3\7\4\0\13\7\1\63\3\7"+
    "\4\0\2\7\3\0\1\7\16\0\3\7\4\0\1\7"+
    "\1\107\15\7\4\0\2\7\3\0\1\7\16\0\3\7"+
    "\4\0\14\7\1\110\2\7\4\0\2\7\3\0\1\7"+
    "\16\0\1\7\1\66\1\7\4\0\17\7\4\0\2\7"+
    "\3\0\1\7\16\0\3\7\4\0\3\7\1\111\13\7"+
    "\4\0\2\7\3\0\1\7\16\0\1\7\1\112\1\7"+
    "\4\0\17\7\4\0\2\7\3\0\1\7\16\0\2\7"+
    "\1\113\4\0\17\7\4\0\2\7\3\0\1\7\16\0"+
    "\2\7\1\114\4\0\17\7\17\101\1\115\55\101\1\115"+
    "\1\116\35\101\4\0\2\7\3\0\1\63\16\0\3\7"+
    "\4\0\17\7\4\0\2\7\3\0\1\7\16\0\3\7"+
    "\4\0\5\7\1\117\11\7\4\0\2\7\3\0\1\7"+
    "\16\0\3\7\4\0\2\7\1\63\14\7\4\0\2\7"+
    "\3\0\1\7\16\0\3\7\4\0\7\7\1\114\7\7"+
    "\4\0\2\7\3\0\1\7\16\0\1\7\1\120\1\7"+
    "\4\0\17\7\4\0\2\7\3\0\1\7\16\0\3\7"+
    "\4\0\10\7\1\63\6\7\4\0\2\7\3\0\1\7"+
    "\16\0\3\7\4\0\6\7\1\121\10\7\4\0\2\7"+
    "\3\0\1\7\16\0\3\7\4\0\3\7\1\122\13\7"+
    "\4\0\2\7\3\0\1\123\16\0\3\7\4\0\17\7"+
    "\4\0\2\7\3\0\1\7\16\0\3\7\4\0\5\7"+
    "\1\110\11\7\17\101\1\115\1\2\35\101\4\0\2\7"+
    "\3\0\1\7\16\0\3\7\4\0\6\7\1\124\10\7"+
    "\4\0\2\7\3\0\1\7\16\0\3\7\4\0\3\7"+
    "\1\63\13\7\4\0\2\7\3\0\1\7\16\0\3\7"+
    "\4\0\13\7\1\103\3\7\4\0\2\7\3\0\1\7"+
    "\16\0\2\7\1\125\4\0\17\7\4\0\2\7\3\0"+
    "\1\7\16\0\3\7\4\0\3\7\1\126\13\7\4\0"+
    "\2\7\3\0\1\7\16\0\3\7\4\0\2\7\1\110"+
    "\14\7\4\0\2\7\3\0\1\7\16\0\3\7\4\0"+
    "\11\7\1\63\5\7\4\0\2\7\3\0\1\7\16\0"+
    "\2\7\1\127\4\0\4\7\1\63\7\7\1\130\2\7"+
    "\4\0\2\7\3\0\1\120\16\0\3\7\4\0\17\7"+
    "\4\0\2\7\3\0\1\7\16\0\3\7\4\0\3\7"+
    "\1\66\13\7";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3128];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\1\0\3\1\1\11\14\1\4\11\11\1"+
    "\5\0\1\1\1\11\1\0\1\11\1\1\1\0\1\1"+
    "\1\0\2\11\16\1\2\11\2\0\12\1\1\0\13\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[88];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  AnalisadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 164) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
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

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            }
          case 20: break;
          case 2: 
            { /**/
            }
          case 21: break;
          case 3: 
            { return new Token("LITERALINTEIRO", yyline, yycolumn, yytext() );
            }
          case 22: break;
          case 4: 
            { return new Token("IDENTIFICADOR", yyline, yycolumn, yytext() );
            }
          case 23: break;
          case 5: 
            { return new Token("SIMBOLODEPONTUACAO",yyline, yycolumn, yytext() );
            }
          case 24: break;
          case 6: 
            { return new Token("OPERADORATRIBUICAO", yyline, yycolumn, yytext() );
            }
          case 25: break;
          case 7: 
            { return new Token("OPERADORUNARIONEGACAO",yyline, yycolumn, yytext() );
            }
          case 26: break;
          case 8: 
            { return new Token( "Abre_colchetes", yyline, yycolumn, yytext() );
            }
          case 27: break;
          case 9: 
            { return new Token( "Fecha_colchetes", yyline, yycolumn, yytext() );
            }
          case 28: break;
          case 10: 
            { return new Token( "Abre_parentese", yyline, yycolumn, yytext() );
            }
          case 29: break;
          case 11: 
            { return new Token( "Fecha_parentese", yyline, yycolumn, yytext() );
            }
          case 30: break;
          case 12: 
            { return new Token("LITERALSTRING", yyline, yycolumn, yytext());
            }
          case 31: break;
          case 13: 
            { return new Token("OPERADORARITMETICO",yyline, yycolumn, yytext() );
            }
          case 32: break;
          case 14: 
            { return new Token("OPERADORCOMPARACAO", yyline, yycolumn, yytext() );
            }
          case 33: break;
          case 15: 
            { return new Token("OPERADORLOGICOAND",yyline, yycolumn, yytext() );
            }
          case 34: break;
          case 16: 
            { return new Token("OPERADORLOGICOOR",yyline, yycolumn, yytext() );
            }
          case 35: break;
          case 17: 
            { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() );
            }
          case 36: break;
          case 18: 
            { return new Token("LITERALPONTOFLUTUANTE",yyline, yycolumn, yytext());
            }
          case 37: break;
          case 19: 
            { return new Token("LITERALCARACTER",yyline, yycolumn, yytext() );
            }
          case 38: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
