program test8;
var
GPA: real;
num0: real = 0.0;
num1: real = 0.5;
num2: real = 1.0;
num3: real = 1.5;
num4: real = 2.0;
num5: real = 2.5;
num6: real = 3.0;
num7: real = 3.5;
num8: real = 4.0;
boolInput : boolean;
numInput: real;
nameInput: string;

begin
    (*change the grade here to check the case*)
    writeln('Test8 Begin');
    writeln('-----------');
    writeln('testing case statement with variable cases');
    writeln('you can enter whole numbers such as 1 or 0 to get output');
    writeln('GPA compliments, enter your GPA, divisible by 0.5 ie: [0.0-4.0]');
    readln(GPA);

    case (GPA) of
        num0 : writeln('were you even trying? yikes');
        num1, num2, num3, num4 : writeln('Better luck next time.');
        num5 : writeln('Almost there you were so close.');
        num6 : writeln('You really kicked butt.');
        num7 : writeln('Congratz you did great!');
        num8 : writeln('a 4.0? wow you are really smart!!!');
        ELSE writeln('you gotta enter 0.0-4.0 in increments of 0.5');
            writeln('two statements can be here just to show you');
    end;

    writeln('Now lets test a case statement using numbers');
    writeln('----------');
    writeln('enter a whole number 1-10');
    readln(numInput);
    case (numInput) of
        0.0 : writeln('Zero');
        1.0 : writeln('One');
        2.0 : writeln('Two');
        3.0 : writeln('Three');
        4.0 : writeln('Four');
        5.0 : writeln('Five');
        6.0 : writeln('Six');
        7.0 : writeln('Seven');
        8.0 : writeln('Eight');
        9.0 : writeln('Nine');
        10.0 : writeln('Ten');
    ELSE writeln('You were supposed to enter a whole number 1-10 to receive proper output');
    end;

    writeln('Now lets test a case statement using booleans');
    writeln('----------');
    writeln('Do you like updog? true or false?');
    readln(boolInput);
    case (boolInput) of
        true : writeln('Whats up dog');
        false : writeln('Whats wrong dog?');
    else writeln('You are no fun ');
    end;
    
    writeln('--------');
    writeln('Test8 End');
end.