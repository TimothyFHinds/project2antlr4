program test9;

var 
A : REAL;
B : REAL = 12.0;

procedure ScopeInner(var c : real);
var A : REAL;
begin
    A := 10;
    //writeln (A)
end;

begin (* Main *)
    writeln('Old Value of A');
    A := 20;
    writeln (A);
    ScopeInner(B);
    writeln('New Value of A');
    writeln (A);
end. 
(* Main *)

