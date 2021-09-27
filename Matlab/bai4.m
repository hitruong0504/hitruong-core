u1 = [1;1];
v1 = [0;1];

x = sum(u1.*v1)/(sqrt(sum(u1.^2))*sqrt(sum(v1.^2)))
a.ans1d = acos(x)

u2 = [1;0];
v2 = [0;1];

y = sum(u2.*v2)/(sqrt(sum(u2.^2))*sqrt(sum(v2.^2)))
a.ans2d = acos(y)

u3 = [-2;3];
v3 = [1/2;-1/2];

z = sum(u3.*v3)/(sqrt(sum(u3.^2))*sqrt(sum(v3.^2)))
a.ans3d = acos(z)