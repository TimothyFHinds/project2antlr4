(*testing variable declaration methods*)
program test1;
var
num1, num2, num3: REAL; 
num4: real;         (*single variable declaration and real type  *)
bool1, bool2: boolean;  //multiple variable declaration and boolean type 
num5 : real = 25.5; (*var decl alternative  *)
bool3 : boolean = TRUE ;    (*testing alternative bool decl *)
bool4 : boolean = FALSE ;
num6 : real = 5.2;
(*this is the preferred method of implementing variables *)


begin
    writeln('num1 expected 0.0');
    writeln(num1);
    writeln('num2 expected 0.0');
    writeln(num2);
    writeln('num3 expected 0.0');
    writeln(num3);
    writeln('num4 expected 0.0');
    writeln(num4);
    writeln('num5 expected 25.5');
    writeln(num5);
    writeln('num6 expected 5.2');
    writeln(num6);
    writeln('bool1 expected true');
    writeln(bool1);
    writeln('bool2 expected true');
    writeln(bool2);
    writeln('bool3 expected true');
    writeln(bool3);
    writeln('bool4 expected 0.0');
    writeln(bool4);
    writeln('Test1 finished');
    writeln('--------------');
end.