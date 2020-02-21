:: Run all tests
:: Project2 - Pascal
ECHO OFF
ECHO.
ECHO Project2 - Carl Lin and Timothy Hinds
ECHO.
::antlr4 -visitor Pascal.g4
:: javac *.java

ECHO. 

:: Test 1
java TestPascalVisitor tests/test1.pas >> result1.txt

ECHO. 

:: Display output of Test1
java TestPascalVisitor tests/test1.pas

ECHO. 


:: Test 2
java TestPascalVisitor tests.test2.pas >> result2.txt

ECHO. 

:: Display output of Test2
java TestPascalVisitor tests/test2.pas

ECHO. 


:: Test 3
java TestPascalVisitor tests/test3.pas >> result3.txt

ECHO. 

:: Display output of Test3
java TestPascalVisitor tests/test3.pas

ECHO. 

:: Test 4
java TestPascalVisitor tests/test4.pas >> result4.txt

ECHO. 

:: Display output of Test4
java TestPascalVisitor tests/test4.pas

ECHO. 

:: Test 5
java TestPascalVisitor tests/test5.pas >> result5.txt

ECHO. 

:: Display output of Test5
java TestPascalVisitor tests/test5.pas

ECHO. 

:: Test 6
java TestPascalVisitor tests/test6.pas >> result6.txt

ECHO. 

:: Display output of Test6
java TestPascalVisitor tests/test6.pas

ECHO. 

:: Test 7
java TestPascalVisitor tests/test7.pas >> result7.txt

ECHO. 

:: Display output of Test7
java TestPascalVisitor tests/test7.pas

ECHO. 



:: Checking if tests were successful or not
:: Test1
ECHO.
fc /b tests\output\test1.out result1.txt > nul
if errorlevel 1 (
    echo Test1.pas Did not match expected output!
) else (
    echo Test1.pas SUCCESSFUL OUTPUT MATCHED!
)
del result1.txt
ECHO.

:: Test2
ECHO.
fc /b tests\output\test2.out result2.txt > nul
if errorlevel 1 (
    echo Test2.pas Did not match expected output!
) else (
    echo Test2.pas SUCCESSFUL OUTPUT MATCHED!
)
del result2.txt
ECHO.

:: Test3
ECHO.
fc /b tests\output\test3.out result3.txt > nul
if errorlevel 1 (
    echo Test3.pas Did not match expected output!
) else (
    echo Test3.pas SUCCESSFUL OUTPUT MATCHED!
)
del result3.txt
ECHO.

:: Test4
ECHO.
fc /b tests\output\test4.out result4.txt > nul
if errorlevel 1 (
    echo Test4.pas Did not match expected output!
) else (
    echo Test4.pas SUCCESSFUL OUTPUT MATCHED!
)
del result4.txt
ECHO.

:: Test5
ECHO.
fc /b tests\output\test5.out result5.txt > nul
if errorlevel 1 (
    echo Test5.pas Did not match expected output!
) else (
    echo Test5.pas SUCCESSFUL OUTPUT MATCHED!
)
del result5.txt
ECHO.

:: Test6
ECHO.
fc /b tests\output\test6.out result6.txt > nul
if errorlevel 1 (
    echo Test6.pas Did not match expected output!
) else (
    echo Test6.pas SUCCESSFUL OUTPUT MATCHED!
)
del result6.txt
ECHO.

:: Test7
ECHO.
fc /b tests\output\test7.out result7.txt > nul
if errorlevel 1 (
    echo Test7.pas Did not match expected output!
) else (
    echo Test7.pas SUCCESSFUL OUTPUT MATCHED!
)
del result7.txt
ECHO.

ECHO End of test files
ECHO Scroll up to see outputs from tests
pause




