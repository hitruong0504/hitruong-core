#ifndef MEMBER_H_INCLUDE
#define MEMBER_H_INCLUDE

struct Information
{
    char accountID[255];
    char type;
    char fullname[255];
    char numberphone[20];
    char email[255];
    char address[255];
    char status[20];
};

struct Information input();
void check(struct Information);

#endif