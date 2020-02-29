grammar Pascal;
program: programHeading block '.' EOF;
programHeading: PROGRAM id ';';
id: 
    ID;
block:
     variableDecBlock* procAndFuncDecPart? mainBlock
     //(constantDefBlock | typeDefBlock | variableDecBlock)* compoundStatement
    ;
mainBlock: BEGIN statements END;
//constantDefBlock: ; //extra credit
//typeDefBlock: ; //extra credit
variableDecBlock:
    VAR variableDeclaration (';' variableDeclaration)* ';'
    ;
variableDeclaration:
    idList ':' type
    | id ':' type '=' input
    ; 
input:
    BOOLINPUT   #boolInput
    | NUM   #numInput
    | STRING #stringInput;  
idList:
    id (',' id)*
    ; 
type
   : 
   id
   | REAL
   | BOOLEAN
   | STRING
   ;  

procAndFuncDecPart:
    procOrFuncDec ';'
    ;
procOrFuncDec: 
    procedureDeclaration
    | functionDeclaration;

procedureDeclaration:
    PROCEDURE procName=id (procVariable=formalParameterList)? ';' block
    ;
formalParameterList: 
    '(' formalParam? (';' formalParam)* ')'
    ;
formalParam:
    parameterGroup
    | VAR parameterGroup
    | FUNCTION parameterGroup
    | PROCEDURE parameterGroup
    ;
parameterGroup:
    idList ':' type
    ;
    
functionDeclaration:
    FUNCTION functionName=id (functionVariables=formalParameterList)? ':' type ';' block
    ;
    //nice


/*statement:
    label ':' nolabel
    | nolabel ;
*/
statement:
    simpleStatement
    | structuredStatement ;
simpleStatement: 
     assignStatement
    | procedureCall
    | procedureStatement
    | emptyStatement;
procedureCall: 
    name=id ('(' params=parameterList ')')?
    ;  
procedureStatement
   : BREAK  #visitBreak
   | CONTINUE   #visitContinue
   | write  #visitProcWrite                             //not used
   | read   #visitProcRead                              //not used
   ;
write:
    WRITELN '(' expression ')'  #visitWriteExpr
    | WRITELN '(' id ')'    #visitWriteId
    | WRITELN '(' STRING ')'    #visitWriteStr
    | WRITELN '(' ')'           #visitWriteEmpty
    ;
read:
    //READLN '(' expression ')'   #visitReadExpr
     READLN '(' id ')' #visitReadId
    | READLN '(' STRING ')' #visitReadStr
    ;



structuredStatement:
    compoundStatement
    | conditionalStatement;
assignStatement: id LET expression
    | id LET input ;
emptyStatement: ;
conditionalStatement:
    ifStatement 
    | forDoStatement
    | whileDoStatement
    | caseStatement
    ;
compoundStatement: 
    BEGIN statements END
    ;
statements:
    statement (';' statement)*
    //| statement (';' statement)* ((CONTINUE | BREAK) ';')*?
    ;

expression: 
      NOT '(' expression ')'    #notExpression
    | id '(' parameterList ')'  #functionCall
    |  function=(SQRT | SIN | COS | EXP | LN) '(' id ')' #functionExpression
    |  function=(SQRT | SIN | COS | EXP | LN) '(' Uinput=NUM ')' #functionNumber
    | '(' expression ')'        #parentExpression
    | expression op=(MULT | DIV | AND) expression  #multExpression
    | expression op=(PLUS | MINUS | OR) expression #plusExpression
    | expression op=(EQUAL | NOT_EQUAL | LT | LE | GT | GE) expression #relationExpression
    | NUM   #numExpression
    | BOOLINPUT  #boolExpression
    | ID    #idExpression
    | STRING    #stringExpression
    ;


bool: TRUE | FALSE ;

string:
    STRING
    ;



parameterList
   : actualParameter? (',' actualParameter)*
   ;
actualParameter
   : expression parameterwidth*
   ;
parameterwidth
   : ':' expression
   ;

ifStatement:
    IF conditionBlock (: ELSE statement)?
;

conditionBlock:
    expression THEN statement;

