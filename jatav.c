#include<stdio.h>
struct student
{
    int id;
    char name[20];
    float marks;
};
int main()
{
   printf("Enter no. of students: ");
    int n;
    scanf("%d", &n);
    struct student s[n];
   
   return 0;
}