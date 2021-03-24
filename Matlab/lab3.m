%%Ex1
x = [1 2 3 4 5];
b = [1 2 3 4 5 6];
c = 1:1:30;
d = 1:1:25;
%a
A = repmat(x, 5, 1)'
%b
B = repmat(b , 5 ,1)
%c
C = reshape(c, 5, 6)
%c
D = reshape(d, 5, 5)'
%%Ex2
I = randi([1 100], 5, 6)
%%Ex3
A = [1 2 3; 4 5 6; 7 8 9];
B = A(:, end:-1:1)
%%Ex4
A = [1 2 3; 4 5 6; 7 8 9];
B = A(end:-1:1,:)
%%Ex5
Y = [1 2 16 31 22; 2 8 12 21 23; 4 9 11 14 25; 3 6 10 16 34];
%a
x = Y(2, 2:4)
%b
b = Y(:, 3)
%c
A = Y([2 3], 2:4)
%d
B = Y(:, [1 3 5])
%e
C = Y(2:end, [1 3 4 5])
%f
D = reshape(Y(Y > 12), 3, 3)
%%Ex6
A = [2 4 1; 6 7 2; 3 5 9];
%a
x1 = A(1, :)
%b
Y = A(2:end, :)
%%Ex7
A = [2 7 9 7; 3 1 5 6; 8 1 2 5];
%a
B = A(:, 2:2:end)
%b
C = A(1:2:end, :)
%c
A'
%%Ex8
F = [12 15 10 16 12; 5 9 14 7 10; 8 12 9 10 15];
S = sum(F)
%%Ex9
T = [0.6 0.7; 0.4 0.3];
%%Ex10
A = [-1 4 8; -9 1 2];
B = [5 8; 0 -6; 5 6];
C = [-4 1; 6 5];
D = [-6 3 1; 8 9 -2; 6 -1 5];
%%
% a = A*B'
b = B*C'
c = C - C'
d = D - D'
e = (D')'
f = 2*C'
g = A' + B
h = (g)'
i = (2*A' - 5*B)'
j = (-D)'
k = (-(D)')
l = (C^2)'
m = (C')^2
%%Ex11
A = [2 4 1; 6 7 2; 3 5 9];
%a
[nRow,nCol] = size(A);
if nRow == nCol
    disp("A is matrix square");
else
    disp("A is not matrix square");
end
%b
if issymmetric(A) ~= 0
    disp("A is matrix symmetric");
else
    disp("A is not matrix symmetric");
end
%c
if issymmetric(A, 'skew') ~= 0
    disp("A is matrix skew-symmetric");
else
    disp("A is not matrix skew-symmetric");
end
%d
triu(A)
%e
tril(A)
%%Ex12
A = [6 0 0 5; 1 7 2 -5; 2 0 0 0; 8 3 1 8];
determinant_a = det(A)
B = [1 -2 5 2; 0 0 3 0; 2 -6 -7 5; 5 0 4 4];
determinant_b = det(B)
C = [3 5 -8 4; 0 -2 3 -7; 0 0 1 5; 0 0 0 2];
determinant_c = det(C)
D = [4 0 0 0; 7 -1 0 0; 2 6 3 0; 5 -8 3 0; 5 -8 4 -3];
%%Ex15
A = [2 4 5/2; (-3)/4 2 1/4; 1/4 1/2 2];
B = [1 (-1)/2 3/4; 3/2 1/2 -2; 1/4 1 1/2];
%a
a_1 = (A^(-1))*(B^(-1))
a_2 = (B*A)^(-1)
%b
b_1 = (A^(-1))'
b_2 = (A')^(-1)