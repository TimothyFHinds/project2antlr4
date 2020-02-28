program test82;

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
    h : REAL;
begin
    for h := 5 to 10 do
    begin
        writeln('|');
    end;
    writeln('V');
    value := e * f;
    if(value > result) then
    g := true

    else
    g := false;
end;

begin
    writeln('Start Test Case #8');
    writeln('Enter a number for d: ');
    d := 5;
    writeln();

    isTrue(a, d, b);

    writeln();
    writeln('Is 12*d greater than 100?');
    writeln(b);
end.