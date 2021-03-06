#ifndef BOOKREQUEST_H_INCLUDE
#define BOOKREQUEST_H_INCLUDE

struct bookrequest
{
    int BLCODE;
    int memberID;
    char ISBN[5]; // ma so sach
    char dueDate[12];
    char returnDate[12];
};

struct bookrequest input2();
void output2(struct bookrequest);
void YoN();

#endif