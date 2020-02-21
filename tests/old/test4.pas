program test4;
var 
x : REAL = 10.5;
y : REAL;

begin
    writeln('Test4 Begin');
    writeln('--------------');
    writeln('Testing if-then-else statement');
    writeln('Guess the secret number x.x');
    readln(y);
                   
    if(y=x) then
        writeln('You guessed the secret number!')
    else
        writeln('You did NOT guess the secret number.');
    
    writeln('hint: its 10.5');
    writeln('Test 4 End');
    writeln('--------------');
end.