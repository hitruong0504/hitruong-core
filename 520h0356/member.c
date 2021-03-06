#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "member.h"

struct Information input()
{
    struct Information x;
    printf("\t\t-----Please enter the infomation-----");
    printf("\nEnter accountID: ");
    fgets(x.accountID, 255, stdin);
    printf("Enter type 'L'(Librarian) or 'M'(Menber): ");
    scanf("%c", &x.type);
    printf("Enter fullname: ");
    getchar();
    fgets(x.fullname, 255, stdin);
    printf("Your numberphone: ");
    fgets(x.numberphone, 20, stdin);
    printf("Enter your email: ");
    fgets(x.email, 255, stdin);
    printf("Enter your address: ");
    fgets(x.address, 255, stdin);
    printf("Status accountID: ");
    scanf("%s", &x.status);

    return x;
}

void check(struct Information x)
{
    strlwr(x.status);
    if (strcmp(x.status, "suspended") == 0 || strcmp(x.status, "closed") == 0 || strcmp(x.status, "active") != 0)
    {
        printf("You don't use service!");
        exit(0);
    }
}