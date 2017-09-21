// $ANTLR 3.4 /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g 2017-03-17 21:04:20

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ARRAY_ACCESS=6;
    public static final int ASSIGN=7;
    public static final int BOOLEAN=8;
    public static final int COMMENT=9;
    public static final int DIV=10;
    public static final int DO=11;
    public static final int ELSE=12;
    public static final int ENDFUNC=13;
    public static final int ENDIF=14;
    public static final int ENDWHILE=15;
    public static final int EQUAL=16;
    public static final int ESC_SEQ=17;
    public static final int FACT=18;
    public static final int FALSE=19;
    public static final int FUNC=20;
    public static final int FUNCALL=21;
    public static final int GE=22;
    public static final int GT=23;
    public static final int ID=24;
    public static final int IF=25;
    public static final int INT=26;
    public static final int LE=27;
    public static final int LIST_FUNCTIONS=28;
    public static final int LIST_INSTR=29;
    public static final int LT=30;
    public static final int MINUS=31;
    public static final int MOD=32;
    public static final int MUL=33;
    public static final int NOT=34;
    public static final int NOT_EQUAL=35;
    public static final int OR=36;
    public static final int PARAMS=37;
    public static final int PLUS=38;
    public static final int PREF=39;
    public static final int PVALUE=40;
    public static final int READ=41;
    public static final int RETURN=42;
    public static final int SIZE=43;
    public static final int SIZECALL=44;
    public static final int STRING=45;
    public static final int SUM=46;
    public static final int THEN=47;
    public static final int TRUE=48;
    public static final int WHILE=49;
    public static final int WRITE=50;
    public static final int WS=51;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AslLexer() {} 
    public AslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g"; }

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:6:7: ( '&' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:6:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:7:7: ( '(' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:7:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:8:7: ( '()' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:8:9: '()'
            {
            match("()"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:9:7: ( ')' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:9:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:10:7: ( ',' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:10:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:11:7: ( '.' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:12:7: ( ';' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:12:9: ';'
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:13:7: ( '[' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:13:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:14:7: ( ']' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:14:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:187:9: ( '=' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:187:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:188:10: ( '!=' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:188:12: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:189:9: ( '<' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:189:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:190:9: ( '<=' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:190:11: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:191:9: ( '>' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:191:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:192:9: ( '>=' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:192:11: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:193:9: ( '+' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:193:11: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:194:9: ( '-' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:194:11: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:195:9: ( '*' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:195:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:196:9: ( '/' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:196:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:197:9: ( '%' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:197:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "FACT"
    public final void mFACT() throws RecognitionException {
        try {
            int _type = FACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:198:9: ( '!' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:198:11: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FACT"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:199:9: ( 'not' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:199:11: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:200:9: ( 'and' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:200:11: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:201:9: ( 'or' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:201:11: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:202:9: ( 'if' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:202:11: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:203:9: ( 'then' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:203:11: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:204:9: ( 'else' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:204:11: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:205:9: ( 'endif' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:205:11: 'endif'
            {
            match("endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:206:9: ( 'while' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:206:11: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:207:9: ( 'do' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:207:11: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "ENDWHILE"
    public final void mENDWHILE() throws RecognitionException {
        try {
            int _type = ENDWHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:208:9: ( 'endwhile' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:208:11: 'endwhile'
            {
            match("endwhile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDWHILE"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:209:9: ( 'func' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:209:11: 'func'
            {
            match("func"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "ENDFUNC"
    public final void mENDFUNC() throws RecognitionException {
        try {
            int _type = ENDFUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:210:9: ( 'endfunc' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:210:11: 'endfunc'
            {
            match("endfunc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDFUNC"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:211:9: ( 'return' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:211:11: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:212:9: ( 'read' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:212:11: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:213:9: ( 'write' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:213:11: 'write'
            {
            match("write"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "SIZE"
    public final void mSIZE() throws RecognitionException {
        try {
            int _type = SIZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:214:9: ( 'size' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:214:11: 'size'
            {
            match("size"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIZE"

    // $ANTLR start "SUM"
    public final void mSUM() throws RecognitionException {
        try {
            int _type = SUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:215:9: ( 'sum' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:215:11: 'sum'
            {
            match("sum"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUM"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:216:9: ( 'true' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:216:11: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:217:9: ( 'false' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:217:11: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:218:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:218:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:218:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:
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
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:219:9: ( ( '0' .. '9' )+ )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:219:11: ( '0' .. '9' )+
            {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:219:11: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:222:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:222:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:222:16: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:
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
                    	    break loop3;
                        }
                    } while (true);


                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:222:30: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:222:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:223:11: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:223:16: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:223:44: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

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
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:227:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:227:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:227:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:227:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:227:28: ~ ( '\\\\' | '\"' )
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
            	    break loop7;
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

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:233:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:233:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:236:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:236:11: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:8: ( T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | FACT | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | SIZE | SUM | TRUE | FALSE | ID | INT | COMMENT | STRING | WS )
        int alt8=45;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:10: T__52
                {
                mT__52(); 


                }
                break;
            case 2 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:16: T__53
                {
                mT__53(); 


                }
                break;
            case 3 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:22: T__54
                {
                mT__54(); 


                }
                break;
            case 4 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:28: T__55
                {
                mT__55(); 


                }
                break;
            case 5 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:34: T__56
                {
                mT__56(); 


                }
                break;
            case 6 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:40: T__57
                {
                mT__57(); 


                }
                break;
            case 7 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:46: T__58
                {
                mT__58(); 


                }
                break;
            case 8 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:52: T__59
                {
                mT__59(); 


                }
                break;
            case 9 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:58: T__60
                {
                mT__60(); 


                }
                break;
            case 10 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:64: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 11 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:70: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 12 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:80: LT
                {
                mLT(); 


                }
                break;
            case 13 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:83: LE
                {
                mLE(); 


                }
                break;
            case 14 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:86: GT
                {
                mGT(); 


                }
                break;
            case 15 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:89: GE
                {
                mGE(); 


                }
                break;
            case 16 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:92: PLUS
                {
                mPLUS(); 


                }
                break;
            case 17 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:97: MINUS
                {
                mMINUS(); 


                }
                break;
            case 18 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:103: MUL
                {
                mMUL(); 


                }
                break;
            case 19 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:107: DIV
                {
                mDIV(); 


                }
                break;
            case 20 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:111: MOD
                {
                mMOD(); 


                }
                break;
            case 21 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:115: FACT
                {
                mFACT(); 


                }
                break;
            case 22 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:120: NOT
                {
                mNOT(); 


                }
                break;
            case 23 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:124: AND
                {
                mAND(); 


                }
                break;
            case 24 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:128: OR
                {
                mOR(); 


                }
                break;
            case 25 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:131: IF
                {
                mIF(); 


                }
                break;
            case 26 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:134: THEN
                {
                mTHEN(); 


                }
                break;
            case 27 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:139: ELSE
                {
                mELSE(); 


                }
                break;
            case 28 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:144: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 29 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:150: WHILE
                {
                mWHILE(); 


                }
                break;
            case 30 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:156: DO
                {
                mDO(); 


                }
                break;
            case 31 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:159: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 32 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:168: FUNC
                {
                mFUNC(); 


                }
                break;
            case 33 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:173: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 34 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:181: RETURN
                {
                mRETURN(); 


                }
                break;
            case 35 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:188: READ
                {
                mREAD(); 


                }
                break;
            case 36 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:193: WRITE
                {
                mWRITE(); 


                }
                break;
            case 37 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:199: SIZE
                {
                mSIZE(); 


                }
                break;
            case 38 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:204: SUM
                {
                mSUM(); 


                }
                break;
            case 39 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:208: TRUE
                {
                mTRUE(); 


                }
                break;
            case 40 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:213: FALSE
                {
                mFALSE(); 


                }
                break;
            case 41 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:219: ID
                {
                mID(); 


                }
                break;
            case 42 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:222: INT
                {
                mINT(); 


                }
                break;
            case 43 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:226: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 44 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:234: STRING
                {
                mSTRING(); 


                }
                break;
            case 45 :
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:1:241: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\2\uffff\1\42\7\uffff\1\44\1\46\1\50\3\uffff\1\52\1\uffff\13\35"+
        "\16\uffff\2\35\1\75\1\76\6\35\1\105\5\35\1\114\1\115\2\uffff\6\35"+
        "\1\uffff\5\35\1\133\2\uffff\1\134\1\135\1\136\5\35\1\144\2\35\1"+
        "\147\1\150\4\uffff\1\151\2\35\1\154\1\155\1\uffff\1\156\1\35\3\uffff"+
        "\2\35\3\uffff\1\162\1\35\1\164\1\uffff\1\165\2\uffff";
    static final String DFA8_eofS =
        "\166\uffff";
    static final String DFA8_minS =
        "\1\11\1\uffff\1\51\7\uffff\3\75\3\uffff\1\52\1\uffff\1\157\1\156"+
        "\1\162\1\146\1\150\1\154\1\150\1\157\1\141\1\145\1\151\16\uffff"+
        "\1\164\1\144\2\60\1\145\1\165\1\163\1\144\2\151\1\60\1\156\1\154"+
        "\1\141\1\172\1\155\2\60\2\uffff\1\156\2\145\1\146\1\154\1\164\1"+
        "\uffff\1\143\1\163\1\165\1\144\1\145\1\60\2\uffff\3\60\1\146\1\150"+
        "\1\165\2\145\1\60\1\145\1\162\2\60\4\uffff\1\60\1\151\1\156\2\60"+
        "\1\uffff\1\60\1\156\3\uffff\1\154\1\143\3\uffff\1\60\1\145\1\60"+
        "\1\uffff\1\60\2\uffff";
    static final String DFA8_maxS =
        "\1\172\1\uffff\1\51\7\uffff\3\75\3\uffff\1\57\1\uffff\1\157\1\156"+
        "\1\162\1\146\1\162\1\156\1\162\1\157\1\165\1\145\1\165\16\uffff"+
        "\1\164\1\144\2\172\1\145\1\165\1\163\1\144\2\151\1\172\1\156\1\154"+
        "\1\164\1\172\1\155\2\172\2\uffff\1\156\2\145\1\167\1\154\1\164\1"+
        "\uffff\1\143\1\163\1\165\1\144\1\145\1\172\2\uffff\3\172\1\146\1"+
        "\150\1\165\2\145\1\172\1\145\1\162\2\172\4\uffff\1\172\1\151\1\156"+
        "\2\172\1\uffff\1\172\1\156\3\uffff\1\154\1\143\3\uffff\1\172\1\145"+
        "\1\172\1\uffff\1\172\2\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\3\uffff\1\20"+
        "\1\21\1\22\1\uffff\1\24\13\uffff\1\51\1\52\1\54\1\55\1\3\1\2\1\13"+
        "\1\25\1\15\1\14\1\17\1\16\1\53\1\23\22\uffff\1\30\1\31\6\uffff\1"+
        "\36\6\uffff\1\26\1\27\15\uffff\1\46\1\32\1\47\1\33\5\uffff\1\40"+
        "\2\uffff\1\43\1\45\1\34\2\uffff\1\35\1\44\1\50\3\uffff\1\42\1\uffff"+
        "\1\41\1\37";
    static final String DFA8_specialS =
        "\166\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\40\2\uffff\1\40\22\uffff\1\40\1\12\1\37\2\uffff\1\21\1\1"+
            "\1\uffff\1\2\1\3\1\17\1\15\1\4\1\16\1\5\1\20\12\36\1\uffff\1"+
            "\6\1\13\1\11\1\14\2\uffff\32\35\1\7\1\uffff\1\10\1\uffff\1\35"+
            "\1\uffff\1\23\2\35\1\31\1\27\1\32\2\35\1\25\4\35\1\22\1\24\2"+
            "\35\1\33\1\34\1\26\2\35\1\30\3\35",
            "",
            "\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43",
            "\1\45",
            "\1\47",
            "",
            "",
            "",
            "\1\51\4\uffff\1\51",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57\11\uffff\1\60",
            "\1\61\1\uffff\1\62",
            "\1\63\11\uffff\1\64",
            "\1\65",
            "\1\67\23\uffff\1\66",
            "\1\70",
            "\1\71\13\uffff\1\72",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\73",
            "\1\74",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\106",
            "\1\107",
            "\1\111\22\uffff\1\110",
            "\1\112",
            "\1\113",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\123\2\uffff\1\121\15\uffff\1\122",
            "\1\124",
            "\1\125",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\145",
            "\1\146",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\152",
            "\1\153",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\157",
            "",
            "",
            "",
            "\1\160",
            "\1\161",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\163",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | FACT | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | SIZE | SUM | TRUE | FALSE | ID | INT | COMMENT | STRING | WS );";
        }
    }
 

}