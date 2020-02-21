//testing the mathematical functions and also their precedence *)
program test9;
var
pi: REAL = 3.14;
zero: REAL = 0.0;
x : REAL = 16.0;
e : REAL = 2.718;
y : REAL;
z : REAL;

begin
    writeln('Test9 Begin');
    writeln('--------------');
    writeln('testing y := sqrt(NUM), sin(NUM), cos(NUM), exp(NUM), ln(NUM) functions(NUM)');
    writeln('EXPECT: 4.0');
    y := sqrt(16.0);
    writeln(y); 
    writeln('EXPECT: 0.0');
    y := sin(3.14);
    writeln(y);
    writeln('EXPECT 1.0');
    y := cos(0.0);
    writeln(y);
    writeln('EXPECT close to 1.0');
    y := ln(2.718);
    writeln(y);
    writeln('EXPECT close to 1.0');
    y := exp(0.0);
    writeln(y);
    writeln('testing y := sqrt(x), sin(x), cos(x), exp(x), ln(x) functions(x)');
    writeln('EXPECT: 4.0');
    y := sqrt(x);
    writeln(y); 
    writeln('EXPECT: 0.0');
    y := sin(pi);
    writeln(y);
    writeln('EXPECT 1.0');
    y := cos(zero);
    writeln(y);
    writeln('EXPECT close to 1.0');
    y := ln(e);
    writeln(y);
    writeln('EXPECT close to 1.0');
    y := exp(0.0); 
    writeln(y);
    
    writeln('testing writeln(sqrt(num)), writeln(sin(num)), writeln(cos(num)), writeln(exp(num)), writeln(ln(num)) functions(num)');
    
    writeln('EXPECT: 8.0');
    writeln(sqrt(64.0)); 
    writeln('EXPECT: 0.0');
    writeln(sin(3.14)); 
    writeln('EXPECT 1.0');
    writeln(cos(0.0));
    writeln('EXPECT close to 1.0');
    writeln(ln(2.718));
    writeln('EXPECT close to 1.0');
    writeln(exp(0.0));
    writeln('Test9 End');
    writeln('--------------');
end.