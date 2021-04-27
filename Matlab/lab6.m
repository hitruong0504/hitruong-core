%%Ex1
A1 = [1 -7; -2 -3];
a1 = max(sum(abs(A1)))
A2 = [-2 8; 3 1];
a2 = max(sum(abs(A2)))
A3 = [2 -8; 3 1];
a3 = norm(A3, 1)
A4 = [2 3; 1 -1];
a4 = norm(A4, 1)
A5 = [5 -4 2; -1 2 3; -2 1 0];
a5 = norm(A5, 1)
%%Ex2
b1 = max(sum(abs(A1')))
B2 = [3 6; 1 0];
b2 = norm(B2, Inf)
b3 = norm(A5, Inf)
B4 = [3 6 -1; 3 1 0; 2 4 -7];
b4 = norm(B4, Inf)
B5 = [-3 0 0; 0 4 0; 0 0 2];
b5 = norm(B5, Inf)
%%Ex3
C1 = A5;
c1 = sqrt(sum(diag(C1'*C1)))
C2 = [1 7 3; 4 -2 -2; -2 -1 1];
c2 = norm(C2, 'fro')
C3 = [2 3; 1 -1];
c3 = norm(C3, 'fro')
%%Ex4
u1 = [1; 1];
v1 = [0; 1];
ang1 = acos(sum(u1.*v1)/(sqrt(sum(u1.^2))*sqrt(sum(v1.^2))))

u2 = [-2; 3];
v2 = [1/2; -1/2];
ang2 = acos(sum(u2.*v2)/(sqrt(sum(u2.^2))*sqrt(sum(v2.^2))))

u3 = [1; 0];
v3 = [0; 1];
ang3 = acos(sum(u3.*v3)/(sqrt(sum(u3.^2))*sqrt(sum(v3.^2))))
%%Ex5
u5_a = [2 3];
unit1 = u5_a/norm(u5_a)

u5_b = [1 2 3];
unit2 = u5_b/norm(u5_b)

u5_c = [1/2 -1/2 1/4]
unit3 = u5_c/norm(u5_c)

u5_d = [sqrt(2) 2 -sqrt(2) sqrt(2)];
unit4 = u5_d/norm(u5_d)
%%Ex6
v6 = [1 2 3];
s2 = [7 4 3];
s3 = [2 1 9];
% D1 = norm(v6 - s2)
D1 = sqrt(sum((v6 - s2).^2))
D2 = norm(v6 - s3)
D3 = norm(s3 - s2) % = norm(s2 - s3)
%%Ex7
A1 = [1 2 3; 2 1 2; 3 2 4];
E1 = [80 98 99 85 106 94; 71 92 76 95 100 92; 124 163 140 160 176 161];
D1 = (inv(A1)*E1) - 3;
LKT = ['A':'Z'];
LKT = [LKT ' '];
S0 = LKT(D1(1:numel(D1)));
%%Ex8
A2 = [3 4 5; 1 3 1; 1 1 2];
S1 = 'ATTACK';
D2 = [];
for i = 1:length(S1)
   for j = 1:27
       if LKT(j) == S1(i)
           D2 = [D2 j];
           break;
       end
   end
end
E2 = (reshape(D2, 2, 3) + 9) * A2;

S2 = 'LINEAR ALGEBRA LABORATORY';
D3 = [];
for i = 1:length(S2)
   for j = 1:27
       if LKT(j) == S2(i)
           D3 = [D3 j];
           break;
       end
   end
end
E3 = reshape(D3, 25, 1) * reshape(A2, 1, 9);
%%Ex9
Doc1 = [0 4 0 0 0 2 1 3];
Doc2 = [3 1 4 3 1 2 0 1];
Doc3 = [3 0 0 0 3 0 3 0];
Doc4 = [0 1 0 3 0 0 2 0];
Doc5 = [2 2 2 3 1 4 0 2];

a12 = sum(Doc1.*Doc2)/(sqrt(sum(Doc1.*2))*sqrt(sum(Doc2.*2)))
a13 = sum(Doc1.*Doc3)/(sqrt(sum(Doc1.*2))*sqrt(sum(Doc3.*2)))
a14 = sum(Doc1.*Doc4)/(sqrt(sum(Doc1.*2))*sqrt(sum(Doc4.*2)))
a15 = sum(Doc1.*Doc5)/(sqrt(sum(Doc1.*2))*sqrt(sum(Doc5.*2)))
a23 = sum(Doc3.*Doc2)/(sqrt(sum(Doc3.*2))*sqrt(sum(Doc2.*2)))
a24 = sum(Doc4.*Doc2)/(sqrt(sum(Doc4.*2))*sqrt(sum(Doc2.*2)))
a34 = sum(Doc3.*Doc4)/(sqrt(sum(Doc3.*2))*sqrt(sum(Doc4.*2)))
a25 = sum(Doc5.*Doc2)/(sqrt(sum(Doc5.*2))*sqrt(sum(Doc2.*2)))
a35 = sum(Doc3.*Doc5)/(sqrt(sum(Doc5.*2))*sqrt(sum(Doc3.*2)))
a45 = sum(Doc4.*Doc5)/(sqrt(sum(Doc5.*2))*sqrt(sum(Doc4.*2)))

%%Ex10
q = [0 0 0.7 0.5 0 0.3];
D1 = [1.0 0.5 0.3 0 0 0];
D2 = [0.5 1 0 0 0 0];
D3 = [0 1.0 0.8 0.7 0 0];
D4 = [0 0.9 1.0 0.5 0 0];
D5 = [0 0 0 1.0 0 1.0];
D6 = [0 0 0 0 0.7 0];
D7 = [0.5 0 0.7 0 0 0.9];
D8 = [0 0.6 0 1.0 0.3 0.2];

T = [D1;D2;D3;D4;D5;D6;D7;D8];
d = [];
for i = 1:size(T,1)
    cs = sum(q.*T(i,:))/(sqrt(sum(q.^2))*sqrt(sum(T(i,:).^2)));
    d = [d cs];
end

[m,n] = sort(d);
m(end:-1:1)
n(end:-1:1)

disp('D2 is nearest');