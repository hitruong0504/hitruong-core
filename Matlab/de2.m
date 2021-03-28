%%cai1
%a
a.ans1a = randi([-5 5], 1, 16);
%b
a.ans1b = randi([-10 10], 4, 4);
%%cau2
a.ans2 = sum(a.ans1a(1:2:end))
%%cau3
a.ans3 = sum(sum(a.ans1b))
%cau4
a.ans4 = a.ans1a(mod(a.ans1a, 4) == 0) + 3
%%cau5
a.ans5 = a.ans1b;
a.ans5(2:2:end, :) = min(a.ans1a)
%%cau6
temp = reshape(a.ans1a, 4, 4);
a.ans6 = temp(end-1:end, :)
%%cau7
mt7 = [-2 -2 -2 1; -2 -4 -2 1; -2 -2 -4 1; -4 -4 -2 1];
c = [-3 -6 -6 -9]';
a.ans7 = linsolve(mt7, c)
%%cau8
%% ax + by + cz = d => z = (d - ax - by)/c
plot(a.ans1b)