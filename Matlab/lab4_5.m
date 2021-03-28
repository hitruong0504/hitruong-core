%%cau1
A=[1 2 1 0; 2 -1 1 0; 2 1 0 0];
B=[1 2 1; 2 -1 1; 2 1 0];
C=[0;0;0];
%%Option1
a=rref(A);
%%Option2
b=linsolve(B,C);
%%Option3:Ax=B=>x=(A^-1)*B
c = B\C;
%%Option4:Ax=b=>x=(A^-1)b
d = inv(B)*C;
%%cau2
A=[2 1 1 1 1; 1 2 1 1 1; 1 1 2 2 1; 1 1 1 2 1];
B=[2 1 1 1; 1 2 1 1; 1 1 2 2; 1 1 1 2];
C=[1;1;1;1];
%%option1
a=rref(A);
%%option2
b=linsolve(B,C);
%option3:B\C<=>(B^-1)*C
c=B\C;
%%cau3
A=[1 -4 7 0; 0 3 -5 0; -2 5 -9 0]
%%cau4
x=linspace(-10,10);
a1=1;
a2=2;
b1=1;
b2=2;
c1=1;
c2=10;
%%a1x+b1y=c=>y=(c-a1x)./b1
y1=(c1-a1*x)./b1;
y2=(c2-a2*x)./b2;
holdon;
plot(x,y1)
plot(x,y2)
holdoff;
%%cau5
[x,y]=meshgrid(-10:10,-10:10);
a1=1;
a2=2;
b1=1;
b2=2;
c1=1;
c2=2;
d1=1;
d2=10;
%%a1x+b1y+c1z=d1=>z=(d1-a1x-b1y)./c1
z1=(d1-a1*x-b1*y)./c1;
z2=(d2-a2*x-b2*y)./c2;
holdon;
h1=surf(x,y,z1);
set(h1,'FaceColor','r','FaceAlpha',0.7)
h2=surf(x,y,z2);
set(h2,'FaceColor','b','FaceAlpha',0.7)
view(-3,32)
holdoff;
%%cau6
A=[1 1 2; 3 6 -5; 2 4 -3];
B=[1;-1;0];%B=[1-10]'c?ng???c
%a
a=det(A);
disp('Acanbeinverted');
%b
b=inv(A)*B;
c=A\B;%A\B<=>(A^-1)*B
%%cau7
A=[1 2 1 1; 2 2 2 1; 2 4 1 2];
B=[1 2 1; 2 2 2; 2 4 1];
C=[1;1;2];
%%option1:
a=rref(A);
%%option2:
b=linsolve(B,C);
%%option3:
c=inv(B)*C;%orc=B\C
%%cau8
A=[1 1 1 6; 1 2 4 15; 1 3 9 38];
B=[1 1 1; 1 2 4; 1 3 9];
C=[6;15;38];

%%option1:
a=rref(A);
%%option2:
b=linsolve(B,C);
%%option3:
c=B\C;
%%cau9
A=[3 3.2 118.4; 3.5 3.6 135.2];
B=[3 3.2; 3.5 3.6];
C=[118.4;135.2];

%%option1:
a=rref(A);
%%option2:
b=linsolve(B,C);
%%option3:
c=B\C;
%%cau10
A=[0.61 0.29 0.15; 0.35 0.59 0.063; 0.04 0.12 0.787];
B=[1;1;1];

a=A\B
%%cau11
A=[0.25 0.15 0.1; 0.4 0.15 0.2; 0.15 0.2 0.2];
d=[100 100 100]';

a=linsolve(A,d);
%%cau12
A=[3 0 1 0 0; 8 0 0 2 0; 0 2 2 1 0];
 
a=rref(A);
%%cau13
A=[1 1 1 0 0 0 15; 0 0 0 1 1 1 6; 1 0 0 1 0 0 8; 0 1 0 0 1 0 7; 0 0 1 0 0 1 6];

a=rref(A);