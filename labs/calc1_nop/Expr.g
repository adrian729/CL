grammar Expr;

prog:   stat+ ;
                
stat:   expr NEWLINE
    |   ID '=' expr NEWLINE
    |   NEWLINE
    ;

expr:   multExpr (('+' | '-') multExpr)*
    ;

multExpr:   unRestExpr (('*' | '/') unRestExpr)*
    ;

unRestExpr: ('-' | ) potExpr
    ;

potExpr:   parExpr ('^' parExpr)*
    ;

parExpr:   atom | ('(' expr ')')
    ;

atom:   INT
    |   ID
    ;

ID  :   ('a'..'z'|'A'..'Z')+ ;
INT :   '0'..'9'+ ;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+ {skip();} ;
