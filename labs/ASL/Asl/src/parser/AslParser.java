// $ANTLR 3.4 /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g 2017-03-12 22:19:45

package parser;
import interp.AslTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ARRAY_ACCESS", "ASSIGN", "BOOLEAN", "COMMENT", "DIV", "DO", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "READ", "RETURN", "SIZE", "STRING", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "'.'", "';'", "'['", "']'"
    };

    public static final int EOF=-1;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
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
    public static final int FALSE=18;
    public static final int FUNC=19;
    public static final int FUNCALL=20;
    public static final int GE=21;
    public static final int GT=22;
    public static final int ID=23;
    public static final int IF=24;
    public static final int INT=25;
    public static final int LE=26;
    public static final int LIST_FUNCTIONS=27;
    public static final int LIST_INSTR=28;
    public static final int LT=29;
    public static final int MINUS=30;
    public static final int MOD=31;
    public static final int MUL=32;
    public static final int NOT=33;
    public static final int NOT_EQUAL=34;
    public static final int OR=35;
    public static final int PARAMS=36;
    public static final int PLUS=37;
    public static final int PREF=38;
    public static final int PVALUE=39;
    public static final int READ=40;
    public static final int RETURN=41;
    public static final int SIZE=42;
    public static final int STRING=43;
    public static final int THEN=44;
    public static final int TRUE=45;
    public static final int WHILE=46;
    public static final int WRITE=47;
    public static final int WS=48;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AslParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AslParser.tokenNames; }
    public String getGrammarFileName() { return "/home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:61:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
    public final AslParser.prog_return prog() throws RecognitionException {
        AslParser.prog_return retval = new AslParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF2=null;
        AslParser.func_return func1 =null;


        AslTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:61:9: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:61:11: ( func )+ EOF
            {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:61:11: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:61:11: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog175);
            	    func1=func();

            	    state._fsp--;

            	    stream_func.add(func1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog178);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: func
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 61:21: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:61:24: ^( LIST_FUNCTIONS ( func )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
                , root_1);

                if ( !(stream_func.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_func.hasNext() ) {
                    adaptor.addChild(root_1, stream_func.nextTree());

                }
                stream_func.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class func_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:65:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FUNC3=null;
        Token ID4=null;
        Token ENDFUNC7=null;
        AslParser.params_return params5 =null;

        AslParser.block_instructions_return block_instructions6 =null;


        AslTree FUNC3_tree=null;
        AslTree ID4_tree=null;
        AslTree ENDFUNC7_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:65:9: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:65:11: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func220); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func223); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func225);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func227);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func229); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class params_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:69:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:69:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:69:11: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,50,FOLLOW_50_in_params249);  
            stream_50.add(char_literal8);


            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:69:15: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==49) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:69:15: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params251);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,51,FOLLOW_51_in_params254);  
            stream_51.add(char_literal10);


            // AST REWRITE
            // elements: paramlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 69:30: -> ^( PARAMS ( paramlist )? )
            {
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:69:33: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:69:42: ( paramlist )?
                if ( stream_paramlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramlist.nextTree());

                }
                stream_paramlist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class paramlist_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramlist"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:73:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:73:10: ( param ( ',' ! param )* )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:73:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist280);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:73:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==52) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:73:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,52,FOLLOW_52_in_paramlist283); 

            	    pushFollow(FOLLOW_param_in_paramlist286);
            	    param13=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param13.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramlist"


    public static class param_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:78:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:78:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==49) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:78:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,49,FOLLOW_49_in_param311);  
                    stream_49.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param315);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 78:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:78:26: ^( PREF[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PREF, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:79:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param338);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 79:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:79:22: ^( PVALUE[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PVALUE, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class block_instructions_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:83:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal16=null;
        AslParser.instruction_return instruction15 =null;

        AslParser.instruction_return instruction17 =null;


        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:84:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:84:14: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions374);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:84:26: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==54) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:84:27: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,54,FOLLOW_54_in_block_instructions377);  
            	    stream_54.add(char_literal16);


            	    pushFollow(FOLLOW_instruction_in_block_instructions379);
            	    instruction17=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction17.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 84:45: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:84:48: ^( LIST_INSTR ( instruction )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:88:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign18 =null;

        AslParser.ite_stmt_return ite_stmt19 =null;

        AslParser.while_stmt_return while_stmt20 =null;

        AslParser.funcall_return funcall21 =null;

        AslParser.return_stmt_return return_stmt22 =null;

        AslParser.read_return read23 =null;

        AslParser.write_return write24 =null;



        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:89:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |)
            int alt6=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EQUAL||LA6_1==55) ) {
                    alt6=1;
                }
                else if ( (LA6_1==50) ) {
                    alt6=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt6=2;
                }
                break;
            case WHILE:
                {
                alt6=3;
                }
                break;
            case RETURN:
                {
                alt6=5;
                }
                break;
            case READ:
                {
                alt6=6;
                }
                break;
            case WRITE:
                {
                alt6=7;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 54:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:89:13: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction418);
                    assign18=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign18.getTree());

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:90:13: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction442);
                    ite_stmt19=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt19.getTree());

                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:91:13: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction464);
                    while_stmt20=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:92:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction484);
                    funcall21=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall21.getTree());

                    }
                    break;
                case 5 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:93:13: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction507);
                    return_stmt22=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:94:13: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction526);
                    read23=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read23.getTree());

                    }
                    break;
                case 7 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:95:13: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction552);
                    write24=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write24.getTree());

                    }
                    break;
                case 8 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:97:9: 
                    {
                    root_0 = (AslTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class assign_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:100:1: assign : ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) | array_access eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] array_access expr ) );
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID25=null;
        AslParser.expr_return expr26 =null;

        AslParser.array_access_return array_access27 =null;

        AslParser.expr_return expr28 =null;


        AslTree eq_tree=null;
        AslTree ID25_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_array_access=new RewriteRuleSubtreeStream(adaptor,"rule array_access");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:100:9: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) | array_access eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] array_access expr ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EQUAL) ) {
                    alt7=1;
                }
                else if ( (LA7_1==55) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:100:13: ID eq= EQUAL expr
                    {
                    ID25=(Token)match(input,ID,FOLLOW_ID_in_assign613);  
                    stream_ID.add(ID25);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign617);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_expr_in_assign619);
                    expr26=expr();

                    state._fsp--;

                    stream_expr.add(expr26.getTree());

                    // AST REWRITE
                    // elements: ID, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 100:30: -> ^( ASSIGN[$eq,\":=\"] ID expr )
                    {
                        // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:100:33: ^( ASSIGN[$eq,\":=\"] ID expr )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ASSIGN, eq, ":=")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:101:13: array_access eq= EQUAL expr
                    {
                    pushFollow(FOLLOW_array_access_in_assign644);
                    array_access27=array_access();

                    state._fsp--;

                    stream_array_access.add(array_access27.getTree());

                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign648);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_expr_in_assign650);
                    expr28=expr();

                    state._fsp--;

                    stream_expr.add(expr28.getTree());

                    // AST REWRITE
                    // elements: expr, array_access
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 101:40: -> ^( ASSIGN[$eq,\":=\"] array_access expr )
                    {
                        // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:101:43: ^( ASSIGN[$eq,\":=\"] array_access expr )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ASSIGN, eq, ":=")
                        , root_1);

                        adaptor.addChild(root_1, stream_array_access.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:105:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF29=null;
        Token THEN31=null;
        Token ELSE33=null;
        Token ENDIF35=null;
        AslParser.expr_return expr30 =null;

        AslParser.block_instructions_return block_instructions32 =null;

        AslParser.block_instructions_return block_instructions34 =null;


        AslTree IF29_tree=null;
        AslTree THEN31_tree=null;
        AslTree ELSE33_tree=null;
        AslTree ENDIF35_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:105:13: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:105:17: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF29=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt684); 
            IF29_tree = 
            (AslTree)adaptor.create(IF29)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF29_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt687);
            expr30=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr30.getTree());

            THEN31=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt689); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt692);
            block_instructions32=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions32.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:105:51: ( ELSE ! block_instructions )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ELSE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:105:52: ELSE ! block_instructions
                    {
                    ELSE33=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt695); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt698);
                    block_instructions34=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions34.getTree());

                    }
                    break;

            }


            ENDIF35=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt702); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ite_stmt"


    public static class while_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:109:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE36=null;
        Token DO38=null;
        Token ENDWHILE40=null;
        AslParser.expr_return expr37 =null;

        AslParser.block_instructions_return block_instructions39 =null;


        AslTree WHILE36_tree=null;
        AslTree DO38_tree=null;
        AslTree ENDWHILE40_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:109:13: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:109:17: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE36=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt728); 
            WHILE36_tree = 
            (AslTree)adaptor.create(WHILE36)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE36_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt731);
            expr37=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr37.getTree());

            DO38=(Token)match(input,DO,FOLLOW_DO_in_while_stmt733); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt736);
            block_instructions39=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions39.getTree());

            ENDWHILE40=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt738); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:113:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN41=null;
        AslParser.expr_return expr42 =null;


        AslTree RETURN41_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:113:13: ( RETURN ^ ( expr )? )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:113:17: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN41=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt763); 
            RETURN41_tree = 
            (AslTree)adaptor.create(RETURN41)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN41_tree, root_0);


            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:113:25: ( expr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==TRUE||LA9_0==50) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:113:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt766);
                    expr42=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr42.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class read_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:117:1: read : READ ^ ( ID | array_access ) ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ43=null;
        Token ID44=null;
        AslParser.array_access_return array_access45 =null;


        AslTree READ43_tree=null;
        AslTree ID44_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:117:9: ( READ ^ ( ID | array_access ) )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:117:13: READ ^ ( ID | array_access )
            {
            root_0 = (AslTree)adaptor.nil();


            READ43=(Token)match(input,READ,FOLLOW_READ_in_read790); 
            READ43_tree = 
            (AslTree)adaptor.create(READ43)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ43_tree, root_0);


            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:117:19: ( ID | array_access )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==55) ) {
                    alt10=2;
                }
                else if ( ((LA10_1 >= ELSE && LA10_1 <= ENDWHILE)||LA10_1==54) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:117:20: ID
                    {
                    ID44=(Token)match(input,ID,FOLLOW_ID_in_read794); 
                    ID44_tree = 
                    (AslTree)adaptor.create(ID44)
                    ;
                    adaptor.addChild(root_0, ID44_tree);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:117:25: array_access
                    {
                    pushFollow(FOLLOW_array_access_in_read798);
                    array_access45=array_access();

                    state._fsp--;

                    adaptor.addChild(root_0, array_access45.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "read"


    public static class write_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:121:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE46=null;
        Token STRING48=null;
        AslParser.expr_return expr47 =null;


        AslTree WRITE46_tree=null;
        AslTree STRING48_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:121:9: ( WRITE ^ ( expr | STRING ) )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:121:13: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE46=(Token)match(input,WRITE,FOLLOW_WRITE_in_write821); 
            WRITE46_tree = 
            (AslTree)adaptor.create(WRITE46)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE46_tree, root_0);


            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:121:20: ( expr | STRING )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==FALSE||LA11_0==ID||LA11_0==INT||LA11_0==MINUS||LA11_0==NOT||LA11_0==PLUS||LA11_0==TRUE||LA11_0==50) ) {
                alt11=1;
            }
            else if ( (LA11_0==STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:121:21: expr
                    {
                    pushFollow(FOLLOW_expr_in_write825);
                    expr47=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr47.getTree());

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:121:28: STRING
                    {
                    STRING48=(Token)match(input,STRING,FOLLOW_STRING_in_write829); 
                    STRING48_tree = 
                    (AslTree)adaptor.create(STRING48)
                    ;
                    adaptor.addChild(root_0, STRING48_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "write"


    public static class expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:125:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR50=null;
        AslParser.boolterm_return boolterm49 =null;

        AslParser.boolterm_return boolterm51 =null;


        AslTree OR50_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:125:9: ( boolterm ( OR ^ boolterm )* )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:125:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr854);
            boolterm49=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm49.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:125:22: ( OR ^ boolterm )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==OR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:125:23: OR ^ boolterm
            	    {
            	    OR50=(Token)match(input,OR,FOLLOW_OR_in_expr857); 
            	    OR50_tree = 
            	    (AslTree)adaptor.create(OR50)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR50_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr860);
            	    boolterm51=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm51.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:128:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND53=null;
        AslParser.boolfact_return boolfact52 =null;

        AslParser.boolfact_return boolfact54 =null;


        AslTree AND53_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:128:9: ( boolfact ( AND ^ boolfact )* )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:128:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm880);
            boolfact52=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact52.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:128:22: ( AND ^ boolfact )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==AND) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:128:23: AND ^ boolfact
            	    {
            	    AND53=(Token)match(input,AND,FOLLOW_AND_in_boolterm883); 
            	    AND53_tree = 
            	    (AslTree)adaptor.create(AND53)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND53_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm886);
            	    boolfact54=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact54.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:131:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL56=null;
        Token NOT_EQUAL57=null;
        Token LT58=null;
        Token LE59=null;
        Token GT60=null;
        Token GE61=null;
        AslParser.num_expr_return num_expr55 =null;

        AslParser.num_expr_return num_expr62 =null;


        AslTree EQUAL56_tree=null;
        AslTree NOT_EQUAL57_tree=null;
        AslTree LT58_tree=null;
        AslTree LE59_tree=null;
        AslTree GT60_tree=null;
        AslTree GE61_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:131:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:131:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact906);
            num_expr55=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr55.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:131:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EQUAL||(LA15_0 >= GE && LA15_0 <= GT)||LA15_0==LE||LA15_0==LT||LA15_0==NOT_EQUAL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:131:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:131:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt14=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt14=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt14=2;
                        }
                        break;
                    case LT:
                        {
                        alt14=3;
                        }
                        break;
                    case LE:
                        {
                        alt14=4;
                        }
                        break;
                    case GT:
                        {
                        alt14=5;
                        }
                        break;
                    case GE:
                        {
                        alt14=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;

                    }

                    switch (alt14) {
                        case 1 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:131:24: EQUAL ^
                            {
                            EQUAL56=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact910); 
                            EQUAL56_tree = 
                            (AslTree)adaptor.create(EQUAL56)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL56_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:131:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL57=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact915); 
                            NOT_EQUAL57_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL57)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL57_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:131:46: LT ^
                            {
                            LT58=(Token)match(input,LT,FOLLOW_LT_in_boolfact920); 
                            LT58_tree = 
                            (AslTree)adaptor.create(LT58)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT58_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:131:52: LE ^
                            {
                            LE59=(Token)match(input,LE,FOLLOW_LE_in_boolfact925); 
                            LE59_tree = 
                            (AslTree)adaptor.create(LE59)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE59_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:131:58: GT ^
                            {
                            GT60=(Token)match(input,GT,FOLLOW_GT_in_boolfact930); 
                            GT60_tree = 
                            (AslTree)adaptor.create(GT60)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT60_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:131:64: GE ^
                            {
                            GE61=(Token)match(input,GE,FOLLOW_GE_in_boolfact935); 
                            GE61_tree = 
                            (AslTree)adaptor.create(GE61)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE61_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact939);
                    num_expr62=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr62.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:134:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS64=null;
        Token MINUS65=null;
        AslParser.term_return term63 =null;

        AslParser.term_return term66 =null;


        AslTree PLUS64_tree=null;
        AslTree MINUS65_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:134:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:134:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr959);
            term63=term();

            state._fsp--;

            adaptor.addChild(root_0, term63.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:134:18: ( ( PLUS ^| MINUS ^) term )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==MINUS||LA17_0==PLUS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:134:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:134:20: ( PLUS ^| MINUS ^)
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==PLUS) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==MINUS) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:134:21: PLUS ^
            	            {
            	            PLUS64=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr964); 
            	            PLUS64_tree = 
            	            (AslTree)adaptor.create(PLUS64)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS64_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:134:29: MINUS ^
            	            {
            	            MINUS65=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr969); 
            	            MINUS65_tree = 
            	            (AslTree)adaptor.create(MINUS65)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS65_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr973);
            	    term66=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term66.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:137:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL68=null;
        Token DIV69=null;
        Token MOD70=null;
        AslParser.factor_return factor67 =null;

        AslParser.factor_return factor71 =null;


        AslTree MUL68_tree=null;
        AslTree DIV69_tree=null;
        AslTree MOD70_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:137:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:137:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term997);
            factor67=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor67.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:137:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==DIV||(LA19_0 >= MOD && LA19_0 <= MUL)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:137:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:137:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt18=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:137:23: MUL ^
            	            {
            	            MUL68=(Token)match(input,MUL,FOLLOW_MUL_in_term1002); 
            	            MUL68_tree = 
            	            (AslTree)adaptor.create(MUL68)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL68_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:137:30: DIV ^
            	            {
            	            DIV69=(Token)match(input,DIV,FOLLOW_DIV_in_term1007); 
            	            DIV69_tree = 
            	            (AslTree)adaptor.create(DIV69)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV69_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:137:37: MOD ^
            	            {
            	            MOD70=(Token)match(input,MOD,FOLLOW_MOD_in_term1012); 
            	            MOD70_tree = 
            	            (AslTree)adaptor.create(MOD70)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD70_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1016);
            	    factor71=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor71.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:140:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT72=null;
        Token PLUS73=null;
        Token MINUS74=null;
        AslParser.atom_return atom75 =null;


        AslTree NOT72_tree=null;
        AslTree PLUS73_tree=null;
        AslTree MINUS74_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:140:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:140:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:140:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt20=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt20=1;
                    }
                    break;
                case PLUS:
                    {
                    alt20=2;
                    }
                    break;
                case MINUS:
                    {
                    alt20=3;
                    }
                    break;
            }

            switch (alt20) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:140:14: NOT ^
                    {
                    NOT72=(Token)match(input,NOT,FOLLOW_NOT_in_factor1039); 
                    NOT72_tree = 
                    (AslTree)adaptor.create(NOT72)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT72_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:140:21: PLUS ^
                    {
                    PLUS73=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1044); 
                    PLUS73_tree = 
                    (AslTree)adaptor.create(PLUS73)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS73_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:140:29: MINUS ^
                    {
                    MINUS74=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1049); 
                    MINUS74_tree = 
                    (AslTree)adaptor.create(MINUS74)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS74_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1054);
            atom75=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom75.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:146:1: atom : ( ID ( '.' SIZE -> ^( SIZE ID ) | -> ID ) | array_access | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall (ac= '[' expr ']' -> ^( ARRAY_ACCESS[$ac, \"[]\"] funcall expr ) | '.' SIZE -> ^( SIZE funcall ) | -> funcall ) | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ac=null;
        Token ID76=null;
        Token char_literal77=null;
        Token SIZE78=null;
        Token INT80=null;
        Token char_literal83=null;
        Token char_literal84=null;
        Token SIZE85=null;
        Token char_literal86=null;
        Token char_literal88=null;
        AslParser.array_access_return array_access79 =null;

        AslParser.funcall_return funcall81 =null;

        AslParser.expr_return expr82 =null;

        AslParser.expr_return expr87 =null;


        AslTree b_tree=null;
        AslTree ac_tree=null;
        AslTree ID76_tree=null;
        AslTree char_literal77_tree=null;
        AslTree SIZE78_tree=null;
        AslTree INT80_tree=null;
        AslTree char_literal83_tree=null;
        AslTree char_literal84_tree=null;
        AslTree SIZE85_tree=null;
        AslTree char_literal86_tree=null;
        AslTree char_literal88_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_SIZE=new RewriteRuleTokenStream(adaptor,"token SIZE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_funcall=new RewriteRuleSubtreeStream(adaptor,"rule funcall");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:146:9: ( ID ( '.' SIZE -> ^( SIZE ID ) | -> ID ) | array_access | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall (ac= '[' expr ']' -> ^( ARRAY_ACCESS[$ac, \"[]\"] funcall expr ) | '.' SIZE -> ^( SIZE funcall ) | -> funcall ) | '(' ! expr ')' !)
            int alt24=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 55:
                    {
                    alt24=2;
                    }
                    break;
                case 50:
                    {
                    alt24=5;
                    }
                    break;
                case AND:
                case DIV:
                case DO:
                case ELSE:
                case ENDFUNC:
                case ENDIF:
                case ENDWHILE:
                case EQUAL:
                case GE:
                case GT:
                case LE:
                case LT:
                case MINUS:
                case MOD:
                case MUL:
                case NOT_EQUAL:
                case OR:
                case PLUS:
                case THEN:
                case 51:
                case 52:
                case 53:
                case 54:
                case 56:
                    {
                    alt24=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }

                }
                break;
            case INT:
                {
                alt24=3;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt24=4;
                }
                break;
            case 50:
                {
                alt24=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:146:13: ID ( '.' SIZE -> ^( SIZE ID ) | -> ID )
                    {
                    ID76=(Token)match(input,ID,FOLLOW_ID_in_atom1079);  
                    stream_ID.add(ID76);


                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:146:16: ( '.' SIZE -> ^( SIZE ID ) | -> ID )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==53) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==AND||(LA21_0 >= DIV && LA21_0 <= EQUAL)||(LA21_0 >= GE && LA21_0 <= GT)||LA21_0==LE||(LA21_0 >= LT && LA21_0 <= MUL)||(LA21_0 >= NOT_EQUAL && LA21_0 <= OR)||LA21_0==PLUS||LA21_0==THEN||(LA21_0 >= 51 && LA21_0 <= 52)||LA21_0==54||LA21_0==56) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }
                    switch (alt21) {
                        case 1 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:146:18: '.' SIZE
                            {
                            char_literal77=(Token)match(input,53,FOLLOW_53_in_atom1083);  
                            stream_53.add(char_literal77);


                            SIZE78=(Token)match(input,SIZE,FOLLOW_SIZE_in_atom1085);  
                            stream_SIZE.add(SIZE78);


                            // AST REWRITE
                            // elements: SIZE, ID
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AslTree)adaptor.nil();
                            // 146:28: -> ^( SIZE ID )
                            {
                                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:146:31: ^( SIZE ID )
                                {
                                AslTree root_1 = (AslTree)adaptor.nil();
                                root_1 = (AslTree)adaptor.becomeRoot(
                                stream_SIZE.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, 
                                stream_ID.nextNode()
                                );

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 2 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:147:28: 
                            {
                            // AST REWRITE
                            // elements: ID
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AslTree)adaptor.nil();
                            // 147:28: -> ID
                            {
                                adaptor.addChild(root_0, 
                                stream_ID.nextNode()
                                );

                            }


                            retval.tree = root_0;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:149:13: array_access
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_array_access_in_atom1157);
                    array_access79=array_access();

                    state._fsp--;

                    adaptor.addChild(root_0, array_access79.getTree());

                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:150:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT80=(Token)match(input,INT,FOLLOW_INT_in_atom1171); 
                    INT80_tree = 
                    (AslTree)adaptor.create(INT80)
                    ;
                    adaptor.addChild(root_0, INT80_tree);


                    }
                    break;
                case 4 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:151:13: (b= TRUE |b= FALSE )
                    {
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:151:13: (b= TRUE |b= FALSE )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==TRUE) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==FALSE) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;

                    }
                    switch (alt22) {
                        case 1 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:151:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1188);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:151:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1194);  
                            stream_FALSE.add(b);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 151:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:151:36: ^( BOOLEAN[$b,$b.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:152:13: funcall (ac= '[' expr ']' -> ^( ARRAY_ACCESS[$ac, \"[]\"] funcall expr ) | '.' SIZE -> ^( SIZE funcall ) | -> funcall )
                    {
                    pushFollow(FOLLOW_funcall_in_atom1217);
                    funcall81=funcall();

                    state._fsp--;

                    stream_funcall.add(funcall81.getTree());

                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:152:21: (ac= '[' expr ']' -> ^( ARRAY_ACCESS[$ac, \"[]\"] funcall expr ) | '.' SIZE -> ^( SIZE funcall ) | -> funcall )
                    int alt23=3;
                    switch ( input.LA(1) ) {
                    case 55:
                        {
                        alt23=1;
                        }
                        break;
                    case 53:
                        {
                        alt23=2;
                        }
                        break;
                    case AND:
                    case DIV:
                    case DO:
                    case ELSE:
                    case ENDFUNC:
                    case ENDIF:
                    case ENDWHILE:
                    case EQUAL:
                    case GE:
                    case GT:
                    case LE:
                    case LT:
                    case MINUS:
                    case MOD:
                    case MUL:
                    case NOT_EQUAL:
                    case OR:
                    case PLUS:
                    case THEN:
                    case 51:
                    case 52:
                    case 54:
                    case 56:
                        {
                        alt23=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;

                    }

                    switch (alt23) {
                        case 1 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:152:22: ac= '[' expr ']'
                            {
                            ac=(Token)match(input,55,FOLLOW_55_in_atom1222);  
                            stream_55.add(ac);


                            pushFollow(FOLLOW_expr_in_atom1224);
                            expr82=expr();

                            state._fsp--;

                            stream_expr.add(expr82.getTree());

                            char_literal83=(Token)match(input,56,FOLLOW_56_in_atom1226);  
                            stream_56.add(char_literal83);


                            // AST REWRITE
                            // elements: funcall, expr
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AslTree)adaptor.nil();
                            // 152:38: -> ^( ARRAY_ACCESS[$ac, \"[]\"] funcall expr )
                            {
                                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:152:41: ^( ARRAY_ACCESS[$ac, \"[]\"] funcall expr )
                                {
                                AslTree root_1 = (AslTree)adaptor.nil();
                                root_1 = (AslTree)adaptor.becomeRoot(
                                (AslTree)adaptor.create(ARRAY_ACCESS, ac, "[]")
                                , root_1);

                                adaptor.addChild(root_1, stream_funcall.nextTree());

                                adaptor.addChild(root_1, stream_expr.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 2 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:153:23: '.' SIZE
                            {
                            char_literal84=(Token)match(input,53,FOLLOW_53_in_atom1261);  
                            stream_53.add(char_literal84);


                            SIZE85=(Token)match(input,SIZE,FOLLOW_SIZE_in_atom1263);  
                            stream_SIZE.add(SIZE85);


                            // AST REWRITE
                            // elements: SIZE, funcall
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AslTree)adaptor.nil();
                            // 153:38: -> ^( SIZE funcall )
                            {
                                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:153:41: ^( SIZE funcall )
                                {
                                AslTree root_1 = (AslTree)adaptor.nil();
                                root_1 = (AslTree)adaptor.becomeRoot(
                                stream_SIZE.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_funcall.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 3 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:154:38: 
                            {
                            // AST REWRITE
                            // elements: funcall
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AslTree)adaptor.nil();
                            // 154:38: -> funcall
                            {
                                adaptor.addChild(root_0, stream_funcall.nextTree());

                            }


                            retval.tree = root_0;

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:156:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal86=(Token)match(input,50,FOLLOW_50_in_atom1354); 

                    pushFollow(FOLLOW_expr_in_atom1357);
                    expr87=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr87.getTree());

                    char_literal88=(Token)match(input,51,FOLLOW_51_in_atom1359); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class array_access_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array_access"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:161:1: array_access : ID ac= '[' expr ']' -> ^( ARRAY_ACCESS[$ac,\"ARRAY_ACCESS\"] ID expr ) ;
    public final AslParser.array_access_return array_access() throws RecognitionException {
        AslParser.array_access_return retval = new AslParser.array_access_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ac=null;
        Token ID89=null;
        Token char_literal91=null;
        AslParser.expr_return expr90 =null;


        AslTree ac_tree=null;
        AslTree ID89_tree=null;
        AslTree char_literal91_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:162:9: ( ID ac= '[' expr ']' -> ^( ARRAY_ACCESS[$ac,\"ARRAY_ACCESS\"] ID expr ) )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:162:13: ID ac= '[' expr ']'
            {
            ID89=(Token)match(input,ID,FOLLOW_ID_in_array_access1391);  
            stream_ID.add(ID89);


            ac=(Token)match(input,55,FOLLOW_55_in_array_access1395);  
            stream_55.add(ac);


            pushFollow(FOLLOW_expr_in_array_access1397);
            expr90=expr();

            state._fsp--;

            stream_expr.add(expr90.getTree());

            char_literal91=(Token)match(input,56,FOLLOW_56_in_array_access1399);  
            stream_56.add(char_literal91);


            // AST REWRITE
            // elements: expr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 162:32: -> ^( ARRAY_ACCESS[$ac,\"ARRAY_ACCESS\"] ID expr )
            {
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:162:35: ^( ARRAY_ACCESS[$ac,\"ARRAY_ACCESS\"] ID expr )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARRAY_ACCESS, ac, "ARRAY_ACCESS")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array_access"


    public static class funcall_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:166:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID92=null;
        Token char_literal93=null;
        Token char_literal95=null;
        AslParser.expr_list_return expr_list94 =null;


        AslTree ID92_tree=null;
        AslTree char_literal93_tree=null;
        AslTree char_literal95_tree=null;
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:166:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:166:13: ID '(' ( expr_list )? ')'
            {
            ID92=(Token)match(input,ID,FOLLOW_ID_in_funcall1430);  
            stream_ID.add(ID92);


            char_literal93=(Token)match(input,50,FOLLOW_50_in_funcall1432);  
            stream_50.add(char_literal93);


            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:166:20: ( expr_list )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==FALSE||LA25_0==ID||LA25_0==INT||LA25_0==MINUS||LA25_0==NOT||LA25_0==PLUS||LA25_0==TRUE||LA25_0==50) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:166:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1434);
                    expr_list94=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list94.getTree());

                    }
                    break;

            }


            char_literal95=(Token)match(input,51,FOLLOW_51_in_funcall1437);  
            stream_51.add(char_literal95);


            // AST REWRITE
            // elements: expr_list, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 166:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:166:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:166:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:166:61: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class expr_list_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:170:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal97=null;
        AslParser.expr_return expr96 =null;

        AslParser.expr_return expr98 =null;


        AslTree char_literal97_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:170:10: ( expr ( ',' ! expr )* )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:170:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1470);
            expr96=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr96.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:170:18: ( ',' ! expr )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==52) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:170:19: ',' ! expr
            	    {
            	    char_literal97=(Token)match(input,52,FOLLOW_52_in_expr_list1473); 

            	    pushFollow(FOLLOW_expr_in_expr_list1476);
            	    expr98=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr98.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog175 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EOF_in_prog178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func220 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_func223 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_params_in_func225 = new BitSet(new long[]{0x0040C30001800000L});
    public static final BitSet FOLLOW_block_instructions_in_func227 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_params249 = new BitSet(new long[]{0x000A000000800000L});
    public static final BitSet FOLLOW_paramlist_in_params251 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_params254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist280 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_paramlist283 = new BitSet(new long[]{0x0002000000800000L});
    public static final BitSet FOLLOW_param_in_paramlist286 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_49_in_param311 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_param315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions374 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_block_instructions377 = new BitSet(new long[]{0x0040C30001800000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions379 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign613 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_EQUAL_in_assign617 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_expr_in_assign619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_access_in_assign644 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_EQUAL_in_assign648 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_expr_in_assign650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt684 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt687 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt689 = new BitSet(new long[]{0x0040C30001800000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt692 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt695 = new BitSet(new long[]{0x0040C30001800000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt698 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt728 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_expr_in_while_stmt731 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DO_in_while_stmt733 = new BitSet(new long[]{0x0040C30001800000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt736 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt763 = new BitSet(new long[]{0x0004202242840002L});
    public static final BitSet FOLLOW_expr_in_return_stmt766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read790 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_read794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_access_in_read798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write821 = new BitSet(new long[]{0x0004282242840000L});
    public static final BitSet FOLLOW_expr_in_write825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr854 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_OR_in_expr857 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_boolterm_in_expr860 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm880 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm883 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm886 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact906 = new BitSet(new long[]{0x0000000424610002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact910 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact915 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_LT_in_boolfact920 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_LE_in_boolfact925 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_GT_in_boolfact930 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_GE_in_boolfact935 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr959 = new BitSet(new long[]{0x0000002040000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr964 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr969 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_term_in_num_expr973 = new BitSet(new long[]{0x0000002040000002L});
    public static final BitSet FOLLOW_factor_in_term997 = new BitSet(new long[]{0x0000000180000402L});
    public static final BitSet FOLLOW_MUL_in_term1002 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_DIV_in_term1007 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_MOD_in_term1012 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_factor_in_term1016 = new BitSet(new long[]{0x0000000180000402L});
    public static final BitSet FOLLOW_NOT_in_factor1039 = new BitSet(new long[]{0x0004200002840000L});
    public static final BitSet FOLLOW_PLUS_in_factor1044 = new BitSet(new long[]{0x0004200002840000L});
    public static final BitSet FOLLOW_MINUS_in_factor1049 = new BitSet(new long[]{0x0004200002840000L});
    public static final BitSet FOLLOW_atom_in_factor1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1079 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_atom1083 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SIZE_in_atom1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_access_in_atom1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1217 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_55_in_atom1222 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_expr_in_atom1224 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_atom1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_atom1261 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SIZE_in_atom1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_atom1354 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_expr_in_atom1357 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_atom1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_array_access1391 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_array_access1395 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_expr_in_array_access1397 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_array_access1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1430 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_funcall1432 = new BitSet(new long[]{0x000C202242840000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1434 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_funcall1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1470 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_expr_list1473 = new BitSet(new long[]{0x0004202242840000L});
    public static final BitSet FOLLOW_expr_in_expr_list1476 = new BitSet(new long[]{0x0010000000000002L});

}