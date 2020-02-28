program test5;

var  
num1 : REAL;
num2 : REAL;

//continue statement test cases
//https://www.tutorialspoint.com/pascal/pascal_continue_statement.htm
begin
    
    num1 := 10;
    writeln('While loop with continue, 3 should be missing');
    while num1>0 do
        begin
            if(num1 = 3) then //skip iterations 0-3
                begin
                    num1 := num1 - 1;
                    continue;
                end;
            writeln(num1);  
            num1 := num1 - 1;
        end;

    writeln();

    num1 := 1;
    writeln('While loop with continue,  should print from 1 to 5');
    while num1<10 do
        begin
            if(num1 > 5) then //skip iterations 5-10
                begin
                    num1 := num1 + 1;
                    continue;
                end;
            writeln(num1);  
            num1 := num1 + 1;
        end;

    writeln();

    writeln('For loop with continue, output should go from 10 to 14');
    for num2 := 10 to 20 do 
    begin 
        if(num2 > 14) then
            continue;
        writeln(num2);
    end;

    writeln();

end.