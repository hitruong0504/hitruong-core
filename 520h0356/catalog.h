#ifndef CATALOG_H_INCLUDE
#define CATALOG_H_INCLUDE

struct catalog
{
    char ISBN[5]; // ma so sach
    char title[255]; // tua sach
    char authors[255]; // tac gia
    int year[5]; // nam san xuat
    char publicher[255]; // nha san xuat
    char status[20]; // tinh trang sach
};

void search(struct catalog *, int);
int output(char*);


#endif