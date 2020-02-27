program test8;

var
a : REAL = 12.0;
b : boolean;
c : boolean = false;
d : REAL;

// User-Procedure Starts Here

procedure isTrue(var e, f: real; var g: boolean);
var
    value : real;
    result : REAL = 100.0;
begin
    value := e * f;
    if(value > result) then
    g := true

    else
    g := false;
end;

begin
    writeln('Start Test Case #8');
    writeln('Enter a number for d: ');
    readln(d);

    isTrue(a, d, b);

    writeln();
    writeln('Is a and d multipled greater than 100?');
    writeln(b);
end.