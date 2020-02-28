program test7;

var 
a, b, ret: REAL;

//user defined functions
//https://www.tutorialspoint.com/pascal/pascal_functions.htm
function max(num1, num2: real): real;
var 
    //local variable declaration
    result: real;

begin
    if(num1 > num2) then
    result := num1

    else
        result := num2;
    
    max := result;
end;

//main block
begin
    a := 100;
    b := 200;
    //function call to find max value
    ret := max(a, b);
    writeln('The values are: ');
    writeln(a);
    writeln(b);

    writeln('Max value is ');
    writeln(ret);
end.