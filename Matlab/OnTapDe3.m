%%cau1,2
try
    rng(1);
    a.ans1 = randi([-4 18], 9, 9)
    rng(1);
    a.ans2 = randi([-1 12], 9, 9)
catch
    a.ans1 = 0;
    a.ans2 = 0;
end
%%cau3
try
    a.ans3 = [a.ans1(:, 1) a.ans1(:, 4) diag(a.ans1)]
catch
    a.ans3 = 0;
end
%%cau4
try
    a.ans4 = sum(diag(abs(a.ans1 - a.ans2)))
catch
    a.ans4 = 0;
end
%%cau5
try
    if det(a.ans1) == 0
        a.ans5 = inf
    else
        a.ans5 = a.ans1^(-1)
    end
catch
    a.ans5 = 0;
end
%%cau6
try
    a.ans6 = find(max(sum(a.ans1')) == sum(a.ans1'))
catch
    a.ans6 = 0;
end
%%cau7
try
    A = a.ans2(a.ans2 > 0);
    a.ans7 = length(unique(A(isprime(A))))
catch
    a.ans7 = 0;
end
%%cau8
try
    a.ans8 = sum(diag(fliplr(a.ans2)))
catch
    a.ans8 = 0;
end
%%cau9
try
    
catch
end