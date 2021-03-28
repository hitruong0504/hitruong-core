%%cau1
%a
a.ans1a = randi([-5 5], 1, 15)
%b
a.ans1b = randi([-10 10], 3, 3)
%%cau2
a.ans2 = a.ans1a(mod(a.ans1a, 3) == 0)
%%cau3
a.ans3 = sum(a.ans1a(a.ans1a > 0))
%%cau4
a.ans4 = a.ans1a(1:2:end) + 10
%cau5
max1a = max(a.ans1a);
a.ans5 = a.ans1b;
a.ans5(:, 2) = max1a;
%%cau6
a.ans6 = find(a.ans1a > 0)
%%cau7
mt7 = [8 -2 -1; -1 6 -1; -1 -3 9];
c = [5 4 5]';
a.ans7 = linsolve(mt7, c)'
%%cau8
x = 1:15;
figure(1);
hold on;
    plot(x,'k--');
    hold on;
    plot(a.ans1a, 'k--');
    for i = 1:length(x) 
        if x(i) == a.ans1a(i)
            hold on;
            plot(x(i), a.ans1a(i), 'o');
        end
    end
hold off;
h = figure('visible', 'off');
saveas(h, 'a.ans8', 'jpg');