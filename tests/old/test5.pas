program test5;
var  
a : REAL = 5.0;
b : REAL = 10.0;
c : REAL = 15.0;
d : REAL = 5.0;
bo1: boolean = true;

begin
    writeln('Test5 Begin');
    writeln('--------------');
    writeln('test boolean writeln');
    writeln(bo1);   //test
    writeln('Testing relational expressions and ifStatement evaluation');
    if(a=d) 
    then writeln('5=5 is true. CORRECT OUTPUT');
    if(a=b)
    then writeln('5=10 is true. INCORRECT OUTPUT!!')
    else writeln('5=10 is false. CORRECT OUTPUT');

    if(true=true) 
    then writeln('true is true. CORRECT OUTPUT');
    if(true=false)
    then writeln('true=false is true. INCORRECT OUTPUT!!')
    else writeln('true=false is false. CORRECT OUTPUT');

    if(1.0=1.0) 
    then writeln('1.0=1.0 is true. CORRECT OUTPUT');
    if(2.2=2.3)
    then writeln('2.2=2.3 is true. INCORRECT OUTPUT!!')
    else writeln('2.2=2.3 is false. CORRECT OUTPUT');

    if(2.0<>1.0) 
    then writeln('1.0<>1.0 is true. CORRECT OUTPUT');
    if(2.2<>2.2)
    then writeln('2.2<>2.2 is true. INCORRECT OUTPUT!!')
    else writeln('2.2<>2.2 is false. CORRECT OUTPUT');

    if(a=d) 
    then writeln('5=5 is true. CORRECT OUTPUT');
    if(a=b)
    then writeln('5=10 is true. INCORRECT OUTPUT!!')
    else writeln('5=10 is false. CORRECT OUTPUT');

    if(a<b)
    then writeln('5<10 is true. CORRECT OUTPUT');

    if(c<a)
    then writeln('15<5 is true. INCORRECT OUTPUT!!')
    else writeln('15<5 is false. CORRECT OUTPUT');

    if(d<a)
    then writeln('5<5 is true. INCORRECT OUTPUT!!')
    else writeln('5<5 is false. CORRECT OUTPUT');

    if(d>a)
    then writeln('5>5 is true. INCORRECT OUTPUT!!')
    else writeln('5>5 is false. CORRECT OUTPUT');

    if(b>a)
    then writeln('5<10 is true. CORRECT OUTPUT');

    if(a>c)
    then writeln('15<5 is true. INCORRECT OUTPUT!!')
    else writeln('15<5 is false. CORRECT OUTPUT');

    if(a>=d)
    then writeln('5>=5 is true. CORRECT OUTPUT')
    else writeln('5>=5 is false. INCORRECT OUTPUT!!');

    if(b>=a)
    then writeln('10>=5 is true. CORRECT OUTPUT')
    else writeln('10>=5 is false. INCORRECT OUTPUT!!');

    if(b<=c)
    then writeln('15<=15 is true. CORRECT OUTPUT')
    else writeln('15<=15 is false. INCORRECT OUTPUT!!');

    if(b<=c)
    then writeln('10<=15 is true. CORRECT OUTPUT')
    else writeln('10<=15 is false. INCORRECT OUTPUT!!');
    writeln('Test5 End');
    writeln('--------------');
end.