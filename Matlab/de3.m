%%cau1
a.ans1 = randi([-4 18], 9, 9);
%%cau2
a.ans2 = randi([-1 12], 9, 9);
%%cau3
a.ans3 = [a.ans1(:, 1)'; a.ans1(:, 4)'; diag(a.ans1)']'
%%cau4
C = abs(a.ans1 - a.ans2);
a.ans4 = sum(diag(C));
%%cau5
if det(a.ans1) == 0
    a.ans5 = inf;
else
    a.ans5 = a.ans1^(-1)
end
%%cau6
a.ans6 = find(max(sum(a.ans1')));
%%cau7
a = a.ans2(a.ans2 > 0)';
b = a(isprime(a));
count = 0;
for i = 1:length(unique(b))
    count = count + 1;
end
% a.ans7 = count;
%%cau8
a.ans8 = sum(diag(fliplr(a.ans2)))
%%cau9
A = [1 1 0;4 0 1;2 -1 -1];
B = [1;-2;0];
a.ans9 = linsolve(A,B);