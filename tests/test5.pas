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
            if(num1 = 5) then
                //skip iteration
                begin
                    num1 := num1 - 1;
                    continue;
                end;
            writeln('The value of num1: ');
            writeln(num1);
            writeln();  //write new line
            num1 := num1 - 1;
        end;

end.