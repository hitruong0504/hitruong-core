#include <stdio.h>
#include <string.h>

#include "member.h"
#include "catalog.h"
#include "bookrequest.h"

int main()
{
    struct Information s = input();
    struct catalog b;
    int n, k = 0;

    printf("\t\t-----Search by-----");
    printf("\n1. Title\n2. ISBN\n3. Authors\n4. Publisher\n");
    do
    {
        if (k == 0)
        {
            printf("You choose: ");
            scanf("%d", &n);
        }else
        {
            printf("Select again: ");
            scanf("%d", &n);
        }
        k++;
    } while (n >= 5);
    
    search(&b, n);
    YoN();
    struct bookrequest s1 = input2();
    output2(s1);
}