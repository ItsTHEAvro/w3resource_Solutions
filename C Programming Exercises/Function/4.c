/*
Problem: Write a program in C to check a given number is even or odd using the function.
Author: Jyotirmoy Avro
*/

#include <stdio.h>

int EoD(int);

int main(void)
{
    int num;

    printf("Input any number: ");
    scanf("%d", &num);

    if(EoD(num))
    {
        printf("The entered number is odd.");
    }
    else
    {
        printf("The entered number is even.");
    }

    return 0;
}

int EoD(int n)
{
    return n&1;
}
