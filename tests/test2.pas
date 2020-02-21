program test2;

var 
num1 : REAL;
num2 : REAL;


begin

    writeln('Count down from?');
    readln(num1);
    while num1>0 do
        begin
            writeln('The value of num1: ');
            writeln(num1);
            writeln();  
            num1 := num1 - 1;
        end;
end.