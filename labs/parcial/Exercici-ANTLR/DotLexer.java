// $ANTLR 3.4 Dot.g 2017-03-14 20:15:35

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DotLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int COMMENT=4;
    public static final int EDGE=5;
    public static final int ELEMENTS=6;
    public static final int GRAPH=7;
    public static final int NUM=8;
    public static final int STRING=9;
    public static final int SUBGRAPH=10;
    public static final int VAR=11;
    public static final int WS=12;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public DotLexer() {} 
    public DotLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DotLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Dot.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dot.g:6:7: ( ';' )
            // Dot.g:6:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dot.g:7:7: ( '{' )
            // Dot.g:7:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dot.g:8:7: ( '}' )
            // Dot.g:8:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "GRAPH"
    public final void mGRAPH() throws RecognitionException {
        try {
            int _type = GRAPH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dot.g:40:10: ( 'digraph' )
            // Dot.g:40:12: 'digraph'
            {
            match("digraph"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GRAPH"

    // $ANTLR start "SUBGRAPH"
    public final void mSUBGRAPH() throws RecognitionException {
        try {
            int _type = SUBGRAPH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dot.g:41:10: ( 'subgraph' )
            // Dot.g:41:12: 'subgraph'
            {
            match("subgraph"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUBGRAPH"

    // $ANTLR start "EDGE"
    public final void mEDGE() throws RecognitionException {
        try {
            int _type = EDGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dot.g:43:9: ( '->' )
            // Dot.g:43:11: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EDGE"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dot.g:44:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // Dot.g:44:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Dot.g:44:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Dot.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dot.g:45:9: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
            // Dot.g:45:11: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // Dot.g:45:15: (~ ( '\\\\' | '\"' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\u0000' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '[')||(LA2_0 >= ']' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Dot.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dot.g:46:9: ( ( '0' .. '9' )+ | ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // Dot.g:46:11: ( '0' .. '9' )+
                    {
                    // Dot.g:46:11: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Dot.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // Dot.g:46:25: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // Dot.g:46:25: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Dot.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    match('.'); 

                    // Dot.g:46:41: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // Dot.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // Dot.g:46:55: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // Dot.g:46:59: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // Dot.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dot.g:49:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // Dot.g:49:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // Dot.g:49:16: (~ ( '\\n' | '\\r' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Dot.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // Dot.g:49:30: ( '\\r' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Dot.g:49:30: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dot.g:52:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // Dot.g:52:11: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // Dot.g:1:8: ( T__13 | T__14 | T__15 | GRAPH | SUBGRAPH | EDGE | VAR | STRING | NUM | COMMENT | WS )
        int alt10=11;
        switch ( input.LA(1) ) {
        case ';':
            {
            alt10=1;
            }
            break;
        case '{':
            {
            alt10=2;
            }
            break;
        case '}':
            {
            alt10=3;
            }
            break;
        case 'd':
            {
            int LA10_4 = input.LA(2);

            if ( (LA10_4=='i') ) {
                int LA10_12 = input.LA(3);

                if ( (LA10_12=='g') ) {
                    int LA10_14 = input.LA(4);

                    if ( (LA10_14=='r') ) {
                        int LA10_16 = input.LA(5);

                        if ( (LA10_16=='a') ) {
                            int LA10_18 = input.LA(6);

                            if ( (LA10_18=='p') ) {
                                int LA10_20 = input.LA(7);

                                if ( (LA10_20=='h') ) {
                                    int LA10_22 = input.LA(8);

                                    if ( ((LA10_22 >= '0' && LA10_22 <= '9')||(LA10_22 >= 'A' && LA10_22 <= 'Z')||LA10_22=='_'||(LA10_22 >= 'a' && LA10_22 <= 'z')) ) {
                                        alt10=7;
                                    }
                                    else {
                                        alt10=4;
                                    }
                                }
                                else {
                                    alt10=7;
                                }
                            }
                            else {
                                alt10=7;
                            }
                        }
                        else {
                            alt10=7;
                        }
                    }
                    else {
                        alt10=7;
                    }
                }
                else {
                    alt10=7;
                }
            }
            else {
                alt10=7;
            }
            }
            break;
        case 's':
            {
            int LA10_5 = input.LA(2);

            if ( (LA10_5=='u') ) {
                int LA10_13 = input.LA(3);

                if ( (LA10_13=='b') ) {
                    int LA10_15 = input.LA(4);

                    if ( (LA10_15=='g') ) {
                        int LA10_17 = input.LA(5);

                        if ( (LA10_17=='r') ) {
                            int LA10_19 = input.LA(6);

                            if ( (LA10_19=='a') ) {
                                int LA10_21 = input.LA(7);

                                if ( (LA10_21=='p') ) {
                                    int LA10_23 = input.LA(8);

                                    if ( (LA10_23=='h') ) {
                                        int LA10_25 = input.LA(9);

                                        if ( ((LA10_25 >= '0' && LA10_25 <= '9')||(LA10_25 >= 'A' && LA10_25 <= 'Z')||LA10_25=='_'||(LA10_25 >= 'a' && LA10_25 <= 'z')) ) {
                                            alt10=7;
                                        }
                                        else {
                                            alt10=5;
                                        }
                                    }
                                    else {
                                        alt10=7;
                                    }
                                }
                                else {
                                    alt10=7;
                                }
                            }
                            else {
                                alt10=7;
                            }
                        }
                        else {
                            alt10=7;
                        }
                    }
                    else {
                        alt10=7;
                    }
                }
                else {
                    alt10=7;
                }
            }
            else {
                alt10=7;
            }
            }
            break;
        case '-':
            {
            alt10=6;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt10=7;
            }
            break;
        case '\"':
            {
            alt10=8;
            }
            break;
        case '.':
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt10=9;
            }
            break;
        case '/':
            {
            alt10=10;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt10=11;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 10, 0, input);

            throw nvae;

        }

        switch (alt10) {
            case 1 :
                // Dot.g:1:10: T__13
                {
                mT__13(); 


                }
                break;
            case 2 :
                // Dot.g:1:16: T__14
                {
                mT__14(); 


                }
                break;
            case 3 :
                // Dot.g:1:22: T__15
                {
                mT__15(); 


                }
                break;
            case 4 :
                // Dot.g:1:28: GRAPH
                {
                mGRAPH(); 


                }
                break;
            case 5 :
                // Dot.g:1:34: SUBGRAPH
                {
                mSUBGRAPH(); 


                }
                break;
            case 6 :
                // Dot.g:1:43: EDGE
                {
                mEDGE(); 


                }
                break;
            case 7 :
                // Dot.g:1:48: VAR
                {
                mVAR(); 


                }
                break;
            case 8 :
                // Dot.g:1:52: STRING
                {
                mSTRING(); 


                }
                break;
            case 9 :
                // Dot.g:1:59: NUM
                {
                mNUM(); 


                }
                break;
            case 10 :
                // Dot.g:1:63: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 11 :
                // Dot.g:1:71: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\uffff\1\3\3\uffff";
    static final String DFA7_eofS =
        "\5\uffff";
    static final String DFA7_minS =
        "\2\56\3\uffff";
    static final String DFA7_maxS =
        "\2\71\3\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\3\1\1\1\2";
    static final String DFA7_specialS =
        "\5\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "46:1: NUM : ( ( '0' .. '9' )+ | ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ );";
        }
    }
 

}