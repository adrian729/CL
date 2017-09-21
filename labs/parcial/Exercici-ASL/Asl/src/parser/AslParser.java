// $ANTLR 3.4 /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g 2017-03-14 20:15:40

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "BOOLEAN", "BRACES_LEXPRS", "BRACKETS_LEXPRS", "COMMENT", "DIV", "DO", "ELSE", "ENDFOR", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FOREACH", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "IN", "INT", "ISBOOL", "ISINT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "READ", "RETURN", "STRING", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "';'", "'['", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int BOOLEAN=7;
    public static final int BRACES_LEXPRS=8;
    public static final int BRACKETS_LEXPRS=9;
    public static final int COMMENT=10;
    public static final int DIV=11;
    public static final int DO=12;
    public static final int ELSE=13;
    public static final int ENDFOR=14;
    public static final int ENDFUNC=15;
    public static final int ENDIF=16;
    public static final int ENDWHILE=17;
    public static final int EQUAL=18;
    public static final int ESC_SEQ=19;
    public static final int FALSE=20;
    public static final int FOREACH=21;
    public static final int FUNC=22;
    public static final int FUNCALL=23;
    public static final int GE=24;
    public static final int GT=25;
    public static final int ID=26;
    public static final int IF=27;
    public static final int IN=28;
    public static final int INT=29;
    public static final int ISBOOL=30;
    public static final int ISINT=31;
    public static final int LE=32;
    public static final int LIST_FUNCTIONS=33;
    public static final int LIST_INSTR=34;
    public static final int LT=35;
    public static final int MINUS=36;
    public static final int MOD=37;
    public static final int MUL=38;
    public static final int NOT=39;
    public static final int NOT_EQUAL=40;
    public static final int OR=41;
    public static final int PARAMS=42;
    public static final int PLUS=43;
    public static final int PREF=44;
    public static final int PVALUE=45;
    public static final int READ=46;
    public static final int RETURN=47;
    public static final int STRING=48;
    public static final int THEN=49;
    public static final int TRUE=50;
    public static final int WHILE=51;
    public static final int WRITE=52;
    public static final int WS=53;

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
    public String getGrammarFileName() { return "/home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:63:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:63:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:63:8: ( func )+ EOF
            {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:63:8: ( func )+
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
            	    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:63:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog182);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog185);  
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
            // 63:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:63:21: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:67:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
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
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:67:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:67:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func224); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func227); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func229);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func231);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func233); 

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
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:71:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
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
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:71:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:71:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,55,FOLLOW_55_in_params252);  
            stream_55.add(char_literal8);


            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:71:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==54) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:71:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params254);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,56,FOLLOW_56_in_params257);  
            stream_56.add(char_literal10);


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
            // 71:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:71:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:71:41: ( paramlist )?
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
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:75:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:75:10: ( param ( ',' ! param )* )
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:75:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist283);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:75:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==57) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:75:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,57,FOLLOW_57_in_paramlist286); 

            	    pushFollow(FOLLOW_param_in_paramlist289);
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
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:80:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");

        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:80:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==54) ) {
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
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:80:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,54,FOLLOW_54_in_param314);  
                    stream_54.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param318);  
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
                    // 80:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:80:26: ^( PREF[$id,$id.text] )
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
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:81:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param341);  
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
                    // 81:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:81:22: ^( PVALUE[$id,$id.text] )
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
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:85:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
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
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:86:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:86:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions375);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:86:24: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==58) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:86:25: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,58,FOLLOW_58_in_block_instructions378);  
            	    stream_58.add(char_literal16);


            	    pushFollow(FOLLOW_instruction_in_block_instructions380);
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
            // 87:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:87:16: ^( LIST_INSTR ( instruction )+ )
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
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:91:1: instruction : ( assign | ite_stmt | while_stmt | foreach_stmt | funcall | return_stmt | read | write |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign18 =null;

        AslParser.ite_stmt_return ite_stmt19 =null;

        AslParser.while_stmt_return while_stmt20 =null;

        AslParser.foreach_stmt_return foreach_stmt21 =null;

        AslParser.funcall_return funcall22 =null;

        AslParser.return_stmt_return return_stmt23 =null;

        AslParser.read_return read24 =null;

        AslParser.write_return write25 =null;



        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:92:9: ( assign | ite_stmt | while_stmt | foreach_stmt | funcall | return_stmt | read | write |)
            int alt6=9;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EQUAL) ) {
                    alt6=1;
                }
                else if ( (LA6_1==55) ) {
                    alt6=5;
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
            case FOREACH:
                {
                alt6=4;
                }
                break;
            case RETURN:
                {
                alt6=6;
                }
                break;
            case READ:
                {
                alt6=7;
                }
                break;
            case WRITE:
                {
                alt6=8;
                }
                break;
            case ELSE:
            case ENDFOR:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 58:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:92:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction429);
                    assign18=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign18.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:93:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction451);
                    ite_stmt19=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt19.getTree());

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:94:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction471);
                    while_stmt20=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:95:13: foreach_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_foreach_stmt_in_instruction491);
                    foreach_stmt21=foreach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, foreach_stmt21.getTree());

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:96:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction509);
                    funcall22=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall22.getTree());

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:97:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction530);
                    return_stmt23=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt23.getTree());

                    }
                    break;
                case 7 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:98:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction547);
                    read24=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read24.getTree());

                    }
                    break;
                case 8 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:99:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction572);
                    write25=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write25.getTree());

                    }
                    break;
                case 9 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:101:9: 
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
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:104:1: assign : ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID26=null;
        AslParser.expr_return expr27 =null;


        AslTree eq_tree=null;
        AslTree ID26_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:104:8: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:104:10: ID eq= EQUAL expr
            {
            ID26=(Token)match(input,ID,FOLLOW_ID_in_assign630);  
            stream_ID.add(ID26);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign634);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign636);
            expr27=expr();

            state._fsp--;

            stream_expr.add(expr27.getTree());

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
            // 104:27: -> ^( ASSIGN[$eq,\":=\"] ID expr )
            {
                // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:104:30: ^( ASSIGN[$eq,\":=\"] ID expr )
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
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:108:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF28=null;
        Token THEN30=null;
        Token ELSE32=null;
        Token ENDIF34=null;
        AslParser.expr_return expr29 =null;

        AslParser.block_instructions_return block_instructions31 =null;

        AslParser.block_instructions_return block_instructions33 =null;


        AslTree IF28_tree=null;
        AslTree THEN30_tree=null;
        AslTree ELSE32_tree=null;
        AslTree ENDIF34_tree=null;

        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:108:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:108:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF28=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt665); 
            IF28_tree = 
            (AslTree)adaptor.create(IF28)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF28_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt668);
            expr29=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr29.getTree());

            THEN30=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt670); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt673);
            block_instructions31=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions31.getTree());

            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:108:46: ( ELSE ! block_instructions )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ELSE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:108:47: ELSE ! block_instructions
                    {
                    ELSE32=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt676); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt679);
                    block_instructions33=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions33.getTree());

                    }
                    break;

            }


            ENDIF34=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt683); 

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
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:112:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE35=null;
        Token DO37=null;
        Token ENDWHILE39=null;
        AslParser.expr_return expr36 =null;

        AslParser.block_instructions_return block_instructions38 =null;


        AslTree WHILE35_tree=null;
        AslTree DO37_tree=null;
        AslTree ENDWHILE39_tree=null;

        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:112:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:112:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE35=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt706); 
            WHILE35_tree = 
            (AslTree)adaptor.create(WHILE35)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE35_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt709);
            expr36=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr36.getTree());

            DO37=(Token)match(input,DO,FOLLOW_DO_in_while_stmt711); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt714);
            block_instructions38=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions38.getTree());

            ENDWHILE39=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt716); 

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


    public static class foreach_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "foreach_stmt"
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:116:1: foreach_stmt : FOREACH ^ ID IN ! foreach_arguments DO ! block_instructions ENDFOR !;
    public final AslParser.foreach_stmt_return foreach_stmt() throws RecognitionException {
        AslParser.foreach_stmt_return retval = new AslParser.foreach_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FOREACH40=null;
        Token ID41=null;
        Token IN42=null;
        Token DO44=null;
        Token ENDFOR46=null;
        AslParser.foreach_arguments_return foreach_arguments43 =null;

        AslParser.block_instructions_return block_instructions45 =null;


        AslTree FOREACH40_tree=null;
        AslTree ID41_tree=null;
        AslTree IN42_tree=null;
        AslTree DO44_tree=null;
        AslTree ENDFOR46_tree=null;

        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:116:13: ( FOREACH ^ ID IN ! foreach_arguments DO ! block_instructions ENDFOR !)
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:116:15: FOREACH ^ ID IN ! foreach_arguments DO ! block_instructions ENDFOR !
            {
            root_0 = (AslTree)adaptor.nil();


            FOREACH40=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_foreach_stmt750); 
            FOREACH40_tree = 
            (AslTree)adaptor.create(FOREACH40)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FOREACH40_tree, root_0);


            ID41=(Token)match(input,ID,FOLLOW_ID_in_foreach_stmt753); 
            ID41_tree = 
            (AslTree)adaptor.create(ID41)
            ;
            adaptor.addChild(root_0, ID41_tree);


            IN42=(Token)match(input,IN,FOLLOW_IN_in_foreach_stmt755); 

            pushFollow(FOLLOW_foreach_arguments_in_foreach_stmt758);
            foreach_arguments43=foreach_arguments();

            state._fsp--;

            adaptor.addChild(root_0, foreach_arguments43.getTree());

            DO44=(Token)match(input,DO,FOLLOW_DO_in_foreach_stmt760); 

            pushFollow(FOLLOW_block_instructions_in_foreach_stmt763);
            block_instructions45=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions45.getTree());

            ENDFOR46=(Token)match(input,ENDFOR,FOLLOW_ENDFOR_in_foreach_stmt765); 

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
    // $ANTLR end "foreach_stmt"


    public static class foreach_arguments_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "foreach_arguments"
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:118:1: foreach_arguments : ( '{' expr_list '}' -> ^( BRACES_LEXPRS expr_list ) | '[' expr_list ']' -> ^( BRACKETS_LEXPRS expr_list ) );
    public final AslParser.foreach_arguments_return foreach_arguments() throws RecognitionException {
        AslParser.foreach_arguments_return retval = new AslParser.foreach_arguments_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal47=null;
        Token char_literal49=null;
        Token char_literal50=null;
        Token char_literal52=null;
        AslParser.expr_list_return expr_list48 =null;

        AslParser.expr_list_return expr_list51 =null;


        AslTree char_literal47_tree=null;
        AslTree char_literal49_tree=null;
        AslTree char_literal50_tree=null;
        AslTree char_literal52_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:118:18: ( '{' expr_list '}' -> ^( BRACES_LEXPRS expr_list ) | '[' expr_list ']' -> ^( BRACKETS_LEXPRS expr_list ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==61) ) {
                alt8=1;
            }
            else if ( (LA8_0==59) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:119:9: '{' expr_list '}'
                    {
                    char_literal47=(Token)match(input,61,FOLLOW_61_in_foreach_arguments782);  
                    stream_61.add(char_literal47);


                    pushFollow(FOLLOW_expr_list_in_foreach_arguments784);
                    expr_list48=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list48.getTree());

                    char_literal49=(Token)match(input,62,FOLLOW_62_in_foreach_arguments786);  
                    stream_62.add(char_literal49);


                    // AST REWRITE
                    // elements: expr_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 119:29: -> ^( BRACES_LEXPRS expr_list )
                    {
                        // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:119:32: ^( BRACES_LEXPRS expr_list )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(BRACES_LEXPRS, "BRACES_LEXPRS")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:120:11: '[' expr_list ']'
                    {
                    char_literal50=(Token)match(input,59,FOLLOW_59_in_foreach_arguments808);  
                    stream_59.add(char_literal50);


                    pushFollow(FOLLOW_expr_list_in_foreach_arguments810);
                    expr_list51=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list51.getTree());

                    char_literal52=(Token)match(input,60,FOLLOW_60_in_foreach_arguments812);  
                    stream_60.add(char_literal52);


                    // AST REWRITE
                    // elements: expr_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 120:29: -> ^( BRACKETS_LEXPRS expr_list )
                    {
                        // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:120:32: ^( BRACKETS_LEXPRS expr_list )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(BRACKETS_LEXPRS, "BRACKETS_LEXPRS")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr_list.nextTree());

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
    // $ANTLR end "foreach_arguments"


    public static class return_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:124:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN53=null;
        AslParser.expr_return expr54 =null;


        AslTree RETURN53_tree=null;

        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:124:13: ( RETURN ^ ( expr )? )
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:124:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN53=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt838); 
            RETURN53_tree = 
            (AslTree)adaptor.create(RETURN53)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN53_tree, root_0);


            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:124:23: ( expr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FALSE||LA9_0==ID||(LA9_0 >= INT && LA9_0 <= ISINT)||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==TRUE||LA9_0==55) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:124:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt841);
                    expr54=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr54.getTree());

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
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:128:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ55=null;
        Token ID56=null;

        AslTree READ55_tree=null;
        AslTree ID56_tree=null;

        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:128:6: ( READ ^ ID )
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:128:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ55=(Token)match(input,READ,FOLLOW_READ_in_read860); 
            READ55_tree = 
            (AslTree)adaptor.create(READ55)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ55_tree, root_0);


            ID56=(Token)match(input,ID,FOLLOW_ID_in_read863); 
            ID56_tree = 
            (AslTree)adaptor.create(ID56)
            ;
            adaptor.addChild(root_0, ID56_tree);


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
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:132:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE57=null;
        Token STRING59=null;
        AslParser.expr_return expr58 =null;


        AslTree WRITE57_tree=null;
        AslTree STRING59_tree=null;

        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:132:7: ( WRITE ^ ( expr | STRING ) )
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:132:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE57=(Token)match(input,WRITE,FOLLOW_WRITE_in_write883); 
            WRITE57_tree = 
            (AslTree)adaptor.create(WRITE57)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE57_tree, root_0);


            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:132:18: ( expr | STRING )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FALSE||LA10_0==ID||(LA10_0 >= INT && LA10_0 <= ISINT)||LA10_0==MINUS||LA10_0==NOT||LA10_0==PLUS||LA10_0==TRUE||LA10_0==55) ) {
                alt10=1;
            }
            else if ( (LA10_0==STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:132:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write887);
                    expr58=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr58.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:132:26: STRING
                    {
                    STRING59=(Token)match(input,STRING,FOLLOW_STRING_in_write891); 
                    STRING59_tree = 
                    (AslTree)adaptor.create(STRING59)
                    ;
                    adaptor.addChild(root_0, STRING59_tree);


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
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:136:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR61=null;
        AslParser.boolterm_return boolterm60 =null;

        AslParser.boolterm_return boolterm62 =null;


        AslTree OR61_tree=null;

        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:136:9: ( boolterm ( OR ^ boolterm )* )
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:136:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr916);
            boolterm60=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm60.getTree());

            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:136:22: ( OR ^ boolterm )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==OR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:136:23: OR ^ boolterm
            	    {
            	    OR61=(Token)match(input,OR,FOLLOW_OR_in_expr919); 
            	    OR61_tree = 
            	    (AslTree)adaptor.create(OR61)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR61_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr922);
            	    boolterm62=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm62.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:139:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND64=null;
        AslParser.boolfact_return boolfact63 =null;

        AslParser.boolfact_return boolfact65 =null;


        AslTree AND64_tree=null;

        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:139:9: ( boolfact ( AND ^ boolfact )* )
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:139:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm942);
            boolfact63=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact63.getTree());

            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:139:22: ( AND ^ boolfact )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:139:23: AND ^ boolfact
            	    {
            	    AND64=(Token)match(input,AND,FOLLOW_AND_in_boolterm945); 
            	    AND64_tree = 
            	    (AslTree)adaptor.create(AND64)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND64_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm948);
            	    boolfact65=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact65.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:142:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL67=null;
        Token NOT_EQUAL68=null;
        Token LT69=null;
        Token LE70=null;
        Token GT71=null;
        Token GE72=null;
        AslParser.num_expr_return num_expr66 =null;

        AslParser.num_expr_return num_expr73 =null;


        AslTree EQUAL67_tree=null;
        AslTree NOT_EQUAL68_tree=null;
        AslTree LT69_tree=null;
        AslTree LE70_tree=null;
        AslTree GT71_tree=null;
        AslTree GE72_tree=null;

        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:142:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:142:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact968);
            num_expr66=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr66.getTree());

            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:142:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQUAL||(LA14_0 >= GE && LA14_0 <= GT)||LA14_0==LE||LA14_0==LT||LA14_0==NOT_EQUAL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:142:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:142:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt13=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt13=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt13=2;
                        }
                        break;
                    case LT:
                        {
                        alt13=3;
                        }
                        break;
                    case LE:
                        {
                        alt13=4;
                        }
                        break;
                    case GT:
                        {
                        alt13=5;
                        }
                        break;
                    case GE:
                        {
                        alt13=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;

                    }

                    switch (alt13) {
                        case 1 :
                            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:142:24: EQUAL ^
                            {
                            EQUAL67=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact972); 
                            EQUAL67_tree = 
                            (AslTree)adaptor.create(EQUAL67)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL67_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:142:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL68=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact977); 
                            NOT_EQUAL68_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL68)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL68_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:142:46: LT ^
                            {
                            LT69=(Token)match(input,LT,FOLLOW_LT_in_boolfact982); 
                            LT69_tree = 
                            (AslTree)adaptor.create(LT69)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT69_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:142:52: LE ^
                            {
                            LE70=(Token)match(input,LE,FOLLOW_LE_in_boolfact987); 
                            LE70_tree = 
                            (AslTree)adaptor.create(LE70)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE70_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:142:58: GT ^
                            {
                            GT71=(Token)match(input,GT,FOLLOW_GT_in_boolfact992); 
                            GT71_tree = 
                            (AslTree)adaptor.create(GT71)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT71_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:142:64: GE ^
                            {
                            GE72=(Token)match(input,GE,FOLLOW_GE_in_boolfact997); 
                            GE72_tree = 
                            (AslTree)adaptor.create(GE72)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE72_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1001);
                    num_expr73=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr73.getTree());

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
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:145:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS75=null;
        Token MINUS76=null;
        AslParser.term_return term74 =null;

        AslParser.term_return term77 =null;


        AslTree PLUS75_tree=null;
        AslTree MINUS76_tree=null;

        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:145:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:145:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1021);
            term74=term();

            state._fsp--;

            adaptor.addChild(root_0, term74.getTree());

            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:145:18: ( ( PLUS ^| MINUS ^) term )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==MINUS||LA16_0==PLUS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:145:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:145:20: ( PLUS ^| MINUS ^)
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==PLUS) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==MINUS) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:145:21: PLUS ^
            	            {
            	            PLUS75=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1026); 
            	            PLUS75_tree = 
            	            (AslTree)adaptor.create(PLUS75)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS75_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:145:29: MINUS ^
            	            {
            	            MINUS76=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1031); 
            	            MINUS76_tree = 
            	            (AslTree)adaptor.create(MINUS76)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS76_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1035);
            	    term77=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term77.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:148:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL79=null;
        Token DIV80=null;
        Token MOD81=null;
        AslParser.factor_return factor78 =null;

        AslParser.factor_return factor82 =null;


        AslTree MUL79_tree=null;
        AslTree DIV80_tree=null;
        AslTree MOD81_tree=null;

        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:148:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:148:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1059);
            factor78=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor78.getTree());

            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:148:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==DIV||(LA18_0 >= MOD && LA18_0 <= MUL)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:148:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:148:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt17=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:148:23: MUL ^
            	            {
            	            MUL79=(Token)match(input,MUL,FOLLOW_MUL_in_term1064); 
            	            MUL79_tree = 
            	            (AslTree)adaptor.create(MUL79)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL79_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:148:30: DIV ^
            	            {
            	            DIV80=(Token)match(input,DIV,FOLLOW_DIV_in_term1069); 
            	            DIV80_tree = 
            	            (AslTree)adaptor.create(DIV80)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV80_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:148:37: MOD ^
            	            {
            	            MOD81=(Token)match(input,MOD,FOLLOW_MOD_in_term1074); 
            	            MOD81_tree = 
            	            (AslTree)adaptor.create(MOD81)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD81_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1078);
            	    factor82=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor82.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:151:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT83=null;
        Token PLUS84=null;
        Token MINUS85=null;
        AslParser.atom_return atom86 =null;


        AslTree NOT83_tree=null;
        AslTree PLUS84_tree=null;
        AslTree MINUS85_tree=null;

        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:151:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:151:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:151:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt19=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt19=1;
                    }
                    break;
                case PLUS:
                    {
                    alt19=2;
                    }
                    break;
                case MINUS:
                    {
                    alt19=3;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:151:14: NOT ^
                    {
                    NOT83=(Token)match(input,NOT,FOLLOW_NOT_in_factor1101); 
                    NOT83_tree = 
                    (AslTree)adaptor.create(NOT83)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT83_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:151:21: PLUS ^
                    {
                    PLUS84=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1106); 
                    PLUS84_tree = 
                    (AslTree)adaptor.create(PLUS84)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS84_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:151:29: MINUS ^
                    {
                    MINUS85=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1111); 
                    MINUS85_tree = 
                    (AslTree)adaptor.create(MINUS85)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS85_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1116);
            atom86=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom86.getTree());

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
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:157:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | ( ISINT | ISBOOL ) ^ '(' ! expr ')' !| funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID87=null;
        Token INT88=null;
        Token set89=null;
        Token char_literal90=null;
        Token char_literal92=null;
        Token char_literal94=null;
        Token char_literal96=null;
        AslParser.expr_return expr91 =null;

        AslParser.funcall_return funcall93 =null;

        AslParser.expr_return expr95 =null;


        AslTree b_tree=null;
        AslTree ID87_tree=null;
        AslTree INT88_tree=null;
        AslTree set89_tree=null;
        AslTree char_literal90_tree=null;
        AslTree char_literal92_tree=null;
        AslTree char_literal94_tree=null;
        AslTree char_literal96_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:157:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | ( ISINT | ISBOOL ) ^ '(' ! expr ')' !| funcall | '(' ! expr ')' !)
            int alt21=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==55) ) {
                    alt21=5;
                }
                else if ( (LA21_1==AND||(LA21_1 >= DIV && LA21_1 <= EQUAL)||(LA21_1 >= GE && LA21_1 <= GT)||LA21_1==LE||(LA21_1 >= LT && LA21_1 <= MUL)||(LA21_1 >= NOT_EQUAL && LA21_1 <= OR)||LA21_1==PLUS||LA21_1==THEN||(LA21_1 >= 56 && LA21_1 <= 58)||LA21_1==60||LA21_1==62) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt21=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt21=3;
                }
                break;
            case ISBOOL:
            case ISINT:
                {
                alt21=4;
                }
                break;
            case 55:
                {
                alt21=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:157:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID87=(Token)match(input,ID,FOLLOW_ID_in_atom1141); 
                    ID87_tree = 
                    (AslTree)adaptor.create(ID87)
                    ;
                    adaptor.addChild(root_0, ID87_tree);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:158:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT88=(Token)match(input,INT,FOLLOW_INT_in_atom1156); 
                    INT88_tree = 
                    (AslTree)adaptor.create(INT88)
                    ;
                    adaptor.addChild(root_0, INT88_tree);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:159:13: (b= TRUE |b= FALSE )
                    {
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:159:13: (b= TRUE |b= FALSE )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==TRUE) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==FALSE) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;

                    }
                    switch (alt20) {
                        case 1 :
                            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:159:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1173);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:159:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1179);  
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
                    // 159:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:159:36: ^( BOOLEAN[$b,$b.text] )
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
                case 4 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:160:13: ( ISINT | ISBOOL ) ^ '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    set89=(Token)input.LT(1);

                    set89=(Token)input.LT(1);

                    if ( (input.LA(1) >= ISBOOL && input.LA(1) <= ISINT) ) {
                        input.consume();
                        root_0 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(set89)
                        , root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    char_literal90=(Token)match(input,55,FOLLOW_55_in_atom1211); 

                    pushFollow(FOLLOW_expr_in_atom1214);
                    expr91=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr91.getTree());

                    char_literal92=(Token)match(input,56,FOLLOW_56_in_atom1216); 

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:161:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1231);
                    funcall93=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall93.getTree());

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:162:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal94=(Token)match(input,55,FOLLOW_55_in_atom1245); 

                    pushFollow(FOLLOW_expr_in_atom1248);
                    expr95=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr95.getTree());

                    char_literal96=(Token)match(input,56,FOLLOW_56_in_atom1250); 

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


    public static class funcall_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:166:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID97=null;
        Token char_literal98=null;
        Token char_literal100=null;
        AslParser.expr_list_return expr_list99 =null;


        AslTree ID97_tree=null;
        AslTree char_literal98_tree=null;
        AslTree char_literal100_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:166:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:166:13: ID '(' ( expr_list )? ')'
            {
            ID97=(Token)match(input,ID,FOLLOW_ID_in_funcall1271);  
            stream_ID.add(ID97);


            char_literal98=(Token)match(input,55,FOLLOW_55_in_funcall1273);  
            stream_55.add(char_literal98);


            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:166:20: ( expr_list )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==FALSE||LA22_0==ID||(LA22_0 >= INT && LA22_0 <= ISINT)||LA22_0==MINUS||LA22_0==NOT||LA22_0==PLUS||LA22_0==TRUE||LA22_0==55) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:166:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1275);
                    expr_list99=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list99.getTree());

                    }
                    break;

            }


            char_literal100=(Token)match(input,56,FOLLOW_56_in_funcall1278);  
            stream_56.add(char_literal100);


            // AST REWRITE
            // elements: ID, expr_list
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
                // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:166:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:166:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:166:61: ( expr_list )?
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
    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:170:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal102=null;
        AslParser.expr_return expr101 =null;

        AslParser.expr_return expr103 =null;


        AslTree char_literal102_tree=null;

        try {
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:170:10: ( expr ( ',' ! expr )* )
            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:170:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1311);
            expr101=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr101.getTree());

            // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:170:18: ( ',' ! expr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==57) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home2/users/alumnes/1183123/Documents/parcial/Exercici-ASL/Asl/src/parser/Asl.g:170:19: ',' ! expr
            	    {
            	    char_literal102=(Token)match(input,57,FOLLOW_57_in_expr_list1314); 

            	    pushFollow(FOLLOW_expr_in_expr_list1317);
            	    expr103=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr103.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
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


 

    public static final BitSet FOLLOW_func_in_prog182 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EOF_in_prog185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func224 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_func227 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_params_in_func229 = new BitSet(new long[]{0x0418C0000C200000L});
    public static final BitSet FOLLOW_block_instructions_in_func231 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_params252 = new BitSet(new long[]{0x0140000004000000L});
    public static final BitSet FOLLOW_paramlist_in_params254 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_params257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist283 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_paramlist286 = new BitSet(new long[]{0x0040000004000000L});
    public static final BitSet FOLLOW_param_in_paramlist289 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_54_in_param314 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_param318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions375 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_block_instructions378 = new BitSet(new long[]{0x0418C0000C200000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions380 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_stmt_in_instruction491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign630 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_assign634 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_expr_in_assign636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt665 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt668 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt670 = new BitSet(new long[]{0x0418C0000C200000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt673 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt676 = new BitSet(new long[]{0x0418C0000C200000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt679 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt706 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_expr_in_while_stmt709 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DO_in_while_stmt711 = new BitSet(new long[]{0x0418C0000C200000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt714 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREACH_in_foreach_stmt750 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_foreach_stmt753 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_IN_in_foreach_stmt755 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_foreach_arguments_in_foreach_stmt758 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DO_in_foreach_stmt760 = new BitSet(new long[]{0x0418C0000C200000L});
    public static final BitSet FOLLOW_block_instructions_in_foreach_stmt763 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ENDFOR_in_foreach_stmt765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_foreach_arguments782 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_expr_list_in_foreach_arguments784 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_foreach_arguments786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_foreach_arguments808 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_expr_list_in_foreach_arguments810 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_foreach_arguments812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt838 = new BitSet(new long[]{0x00840890E4100002L});
    public static final BitSet FOLLOW_expr_in_return_stmt841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read860 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_read863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write883 = new BitSet(new long[]{0x00850890E4100000L});
    public static final BitSet FOLLOW_expr_in_write887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr916 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_OR_in_expr919 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_boolterm_in_expr922 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm942 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm945 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm948 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact968 = new BitSet(new long[]{0x0000010903040002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact972 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact977 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_LT_in_boolfact982 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_LE_in_boolfact987 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_GT_in_boolfact992 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_GE_in_boolfact997 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1021 = new BitSet(new long[]{0x0000081000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1026 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1031 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_term_in_num_expr1035 = new BitSet(new long[]{0x0000081000000002L});
    public static final BitSet FOLLOW_factor_in_term1059 = new BitSet(new long[]{0x0000006000000802L});
    public static final BitSet FOLLOW_MUL_in_term1064 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_DIV_in_term1069 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_MOD_in_term1074 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_factor_in_term1078 = new BitSet(new long[]{0x0000006000000802L});
    public static final BitSet FOLLOW_NOT_in_factor1101 = new BitSet(new long[]{0x00840000E4100000L});
    public static final BitSet FOLLOW_PLUS_in_factor1106 = new BitSet(new long[]{0x00840000E4100000L});
    public static final BitSet FOLLOW_MINUS_in_factor1111 = new BitSet(new long[]{0x00840000E4100000L});
    public static final BitSet FOLLOW_atom_in_factor1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_atom1202 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_atom1211 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_expr_in_atom1214 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_atom1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_atom1245 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_expr_in_atom1248 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_atom1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1271 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_funcall1273 = new BitSet(new long[]{0x01840890E4100000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1275 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_funcall1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1311 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_expr_list1314 = new BitSet(new long[]{0x00840890E4100000L});
    public static final BitSet FOLLOW_expr_in_expr_list1317 = new BitSet(new long[]{0x0200000000000002L});

}