// $ANTLR 3.4 Dot.g 2017-03-14 20:15:35

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class DotParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "EDGE", "ELEMENTS", "GRAPH", "NUM", "STRING", "SUBGRAPH", "VAR", "WS", "';'", "'{'", "'}'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public DotParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public DotParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return DotParser.tokenNames; }
    public String getGrammarFileName() { return "Dot.g"; }


    public static class graph_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graph"
    // Dot.g:22:1: graph : GRAPH ( VAR )? '{' elements '}' -> ^( GRAPH ( VAR )? elements ) ;
    public final DotParser.graph_return graph() throws RecognitionException {
        DotParser.graph_return retval = new DotParser.graph_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GRAPH1=null;
        Token VAR2=null;
        Token char_literal3=null;
        Token char_literal5=null;
        DotParser.elements_return elements4 =null;


        Object GRAPH1_tree=null;
        Object VAR2_tree=null;
        Object char_literal3_tree=null;
        Object char_literal5_tree=null;
        RewriteRuleTokenStream stream_GRAPH=new RewriteRuleTokenStream(adaptor,"token GRAPH");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleSubtreeStream stream_elements=new RewriteRuleSubtreeStream(adaptor,"rule elements");
        try {
            // Dot.g:22:9: ( GRAPH ( VAR )? '{' elements '}' -> ^( GRAPH ( VAR )? elements ) )
            // Dot.g:22:11: GRAPH ( VAR )? '{' elements '}'
            {
            GRAPH1=(Token)match(input,GRAPH,FOLLOW_GRAPH_in_graph58);  
            stream_GRAPH.add(GRAPH1);


            // Dot.g:22:17: ( VAR )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==VAR) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Dot.g:22:17: VAR
                    {
                    VAR2=(Token)match(input,VAR,FOLLOW_VAR_in_graph60);  
                    stream_VAR.add(VAR2);


                    }
                    break;

            }


            char_literal3=(Token)match(input,14,FOLLOW_14_in_graph63);  
            stream_14.add(char_literal3);


            pushFollow(FOLLOW_elements_in_graph65);
            elements4=elements();

            state._fsp--;

            stream_elements.add(elements4.getTree());

            char_literal5=(Token)match(input,15,FOLLOW_15_in_graph67);  
            stream_15.add(char_literal5);


            // AST REWRITE
            // elements: VAR, elements, GRAPH
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 22:39: -> ^( GRAPH ( VAR )? elements )
            {
                // Dot.g:22:42: ^( GRAPH ( VAR )? elements )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_GRAPH.nextNode()
                , root_1);

                // Dot.g:22:50: ( VAR )?
                if ( stream_VAR.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_VAR.nextNode()
                    );

                }
                stream_VAR.reset();

                adaptor.addChild(root_1, stream_elements.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "graph"


    public static class elements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elements"
    // Dot.g:24:1: elements : elemCjt -> ^( ELEMENTS elemCjt ) ;
    public final DotParser.elements_return elements() throws RecognitionException {
        DotParser.elements_return retval = new DotParser.elements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        DotParser.elemCjt_return elemCjt6 =null;


        RewriteRuleSubtreeStream stream_elemCjt=new RewriteRuleSubtreeStream(adaptor,"rule elemCjt");
        try {
            // Dot.g:24:9: ( elemCjt -> ^( ELEMENTS elemCjt ) )
            // Dot.g:24:11: elemCjt
            {
            pushFollow(FOLLOW_elemCjt_in_elements86);
            elemCjt6=elemCjt();

            state._fsp--;

            stream_elemCjt.add(elemCjt6.getTree());

            // AST REWRITE
            // elements: elemCjt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 24:19: -> ^( ELEMENTS elemCjt )
            {
                // Dot.g:24:22: ^( ELEMENTS elemCjt )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ELEMENTS, "ELEMENTS")
                , root_1);

                adaptor.addChild(root_1, stream_elemCjt.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elements"


    public static class elemCjt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elemCjt"
    // Dot.g:26:1: elemCjt : ( elem ( ';' !)? )* ;
    public final DotParser.elemCjt_return elemCjt() throws RecognitionException {
        DotParser.elemCjt_return retval = new DotParser.elemCjt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal8=null;
        DotParser.elem_return elem7 =null;


        Object char_literal8_tree=null;

        try {
            // Dot.g:26:11: ( ( elem ( ';' !)? )* )
            // Dot.g:26:13: ( elem ( ';' !)? )*
            {
            root_0 = (Object)adaptor.nil();


            // Dot.g:26:13: ( elem ( ';' !)? )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= NUM && LA3_0 <= VAR)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Dot.g:26:14: elem ( ';' !)?
            	    {
            	    pushFollow(FOLLOW_elem_in_elemCjt106);
            	    elem7=elem();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elem7.getTree());

            	    // Dot.g:26:22: ( ';' !)?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==13) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // Dot.g:26:22: ';' !
            	            {
            	            char_literal8=(Token)match(input,13,FOLLOW_13_in_elemCjt108); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elemCjt"


    public static class elem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elem"
    // Dot.g:28:1: elem : ( node | subgrafExp ) ( EDGE ^ ( node | subgrafExp ) )* ;
    public final DotParser.elem_return elem() throws RecognitionException {
        DotParser.elem_return retval = new DotParser.elem_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EDGE11=null;
        DotParser.node_return node9 =null;

        DotParser.subgrafExp_return subgrafExp10 =null;

        DotParser.node_return node12 =null;

        DotParser.subgrafExp_return subgrafExp13 =null;


        Object EDGE11_tree=null;

        try {
            // Dot.g:28:9: ( ( node | subgrafExp ) ( EDGE ^ ( node | subgrafExp ) )* )
            // Dot.g:28:11: ( node | subgrafExp ) ( EDGE ^ ( node | subgrafExp ) )*
            {
            root_0 = (Object)adaptor.nil();


            // Dot.g:28:11: ( node | subgrafExp )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0 >= NUM && LA4_0 <= STRING)||LA4_0==VAR) ) {
                alt4=1;
            }
            else if ( (LA4_0==SUBGRAPH) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Dot.g:28:12: node
                    {
                    pushFollow(FOLLOW_node_in_elem125);
                    node9=node();

                    state._fsp--;

                    adaptor.addChild(root_0, node9.getTree());

                    }
                    break;
                case 2 :
                    // Dot.g:28:19: subgrafExp
                    {
                    pushFollow(FOLLOW_subgrafExp_in_elem129);
                    subgrafExp10=subgrafExp();

                    state._fsp--;

                    adaptor.addChild(root_0, subgrafExp10.getTree());

                    }
                    break;

            }


            // Dot.g:28:31: ( EDGE ^ ( node | subgrafExp ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==EDGE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Dot.g:28:32: EDGE ^ ( node | subgrafExp )
            	    {
            	    EDGE11=(Token)match(input,EDGE,FOLLOW_EDGE_in_elem133); 
            	    EDGE11_tree = 
            	    (Object)adaptor.create(EDGE11)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(EDGE11_tree, root_0);


            	    // Dot.g:28:38: ( node | subgrafExp )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( ((LA5_0 >= NUM && LA5_0 <= STRING)||LA5_0==VAR) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==SUBGRAPH) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // Dot.g:28:39: node
            	            {
            	            pushFollow(FOLLOW_node_in_elem137);
            	            node12=node();

            	            state._fsp--;

            	            adaptor.addChild(root_0, node12.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // Dot.g:28:46: subgrafExp
            	            {
            	            pushFollow(FOLLOW_subgrafExp_in_elem141);
            	            subgrafExp13=subgrafExp();

            	            state._fsp--;

            	            adaptor.addChild(root_0, subgrafExp13.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elem"


    public static class node_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "node"
    // Dot.g:30:1: node : ( VAR | STRING | NUM );
    public final DotParser.node_return node() throws RecognitionException {
        DotParser.node_return retval = new DotParser.node_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set14=null;

        Object set14_tree=null;

        try {
            // Dot.g:30:9: ( VAR | STRING | NUM )
            // Dot.g:
            {
            root_0 = (Object)adaptor.nil();


            set14=(Token)input.LT(1);

            if ( (input.LA(1) >= NUM && input.LA(1) <= STRING)||input.LA(1)==VAR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set14)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "node"


    public static class subgrafExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subgrafExp"
    // Dot.g:32:1: subgrafExp : SUBGRAPH ( VAR )? '{' elements '}' -> ^( SUBGRAPH ( VAR )? elements ) ;
    public final DotParser.subgrafExp_return subgrafExp() throws RecognitionException {
        DotParser.subgrafExp_return retval = new DotParser.subgrafExp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SUBGRAPH15=null;
        Token VAR16=null;
        Token char_literal17=null;
        Token char_literal19=null;
        DotParser.elements_return elements18 =null;


        Object SUBGRAPH15_tree=null;
        Object VAR16_tree=null;
        Object char_literal17_tree=null;
        Object char_literal19_tree=null;
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SUBGRAPH=new RewriteRuleTokenStream(adaptor,"token SUBGRAPH");
        RewriteRuleSubtreeStream stream_elements=new RewriteRuleSubtreeStream(adaptor,"rule elements");
        try {
            // Dot.g:32:11: ( SUBGRAPH ( VAR )? '{' elements '}' -> ^( SUBGRAPH ( VAR )? elements ) )
            // Dot.g:32:13: SUBGRAPH ( VAR )? '{' elements '}'
            {
            SUBGRAPH15=(Token)match(input,SUBGRAPH,FOLLOW_SUBGRAPH_in_subgrafExp187);  
            stream_SUBGRAPH.add(SUBGRAPH15);


            // Dot.g:32:22: ( VAR )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==VAR) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Dot.g:32:22: VAR
                    {
                    VAR16=(Token)match(input,VAR,FOLLOW_VAR_in_subgrafExp189);  
                    stream_VAR.add(VAR16);


                    }
                    break;

            }


            char_literal17=(Token)match(input,14,FOLLOW_14_in_subgrafExp192);  
            stream_14.add(char_literal17);


            pushFollow(FOLLOW_elements_in_subgrafExp194);
            elements18=elements();

            state._fsp--;

            stream_elements.add(elements18.getTree());

            char_literal19=(Token)match(input,15,FOLLOW_15_in_subgrafExp196);  
            stream_15.add(char_literal19);


            // AST REWRITE
            // elements: elements, VAR, SUBGRAPH
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 32:44: -> ^( SUBGRAPH ( VAR )? elements )
            {
                // Dot.g:32:47: ^( SUBGRAPH ( VAR )? elements )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_SUBGRAPH.nextNode()
                , root_1);

                // Dot.g:32:58: ( VAR )?
                if ( stream_VAR.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_VAR.nextNode()
                    );

                }
                stream_VAR.reset();

                adaptor.addChild(root_1, stream_elements.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "subgrafExp"

    // Delegated rules


 

    public static final BitSet FOLLOW_GRAPH_in_graph58 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_VAR_in_graph60 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_graph63 = new BitSet(new long[]{0x0000000000000F00L});
    public static final BitSet FOLLOW_elements_in_graph65 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_graph67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elemCjt_in_elements86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elem_in_elemCjt106 = new BitSet(new long[]{0x0000000000002F02L});
    public static final BitSet FOLLOW_13_in_elemCjt108 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_node_in_elem125 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_subgrafExp_in_elem129 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_EDGE_in_elem133 = new BitSet(new long[]{0x0000000000000F00L});
    public static final BitSet FOLLOW_node_in_elem137 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_subgrafExp_in_elem141 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_SUBGRAPH_in_subgrafExp187 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_VAR_in_subgrafExp189 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_subgrafExp192 = new BitSet(new long[]{0x0000000000000F00L});
    public static final BitSet FOLLOW_elements_in_subgrafExp194 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_subgrafExp196 = new BitSet(new long[]{0x0000000000000002L});

}