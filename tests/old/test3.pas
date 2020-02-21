(*need to test the precedence of arithmetic operators * / + -    *)
program test3;
var
num1 : REAL = 1.0;
num2 : REAL = 2.0;
num3 : REAL = 3.0;
num4 : REAL = 4.0;
num5 : REAL = 5.0;
num6 : real;


begin
    writeln('Test3 Begin');
    writeln('--------------');
    writeln('Testing operator precedence');
    writeln('Expected Answer: 17.0');
    num6 := num5 + num4 * num3; //5+4*3 = 5+12 = 17
    writeln(num6);
    writeln('Expected Answer: -1.0');
    num6 := num5 + num4 / num1 - num2 * num5;   // 5+4/1-2*5 = 5+4-10 = 9-10 = -1
    writeln(num6);
    writeln('Expected Answer: 7.5');
    num6 := num3 - num1 / num4 * num2 + num5;   //3-1/4*2+5 = 3-0.5+5 = 8-0.5=7.5
    writeln(num6);
    writeln('Expected Answer: 27.5');
    num6 := num5 * num4 + num3 - num1 / num4 * num2 + num5; //5*4+3-1/4*2+5 = 20+3-0.50+5 = 27.5
    writeln(num6);
    writeln('Test3 End');
    writeln('--------------');
    
end.