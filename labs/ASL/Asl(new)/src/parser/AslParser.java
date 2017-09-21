// $ANTLR 3.4 /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g 2017-03-17 21:04:19

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ARRAY_ACCESS", "ASSIGN", "BOOLEAN", "COMMENT", "DIV", "DO", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FACT", "FALSE", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "READ", "RETURN", "SIZE", "SIZECALL", "STRING", "SUM", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'&'", "'('", "'()'", "')'", "','", "'.'", "';'", "'['", "']'"
    };

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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:62:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:62:9: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:62:11: ( func )+ EOF
            {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:62:11: ( func )+
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
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:62:11: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog189);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog192);  
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
            // 62:21: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:62:24: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:66:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
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
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:66:9: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:66:11: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func234); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func237); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func239);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func241);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func243); 

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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:70:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:70:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:70:11: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,53,FOLLOW_53_in_params263);  
            stream_53.add(char_literal8);


            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:70:15: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==52) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:70:15: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params265);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,55,FOLLOW_55_in_params268);  
            stream_55.add(char_literal10);


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
            // 70:30: -> ^( PARAMS ( paramlist )? )
            {
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:70:33: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:70:42: ( paramlist )?
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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:74:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:74:10: ( param ( ',' ! param )* )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:74:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist294);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:74:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==56) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:74:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,56,FOLLOW_56_in_paramlist297); 

            	    pushFollow(FOLLOW_param_in_paramlist300);
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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:79:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:79:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==52) ) {
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
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:79:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,52,FOLLOW_52_in_param325);  
                    stream_52.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param329);  
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
                    // 79:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:79:26: ^( PREF[$id,$id.text] )
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
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:80:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param352);  
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
                    // 80:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:80:22: ^( PVALUE[$id,$id.text] )
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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:84:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal16=null;
        AslParser.instruction_return instruction15 =null;

        AslParser.instruction_return instruction17 =null;


        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:85:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:85:14: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions388);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:85:26: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==58) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:85:27: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,58,FOLLOW_58_in_block_instructions391);  
            	    stream_58.add(char_literal16);


            	    pushFollow(FOLLOW_instruction_in_block_instructions393);
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
            // 85:45: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:85:48: ^( LIST_INSTR ( instruction )+ )
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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:89:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |);
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
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:90:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |)
            int alt6=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EQUAL||LA6_1==59) ) {
                    alt6=1;
                }
                else if ( (LA6_1==53) ) {
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
            case 58:
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
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:90:13: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction432);
                    assign18=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign18.getTree());

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:91:13: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction456);
                    ite_stmt19=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt19.getTree());

                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:92:13: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction478);
                    while_stmt20=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:93:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction498);
                    funcall21=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall21.getTree());

                    }
                    break;
                case 5 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:94:13: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction521);
                    return_stmt22=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:95:13: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction540);
                    read23=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read23.getTree());

                    }
                    break;
                case 7 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:96:13: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction566);
                    write24=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write24.getTree());

                    }
                    break;
                case 8 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:98:9: 
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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:101:1: assign : ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) | array_access eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] array_access expr ) );
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
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:101:9: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) | array_access eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] array_access expr ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EQUAL) ) {
                    alt7=1;
                }
                else if ( (LA7_1==59) ) {
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
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:101:13: ID eq= EQUAL expr
                    {
                    ID25=(Token)match(input,ID,FOLLOW_ID_in_assign627);  
                    stream_ID.add(ID25);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign631);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_expr_in_assign633);
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
                    // 101:30: -> ^( ASSIGN[$eq,\":=\"] ID expr )
                    {
                        // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:101:33: ^( ASSIGN[$eq,\":=\"] ID expr )
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
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:102:13: array_access eq= EQUAL expr
                    {
                    pushFollow(FOLLOW_array_access_in_assign658);
                    array_access27=array_access();

                    state._fsp--;

                    stream_array_access.add(array_access27.getTree());

                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign662);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_expr_in_assign664);
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
                    // 102:40: -> ^( ASSIGN[$eq,\":=\"] array_access expr )
                    {
                        // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:102:43: ^( ASSIGN[$eq,\":=\"] array_access expr )
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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:106:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
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
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:106:13: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:106:17: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF29=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt698); 
            IF29_tree = 
            (AslTree)adaptor.create(IF29)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF29_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt701);
            expr30=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr30.getTree());

            THEN31=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt703); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt706);
            block_instructions32=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions32.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:106:51: ( ELSE ! block_instructions )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ELSE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:106:52: ELSE ! block_instructions
                    {
                    ELSE33=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt709); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt712);
                    block_instructions34=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions34.getTree());

                    }
                    break;

            }


            ENDIF35=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt716); 

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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:110:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
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
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:110:13: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:110:17: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE36=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt742); 
            WHILE36_tree = 
            (AslTree)adaptor.create(WHILE36)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE36_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt745);
            expr37=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr37.getTree());

            DO38=(Token)match(input,DO,FOLLOW_DO_in_while_stmt747); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt750);
            block_instructions39=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions39.getTree());

            ENDWHILE40=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt752); 

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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:114:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN41=null;
        AslParser.expr_return expr42 =null;


        AslTree RETURN41_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:114:13: ( RETURN ^ ( expr )? )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:114:17: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN41=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt777); 
            RETURN41_tree = 
            (AslTree)adaptor.create(RETURN41)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN41_tree, root_0);


            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:114:25: ( expr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==SUM||LA9_0==TRUE||LA9_0==53) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:114:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt780);
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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:118:1: read : READ ^ ( ID | array_access ) ;
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
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:118:9: ( READ ^ ( ID | array_access ) )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:118:13: READ ^ ( ID | array_access )
            {
            root_0 = (AslTree)adaptor.nil();


            READ43=(Token)match(input,READ,FOLLOW_READ_in_read804); 
            READ43_tree = 
            (AslTree)adaptor.create(READ43)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ43_tree, root_0);


            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:118:19: ( ID | array_access )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==59) ) {
                    alt10=2;
                }
                else if ( ((LA10_1 >= ELSE && LA10_1 <= ENDWHILE)||LA10_1==58) ) {
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
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:118:20: ID
                    {
                    ID44=(Token)match(input,ID,FOLLOW_ID_in_read808); 
                    ID44_tree = 
                    (AslTree)adaptor.create(ID44)
                    ;
                    adaptor.addChild(root_0, ID44_tree);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:118:25: array_access
                    {
                    pushFollow(FOLLOW_array_access_in_read812);
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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:122:1: write : WRITE ^ ( expr | STRING ) ;
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
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:122:9: ( WRITE ^ ( expr | STRING ) )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:122:13: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE46=(Token)match(input,WRITE,FOLLOW_WRITE_in_write835); 
            WRITE46_tree = 
            (AslTree)adaptor.create(WRITE46)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE46_tree, root_0);


            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:122:20: ( expr | STRING )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==FALSE||LA11_0==ID||LA11_0==INT||LA11_0==MINUS||LA11_0==NOT||LA11_0==PLUS||LA11_0==SUM||LA11_0==TRUE||LA11_0==53) ) {
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
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:122:21: expr
                    {
                    pushFollow(FOLLOW_expr_in_write839);
                    expr47=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr47.getTree());

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:122:28: STRING
                    {
                    STRING48=(Token)match(input,STRING,FOLLOW_STRING_in_write843); 
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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:126:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR50=null;
        AslParser.boolterm_return boolterm49 =null;

        AslParser.boolterm_return boolterm51 =null;


        AslTree OR50_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:126:9: ( boolterm ( OR ^ boolterm )* )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:126:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr868);
            boolterm49=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm49.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:126:22: ( OR ^ boolterm )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==OR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:126:23: OR ^ boolterm
            	    {
            	    OR50=(Token)match(input,OR,FOLLOW_OR_in_expr871); 
            	    OR50_tree = 
            	    (AslTree)adaptor.create(OR50)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR50_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr874);
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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:129:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND53=null;
        AslParser.boolfact_return boolfact52 =null;

        AslParser.boolfact_return boolfact54 =null;


        AslTree AND53_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:129:9: ( boolfact ( AND ^ boolfact )* )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:129:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm894);
            boolfact52=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact52.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:129:22: ( AND ^ boolfact )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==AND) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:129:23: AND ^ boolfact
            	    {
            	    AND53=(Token)match(input,AND,FOLLOW_AND_in_boolterm897); 
            	    AND53_tree = 
            	    (AslTree)adaptor.create(AND53)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND53_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm900);
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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:132:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
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
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:132:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:132:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact920);
            num_expr55=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr55.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:132:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EQUAL||(LA15_0 >= GE && LA15_0 <= GT)||LA15_0==LE||LA15_0==LT||LA15_0==NOT_EQUAL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:132:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:132:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
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
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:132:24: EQUAL ^
                            {
                            EQUAL56=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact924); 
                            EQUAL56_tree = 
                            (AslTree)adaptor.create(EQUAL56)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL56_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:132:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL57=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact929); 
                            NOT_EQUAL57_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL57)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL57_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:132:46: LT ^
                            {
                            LT58=(Token)match(input,LT,FOLLOW_LT_in_boolfact934); 
                            LT58_tree = 
                            (AslTree)adaptor.create(LT58)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT58_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:132:52: LE ^
                            {
                            LE59=(Token)match(input,LE,FOLLOW_LE_in_boolfact939); 
                            LE59_tree = 
                            (AslTree)adaptor.create(LE59)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE59_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:132:58: GT ^
                            {
                            GT60=(Token)match(input,GT,FOLLOW_GT_in_boolfact944); 
                            GT60_tree = 
                            (AslTree)adaptor.create(GT60)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT60_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:132:64: GE ^
                            {
                            GE61=(Token)match(input,GE,FOLLOW_GE_in_boolfact949); 
                            GE61_tree = 
                            (AslTree)adaptor.create(GE61)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE61_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact953);
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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:135:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
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
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:135:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:135:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr973);
            term63=term();

            state._fsp--;

            adaptor.addChild(root_0, term63.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:135:18: ( ( PLUS ^| MINUS ^) term )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==MINUS||LA17_0==PLUS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:135:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:135:20: ( PLUS ^| MINUS ^)
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
            	            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:135:21: PLUS ^
            	            {
            	            PLUS64=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr978); 
            	            PLUS64_tree = 
            	            (AslTree)adaptor.create(PLUS64)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS64_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:135:29: MINUS ^
            	            {
            	            MINUS65=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr983); 
            	            MINUS65_tree = 
            	            (AslTree)adaptor.create(MINUS65)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS65_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr987);
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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:138:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
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
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:138:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:138:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1011);
            factor67=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor67.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:138:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==DIV||(LA19_0 >= MOD && LA19_0 <= MUL)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:138:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:138:22: ( MUL ^| DIV ^| MOD ^)
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
            	            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:138:23: MUL ^
            	            {
            	            MUL68=(Token)match(input,MUL,FOLLOW_MUL_in_term1016); 
            	            MUL68_tree = 
            	            (AslTree)adaptor.create(MUL68)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL68_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:138:30: DIV ^
            	            {
            	            DIV69=(Token)match(input,DIV,FOLLOW_DIV_in_term1021); 
            	            DIV69_tree = 
            	            (AslTree)adaptor.create(DIV69)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV69_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:138:37: MOD ^
            	            {
            	            MOD70=(Token)match(input,MOD,FOLLOW_MOD_in_term1026); 
            	            MOD70_tree = 
            	            (AslTree)adaptor.create(MOD70)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD70_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1030);
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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:141:1: factor : ( NOT ^| PLUS ^| MINUS ^)? factorial ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT72=null;
        Token PLUS73=null;
        Token MINUS74=null;
        AslParser.factorial_return factorial75 =null;


        AslTree NOT72_tree=null;
        AslTree PLUS73_tree=null;
        AslTree MINUS74_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:141:9: ( ( NOT ^| PLUS ^| MINUS ^)? factorial )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:141:13: ( NOT ^| PLUS ^| MINUS ^)? factorial
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:141:13: ( NOT ^| PLUS ^| MINUS ^)?
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
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:141:14: NOT ^
                    {
                    NOT72=(Token)match(input,NOT,FOLLOW_NOT_in_factor1053); 
                    NOT72_tree = 
                    (AslTree)adaptor.create(NOT72)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT72_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:141:21: PLUS ^
                    {
                    PLUS73=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1058); 
                    PLUS73_tree = 
                    (AslTree)adaptor.create(PLUS73)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS73_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:141:29: MINUS ^
                    {
                    MINUS74=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1063); 
                    MINUS74_tree = 
                    (AslTree)adaptor.create(MINUS74)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS74_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_factorial_in_factor1068);
            factorial75=factorial();

            state._fsp--;

            adaptor.addChild(root_0, factorial75.getTree());

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


    public static class factorial_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factorial"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:144:1: factorial : atom ( FACT ^)* ;
    public final AslParser.factorial_return factorial() throws RecognitionException {
        AslParser.factorial_return retval = new AslParser.factorial_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FACT77=null;
        AslParser.atom_return atom76 =null;


        AslTree FACT77_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:144:10: ( atom ( FACT ^)* )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:144:13: atom ( FACT ^)*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_atom_in_factorial1085);
            atom76=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom76.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:144:18: ( FACT ^)*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==FACT) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:144:19: FACT ^
            	    {
            	    FACT77=(Token)match(input,FACT,FOLLOW_FACT_in_factorial1088); 
            	    FACT77_tree = 
            	    (AslTree)adaptor.create(FACT77)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(FACT77_tree, root_0);


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "factorial"


    public static class atom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:150:1: atom : ( ID ( '.' s= SIZE -> ^( SIZECALL[$s, \"SIZE\"] ID ) | -> ID ) | array_access | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall (ac= '[' expr ']' -> ^( ARRAY_ACCESS[$ac, \"ARRAY_ACCESS\"] funcall expr ) | '.' s= SIZE -> ^( SIZECALL[$s, \"SIZE\"] funcall ) | -> funcall ) | suma | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token s=null;
        Token b=null;
        Token ac=null;
        Token ID78=null;
        Token char_literal79=null;
        Token INT81=null;
        Token char_literal84=null;
        Token char_literal85=null;
        Token char_literal87=null;
        Token char_literal89=null;
        AslParser.array_access_return array_access80 =null;

        AslParser.funcall_return funcall82 =null;

        AslParser.expr_return expr83 =null;

        AslParser.suma_return suma86 =null;

        AslParser.expr_return expr88 =null;


        AslTree s_tree=null;
        AslTree b_tree=null;
        AslTree ac_tree=null;
        AslTree ID78_tree=null;
        AslTree char_literal79_tree=null;
        AslTree INT81_tree=null;
        AslTree char_literal84_tree=null;
        AslTree char_literal85_tree=null;
        AslTree char_literal87_tree=null;
        AslTree char_literal89_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_SIZE=new RewriteRuleTokenStream(adaptor,"token SIZE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_funcall=new RewriteRuleSubtreeStream(adaptor,"rule funcall");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:150:9: ( ID ( '.' s= SIZE -> ^( SIZECALL[$s, \"SIZE\"] ID ) | -> ID ) | array_access | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall (ac= '[' expr ']' -> ^( ARRAY_ACCESS[$ac, \"ARRAY_ACCESS\"] funcall expr ) | '.' s= SIZE -> ^( SIZECALL[$s, \"SIZE\"] funcall ) | -> funcall ) | suma | '(' ! expr ')' !)
            int alt25=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 59:
                    {
                    alt25=2;
                    }
                    break;
                case 53:
                    {
                    alt25=5;
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
                case FACT:
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
                case 55:
                case 56:
                case 57:
                case 58:
                case 60:
                    {
                    alt25=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;

                }

                }
                break;
            case INT:
                {
                alt25=3;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt25=4;
                }
                break;
            case SUM:
                {
                alt25=6;
                }
                break;
            case 53:
                {
                alt25=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:150:13: ID ( '.' s= SIZE -> ^( SIZECALL[$s, \"SIZE\"] ID ) | -> ID )
                    {
                    ID78=(Token)match(input,ID,FOLLOW_ID_in_atom1116);  
                    stream_ID.add(ID78);


                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:150:16: ( '.' s= SIZE -> ^( SIZECALL[$s, \"SIZE\"] ID ) | -> ID )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==57) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==AND||(LA22_0 >= DIV && LA22_0 <= EQUAL)||LA22_0==FACT||(LA22_0 >= GE && LA22_0 <= GT)||LA22_0==LE||(LA22_0 >= LT && LA22_0 <= MUL)||(LA22_0 >= NOT_EQUAL && LA22_0 <= OR)||LA22_0==PLUS||LA22_0==THEN||(LA22_0 >= 55 && LA22_0 <= 56)||LA22_0==58||LA22_0==60) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;

                    }
                    switch (alt22) {
                        case 1 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:150:18: '.' s= SIZE
                            {
                            char_literal79=(Token)match(input,57,FOLLOW_57_in_atom1120);  
                            stream_57.add(char_literal79);


                            s=(Token)match(input,SIZE,FOLLOW_SIZE_in_atom1124);  
                            stream_SIZE.add(s);


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
                            // 150:30: -> ^( SIZECALL[$s, \"SIZE\"] ID )
                            {
                                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:150:33: ^( SIZECALL[$s, \"SIZE\"] ID )
                                {
                                AslTree root_1 = (AslTree)adaptor.nil();
                                root_1 = (AslTree)adaptor.becomeRoot(
                                (AslTree)adaptor.create(SIZECALL, s, "SIZE")
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
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:151:30: 
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
                            // 151:30: -> ID
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
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:153:13: array_access
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_array_access_in_atom1198);
                    array_access80=array_access();

                    state._fsp--;

                    adaptor.addChild(root_0, array_access80.getTree());

                    }
                    break;
                case 3 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:154:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT81=(Token)match(input,INT,FOLLOW_INT_in_atom1212); 
                    INT81_tree = 
                    (AslTree)adaptor.create(INT81)
                    ;
                    adaptor.addChild(root_0, INT81_tree);


                    }
                    break;
                case 4 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:155:13: (b= TRUE |b= FALSE )
                    {
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:155:13: (b= TRUE |b= FALSE )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==TRUE) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==FALSE) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;

                    }
                    switch (alt23) {
                        case 1 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:155:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1229);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:155:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1235);  
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
                    // 155:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:155:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:156:13: funcall (ac= '[' expr ']' -> ^( ARRAY_ACCESS[$ac, \"ARRAY_ACCESS\"] funcall expr ) | '.' s= SIZE -> ^( SIZECALL[$s, \"SIZE\"] funcall ) | -> funcall )
                    {
                    pushFollow(FOLLOW_funcall_in_atom1258);
                    funcall82=funcall();

                    state._fsp--;

                    stream_funcall.add(funcall82.getTree());

                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:156:21: (ac= '[' expr ']' -> ^( ARRAY_ACCESS[$ac, \"ARRAY_ACCESS\"] funcall expr ) | '.' s= SIZE -> ^( SIZECALL[$s, \"SIZE\"] funcall ) | -> funcall )
                    int alt24=3;
                    switch ( input.LA(1) ) {
                    case 59:
                        {
                        alt24=1;
                        }
                        break;
                    case 57:
                        {
                        alt24=2;
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
                    case FACT:
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
                    case 55:
                    case 56:
                    case 58:
                    case 60:
                        {
                        alt24=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;

                    }

                    switch (alt24) {
                        case 1 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:156:22: ac= '[' expr ']'
                            {
                            ac=(Token)match(input,59,FOLLOW_59_in_atom1263);  
                            stream_59.add(ac);


                            pushFollow(FOLLOW_expr_in_atom1265);
                            expr83=expr();

                            state._fsp--;

                            stream_expr.add(expr83.getTree());

                            char_literal84=(Token)match(input,60,FOLLOW_60_in_atom1267);  
                            stream_60.add(char_literal84);


                            // AST REWRITE
                            // elements: expr, funcall
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AslTree)adaptor.nil();
                            // 156:38: -> ^( ARRAY_ACCESS[$ac, \"ARRAY_ACCESS\"] funcall expr )
                            {
                                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:156:41: ^( ARRAY_ACCESS[$ac, \"ARRAY_ACCESS\"] funcall expr )
                                {
                                AslTree root_1 = (AslTree)adaptor.nil();
                                root_1 = (AslTree)adaptor.becomeRoot(
                                (AslTree)adaptor.create(ARRAY_ACCESS, ac, "ARRAY_ACCESS")
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
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:157:23: '.' s= SIZE
                            {
                            char_literal85=(Token)match(input,57,FOLLOW_57_in_atom1302);  
                            stream_57.add(char_literal85);


                            s=(Token)match(input,SIZE,FOLLOW_SIZE_in_atom1306);  
                            stream_SIZE.add(s);


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
                            // 157:40: -> ^( SIZECALL[$s, \"SIZE\"] funcall )
                            {
                                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:157:43: ^( SIZECALL[$s, \"SIZE\"] funcall )
                                {
                                AslTree root_1 = (AslTree)adaptor.nil();
                                root_1 = (AslTree)adaptor.becomeRoot(
                                (AslTree)adaptor.create(SIZECALL, s, "SIZE")
                                , root_1);

                                adaptor.addChild(root_1, stream_funcall.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 3 :
                            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:158:38: 
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
                            // 158:38: -> funcall
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
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:160:13: suma
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_suma_in_atom1398);
                    suma86=suma();

                    state._fsp--;

                    adaptor.addChild(root_0, suma86.getTree());

                    }
                    break;
                case 7 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:161:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal87=(Token)match(input,53,FOLLOW_53_in_atom1412); 

                    pushFollow(FOLLOW_expr_in_atom1415);
                    expr88=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr88.getTree());

                    char_literal89=(Token)match(input,55,FOLLOW_55_in_atom1417); 

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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:164:1: array_access : ID ac= '[' expr ']' -> ^( ARRAY_ACCESS[$ac,\"ARRAY_ACCESS\"] ID expr ) ;
    public final AslParser.array_access_return array_access() throws RecognitionException {
        AslParser.array_access_return retval = new AslParser.array_access_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ac=null;
        Token ID90=null;
        Token char_literal92=null;
        AslParser.expr_return expr91 =null;


        AslTree ac_tree=null;
        AslTree ID90_tree=null;
        AslTree char_literal92_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:165:9: ( ID ac= '[' expr ']' -> ^( ARRAY_ACCESS[$ac,\"ARRAY_ACCESS\"] ID expr ) )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:165:13: ID ac= '[' expr ']'
            {
            ID90=(Token)match(input,ID,FOLLOW_ID_in_array_access1447);  
            stream_ID.add(ID90);


            ac=(Token)match(input,59,FOLLOW_59_in_array_access1451);  
            stream_59.add(ac);


            pushFollow(FOLLOW_expr_in_array_access1453);
            expr91=expr();

            state._fsp--;

            stream_expr.add(expr91.getTree());

            char_literal92=(Token)match(input,60,FOLLOW_60_in_array_access1455);  
            stream_60.add(char_literal92);


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
            // 165:32: -> ^( ARRAY_ACCESS[$ac,\"ARRAY_ACCESS\"] ID expr )
            {
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:165:35: ^( ARRAY_ACCESS[$ac,\"ARRAY_ACCESS\"] ID expr )
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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:169:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID93=null;
        Token char_literal94=null;
        Token char_literal96=null;
        AslParser.expr_list_return expr_list95 =null;


        AslTree ID93_tree=null;
        AslTree char_literal94_tree=null;
        AslTree char_literal96_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:169:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:169:13: ID '(' ( expr_list )? ')'
            {
            ID93=(Token)match(input,ID,FOLLOW_ID_in_funcall1486);  
            stream_ID.add(ID93);


            char_literal94=(Token)match(input,53,FOLLOW_53_in_funcall1488);  
            stream_53.add(char_literal94);


            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:169:20: ( expr_list )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==FALSE||LA26_0==ID||LA26_0==INT||LA26_0==MINUS||LA26_0==NOT||LA26_0==PLUS||LA26_0==SUM||LA26_0==TRUE||LA26_0==53) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:169:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1490);
                    expr_list95=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list95.getTree());

                    }
                    break;

            }


            char_literal96=(Token)match(input,55,FOLLOW_55_in_funcall1493);  
            stream_55.add(char_literal96);


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
            // 169:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:169:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:169:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:169:61: ( expr_list )?
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
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:173:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal98=null;
        AslParser.expr_return expr97 =null;

        AslParser.expr_return expr99 =null;


        AslTree char_literal98_tree=null;

        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:173:10: ( expr ( ',' ! expr )* )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:173:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1526);
            expr97=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr97.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:173:18: ( ',' ! expr )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==56) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:173:19: ',' ! expr
            	    {
            	    char_literal98=(Token)match(input,56,FOLLOW_56_in_expr_list1529); 

            	    pushFollow(FOLLOW_expr_in_expr_list1532);
            	    expr99=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr99.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
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


    public static class suma_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "suma"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:176:1: suma : SUM ( '(' sum_list ')' -> sum_list | '()' -> INT[\"0\"] ) ;
    public final AslParser.suma_return suma() throws RecognitionException {
        AslParser.suma_return retval = new AslParser.suma_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SUM100=null;
        Token char_literal101=null;
        Token char_literal103=null;
        Token string_literal104=null;
        AslParser.sum_list_return sum_list102 =null;


        AslTree SUM100_tree=null;
        AslTree char_literal101_tree=null;
        AslTree char_literal103_tree=null;
        AslTree string_literal104_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_SUM=new RewriteRuleTokenStream(adaptor,"token SUM");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_sum_list=new RewriteRuleSubtreeStream(adaptor,"rule sum_list");
        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:176:9: ( SUM ( '(' sum_list ')' -> sum_list | '()' -> INT[\"0\"] ) )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:176:13: SUM ( '(' sum_list ')' -> sum_list | '()' -> INT[\"0\"] )
            {
            SUM100=(Token)match(input,SUM,FOLLOW_SUM_in_suma1556);  
            stream_SUM.add(SUM100);


            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:176:17: ( '(' sum_list ')' -> sum_list | '()' -> INT[\"0\"] )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==53) ) {
                alt28=1;
            }
            else if ( (LA28_0==54) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:176:18: '(' sum_list ')'
                    {
                    char_literal101=(Token)match(input,53,FOLLOW_53_in_suma1559);  
                    stream_53.add(char_literal101);


                    pushFollow(FOLLOW_sum_list_in_suma1561);
                    sum_list102=sum_list();

                    state._fsp--;

                    stream_sum_list.add(sum_list102.getTree());

                    char_literal103=(Token)match(input,55,FOLLOW_55_in_suma1563);  
                    stream_55.add(char_literal103);


                    // AST REWRITE
                    // elements: sum_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 176:35: -> sum_list
                    {
                        adaptor.addChild(root_0, stream_sum_list.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:177:19: '()'
                    {
                    string_literal104=(Token)match(input,54,FOLLOW_54_in_suma1587);  
                    stream_54.add(string_literal104);


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
                    // 177:35: -> INT[\"0\"]
                    {
                        adaptor.addChild(root_0, 
                        (AslTree)adaptor.create(INT, "0")
                        );

                    }


                    retval.tree = root_0;

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
    // $ANTLR end "suma"


    public static class sum_list_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sum_list"
    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:181:1: sum_list : expr ( ',' sum_list -> ^( PLUS[\"+\"] expr sum_list ) | -> expr ) ;
    public final AslParser.sum_list_return sum_list() throws RecognitionException {
        AslParser.sum_list_return retval = new AslParser.sum_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal106=null;
        AslParser.expr_return expr105 =null;

        AslParser.sum_list_return sum_list107 =null;


        AslTree char_literal106_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_sum_list=new RewriteRuleSubtreeStream(adaptor,"rule sum_list");
        try {
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:181:9: ( expr ( ',' sum_list -> ^( PLUS[\"+\"] expr sum_list ) | -> expr ) )
            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:181:13: expr ( ',' sum_list -> ^( PLUS[\"+\"] expr sum_list ) | -> expr )
            {
            pushFollow(FOLLOW_expr_in_sum_list1639);
            expr105=expr();

            state._fsp--;

            stream_expr.add(expr105.getTree());

            // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:181:18: ( ',' sum_list -> ^( PLUS[\"+\"] expr sum_list ) | -> expr )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==56) ) {
                alt29=1;
            }
            else if ( (LA29_0==55) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:181:19: ',' sum_list
                    {
                    char_literal106=(Token)match(input,56,FOLLOW_56_in_sum_list1642);  
                    stream_56.add(char_literal106);


                    pushFollow(FOLLOW_sum_list_in_sum_list1644);
                    sum_list107=sum_list();

                    state._fsp--;

                    stream_sum_list.add(sum_list107.getTree());

                    // AST REWRITE
                    // elements: sum_list, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 181:32: -> ^( PLUS[\"+\"] expr sum_list )
                    {
                        // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:181:35: ^( PLUS[\"+\"] expr sum_list )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PLUS, "+")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_1, stream_sum_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/brutus729/Documents/FIB/CL/labs/ASL/Asl/src/parser/Asl.g:182:32: 
                    {
                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 182:32: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;

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
    // $ANTLR end "sum_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog189 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_EOF_in_prog192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func234 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_func237 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_params_in_func239 = new BitSet(new long[]{0x0406060003000000L});
    public static final BitSet FOLLOW_block_instructions_in_func241 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_params263 = new BitSet(new long[]{0x0090000001000000L});
    public static final BitSet FOLLOW_paramlist_in_params265 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_params268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist294 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_paramlist297 = new BitSet(new long[]{0x0010000001000000L});
    public static final BitSet FOLLOW_param_in_paramlist300 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_52_in_param325 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_param329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions388 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_block_instructions391 = new BitSet(new long[]{0x0406060003000000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions393 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign627 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_EQUAL_in_assign631 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_expr_in_assign633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_access_in_assign658 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_EQUAL_in_assign662 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_expr_in_assign664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt698 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt701 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt703 = new BitSet(new long[]{0x0406060003000000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt706 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt709 = new BitSet(new long[]{0x0406060003000000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt712 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt742 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_expr_in_while_stmt745 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DO_in_while_stmt747 = new BitSet(new long[]{0x0406060003000000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt750 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt777 = new BitSet(new long[]{0x0021404485080002L});
    public static final BitSet FOLLOW_expr_in_return_stmt780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read804 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_read808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_access_in_read812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write835 = new BitSet(new long[]{0x0021604485080000L});
    public static final BitSet FOLLOW_expr_in_write839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr868 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_OR_in_expr871 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_boolterm_in_expr874 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm894 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm897 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm900 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact920 = new BitSet(new long[]{0x0000000848C10002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact924 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact929 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_LT_in_boolfact934 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_LE_in_boolfact939 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_GT_in_boolfact944 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_GE_in_boolfact949 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr973 = new BitSet(new long[]{0x0000004080000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr978 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr983 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_term_in_num_expr987 = new BitSet(new long[]{0x0000004080000002L});
    public static final BitSet FOLLOW_factor_in_term1011 = new BitSet(new long[]{0x0000000300000402L});
    public static final BitSet FOLLOW_MUL_in_term1016 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_DIV_in_term1021 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_MOD_in_term1026 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_factor_in_term1030 = new BitSet(new long[]{0x0000000300000402L});
    public static final BitSet FOLLOW_NOT_in_factor1053 = new BitSet(new long[]{0x0021400005080000L});
    public static final BitSet FOLLOW_PLUS_in_factor1058 = new BitSet(new long[]{0x0021400005080000L});
    public static final BitSet FOLLOW_MINUS_in_factor1063 = new BitSet(new long[]{0x0021400005080000L});
    public static final BitSet FOLLOW_factorial_in_factor1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_factorial1085 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_FACT_in_factorial1088 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ID_in_atom1116 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_atom1120 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SIZE_in_atom1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_access_in_atom1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1258 = new BitSet(new long[]{0x0A00000000000002L});
    public static final BitSet FOLLOW_59_in_atom1263 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_expr_in_atom1265 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_atom1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_atom1302 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SIZE_in_atom1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suma_in_atom1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_atom1412 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_expr_in_atom1415 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_atom1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_array_access1447 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_array_access1451 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_expr_in_array_access1453 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_array_access1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1486 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_funcall1488 = new BitSet(new long[]{0x00A1404485080000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1490 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_funcall1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1526 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_expr_list1529 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_expr_in_expr_list1532 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_SUM_in_suma1556 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_53_in_suma1559 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_sum_list_in_suma1561 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_suma1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_suma1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_sum_list1639 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_sum_list1642 = new BitSet(new long[]{0x0021404485080000L});
    public static final BitSet FOLLOW_sum_list_in_sum_list1644 = new BitSet(new long[]{0x0000000000000002L});

}