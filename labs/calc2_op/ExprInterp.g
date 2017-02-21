grammar ExprInterp;

@header {
import java.util.HashMap;
}

@members {
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();
}

prog:   stat+ ;
                
stat:   expr NEWLINE {System.out.println($expr.value);}
    |   ID '=' expr NEWLINE
        {memory.put($ID.text, new Integer($expr.value));}
    |   NEWLINE
    ;

expr returns [int value]
    :   e=multExpr {$value = $e.value;}
        (   '+' e=multExpr {$value += $e.value;}
        |   '-' e=multExpr {$value -= $e.value;}
        )*
    ;

multExpr returns [int value]
    :   e=unRestExpr {$value = $e.value;}
        (   '*' e=unRestExpr {$value *= $e.value;}
        |   '/' e=unRestExpr {$value /= $e.value;}
        )*
    ;

unRestExpr returns [int value]
    :   (   e=potExpr {$value = $e.value;}
        |   '-' e=potExpr {$value = -$e.value;}
        )
    ;

/** S'HA D'ARREGLAR! HA DE TENIR PRIORITAT PER LA DRETA (com a google) */
potExpr returns [int value]
    :   e=parExpr {$value = $e.value;} ('^' e=parExpr {$value = (int)Math.pow($value,$e.value);})*
    ;

parExpr returns [int value]
    :   (   e=atom {$value = $e.value;}
        |   '(' e=expr {$value = $e.value;} ')'
        )
    ;

atom returns [int value]
    :   INT {$value = Integer.parseInt($INT.text);}
    |   ID
        {
        Integer v = (Integer)memory.get($ID.text);
        if ( v!=null ) $value = v.intValue();
        else System.err.println("undefined variable "+$ID.text);
        }
    ;

ID  :   ('a'..'z'|'A'..'Z')+ ;
INT :   '0'..'9'+ ;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+ {skip();} ;