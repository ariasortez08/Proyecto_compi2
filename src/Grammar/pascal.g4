grammar pascal;
options { caseInsensitive = true;
language = Java;
   }

main:
PROGRAM ID SEMI_COLON
    (varBlock)?
    (constBlock)?
    (functionBlock)?
    BEGIN

    statements


    END DOT EOF
    ;


statements:  typesstatemes*;
typesstatemes :whileBlock
               |forBlock
               |repeatBlock
               |ifBlock
               |fuctionUsage
               |write_function
               |read_function
               |sentence
               |TEXT
               ;


//DECLARATIONS GENERALS
//ASIGNACION
//math expressions
sentence: assign | expression;
assign: (assingId) ASSIGN (expression) SEMI_COLON ;
expression
        : BRACKET_LEFT expression BRACKET_RIGHT                # ParenthesizedExpression
        | expression (MULT | DIV | MOD) expression              # MulDivModExpression
        | expression (PLUS | MINUS) expression                  # AddSubExpression
        | optional_values                                      # ValuesExpression
        | array_call                                           # ArrayCallExpression
        | arraybi_call                                         # ArrayBiCallExpression
        ;




assingId:ID
    | array_call
    | arraybi_call
     ;

optional_values:
      fuctionUsage
    | TEXT
    | NUMBER
    | ID
    | TEXTCHAR
    | TRUE
    | FALSE
    ;
//declarations of variables
varBlock: VAR varDecl+ ;
varDecl: varID COLON typeDef SEMI_COLON;
varID:(ID) (COMA (ID))* ;
typeDef: typeName ;
typeName: INT_TYPE
       | CHAR_TYPE
       | BOOL_TYPE
       | STR_TYPE
       | arrDecl;
arrDecl: arr1D | arr2D;
arr1D:ARRAY SQBRACKET_LEFT range DOBLEDOTS range SQBRACKET_RIGHT OF typearray;
arr2D:ARRAY SQBRACKET_LEFT range DOBLEDOTS range COMA range DOBLEDOTS range SQBRACKET_RIGHT OF typearray;
typearray:INT_TYPE
          | CHAR_TYPE
          | BOOL_TYPE
          | STR_TYPE;
range:NUMBER;


//declariotions of constants
constBlock: CONST constDecl+;
constDecl: constCharDecl | constStrDecl;
constCharDecl: CONST_CHAR COLON ID EQUAL TEXTCHAR SEMI_COLON;
constStrDecl: CONST_STRING COLON ID EQUAL TEXT SEMI_COLON;

//declaration of funtions
functionBlock: functionDecl+;
functionDecl: FUNCTION ID params COLON returnType SEMI_COLON
            (varBlock)?
            (functionBlock)?
            BEGIN
            (whileBlock|forBlock|repeatBlock|ifBlock|assign|fuctionUsage|write_function|read_function)*
            (ID|NUMBER|TEXT)*
            (assign)?
            END SEMI_COLON;
params: BRACKET_LEFT ((varParamBlock)?) BRACKET_RIGHT;
returnType: INT_TYPE | CHAR_TYPE | BOOL_TYPE | STR_TYPE;

//declaration of params for funtions
varParamBlock: VAR varParamDecl+ ;
varParamDecl: varParamID COLON typeParamDef;
varParamID:(ID) (COMA (ID))* ;
typeParamDef: typeParamName ;
typeParamName: INT_TYPE
       | CHAR_TYPE
       | BOOL_TYPE
       | STR_TYPE ;

//function usage declaration
fuctionUsage: ID BRACKET_LEFT (paramsusable)? BRACKET_RIGHT (SEMI_COLON)?;

paramsusable: (expression)(COMA (expression))*;

//declaration of cycles
//Cycle While
whileBlock: whileDecla+;
whileDecla: C_WHILE condition C_DO
            BEGIN
            statements
            END SEMI_COLON;
condition: BRACKET_LEFT ( ID conditionvali codition2) BRACKET_RIGHT;
codition2: ID
        | NUMBER
        | sentence
        ;
