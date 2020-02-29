# Project 2
# Carl Lin && Timothy Hinds

# How to batch run the tests (windows only):
To run all test files and check for desired outputs
From a windows machine
1. unzip
2. cd project2antlr4  
3. antlr4 -visitor Pascal.g4
4. javac *.java
5. cmd
6. tests.bat
OR
5. double click `tests.bat` within project2antlr4 directory

*note: running the batch test method will NOT test readln() functionality*

*to test readln() functionality run either*

java TestPascalVisitor tests/test22.pas

OR

java TestPascalVisitor tests/test66.pas

OR

java TestPascalVisitor tests/test88.pas

# How to compile/run individual files:
1. unzip 
2. cd project2antlr4
3. antlr4 -visitor Pascal.g4
4. javac *.java
5. java TestPascalVisitor tests/test1.pas       <- for P1 implementations
6. java TestPascalVisitor tests/test2.pas       <- while do loops
7. java TestPascalVisitor tests/test22.pas      <- while do loop with readln()
8. java TestPascalVisitor tests/test3.pas       <- for do loops (TO/DOWNTO)
9. java TestPascalVisitor tests/test4.pas       <- break statements,
10. java TestPascalVisitor tests/test5.pas       <- continue statements
11. java TestPascalVisitor tests/test6.pas       <- procedures
12. java TestPascalVisitor tests/test66.pas      <- procedures with readln()
13. java TestPascalVisitor tests/test7.pas       <- functions
14. java TestPascalVisitor tests/test8.pas       <- procedures with readln() 
15. java TestPascalVisitor tests/test81.pas      <- procedure true case
16. java TestPascalVisitor tests/test82.pas      <- procedure false case
17. java TestPascalVisitor tests/test9.pas       <- scoping
18. java TestPascalVisitor tests/test10.pas     <- static scoping

# TO SEE PARSE TREE
grun Pascal program -gui tests/testX.pas
    cmd will show errors with parse tree if any

# Assumptions:
    strings print with quotes around them ''    
    can't deal with negative number inputs
        --negative sign when user inputs negative numbers is "extraneous input"
        see tests/old/test1.pas line 10
        see tests/old/test2.pas line 7/8

    We cannot create variables with the same name. If it is already create, we cannot make a new one of the same name. We cannot create a new variable named after a global one. This means that if a procedure or variable try to create a new variable named after a global variable, the screen will print out "ALREADY A GLOBAL VARIABLE". This is just printed out to the screen so that we are aware.


# Functionalities:    
    TestPascalVisitor.java contains all of OUR WRITTEN visitor methods
        it @Override's the visitors in PascalBaseVisitor.java
    
    --project1 implementations
        testfile: tests/test1.pas

    --while-do 
        testfile: tests/test2.pas
                  tests/test22.pas      

    --for-do loops
        testfile: tests/test3.pas      

    --break keyword
        testfile: tests/test4.pas      
    
    --continue keyword  
        testfile: tests/test5.pas      
        
    --user defined procedures
        testfile: tests/test6.pas
                  tests/test66.pas
        
    --user defined functions
        testfile: tests/test7.pas      

    --Implement static scoping
        testfile: tests/test9.pas

        This was completed by creating a hashmap called scopeLevelMap.
        The idea of scope level map is to consider the scope level that a variable is created at.
        All global variables have the scope level of 0 and they can be accessed at any other scope level.
        Scope levels increased whenever a procedure/function/for-do statement/while loop were created.


# Test Cases and What They Cover

## tests/test1.pas

Test case #1 basically covered all of the basic math functions that were utilized in the first project.

## tests/test2.pas

Test case #2 covers the while-do loop that we had to implement.
This statement essentially takes a number, prints it, then decrements it. 
Loops until it is equal to 0.

## tests/test22.pas

Test case #22 is test case #2 with readln() functionality to tests the limitationss of while loops.

## tests/test3.pas

Test case #3 covers the for-do loops and will basically print out all values in the for loop from 10 to 20.
It has a second for loop as well, which is utilizing the DOWNTO functionality. It loops from 20 down to 10.

## tests/test4.pas

Test case #4 covers our break statement cases.
It breaks out of a while loops and for loops.

## tests/test5.pas

Test case #5 covers our continue statement cases.
It will parse through the tree until it hits continue statements.
Works for while loops and for loops.

## tests/test6.pas

Test case #6 involves the testing of user defined procedures.
In this file, we read in three different numbers. These numbers should be type and then set with the return key.
Afterwards, we take the three different numbers that we get and an empty variable called min.
In the procedure, we test our three different numbers and set min equal to that number, which is represented by m in the procedure.
After the procedure is done executing, we set the value in m equivalent to the value in min.
In the end, we print out the smallest number represented by min.

## tests/test66.pas

Test case #6 but with readln() functionality for testing its limitations.

## tests/test7.pas

Test case #7 involves the testing of user defined functions.
In this test file, we essentially set the variable ret equivalent to the result of a max function.
The max function essentially gets the max between two different numbers and will return it when called.

## tests/test8.pas

Test case #8 essentially tests creating new variables in the procedure method.
The test case reads in one number that will be multiplied with a predetermined variable.
The procedure is called and the predetermined number (12.0) is multiplied with the user entered number to see if it is greater than 100.
The variables, value and result, were created in the procedure method and used to help determine if the two numbers are greater than result, which is equal to 100.
Value is set equal to the two multiplied numbers and that is then compared to the result.
The result of whether value is greater than or less than result is then stored into variable g.
The global variable, b, is set equal to g and then b is printed out to the screen.

- We also included a for loop in the procedure.
- The functionality of this for loop is to just print the "|" symbol.
- This changed a variable assigned in the procedure and interated from 5 to 10.

## tests/test81.pas

test #8 but a true case.

## tests/test82.pas

test #8 but a false case.

## tests/test9.pas

Test case #9 essentially tests our static scoping.
In our test, we set the variable A equal to 20.
Afterwards, we create a procedure called ScopeInner, which tries to create a variable equal to our global variable.
The screen prints out "Already a global variable" because you cannot create a new variable named after a global variable.
In our procedure, we then change our global variable A to a different value, 10.0.
After the procedure, we print out our A in the main block and it returns the new value 10.0.


