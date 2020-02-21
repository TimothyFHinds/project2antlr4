program test6;
var
exit: boolean;
choice: real;

begin
   writeln('Test6 Begin');
   writeln('-----------');
   writeln('testing readln to change variable values');
   writeln('testing if then else statements with variable manipulation');
   writeln('-----------');
   writeln('would you like to continue?');
   writeln('Enter 1 for yes, anything else for no');
   readln(choice);

   if(choice = 1.0) then
      exit := false
   else
      exit := true;

   if (exit = true) then
      writeln('bye!') //entering 1.0 should result in goodbye print
   else
      writeln('continue..');


end.