#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "bookrequest.h"

struct bookrequest input2()
{
    struct bookrequest x;
    printf("\n\t\t-----Please enter the book request-----");
    printf("\nEnter BLCODE: ");
    scanf("%d", &x.BLCODE);
    printf("Enter memberID: ");
    scanf("%d", &x.memberID);
    printf("Enter ISBN: ");
    getchar();
    fgets(x.ISBN, 255, stdin);
    printf("Enter dueDate: ");
    fgets(x.dueDate, 12, stdin);
    printf("Enter returnDate: ");
    fgets(x.returnDate, 12, stdin);

    return x;
}

void output2(struct bookrequest x)
{
    printf("Ban da dang ky muon sach thanh cong!!!\nVui long tra sach dung han: %s", x.returnDate);
    
}
void YoN()
{
    int t;
    printf("\n\nDo you BookRequest? (Yes or No)\n1. Yes\n2. No\nYou choose: ");
    scanf("%d", &t);

    if (t == 2)
        exit(0);
}