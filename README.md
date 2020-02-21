# Project 2
# Carl Lin && Timothy Hinds

# How to compile/run individual files:
1. unzip 
2. cd pascal
3. antlr4 -visitor Pascal.g4
4. javac *.java
5. java TestPascalVisitor tests/test1.pas       <- for Project1 implementations

6. java TestPascalVisitor tests/test2.pas       <- while do loops
                                test3.pas       <- for do loops
                                test4.pas       <- break statements,
                                                    multiple loops in one program
                                test5.pas       <- continue statement
                                test6.pas       <- procedures
                                test7.pas       <- functions
# Test File Script:
To run all test files and check for desired outputs
    From a windows machine
    cmd tests.bat
    tests.bat

    or double click it      <-- works best


# TO SEE PARSE TREE
grun Pascal program -gui tests/testX.pas
    cmd will show errors with parse tree if any




# Assumptions:
    strings print with 'quotes' around them for now.
        if we get enough time we can fix this later
    
    can't deal with negative number inputs
        --negative sign when user inputs negative numbers is "extraneous input"
        see tests/old/test1.pas line 10
        see tests/old/test2.pas line 7/8

# QUESTIONS!
    --how can we remove the clutter files showing up in the directory?******super annoying to look at i know lol

# Changes Needed:
    PascalBaseVisitor.java has the base visitor methods WITHOUT any written methods
    TestPascalVisitor.java contains all of OUR WRITTEN visitor methods
        it @Override's the visitors in PascalBaseVisitor.java
    
    --while-do 
        testfile: tests/test2.pas      
        
        add labels to the grammar rule in Pascal.g4
            `#whileDoExp1`
            see `expression` grammar rule in Pascal.g4 for example.
            
        After adding labels rerun: antlr4 -visitor Pascal.g4
            javac *.java
            java TestPascalVisitor.java
            its a monster full of Visitor methods

    --for-do loops
        testfile: tests/test3.pas      
        
        add labels to the grammar rule in Pascal.g4
            
        After adding labels rerun: antlr4 -visitor Pascal.g4
            javac *.java
            java TestPascalVisitor.java
            its a monster full of Visitor methods

    --break keyword
        testfile: tests/test4.pas      
        
        add labels to the grammar rule in Pascal.g4
            
        After adding labels rerun: antlr4 -visitor Pascal.g4
            javac *.java
            java TestPascalVisitor.java
            its a monster full of Visitor methods
    
    --continue keyword  
        testfile: tests/test5.pas      
        
        add labels to the grammar rule in Pascal.g4
            
        After adding labels rerun: antlr4 -visitor Pascal.g4
            javac *.java
            java TestPascalVisitor.java
            its a monster full of Visitor methods

    --user defined procedures
        testfile: tests/test6.pas
        
        add labels to the grammar rule in Pascal.g4
            
        After adding labels rerun: antlr4 -visitor Pascal.g4
            javac *.java
            java TestPascalVisitor.java
            its a monster full of Visitor methods

    --user defined functions
        testfile: tests/test7.pas      
        
        add labels to the grammar rule in Pascal.g4
            
        After adding labels rerun: antlr4 -visitor Pascal.g4
            javac *.java
            java TestPascalVisitor.java
            its a monster full of Visitor methods


    --Implement scoping


    --Implement static scoping


# Specific requirements:
# Part of the language to implement:
# For this project, you probably need to re-implement the previous part of the language and to add:
    while-do and for-do loops
    break and continue keywords
    user-defined procedures and functions
    Implementing scoping
    Please implement static scoping for the language. 
## Specifically for static scoping:

        Each time a new block opens (while, for statements) a new scope is created.
        Functions (procedures) create scopes as well. Only global variables are visible in the functions (together with their local scopes).
        Chain the scopes as they are created and keep track what is visible where
        Test cases
        Write test cases to cover the entire language. You can/should reuse the test cases from Project 1 for the common part. 


# What to turn in
Turn in all the files needed to run your project. This includes the grammar file, Java sources needed and test cases (.pas extension) and a README file indicating how to run your code. You will not be able to rely on grun to run your code since you need a main program to evaluate your AST or parse tree. 

# Bonuses (10% each)
Implement a simple version of constant propagation. That is if the code contains calculations using constants that can be performed at compile time, perform such computations as you parse the code. For example, the AST for " v = 2*(10+11)" will become "v=42" and "v=v+2*3" becomes "v=v+6". To prove that this is the case, print your AST. Notice that this is not possible (or at least very hard) to do if you use the Antlr parse trees (requires parse tree rewrite which is hard and undocumented). We will implement the more complex version of constant propagation in a subsequent project.
Implement formal parameter passing in procedures/functions. Procedures should be able to declare formal parameters that can be passed when they are called. These variables should be correctly scoped as well.







