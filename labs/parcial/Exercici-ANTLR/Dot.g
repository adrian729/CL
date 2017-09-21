
grammar Dot;

options {
    output = AST;
}

// Imaginary tokens to create some AST nodes
tokens {
    ELEMENTS;
}

@header {
package parser;
}

@lexer::header {
package parser;
}

// --------  Gramàtica
graph   : GRAPH VAR? '{' elements '}' -> ^(GRAPH VAR? elements) ;

elements: elemCjt -> ^(ELEMENTS elemCjt) ;

elemCjt   : (elem ';'!?)* ;

elem    : (node | subgrafExp) (EDGE^ (node | subgrafExp))* ;
        
node    : VAR | STRING | NUM;
        
subgrafExp: SUBGRAPH VAR? '{' elements '}' -> ^(SUBGRAPH VAR? elements) ;


// --------- Tokens 

// Definiu el token seguent com demana l'enunciat
// NUM   : ??? ;

GRAPH    : 'digraph';
SUBGRAPH : 'subgraph';

EDGE    : '->';
VAR     : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
STRING  : '"' ( ~('\\'|'"') )* '"';
NUM     : ('0'..'9')+ | ('0'..'9')+ '.' ('0'..'9')* | '.' ('0'..'9')+ ;

// comments
COMMENT	: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}	;

// White spaces
WS      : ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
        ;


