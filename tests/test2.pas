program test2;

var 
num1 : REAL = 20;

begin

    writeln('Counting down from 20');
    
    while num1>0 do
        begin
            writeln(num1);
            writeln();  
            num1 := num1 - 1;
        end;
end.