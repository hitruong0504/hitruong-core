%%Ex7
%%a
S = [2 0; 0 2];
v = [1 0; 0 1];
for i=1:size(v,1)
    va(i,:) = v(i,:)*S;
end
figure(1)
title('7a')
hold on;
plot(v(:,1),v(:,2),'b')
plot(va(:,1), va(:,2),'k')
hold off;
grid on;

%%b
figure(2)
title('7b')
S = [0.5 0; 0 0.5];
v = [1 0; 0 1];
for i=1:size(v,1)
    vb(i,:) = v(i,:)*S;
end
hold on;
plot(v(:,1),v(:,2),'b')
plot(vb(:,1), vb(:,2),'k')
hold off;
grid on;

%%c
figure(3)
title('7c')
S = [1 0; 0 -1];
v = [1 0; 0 1];
for i=1:size(v,1)
    vc(i,:) = v(i,:)*S;
end
hold on;
plot(v(:,1),v(:,2),'b')
plot(vc(:,1), vc(:,2),'k')
hold off;
grid on;

%%d
figure(4)
title('7d')
S = [-1 0; 0 1];
v = [1 0; 0 1];
for i=1:size(v,1)
    vd(i,:) = v(i,:)*S;
end
hold on;
plot(v(:,1),v(:,2),'b')
plot(vd(:,1), vd(:,2),'k')
hold off;
grid on;

%%Ex8
%%a
R = [cos(pi) -sin(pi); sin(pi) cos(pi)];
for i=1:size(v,1)
    v8a(i,:) = v(i,:)*R;
end
figure(5)
title('8a')
hold on;
plot(v(:,1),v(:,2),'b')
plot(v8a(:,1), v8a(:,2),'k')
hold off;
grid on;

%%b
R = [cos(pi/3) -sin(pi/3); sin(pi/3) cos(pi/3)];
for i=1:size(v,1)
    v8b(i,:) = v(i,:)*R;
end
figure(6)
title('8b')
hold on;
plot(v(:,1),v(:,2),'b')
plot(v8b(:,1), v8b(:,2),'k')
hold off;
grid on;

%%Ex9
figure(7)
title('house')
load('house.mat')
hold on;
plot(P(:,1),P(:,2),'-m',P(:,1),P(:,2),'*r')
plot([P(end,1) P(1,1)], [P(end,2) P(1,2)],'m')
hold off;

%%a
St = [1 0 0; 0 1 0; 2 4 1];
for i=1:size(P,1)
    Pt(i,:) = P(i,:)*St;
end
figure(8);
title('9a')
hold on;
plot(P(:,1),P(:,2),'-m',P(:,1),P(:,2),'*r')
plot([P(end,1) P(1,1)], [P(end,2) P(1,2)],'m')
plot(Pt(:,1),Pt(:,2),'-k',Pt(:,1),Pt(:,2),'*r')
plot([Pt(end,1) Pt(1,1)], [Pt(end,2) Pt(1,2)],'k')
hold off;

%%b
Sr = [cos(pi/3) -sin(pi/3) 0; sin(pi/3) cos(pi/3) 0; 0 0 1];
for i=1:size(P,1)
    Pr(i,:) = P(i,:)*Sr;
end
figure(9)
title('9b')
hold on;
plot(P(:,1),P(:,2),'-m',P(:,1),P(:,2),'*r')
plot([P(end,1) P(1,1)], [P(end,2) P(1,2)],'m')
plot(Pr(:,1),Pr(:,2),'-k',Pr(:,1),Pr(:,2),'*r')
plot([Pr(end,1) Pr(1,1)], [Pr(end,2) Pr(1,2)],'k')
hold off;

%%c
Ss = [2 0 0; 0 2 0; 0 0 1];
for i=1:size(P,1)
    Ps(i,:) = P(i,:)*Ss;
end
figure(10)
title('9c')
hold on;
plot(P(:,1),P(:,2),'-m',P(:,1),P(:,2),'*r')
plot([P(end,1) P(1,1)], [P(end,2) P(1,2)],'m')
plot(Ps(:,1),Ps(:,2),'-k',Ps(:,1),Ps(:,2),'*r')
plot([Ps(end,1) Ps(1,1)], [Ps(end,2) Ps(1,2)],'k')
hold off;

%%d
Ssr = [1 -1.5 0; 0.5 1 0; 0 0 1];
for i=1:size(P,1)
    Psr(i,:) = P(i,:)*Ssr;
end
figure(11)
title('9d')
hold on;
plot(P(:,1),P(:,2),'-m',P(:,1),P(:,2),'*r')
plot([P(end,1) P(1,1)], [P(end,2) P(1,2)],'m')
plot(Psr(:,1),Psr(:,2),'-k',Psr(:,1),Psr(:,2),'*r')
plot([Psr(end,1) Psr(1,1)], [Psr(end,2) Psr(1,2)],'k')
hold off;

%%Ex10
A = [1 1 0; 3 1 0; 1 3 0];
I = [-1 0 0; 0 -1 0; 0 0 -1];
AI = I*A;
figure(12)
title('10')
hold on;
plot(A(:,1),A(:,2),'-m',A(:,1),A(:,2),'*r')
plot([A(end,1) A(1,1)], [A(end,2) A(1,2)],'m')
plot(AI(:,1),AI(:,2),'-k',AI(:,1),AI(:,2),'*r')
plot([AI(end,1) AI(1,1)], [AI(end,2) AI(1,2)],'k')
hold off;