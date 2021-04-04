%%cau1
try
    rng(1);
    a.ans1a = randi([-5 5], 1, 16)
    rng(1);
    a.ans1b = randi([-10 10], 4, 4)
catch
    a.ans1a = 0
    a.ans1b = 0
end
%%cau2
try
    a.ans2 = sum(a.ans1a(1:2:end))
catch
    a.ans2 = 0
end
%%cau3
try
    a.ans3 = sum(sum(a.ans1b))
catch
    a.ans3 = 0;
end
%%cau4
try
    %a.ans4 = a.ans1a
    a.ans4 = a.ans4(4:4:end) - 3
catch
    a.ans4 = 0
end
%%cau5
try
    a.ans5 = a.ans1b;
    a.ans5(2:2:end, :) = min(a.ans1a)
catch
    a.ans5 = 0
end
%%cau6
try
    temp = reshape(a.ans1a, 4, 4)
    a.ans6 = temp(end-1:end, :)
catch
    a.ans6 = 0;
end
%%cau7
try
    A = [-2 -2 -2 1; -2 -4 -2 1; -2 -2 -4 1; -4 -4 -2 1]
    B = [-3 -6 -6 -9]';
    a.ans7 = linsolve(A, B)
catch
    a.ans7 = 0
end
%%cau8
try
    h = figure('visible', 'off');
    mesh(a.ans1b, 'Facecolor', 'g', 'Edgecolor', 'k')
    saveas(h, 'a.ans8.jpg', 'jpg');
catch
end