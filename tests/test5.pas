program test5;

var  
num1 : REAL;
num2 : REAL;

//continue statement test cases
//https://www.tutorialspoint.com/pascal/pascal_continue_statement.htm
begin
    num1 := 10;

    while num1>0 do
        begin
            if(num1 = 5) then //skip iteration 5
                begin
                    num1 := num1 - 1;
                    continue;
                end;
            writeln('The value of num1: ');
            writeln(num1);
            writeln();  
            num1 := num1 - 1;
        end;

    for num2 := 10 to 20 do 
    begin 
        if(num2 = 15) then
            continue;
        writeln('value of num2: ');
        writeln(num2);
    end;

    writeln();


end.