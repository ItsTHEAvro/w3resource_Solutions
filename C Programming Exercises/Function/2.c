/***********************************************
    Problem: Write a program in C to find
    the square of any number using the function.

    Solved By: Jyotirmoy Avro
***********************************************/

#include <stdio.h>

double sqr(double);

int main(void)
{
    int num;
    double sqrNum;
    printf("Input any number for square : ");
    scanf("%d", &num);
    sqrNum = sqr(num);
    printf("The square of %d is %.2f", num, sqrNum);
    return 0;
}

double sqr(double num)
{
    return num*num;
}
