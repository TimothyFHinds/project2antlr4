program test6;

var 
a, b, c, min: REAL;

//User-defined procedure
//https://www.tutorialspoint.com/pascal/pascal_procedures.htm

procedure findMin(x, y, z: real; var m: real);
    //find the minimum of the three input values
begin
    if(x < y) then
        m := x
        else 
        m := y;
    
    if(z<m) then
        m := z;
end;
//end of findMin

//main block
begin
    writeln('Checking for minimum of 3 numbers');
    a := 500;
    b := 300;
    c := 700;
    findMin(a, b, c, min);

    writeln('Minimum of the 3 numbers: ');
    writeln(min);
end.