program test3;

var  
num1 : REAL;
num2 : REAL;

    //for-do loops
    //https://www.tutorialspoint.com/pascal/pascal_for_do_loop.htm
begin
    //basic for loop
    //for num1:= 1 to 10 do writeln(num1);

    for num2 := 10 to 20 do
    begin
        writeln('value of num2: ');
        writeln(num2);
        writeln();
    end;

    writeln();
    
    //for downto loop
    for num2 := 20 downto 10 do
    begin 
        writeln('value of num2: ');
        writeln(num2);
        writeln();
    end;
end.