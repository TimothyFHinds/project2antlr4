program test10;
var
   a, b, c: integer;

procedure display();
var
   a, b, c: integer;
begin
   (* local variables *)
   a := 10;
   b := 20;
   c := a + b;
   
   writeln('Within the procedure display');
   writeln('value of a = ');
   writeln(a);
   writeln('value of b = ' );
   writeln(b);
   writeln('value of c = ' );
   writeln(c);

end;

begin
   a:= 100;
   b:= 200;
   c:= a + b;
   
   writeln('Within the program');
   writeln('value of a = ');
   writeln(a);
   writeln('value of b = ' );
   writeln(b);
   writeln('value of c = ' );
   writeln(c);   
   display();
end.