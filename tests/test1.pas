program test1;

var                 
z1, z2, z3: REAL; 
z4: real;             
z5, z6: boolean;  
z7 : real = 25.5;     
z8 : boolean = TRUE ;    

//for part 5
num1 : REAL = 1.0;
num2 : REAL = 2.0;
num3 : REAL = 3.0;

//for part 6
a : REAL = 5.0;
b : REAL = 10.0;
c : REAL = 15.0;
d : REAL = 5.0;
bool1 : boolean = true;
bool2 : boolean = false;
bool3 : boolean = true;
bool4 : boolean = false;



begin   
    writeln('Testfinal Begin');
    writeln('----------------');
    writeln('Testing most general functionalities in one file');
    writeln();  //this should print a newline
    (*4. this is multilined
            *)
    //comment
    {*
        multiline comment *}

    num3 := 5 + 56.0;
    writeln(num3);  //expect 61.0
    
    num3 := 55.0 - 5;
    writeln(num3);  //expect 50.0

    num3 := 55.0 / 11;
    writeln(num3); //expect 5.0

    num3 := 23 * 3;
    writeln(num3); //expect 69.0
    
    (*5.*)
    num3 := num1 * num2;
    writeln(num3);  //expect 2.0

    num3 := num2 / num1;
    writeln(num3);  //expect 2.0

    num3 := num1 + num2;
    writeln(num3);  //expect 3.0
    
    num3 := num2 - num1;
    writeln(num3);  //expect 1.0
    
    //check expression inside writeln()
    writeln(5 + 10);    //expect 15.0
    writeln(num1 + num2);   //expect 3.0


    (*6.*)
    if(a=d)                         
    then writeln('Correct output');    (*true case*)

    if(a=b)                         
    then writeln('WRONG OUTPUT!')    
    else writeln('Correct output');  (*false case*)


    if(a<b)                         
    then writeln('Correct output');   (*true case*)

    if(c<a)                         
    then writeln('WRONG OUTPUT!')
    else writeln('Correct output');  (*false case*)

    if(b>a)                         
    then writeln('Correct output');   (*true case*)

    if(a>c)                         
    then writeln('WRONG OUTPUT!')    
    else writeln('Correct output');  (*false*)

    if(a>=d)                       
    then writeln('Correct output')    
    else writeln('WRONG output');  (*true*)

    if(a>=b)                        
    then writeln('WRONG OUTPUT!')   
    else writeln('Correct output');  (*false*)

    if(a<=c)                       
    then writeln('Correct output')  
    else writeln('WRONG output');  (*true*)

    if(c<=a)                       
    then writeln('WRONG OUTPUT!')  
    else writeln('Correct output');  (*false*)

    
    if(bool1 AND bool3)            
    then writeln('Correct output')  
    else writeln('WRONG output');  (*true*)
    if(bool1 AND bool2)
    then writeln('WRONG OUTPUT!')  
    else writeln('Correct output');  (*false*)

    if(bool1 OR bool2)                (*6.B.b*)
    then writeln('Correct output')  
    else writeln('WRONG output');  (*true*)
    if(bool2 OR bool4)
    then writeln('WRONG OUTPUT!')  
    else writeln('Correct output');  (*false*)

    if(NOT (bool2 OR bool4))        (*6.B.c*)
    then writeln('Correct output')  
    else writeln('Wrong output');  (*true*)
    if(NOT (bool1 AND bool3))
    then writeln('WRONG OUTPUT!')  
    else writeln('Correct output');  (*false*)

    (* Operator Precedence .*)
    num3 := num1 + num2 * num1 - num2 / num2;
    writeln(num3);  //expect 2.0


    (*9.*)
    writeln('testing y := sqrt(NUM), sin(NUM), cos(NUM), exp(NUM), ln(NUM) functions(NUM)');
    writeln('EXPECT: 13.0');
    y := sqrt(169.0);
    writeln(y); 
    writeln('EXPECT: 0.0');
    y := sin(3.14);
    writeln(y);
    writeln('EXPECT 1.0');
    y := cos(0.0);
    writeln(y);
    writeln('EXPECT close to 1.0');
    y := ln(2.718);
    writeln(y);
    writeln('EXPECT close to 1.0');
    y := exp(0.0);
    writeln(y);


end.
