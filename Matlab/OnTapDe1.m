%%cau1
try
    rng(1);
    a.ans1a = randi([-5 5], 1, 15)
    rng(1);
    a.ans1b = randi([-10 10], 3, 3)
catch
    a.ans1a = 0;
    a.ans1b = 0;
end
%%cau2
try
    a.ans2 = a.ans1a(mod(a.ans1a, 3) == 0)
catch
    a.ans2 = 0;
end
%%cau3
try
    a.ans3 = sum(a.ans1a(a.ans1a > 0))
catch
    a.ans3 =0;
end
%%cau4
try
    a.ans4 = a.ans1a(1:2:end) + 10
catch
    a.ans4 = 0;
end
%%cau5
try
    a.ans5 = a.ans1b;
    a.ans5(:, 2) = max(a.ans1a)
catch
    a.ans5 = 0;
end
%%cau6
try
    a.ans6 = find(a.ans1a > 0)
catch
    a.ans6 = 0;
end
%%cau7
try
    A = [8 -2 -1; -1 6 -1; -1 -3 9];
    B = [5 4 5]';
    a.ans7 = linsolve(A, B)
catch
    a.ans7 = 0;
end
%%cau8
try
    Ox = a.ans1a;
    Oy = 1:15;
    h = figure('visible', 'off');
    plot(Ox, Oy, 'o--k')
    saveas(h, 'a.ans8.jpg', 'jpg');
catch
end