//Cycle for
forBlock: forDecla+;
forDecla: C_FOR forcondition C_to valuesfor C_DO
            ((BEGIN
             statements
            END SEMI_COLON) | (whileDecla|forDecla|sentence) )?;
forcondition: idfor ASSIGN valuesfor ;

idfor: ID;
valuesfor: NUMBER
        |ID
        ;


//Cycle repeat
repeatBlock: repeatDecla+;
repeatDecla: C_REPEAT
            BEGIN
            (whileBlock|forBlock|repeatBlock|ifBlock|fuctionUsage|write_function|read_function|sentence)*
            END
            repeatcondition;
repeatcondition: C_UNTIL ( (ID) conditionvali (ID)) SEMI_COLON ;

//Codition IF
ifBlock: ifDecla+;
ifDecla: C_IF ifcondition C_THEN
            ((BEGIN
            statements
            END SEMI_COLON)|(typesstatemes))?
            (C_ELSE typesstatemes)?
            ;
ifcondition:  ( (ID) conditionvali cond2) ;
conditionvali:BOOLEANE
| EQUAL;

cond2: ID
    | NUMBER
    | TEXT
    ;

array_call: ID SQBRACKET_LEFT arraybi1 SQBRACKET_RIGHT;
arraybi_call: ID SQBRACKET_LEFT arraybi1 COMA arraybi2 SQBRACKET_RIGHT;

arraybi1:NUMBER
| ID;

arraybi2:NUMBER
| ID;


read_function: READ BRACKET_LEFT readId BRACKET_RIGHT SEMI_COLON;
readId: ID#idRead
        |array_call#arrayRead
        |arraybi_call#arraybiRead;


write_function: WRITE BRACKET_LEFT writeId BRACKET_RIGHT SEMI_COLON;
writeId: ID #idWrite
        |TEXT COMA (ID|array_call|arraybi_call) #idWrite
        |array_call#arrayWrite
        |arraybi_call#arraybiWrite
        |TEXT #idText;

READ: 'read';
WRITE: 'write' | 'writeln';
BRACKET_LEFT: '(';
BRACKET_RIGHT: ')';
SQBRACKET_LEFT: '[';
SQBRACKET_RIGHT: ']';

//token main
PROGRAM: 'program';
BEGIN: 'begin';
END: 'end';

//types of variables tokens
INT_TYPE: 'integer';
STR_TYPE: 'string';
BOOL_TYPE: 'boolean';
CHAR_TYPE: 'char';
VAR: 'var';
ARRAY: 'array';
OF: 'of';
CONST: 'const';
CONST_CHAR: 'constchar';
CONST_STRING: 'conststr';
ARRAY_OF: 'array of';

//tokens for operations


//asignation token
ASSIGN: ':=';

//tokens general
NUMBER:[0-9]+; //number
TEXTCHAR : '\'' ( ~["\r\n] | '\'\'' ) '\''; //string
TEXT: '\'' ( ~["\r\n] | '\'\'' )* '\''; //string
COLON: ':';
SEMI_COLON: ';';
COMA: ',';
DOBLEDOTS: '..';
QUATATION_MARK: '\'';
DOUBLE_QUOTATION_MARK:'"'; //double quotation mark
DOT: '.';
TRUE:'true';
FALSE:'false';

//boolean expression tokens
BOOLEANE:'>'|'<'|'<>'|'>='|'<='|'AND'|'OR'|'NOT';
EQUAL: '=';
//Funtions tokens
FUNCTION: 'function';



//Cicles tokens
C_WHILE: 'while';
C_DO: 'do';
C_to: 'to' | 'Downto';
C_FOR: 'for';
C_REPEAT: 'repeat';
C_UNTIL: 'until';

//Condition tokens
C_IF: 'if';
C_THEN:'then';
C_ELSE: 'else';


//math operatrors
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: 'mod';

ID:[a-z][a-z0-9]*([_][a-z0-9]+)*  ; //ididentifier
WS:[ \t\n\r]+ -> skip;//skip whitespace
COMMENT: '{' .*? '}' -> skip; //comments