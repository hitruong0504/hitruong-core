%%Ex1
%%a
A = [-1 3.5 14; 0 5 -26; 0 0 2];
lambda = eig(A);
det_m = 1;
for i = 1:length(lambda)
    det_m = det_m*lambda(i);
end
disp(det_m)

%%b
B = [-2 0 0; 99 0 0; 10 -4.5 10];
lambda = eig(B);
det_m = 1;
for i = 1:length(lambda)
    det_m = det_m*lambda(i);
end
disp(det_m)

%%c
C = [5 5 0 2; 0 2 -3 6; 0 0 3 -2; 0 0 0 5];
lambda = eig(C);
det_m = 1;
for i = 1:length(lambda)
    det_m = det_m*lambda(i);
end
disp(det_m)

%%d
D = [3 0 0 0; 6 2 0 0; 0 3 6 0; 2 3 3 -5];
lambda = eig(D);
det_m = 1;
for i = 1:length(lambda)
    det_m = det_m*lambda(i);
end
disp(det_m)

%%e
E = [3 0 0 0 0; -5 1 0 0 0; 3 8 0 0 0; 0 -7 2 1 0; -4 1 9 -2 3];
lambda = eig(E);
det_m = 1;
for i = 1:length(lambda)
    det_m = det_m*lambda(i);
end
disp(det_m)

%%Ex2
A = [-6 28 21; 4 -15 -12; 8 0 25];
a = [32; 31.9; 31.8; 32.1; 32.2];
c = ['r','b','g','c','m'];
syms t;
x = 0:3;
hold on;
for i = 1:size(a,1)
    B = A;
    B(3,2) = a(i);
    l = eig(B);
    p = 1;
    for j = 1:length(l)
        p = p*(l(j)-t);
    end
    y = double(subs(p,t,x));
    plot(x,y,c(i));
end
hold off;

%%Ex4
A = [-2 2 -3; 2 1 -6; -1 -2 0];
[V,l] = eig(inv(A)) 

%%Ex5
A1  = [4 -5; 2 -3];
[P,D] = eig(A1);
B = round(P*D*inv(P))
if A1 == B
    disp('digonalizable')
else
    disp('not diagonalizable')
end

A2 = [0 2; 0 1];
[P,D] = eig(A2);
B = round(P*D*inv(P))
if A2 == B
    disp('digonalizable')
else
    disp('not diagonalizable')
end

A3 = [2 3; 1 4];
[P,D] = eig(A3);
B = round(P*D*inv(P))
if A3 == B
    disp('digonalizable')
else
    disp('not diagonalizable')
end

A4 = [1 2 -2; -2 5 -2; -6 6 -3];
[P,D] = eig(A4);
B = round(P*D*inv(P))
if A4 == B
    disp('digonalizable')
else
    disp('not diagonalizable')
end

A5 = [1 2 3 4; 5 6 7 8; 9 10 11 12; 13 14 15 16];
[P,D] = eig(A5);
B = round(P*D*inv(P))
if A5 == B
    disp('digonalizable')
else
    disp('not diagonalizable')
end

%%Ex7
A1 = [1 0; 0 -3];
[U,S,V] = svd(A1)

A2 = [-5 0; 0 0];
[U,S,V] = svd(A2)

A3 = [sqrt(6) 1; 0 sqrt(6)];
[U,S,V] = svd(A3)

A4 = [sqrt(3) 2; 0 sqrt(3)];
[U,S,V] = svd(A4)

%%Ex8
B1 = [-18 13 -4 4; 2 19 -4 12; -14 11 -12 8; -2 21 4 8];
[U,S,V] = svd(B1)

B2 = [6 -8 -4 5 -4; 2 7 -5 -6 4; 0 -1 -8 2 2; -1 -2 4 4 -8];
[U,S,V] = svd(B2)


