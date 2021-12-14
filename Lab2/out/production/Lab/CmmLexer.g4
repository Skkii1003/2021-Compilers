lexer grammar CmmLexer;

INT : INT_10 | INT_8 | INT_16;
INT_10 : '0' | [1-9][0-9]*;
INT_8 : '0'[0-7]+;
INT_16 : '0'[xX][0-9a-fA-F]+;

FLOAT : [0-9]* DOT [0-9]+ ('e' | 'E') SIGN? [0-9]+
      | [0-9]+ DOT [0-9]* ('e' | 'E') SIGN? [0-9]+
      | [0-9]+ DOT [0-9]+
      ;

TYPE : 'int' | 'float';
RETURN : 'return';
STRUCT : 'struct';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
ID : (CHAR | '_')(CHAR | '_' | [0-9])*;
CHAR : [a-zA-Z];
SEMI : ';';
COMMA : ',';
RELOP : '>' | '<' | '<=' | '>=' | '==' | '!=';
ASSIGNOP : '=';
PLUS : '+';
MINUS : '-';
SIGN : '+' | '-';
STAR : '*';
DIV : '/';
AND : '&&';
OR : '||';
DOT : '.';
NOT : '!';
LP : '(';
RP : ')';
LB : '[';
RB : ']';
LC : '{';
RC : '}';
WS : [ \t\n\r]+ ->skip;
SL_COMMENT : '//' .*? '\n' -> skip;
ML_COMMENT : '/*' .*? '*/' -> skip;