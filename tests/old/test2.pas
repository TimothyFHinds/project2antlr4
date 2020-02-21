
program test2;
var
num1 : REAL = 1.0;
num2 : REAL = 2.0;
num3 : REAL = 3.0;
num4 : REAL = -2.0;
num5 : REAL = -33.4;
num6 : real;

begin
    writeln('Test2 Begin');
    writeln('--------------');
    writeln('Testing arithmetic evaluations using variables');
    writeln(num1);
    writeln(num2);
    writeln(num3);
    writeln(num4);
    writeln(num5);
    writeln(num6);
    writeln('Addition: pos + pos. Expected: 3.0');
    num6 := num1 + num2;
    writeln(num6);
    writeln('Addition: pos + neg. Expected: 1.0');
    num6 := num4 + num3;
    writeln(num6);
    writeln('Addition: neg + pos. Expected: 0.0');
    num6 := num4 + num2;
    writeln(num6);
    writeln('Addition: neg + neg. Expected: -35.4');
    num6 := num4 + num5;
    writeln(num6);
    writeln();  //line break

    writeln('Subtraction: pos - pos. Expected: 1.0');
    num6 := num2 - num1;
    writeln(num6);
    writeln('Subtraction: pos - neg. Expected: 5.0');
    num6 := num3 - num4;
    writeln(num6);
    writeln('Subtraction: neg - pos. Expected: -3.0');
    num6 := num4 - num1;
    writeln(num6);
    writeln('Subtraction: neg - neg. Expected: 31.4');
    num6 := num4 - num5;
    writeln(num6);
    writeln();  //line break

    writeln('Mult: pos * pos. Expected: 2.0');
    num6 := num2 * num1;
    writeln(num6);
    writeln('Mult: pos * neg. Expected: -6.0');
    num6 := num3 * num4;
    writeln(num6);
    writeln('Mult: neg * pos. Expected: -2.0');
    num6 := num4 * num1;
    writeln(num6);
    writeln('Mult: neg * neg. Expected: 66.8');
    num6 := num4 * num5;
    writeln(num6);
    writeln();  //line break

    writeln('Div: pos / pos. Expected: 2.0');
    num6 := num2 / num1;
    writeln(num6);
    writeln('Div: pos / neg. Expected: -1.5');
    num6 := num3 / num4;
    writeln(num6);
    writeln('Div: neg / pos. Expected: -0.5');
    num6 := num1 / num4;
    writeln(num6);
    writeln('Div: neg / neg. Expected: 16.7');
    num6 := num5 / num4;
    writeln(num6);
    writeln();  //line break
    
    writeln('Test2 End');
    writeln('--------------');
end.