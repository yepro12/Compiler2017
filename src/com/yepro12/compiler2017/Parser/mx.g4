grammar mx;
code : section* EOF;
section : classdefine #classdef
        | function #funcdef
        | vardefine #glbvardef
        ;
stmt : sta #statement;
sta : block #blk
     | exprstmt #expression
     | loop #lp
     | branch #bran
     | jump #jp
     | vardefine #vardef;
block : '{' stmt* '}' ;
branch : IF '(' expr ')' stmt (ELSE stmt)? ;
jump :  RETURN expr? ';' #return
     | BREAK ';' #break
     | CONTINUE  ';' #continue;
loop : FOR '(' init = expr? ';' cond = expr? ';' step = expr? ')' stmt #for
     | WHILE '(' expr ')' stmt #while;
vardefine : arraytype ID ( '=' expr )? ';' ;
classdefine : CLASS  ID '{' member* '}' ;
member : vardefine #clsvar
       | function #clsfunc
       ;
function : arraytype ID '(' paralist? ')' block;
paralist : argument ( COMMA argument )*;
argument : arraytype ID;
arraytype : type #nonarray
          | arraytype '['']' #artp
          ;
type : tp = BOOL | tp = INT | tp = VOID | tp = STRING | tp = ID;
exprstmt : expr? ';';
expr :  '(' expr ')' #paren
	 | expr '(' list? ')' #fccall
	 | expr '[' expr ']' #adac
	 | expr op=SELFPLUS #selfalt
	 | <assoc = right> op=SELFPLUS expr #una
	 | expr op=SELFMINUS #selfalt
	 | <assoc = right> op=SELFMINUS expr #una
	 | <assoc = right> op=MINUS expr #una
	 | <assoc = right> op=LNOT expr #una
	 | <assoc = right> op=BNOT expr #una
	 | expr op=TIMES expr #bina
	 | expr op=DIVIDE expr #bina
	 | expr op=MODULE expr #bina
	 | expr op=PLUS expr #bina
	 | expr op=MINUS expr #bina
	 | expr op=LSHIFT expr #bina
	 | expr op=RSHIFT expr #bina
	 | expr op=LESSEQUALTHAN expr #bina
	 | expr op=GREATEREQUALTHAN expr #bina
	 | expr op=LESSTHAN expr #bina
	 | expr op=GREATERTHAN expr #bina
	 | expr op=EQUAL expr #bina
	 | expr op=NOTEQUAL expr #bina
	 | expr op=BAND expr #bina
	 | expr op=BOR expr #bina
	 | expr op=BXOR expr #bina
	 | expr op=LOR expr #bina
	 | expr op=LAND expr #bina
	 | expr PIES ID #mbac
	 | NEW newtype #newp
	 | <assoc = right> expr op=ASSIGN expr #bina
	 | ID #iden
	 | lite #cst
	 ;
lite : tp = NUM
     | tp = TRUE
     | tp =FALSE
     | tp = NULL
     | tp = CHAIN
     ;

newtype : type('[' dim ']')*'['']'('['expr']')('[' dim ']')* #error
        | type('[' dim ']')+ #newarray
        | type #newnonarray;
dim : expr?;
list : expr ( COMMA expr )*;
SELFPLUS : '++';
SELFMINUS : '--';
PLUS : '+';
MINUS : '-';
TIMES : '*';
DIVIDE : '/';
MODULE : '%';
LSHIFT : '<<';
RSHIFT : '>>';
LESSEQUALTHAN : '<=';
GREATEREQUALTHAN : '>=';
LESSTHAN : '<';
GREATERTHAN : '>';
EQUAL : '==';
NOTEQUAL : '!=';
LAND : '&&';
BAND : '&';
LOR : '||';
BOR : '|';
LNOT : '!';
BNOT : '~';
BXOR : '^';
PIES : '.';
BOOL : 'bool';
INT : 'int';
STRING : 'string';
NULL : 'null';
VOID : 'void';
TRUE : 'TRUE';
FALSE : 'FALSE';
IF : 'if';
ELSE : 'else';
FOR : 'for';
WHILE : 'while';
BREAK : 'break';
CONTINUE : 'continue';
RETURN : 'return';
NEW : 'new';
CLASS : 'class';
THIS : 'this';
SEMICOLON : ';';
COMMA : ',';
ASSIGN : '=';
NUM :  DIGIT+ ;
ID : ALPHA(DIGIT | ALPHA | '_')*;
CHAIN : '"' CHAR* '"';
DIGIT : [0-9];
ALPHA : [a-zA-Z];
COMMENT : '//' .*? -> skip;
NEWLINE : '\r'? '\n' -> skip;
WS : [ \r\n\t] -> skip;
CHAR : '\\' ["\\n] | ~["\\] ;