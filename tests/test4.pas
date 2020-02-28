program test4;

var 
num1 : REAL;
num2 : REAL;



begin 
    num1 := 10;
    
    while num1 < 20 do
    begin
        writeln('value of num1');
        writeln(num1);
        num1 := num1 + 1;

        if(num1 > 15) then
            break;
    end;
    writeln();

    for num2 := 10 to 20 do 
    begin 
        writeln('value of num2: ');
        writeln(num2);

        if(num2 > 14) then
            break;
    end;

    writeln();

    num1 := 10;
    
    
    while num1 < 20 do
    begin
        writeln('value of num1');
        writeln(num1);
        num1 := num1 + 1;

        if(num1 > 15) then
            break;
    end;
    
    {* can have multiple loops after each other*}
    writeln('expect output 15 for each loop');    

end.