%%Ex 1
x = [1 3 5 2 9]
y = [-1, 3, 15, 27, 29]
%%Ex2
%a
c = [];
n = 3;
i = 1;
while i<=n
    if i == 1
        c = [12]
    else
        c = [c c(end)+2]
    end
    i = i + 1;
end
%b
c = [];
n = 3;
i = 1;
while i<=n
    if i == 1
        c = [31]
    else
        c = [c c(end)+2]
    end
    i = i + 1;
end
%c
x = [];
n = 10;
i = 1;
while i<=n
    if i == 1
        x = [-5]
    else
        x = [x x(end)+1]
    end
    i = i + 1;
end
%d
y = [];
n = 10;
i = 1;
while i<=n
    if i == 1
        y = [5]
    else
        y = [y y(end)-1]
    end
    i = i + 1;
end
%e
z = [10:-2:-4]
%f
w = [];
n = 9;
i = 1;
while i<=n
    if i == 1
        w = [1]
    else
        w = [w w(end)*(1/2)]
    end
    i = i + 1;
end
%g
fi=[];
n = 7;
if n==1
    fi=[1];
elseif n==2
    fi = [fi 1];
else
    fi = [1 1];
    for i=3:n
        fi = [fi fi(i-1)+fi(i-2)];
    end
end

d=[];
while i<=n
    d = [1./fi]
    i = i + 1;
end
%h
a=1:1000;
e=[];
n = 10;
prime = find(isprime(a));
e = [1./prime(1:n)]
%i
a=[];
n=6;
for i=1:n
    a = [a (i+1)/2*i]
end
%j
p=[];
n = 4;
a = 0:1:n-1;
b=1:1:n;
p = [p a./b]
%k
o=['a':'z']
%l
s=['A':3:'Z']
%%Ex3
x=logspace(log10(1), log10(10), 10)
%%Ex4
x=[1 2 3];
y=[98 12 33];
z=[x y]
%%Ex5
y=[4 5 6];
z=[x;y]
%%Ex6
x=0:2:20;
%a
x(1:6)
%b
x(end-4:end)
%c
x([1 4 end])
%d
x([1 3 5 7])
%e
x([1:2:end])
%f
x([2:2:end])

%%Ex7
x=[3 11 -9 -131 -1 1 -11 91 -6 407 -12 -11 12 153 371];
%a
max(x)
%b
min(x)
%c
find(x > 10)
%d
x(end:-1:1)
%e
sort(x)
%f
sort(x, 'descend')
%g
count=0;
for i=0:14
end
count
%h
