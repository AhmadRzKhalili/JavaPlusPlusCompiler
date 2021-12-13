grammar JavaPlusPlus;

INT_NO : ([ +-][0-9]+) ;
INT : 'int' ;

FLT_NO : ([ +-][0-9]*'.'[0-9]+'f') ;
FLT : 'float' ;

AS : '=' ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
POWER : '^' ;

IF : 'if' ;
ELSE : 'else' ;
SWITCH : 'switch' ;
CASE : 'case' ;
BREAK : 'break' ;

EQ : '==' ;
NEQ : '!=' ;
GTE : '>=' ;
LTE : '<=' ;
GT : '>' ;
LT : '<' ;
NOT : '!' ;
OR : '||' ;
AND: '&&' ;

WHILE : 'while' ;
FOR : 'for' ;
DO : 'do' ;

WS : [ \t\r\n]+ -> skip ;

OPEN_PAR : '(' ;
CLOSE_PAR : ')' ;

OPEN_CUR_BRA : '{' ;
CLOSE_CUR_BRA : '}' ;

CLASS : 'class' ;

MAIN_FUNC : 'main' ;

INPUT : 'input' ;
OUTPUT : 'output' ;

FUNC : 'void_func' | 'int_func' | 'float_func' ;
RET : 'return' ;

SEMICOLON : ';' ;

CLASS_ID : [A-Z]('a'..'z'|'A'..'Z'|'0'..'9')* ;

ID : ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

COMMENT : ('//'[ \ta-zA-Z0-9]*) ->  skip;
