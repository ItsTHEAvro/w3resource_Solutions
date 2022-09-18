/**********************************************
    Problem: Write a program in C
    to check a given number is even or odd
    using the function.

    Solved By: Jyotirmoy Avro
***********************************************/

#include <stdio.h>

int evenOrOdd(int);

int main(void)
{
    int num;

    printf("Input any number: ");
    scanf("%d", &num);

    if(evenOrOdd(num))
    {
        printf("The entered number is odd.");
    }
    else
    {
        printf("The entered number is even.");
    }

    return 0;
}

int evenOrOdd(int n)
{
    return n&1;
}
