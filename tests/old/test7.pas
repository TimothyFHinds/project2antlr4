program test7;

var
A:boolean=true;
B:boolean=false;
C:boolean=true;
D:boolean=false;
begin
    writeln('Test7 Begin');
    writeln('--------------');
    writeln('test boolean condition expressions');

    if(NOT (A))   //not true = false
    then writeln('INCORRECT OUTPUT')
    else writeln('CORRECT OUTPUT');

    if(NOT (B))   //not false = true
    then writeln('CORRECT OUTPUT')
    else writeln('INCORRECT OUTPUT');

    if(A and B) //true and false = false
    then writeln('INCORRECT OUTPUT')
    else writeln('CORRECT OUTPUT');

    if(A and C) //true and true = true
    then writeln('CORRECT OUTPUT')
    else writeln('INCORRECT OUTPUT');

    
    if(B and D) //false and false = true
    then writeln('CORRECT OUTPUT')
    else writeln('INCORRECT OUTPUT');   

    if(A or B)  //true or false = true
    then writeln('CORRECT OUTPUT')
    else writeln('INCORRECT OUTPUT');

    if(A or C)  //true or true = true
    then writeln('CORRECT OUTPUT')
    else writeln('INCORRECT OUTPUT');

    if(B or D)  //false or false = false
    then writeln('INCORRECT OUTPUT')
    else writeln('CORRECT OUTPUT');

    if(NOT (A and B))   //true and false = false
    then writeln('CORRECT OUTPUT')
    else writeln('INCORRECT OUTPUT');

    if(NOT (A or B))    //true and false = false
    then writeln('INCORRECT OUTPUT')
    else writeln('CORRECT OUTPUT'); 

end.