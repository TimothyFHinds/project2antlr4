:: Run all tests
:: Project2 - Pascal
ECHO OFF
ECHO.
ECHO Project2 - Carl Lin and Timothy Hinds
ECHO.
::antlr4 -visitor Pascal.g4
::javac *.java

ECHO. 

:: Test 1
java TestPascalVisitor tests/test1.pas >> tests/out/result1.txt

ECHO. 

:: Display output of Test1
java TestPascalVisitor tests/test1.pas

ECHO. 

:: Test 2
java TestPascalVisitor tests/test2.pas >> tests/out/result2.txt

ECHO. 

:: Display output of Test2
java TestPascalVisitor tests/test2.pas

ECHO. 

:: Test 3
java TestPascalVisitor tests/test3.pas >> tests/out/result3.txt

ECHO. 

:: Display output of Test3
java TestPascalVisitor tests/test3.pas

ECHO. 

:: Test 4
java TestPascalVisitor tests/test4.pas >> tests/out/result4.txt

ECHO. 

:: Display output of Test4
java TestPascalVisitor tests/test4.pas

ECHO. 


:: Test 5
java TestPascalVisitor tests/test5.pas >> tests/out/result5.txt

ECHO. 

:: Display output of Test5
java TestPascalVisitor tests/test5.pas

ECHO. 


:: Test 6
java TestPascalVisitor tests/test6.pas >> tests/out/result6.txt

ECHO. 

:: Display output of Test6
java TestPascalVisitor tests/test6.pas

ECHO. 

:: Test 7
java TestPascalVisitor tests/test7.pas >> tests/out/result7.txt

ECHO. 

:: Display output of Test7
java TestPascalVisitor tests/test7.pas

ECHO. 



:: Test 81
java TestPascalVisitor tests/test81.pas >> tests/out/result81.txt

ECHO. 

:: Display output of Test81
java TestPascalVisitor tests/test81.pas

ECHO. 

:: Test 82
java TestPascalVisitor tests/test82.pas >> tests/out/result82.txt

ECHO. 

:: Display output of Test82
java TestPascalVisitor tests/test82.pas

ECHO. 

:: Test 9
java TestPascalVisitor tests/test9.pas >> tests/out/result9.txt

ECHO. 

:: Display output of Test9
java TestPascalVisitor tests/test9.pas

ECHO. 

:: Test 10
java TestPascalVisitor tests/test10.pas >> tests/out/result10.txt

ECHO. 

:: Display output of Test10
java TestPascalVisitor tests/test10.pas

ECHO. 





:: CHECKING IF TESTS WERE SUCCESSFUL OR NOT!

:: Test1
ECHO.
fc /b tests\out\test1.out tests\out\result1.txt > nul
if errorlevel 1 (
    echo Test1.pas Did not match expected output!
) else (
    echo Test1.pas SUCCESSFUL OUTPUT MATCHED!
)
del tests\out\result1.txt
ECHO.

:: Test2
ECHO.
fc /b tests\out\test2.out tests\out\result2.txt > nul
if errorlevel 1 (
    echo Test2.pas Did not match expected output!
) else (
    echo Test2.pas SUCCESSFUL OUTPUT MATCHED!
)
del tests\out\result2.txt
ECHO.

:: Test3
ECHO.
fc /b tests\out\test3.out tests\out\result3.txt > nul
if errorlevel 1 (
    echo Test3.pas Did not match expected output!
) else (
    echo Test3.pas SUCCESSFUL OUTPUT MATCHED!
)
del tests\out\result3.txt
ECHO.

:: Test4
ECHO.
fc /b tests\out\test4.out tests\out\result4.txt > nul
if errorlevel 1 (
    echo Test4.pas Did not match expected output!
) else (
    echo Test4.pas SUCCESSFUL OUTPUT MATCHED!
)
del tests\out\result4.txt
ECHO.

:: Test5
ECHO.
fc /b tests\out\test5.out tests\out\result5.txt > nul
if errorlevel 1 (
    echo Test5.pas Did not match expected output!
) else (
    echo Test5.pas SUCCESSFUL OUTPUT MATCHED!
)
del tests\out\result5.txt
ECHO.

:: Test6
ECHO.
fc /b tests\out\test6.out tests\out\result6.txt > nul
if errorlevel 1 (
    echo Test6.pas Did not match expected output!
) else (
    echo Test6.pas SUCCESSFUL OUTPUT MATCHED!
)
del tests\out\result6.txt
ECHO.


:: Test7
ECHO.
fc /b tests\out\test7.out tests\out\result7.txt > nul
if errorlevel 1 (
    echo Test7.pas Did not match expected output!
) else (
    echo Test7.pas SUCCESSFUL OUTPUT MATCHED!
)
del tests\out\result7.txt
ECHO.


:: Test81
ECHO.
fc /b tests\out\test81.out tests\out\result81.txt > nul
if errorlevel 1 (
    echo Test81.pas Did not match expected output!
) else (
    echo Test81.pas SUCCESSFUL OUTPUT MATCHED!
)
del tests\out\result81.txt
ECHO.

:: Test82
ECHO.
fc /b tests\out\test82.out tests\out\result82.txt > nul
if errorlevel 1 (
    echo Test82.pas Did not match expected output!
) else (
    echo Test82.pas SUCCESSFUL OUTPUT MATCHED!
)
del tests\out\result82.txt
ECHO.

:: Test9
ECHO.
fc /b tests\out\test9.out tests\out\result9.txt > nul
if errorlevel 1 (
    echo Test9.pas Did not match expected output!
) else (
    echo Test9.pas SUCCESSFUL OUTPUT MATCHED!
)
del tests\out\result9.txt
ECHO.

:: Test10
ECHO.
fc /b tests\out\test10.out tests\out\result10.txt > nul
if errorlevel 1 (
    echo Test10.pas Did not match expected output!
) else (
    echo Test10.pas SUCCESSFUL OUTPUT MATCHED!
)
del tests\out\result10.txt
ECHO.





ECHO End of test files
ECHO Scroll up to see outputs from tests
pause




