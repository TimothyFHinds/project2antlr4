Project 1
Timothy Hinds

Assumptions made:
    ' quote marks are printed on edges of strings '
    all numbers are expected to be entered in a x.x format EX: 4.5
    case(variable, boolean, or real)
    variables when declared as negative may give a compiler message
        "extraneous input", but the variable still will hold the negative value
        if negative variables are printed it may give a compiler message
            "no viable alternative at input"
    

Test file overview:
    under /tests/*

to compile:
1. unzip 
2. cd pascal
3. antlr4 -visitor Pascal.g4
4. javac *.java
5. java TestPascalVisitor tests/TESTFILENAME

Test Overviews
-------------------------------
testextra.pas : java TestPascalVisitor tests/testextra.pas
    sample implementations of all Pascal functionalities
-------------------------------
test1.pas : java TestPascalVisitor tests/test1.pas
    (*.. {*..
       ..*) ..*} multiline comments 
    {} // single line comments
    program name (no args) ;
    variable declarations
    main program block begin .. end.
    writeln('string');
    writeln(variable);
-------------------------------
test2.pas : java TestPascalVisitor tests/test2.pas
    Testing arithmetic evaluations using variables
    writeln(variable);
-------------------------------
test3.pas : java TestPascalVisitor tests/test3.pas
   Arithmetic operator precedence  
    //basic arithmetic expressions with variables being evaluated
        ex: b := a + c;
-------------------------------
test4.pas : java TestPascalVisitor tests/test4.pas
    if-then-else 
    guess the secret number (hint: its 10.5)
-------------------------------
test5.pas : java TestPascalVisitor tests/test5.pas
    Evaluating relational expressions
    <>, =, <, <=, >, >=
    evaluating if-then-else statements based on conditions
    writeln(boolean);
-------------------------------
test6.pas : java TestPascalVisitor tests/test6.pas          !!HAS PROBLEMS!!
    if then else case, testing if else case evaluates
    taking user input with readln() and changing variables
-------------------------------
test7.pas : java TestPascalVisitor tests/test7.pas  !!HAS PROBLEMS!!
    boolean operators:
    and         (A and B) if both are true then condition is true
    or          (A or B) if either are true then condition is true
    not         not (a and b) reverses the logical state of its operand
-------------------------------
test8.pas : java TestPascalVisitor tests/test8.pas  !!HAS PROBLEMS!!
    case statement evaluation
    case(variable)
    readln(NUMBER)  
-------------------------------
test9.pas : java TestPascalVisitor tests/test9.pas
    testing the functionalities of the functional math operations such as sqrt, ln, exp, cos, sin
-------------------------------
BONUS TESTS

i did not implement constants
i did not implement enumerated types