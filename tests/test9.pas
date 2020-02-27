program test9;

var 
A : REAL;

  procedure ScopeInner;
  var A : REAL;
  begin
    A := 10;
    writeln (A)
  end;

begin (* Main *)
  A := 20;
  writeln (A);
  ScopeInner;
  writeln (A);
end. 
(* Main *)