/*
caseStatement:
    CASE expression OF constList ':' statement (';' constList ':' statement)* ';' (ELSE statements)? END ;
*/
caseStatement: 
    CASE '(' id ')' OF caseNumber (';' caseNumber)* ';' (ELSE statements)? END;


whileDoStatement:
    WHILE expression DO statement;


forDoStatement:
    FOR id LET initialVal=expression TO finalVal=expression DO statement #visitForTo
    | FOR id LET initialVal=expression DOWNTO finalVal=expression DO statement #visitForDownto
    ;
//when implementing the visitor we can merge these two grammar rules if necessary
//forList:
  //  initialVal=expression TO finalVal=expression;

caseNumber:
    constList ':' statement;

constList
   : constant (',' constant)*
   ;
constant: NUM   #numConstant
    | BOOLINPUT #boolConstant
    | ID   #idConstant
    | STRING #strConstant
    ;



//lexical token rules
//defining fragments for the letters used in keywords
fragment A: ('A'|'a');
fragment B: ('B'|'b');
fragment C: ('C'|'c');
fragment D: ('D'|'d');
fragment E: ('E'|'e');
fragment F: ('F'|'f');
fragment G: ('G'|'g');
fragment H: ('H'|'h');
fragment I: ('I'|'i');
fragment J: ('J'|'j');
fragment K: ('K'|'k');
fragment L: ('L'|'l');
fragment M: ('M'|'m');
fragment N: ('N'|'n');
fragment O: ('O'|'o');
fragment P: ('P'|'p');
fragment Q: ('Q'|'q');
fragment R: ('R'|'r');
fragment S: ('S'|'s');
fragment T: ('T'|'t');
fragment U: ('U'|'u');
fragment V: ('V'|'v');
fragment W: ('W'|'w');
fragment X: ('X'|'x');
fragment Y: ('Y'|'y');
fragment Z: ('Z'|'z');

//Special Identifiers and Keywords
BEGIN:  B E G I N ;
ELSE:   E L S E ;
END:    E N D ;
IF:     I F ;
DIV:    '/';
MULT:   '*';
PLUS: '+';
MINUS: '-';
EQUAL: '=';
NOT_EQUAL: '<>';
LT: '<';
GT: '>';
GE: '>=';
LE: '<=';
BOOLINPUT: TRUE | FALSE;
PROGRAM:    P R O G R A M ;
THEN:   T H E N ;
TYPE:   T Y P E ;
VAR:    V A R ;
TRUE: T R U E ;
FALSE: F A L S E ;
READLN: R E A D L N ;
WRITELN: W R I T E L N ;
SQRT: S Q R T ;
SIN: S I N ;
COS: C O S ;
LN: L N ;
EXP: E X P ;
CASE: C A S E ;
WHILE: W H I L E ;
DO: D O ;
FOR: F O R ;
CONTINUE: C O N T I N U E ;
BREAK: B R E A K ;
TO: T O ;
DOWNTO: D O W N T O ;
OF: O F ;
RETURN: R E T U R N ;
LET: ':=' ;
BOOLEAN: B O O L E A N ;
REAL: R E A L ;
PROCEDURE: P R O C E D U R E ;
FUNCTION: F U N C T I O N ;

NOT: N O T    ;
AND: A N D | '&';   //maybe
OR: O R | '|';  //maybe

fragment DIGIT: [0-9];
NUM:  DIGIT+ '.' DIGIT* // match 1. 39. 3.14159 etc
    |     '.' DIGIT+ // match .0 .14159
    |     DIGIT+  // match integers
    ;


ID: [_A-Za-z][_A-Za-z0-9]*; 
STRING : '\'' .*? '\'' ;
//STRING '.*?';


LINE_COMMENT: '{' .*? '\r'? '}' '\n' -> skip;  //match {..} single line comments
COMMENT: '(*' .*? '*)' -> skip;         //match multiline comments (* ... *)
COMMENTTWO:   '{*' .*? '*}' -> skip;    //match multiline comments {* ... *}
COMMENTTHREE: '//' .*? '\n' -> skip;    //match '//' 1 line comments
WS : [ \t\r\n]+ -> skip ;               //skip all whitespace and comments
