%% Ex1
disp('Exercise 1')
%a
v1_a = [1 2 3 4]';
v2_a = [-1 0 1 3]';
v3_a = [0 5 -6 8]';
w1 = [3 -6 17 11]';

A = [v1_a v2_a v3_a];
B = [A w1];
if rank(A) == rank(B)
    disp('a: v1, v2, v3, w are linear combination')
else
    disp('a: v1, v2, v3, w are not linear combination')
end
%b
v1_b = [1 1 2 2]';
v2_b = [2 3 5 6]';
v3_b = [2 -1 3 6]';
w2 = [0 5 3 0]';

A = [v1_b v2_b v3_b];
B = [A w2];
if rank(A) == rank(B)
    disp('b: v1, v2, v3, w are linear combination')
else
    disp('b: v1, v2, v3, w are not linear combination')
end
%c
w3 = [-1 6 1 -4]';
A = [v1_b v2_b v3_b];
B = [A w3];
if rank(A) == rank(B)
    disp('c: v1, v2, v3, w are linear combination')
else
    disp('c: v1, v2, v3, w are not linear combination')
end
%d
v4 = [1 15 -12 8]';
w4 = [0 -6 17 11]';
A = [v1_a v2_a v3_a v4];
B = [A w4];
if rank(A) == rank(B)
    disp('a: v1, v2, v3, w are linear combination')
else
    disp('a: v1, v2, v3, w are not linear combination')
end
%%Ex2
disp('Exercise 2')
%a
A = [1 0 1 0; -2 -4 -1 0; 0 1 1 0];
if rank(A)==size(A,1)
    disp('a: v1, v2, v3 are the linear independent')
else
    disp('a: v1, v2, v3 are the linear dependent')
end
%b
W = [1 0 2; 0 1 4; 2 -2 -4];
a = [0 0 0]';
B = [W a];
if rank(B) == size(B, 1)
    disp('b: v1, v2, v3 are the linear independent')
else
    disp('b: v1, v2, v3 are the linear dependent')
end
x = linsolve(W, a)'
%c
C = [1 -2 3 4 0; 2 4 5 0 0; -2 0 0 4 0; 3 2 1 -1 0];
if rank(C) == size(C, 1)
    disp('c: v1, v2, v3 are the linear independent')
else
    disp('c: v1, v2, v3 are the linear dependent')
end
%d
D = [0 0 1 2 3 0; 0 0 2 3 1 0; 1 2 3 4 5 0; 2 1 0 0 0 0; -1 -3 -5 0 0 0];
if rank(D) == size(D, 1)
    disp('d: v1, v2, v3 are the linear independent')
else
    disp('d: v1, v2, v3 are the linear dependent')
end
%%Ex3
A2 = [1 0 2 3; 4 -1 0 2; 0 -1 -8 -10];
%a
[q, pivot] = rref(A2);
Col = A2(pivot, :);
%b
[p, pivot] = rref(A2');
Row = A2(:, pivot);
%%Ex4
n = null(A2, 'r');
v1 = n(:,1)
v2 = n(:,2)
%%b
syms a b;
if A2*(a*v1 - b*v2) == 0
    disp('a,b are infinite')
end
%Ex5
%%a
A = [7 6 -4 1; -5 -1 0 2; 9 -11 7 -3; 19 -9 7 1];
w = [1 1 -1 -3]';

wA = [A w];
if (rank(wA) == rank(A))
    disp('w is column space of A')
else
    disp('w is not column space of A')
end

if (A*w == 0)
    disp('w is nullspace of A')
else
    disp('w is not nullspace of A')
end

%%b
A = [-8 5 -2 0; -5 2 1 -2; 10 -8 6 -3; 3 -2 1 0];
w = [1 2 1 0]';
wA = [A w];
if (rank(wA) == rank(A))
    disp('w is column space of A')
else
    disp('w is not column space of A')
end

if (A*w == 0)
    disp('w is nullspace of A')
else
    disp('w is not nullspace of A')
end

%%Ex6
A = [5 1 2 2 0; 3 3 2 -1 -12; 8 4 4 -5 12; 2 1 1 0 -2];
B = [A(:,1) A(:,2) A(:,4)];

AB1 = [B A(:,3)];
AB2 = [B A(:,5)];

if (rank(B) == rank(AB1) && rank(B) == rank(AB2))
    disp('a3 a5 are in the column space of B')
end

%%Ex7
S = [1 0 2; 0 1 4; 2 -2 -4]';
[Q,pivot] = rref(S);
basis = S(:,pivot)

%%Ex8
%%a
A = hilb(5);
C = null(A,'r')
%%b
A = pascal(5);
C = null(A,'r')
%%c
A = magic(5);
C = null(A,'r')

%%Ex9
u1 = [3 1 1]';
u2 = [-1 2 1]';
u3 = [-1/2 2 7/2]';

if (sum(u1.*u2) == 0)
     disp('u1 u2 is orthogonal set')
 else
     disp('u1 u2 is not orthogonal set')
 end
 
 if (sum(u1.*u3) == 0)
     disp('u1 u3 is orthogonal set')
 else
     disp('u1 u3 is not orthogonal set')
 end
 
 if (sum(u2.*u3) == 0)
     disp('u2 u3 is orthogonal set')
 else
     disp('u2 u3 is not orthogonal set')
 end
 
 if sum(u1.*u2) == sum(u1.*u3) && sum(u1.*u2) == sum(u2.*u3) && sum(u1.*u2) == 0
     disp('u1 u2 u3 is an orthogonal set')
else
     disp('u1 u2 u3 is not an orthogonal set')
end
    
%%Ex10
y = [7 6]';
u = [4 2]';
proj = (sum(y.*u)/sqrt(sum(u.^2))^2)*u

%%Ex11
try
m = randi(10);
n = randi(10);
A = randi([1 10],m,n)

if (A' == inv(A))
    disp('orthonormal')
else
    disp('not orthonormal')
end
catch
    disp('not orthonormal')
end

%%Ex12
A = [-10 13 7 -11; 2 1 5 3; -6 3 13 -3; 16 16 2 5; 2 1 5 7];
v = [];
s = 0;
 for i = 1:4
     if (i==1)
         v = [A(:,1)];
     else
     for j = 1:(i-1)
         s = s + (sum(A(:,i).*v(j))/sqrt(sum(v(j).^2))^2)*v(j);
     end
     v = [v (A(:,i) - s)];
     end
 end
disp(v)