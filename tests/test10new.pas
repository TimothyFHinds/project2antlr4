program test10;
var
   a, b, c: REAL;
procedure display;
var
   x, y, z: REAL;

begin
   (* local variables *)
   x := 10;
   y := 20;
   z := x + y;
   
   (*global variables *)
   a := 30;
   b:= 40;
   c:= a + b;
   
   writeln('Winthin the procedure display');
   writeln(' Displaying the global variables a, b, and c');
   writeln('value of a = ');
   writeln(a);
   writeln('value of b = ' );
   writeln(b);
   writeln('value of c = ' );
   writeln(c);
   
   writeln('Displaying the local variables x, y, and z');
   writeln('value of x = ');
   writeln(x);
   writeln('value of y = ' );
   writeln(y);
   writeln('value of z = ' );
   writeln(z);
   end;

begin
   a:= 100;
   b:= 200;
   c:= 300;
   
   writeln('Winthin the program ');
   writeln('value of a = ');
   writeln(a);
   writeln('value of b = ' );
   writeln(b);
   writeln('value of c = ' );
   writeln(c);   
   display();
end.