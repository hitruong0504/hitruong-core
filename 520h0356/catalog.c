#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include "catalog.h"

int output(char* b)
{
    strlwr(b);
    if (strcmp(b, "kinhvanhoa") == 0 || strcmp(b, "101") == 0) // title
    {
        printf("\tISBN: 101.\n\tTitle is: Kinh Van Hoa.\n\tAuthors is: Nguyen Nhat Anh.\n\tYear: 2000.\n\tPublisher: Kim Dong.\n\tStatus: Available.");
    }else if (strcmp(b, "nhungngaythoau") == 0 || strcmp(b, "102") == 0)
    {
        printf("\tISBN: 102.\n\tTitle is: Nhung Ngay Tho Au.\n\tAuthors is: Nguyen Hong.\n\tYear: 1998.\n\tPublisher: Phuong Nam Book.\n\tStatus: Loaned.");
    }else if (strcmp(b, "truyenngannamcao") == 0 || strcmp(b, "103") == 0)
    {
        printf("\tISBN: 103.\n\tTitle is: Truyen ngan Nam Cao.\n\tAuthors is: Nam Cao.\n\tYear: 1999.\n\tPublisher: Kim Dong.\n\tStatus: Available.");
    }else if (strcmp(b, "demenphieuluuki") == 0 || strcmp(b, "104") == 0)
    {
        printf("\tISBN: 104.\n\tTitle is: De Men Phieu Luu Ki.\n\tAuthors is: To Hoai.\n\tYear: 2000.\n\tPublisher: Kim Dong.\n\tStatus: Loaned.");
    }else if (strcmp(b, "nhatkitrongtu") == 0 || strcmp(b, "nhatkytrongtu") == 0 || strcmp(b, "105") == 0)
    {
        printf("\tISBN: 105.\n\tTitle is: Nhat Ky Trong Tu.\n\tAuthors is: Ho Chi Minh.\n\tYear: 2001.\n\tPublisher: Phuong Nam Book.\n\tStatus: Available.");
    }else if (strcmp(b, "datrungphuongnam") == 0 || strcmp(b, "106") == 0)
    {
        printf("\tISBN: 106.\n\tTitle is: Dat Rung Phuong Nam.\n\tAuthors is: Doan Gioi.\n\tYear: 1998.\n\tPublisher: Phuong Nam Book.\n\tStatus: Loaned.");
    }else if (strcmp(b, "chipheo") == 0|| strcmp(b, "107") == 0)
    {
        printf("\tISBN: 107.\n\tTitle is: Chi Pheo.\n\tAuthors is: Nam cao.\n\tYear: 2001.\n\tPublisher: Kim Dong.\n\tStatus: Loaned.");
    }else if (strcmp(b, "vochongaphu") == 0 || strcmp(b, "108") == 0)
    {
        printf("\tISBN: 108.\n\tTitle is: Vo Chong A Phu.\n\tAuthors is: To Hoai.\n\tYear: 2002.\n\tPublisher: Kim Dong.\n\tStatus: Available.");
    }else if (strcmp(b, "matbiec") == 0 || strcmp(b, "109") == 0)
    {
        printf("\tISBN: 109.\n\tTitle is: Mat Biec.\n\tAuthors is: Nguyen Nhat Anh.\n\tYear: 1999.\n\tPublisher: Phuong Nam Book.\n\tStatus: Available.");
    }else if (strcmp(b, "tuyenngondoclap") == 0 || strcmp(b, "110") == 0)
    {
        printf("\tISBN: 110.\n\tTitle is: Tuyen Ngon Doc Lap.\n\tAuthors is: Ho Chi Minh.\n\tYear: 2002.\n\tPublisher: Kim Dong.\n\tStatus: Available.");
    }
    
    else if (strcmp(b, "nguyennhatanh") == 0) // authors
    {
        printf("\tISBN: 101.\n\tTitle is: Kinh Van Hoa.\n\tAuthors is: Nguyen Nhat Anh.\n\tYear: 2000.\n\tPublisher: Kim Dong.\n\tStatus: Available.");
        printf("\n\n\tISBN: 109.\n\tTitle is: Mat Biec.\n\tAuthors is: Nguyen Nhat Anh.\n\tYear: 1999.\n\tPublisher: Phuong Nam Book.\n\tStatus: Available.");
    }else if (strcmp(b, "nguyenhong") == 0)
    {
        printf("\tISBN: 102.\n\tTitle is: Nhung Ngay Tho Au.\n\tAuthors is: Nguyen Hong.\n\tYear: 1998.\n\tPublisher: Phuong Nam Book.\n\tStatus: Loaned.");
    }else if (strcmp(b, "namcao") == 0)
    {
        printf("\tISBN: 103.\n\tTitle is: Truyen ngan Nam Cao.\n\tAuthors is: Nam Cao.\n\tYear: 1999.\n\tPublisher: Kim Dong.\n\tStatus: Available.");
    }else if (strcmp(b, "tohoai") == 0)
    {
        printf("\tISBN: 104.\n\tTitle is: De Men Phieu Luu Ki.\n\tAuthors is: To Hoai.\n\tYear: 2000.\n\tPublisher: Kim Dong.\n\tStatus: Loaned.");
        printf("\n\n\tISBN: 108.\n\tTitle is: Vo Chong A Phu.\n\tAuthors is: To Hoai.\n\tYear: 2002.\n\tPublisher: Kim Dong.\n\tStatus: Available.");
    }else if (strcmp(b, "hochicminh") == 0)
    {
        printf("\tISBN: 105.\n\tTitle is: Nhat Ky Trong Tu.\n\tAuthors is: Ho Chi Minh.\n\tYear: 2001.\n\tPublisher: Phuong Nam Book.\n\tStatus: Available.");
        printf("\n\n\tISBN: 110.\n\tTitle is: Tuyen Ngon Doc Lap.\n\tAuthors is: Ho Chi Minh.\n\tYear: 2002.\n\tPublisher: Kim Dong.\n\tStatus: Available.");

    }else if (strcmp(b, "doangioi") == 0)
    {
        printf("\tISBN: 106.\n\tTitle is: Dat Rung Phuong Nam.\n\tAuthors is: Doan Gioi.\n\tYear: 1998.\n\tPublisher: Phuong Nam Book.\n\tStatus: Loaned.");
    }

    else if (strcmp(b, "kimdong") == 0) // publisher
    {
        printf("\tISBN: 101.\n\tTitle is: Kinh Van Hoa.\n\tAuthors is: Nguyen Nhat Anh.\n\tYear: 2000.\n\tPublisher: Kim Dong.\n\tStatus: Available.");
        printf("\n\n\tISBN: 103.\n\tTitle is: Truyen ngan Nam Cao.\n\tAuthors is: Nam Cao.\n\tYear: 1999.\n\tPublisher: Kim Dong.\n\tStatus: Available.");
        printf("\n\n\tISBN: 104.\n\tTitle is: De Men Phieu Luu Ki.\n\tAuthors is: To Hoai.\n\tYear: 2000.\n\tPublisher: Kim Dong.\n\tStatus: Loaned.");
        printf("\n\n\tISBN: 107.\n\tTitle is: Chi Pheo.\n\tAuthors is: Nam cao.\n\tYear: 2001.\n\tPublisher: Kim Dong.\n\tStatus: Loaned.");
        printf("\n\n\tISBN: 108.\n\tTitle is: Vo Chong A Phu.\n\tAuthors is: To Hoai.\n\tYear: 2002.\n\tPublisher: Kim Dong.\n\tStatus: Available.");
        printf("\n\n\tISBN: 110.\n\tTitle is: Tuyen Ngon Doc Lap.\n\tAuthors is: Ho Chi Minh.\n\tYear: 2002.\n\tPublisher: Kim Dong.\n\tStatus: Available.");
    }else if (strcmp(b, "phuongnambook") == 0)
    {
        printf("\tISBN: 102.\n\tTitle is: Nhung Ngay Tho Au.\n\tAuthors is: Nguyen Hong.\n\tYear: 1998.\n\tPublisher: Phuong Nam Book.\n\tStatus: Loaned.");
        printf("\n\n\tISBN: 105.\n\tTitle is: Nhat Ky Trong Tu.\n\tAuthors is: Ho Chi Minh.\n\tYear: 2001.\n\tPublisher: Phuong Nam Book.\n\tStatus: Available.");
        printf("\n\n\tISBN: 106.\n\tTitle is: Dat Rung Phuong Nam.\n\tAuthors is: Doan Gioi.\n\tYear: 1998.\n\tPublisher: Phuong Nam Book.\n\tStatus: Loaned.");
        printf("\n\n\tISBN: 109.\n\tTitle is: Mat Biec.\n\tAuthors is: Nguyen Nhat Anh.\n\tYear: 1999.\n\tPublisher: Phuong Nam Book.\n\tStatus: Available.");
    }else
    {
        printf("No informatoin!!!");
        return 1;
    }
    
}

void search(struct catalog* b, int n)
{
    switch (n)
    {
    case 1:
        printf("Please enter the title (viet lien khong dau): ");
        scanf("%s", &b->title);
        if(output(b->title) == 1)
            exit(0);
        break;
    case 2:
        printf("Please enter the ISBN: ");
        scanf("%s", &b->ISBN);
        if(output(b->ISBN) == 1)
            exit(0);
        break;
    case 3:
        printf("Please enter the authors (viet lien khong dau): ");
        scanf("%s", &b->authors);
        if(output(b->authors) == 1)
            exit(0);
        break;
    case 4:
        printf("Please enter the publisher (viet lien khong dau): ");
        scanf("%s", &b->publicher);
        if(output(b->publicher) == 1)
            exit(0);
        break;
    default:
        printf("Not exits.");
        break;
    }
}