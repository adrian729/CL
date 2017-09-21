
//package Dot;

// Imports for ANTLR
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

// Imports from Java
import java.io.*;

// Parser and Interpreter
import parser.*;

public class Dot {

    /** The file name of the program. */
    private static String infile = null;
      
    /** Main program that invokes the parser and the interpreter. */    
    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            System.err.println ("Usage:  java Dot file.dot");
            System.exit(1);
        }        
        infile = args[0];

        // Parsing of the input file        
        CharStream input = null;
        try {
            input = new ANTLRFileStream(infile);
        }
        catch (IOException e) {
            System.err.println ("Error: file " + infile + " could not be opened.");
            System.exit(1);
        }

        // Creates the lexer
        DotLexer lex = new DotLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);

        // Creates and runs the parser. As a result, an AST is created
        DotParser parser = new DotParser(tokens);
        DotParser.graph_return result = null;
        try {
            result = parser.graph();
        } 
        catch (Exception e) {} // Just catch the exception (nothing to do)
        
        // Check for parsing errors
        int nerrors = parser.getNumberOfSyntaxErrors();
        if (nerrors > 0) {
            System.err.println (nerrors + " errors detected. Tree not generated.");
            System.exit(1);
        }

        // Get the AST
        CommonTree t = (CommonTree) result.getTree();

        try {
            // Generate a txt file for the AST 
            String outfile = infile.replaceFirst("[.][^.]+$", "");
            File fTxt = new File(outfile+".student.ast");
            BufferedWriter outTxt = new BufferedWriter(new FileWriter(fTxt));
            outTxt.write(t.toStringTree());
            outTxt.close();

            // Generate a dot file for the AST 
            File fDot = new File(outfile+".student.dot");
            BufferedWriter outDot = new BufferedWriter(new FileWriter(fDot));
            DOTTreeGenerator gen = new DOTTreeGenerator();
            outDot.write(gen.toDOT(t).toString());
            outDot.close();
        }
        catch (Exception e) {} // Just catch the exception (nothing to do)

    }
}


