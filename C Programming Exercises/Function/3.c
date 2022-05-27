/*
Problem: Write a program in C to swap two numbers using function.
Author: Jyotirmoy Avro
*/

#include <stdio.h>

void swap(int *, int *);

int main(void)
{
    int num1, num2;

    printf("Input 1st number: ");
    scanf("%d", &num1);
    printf("Input 2nd number: ");
    scanf("%d", &num2);

    printf("\nBefore swapping: n1 = %d, n2 = %d\n", num1, num2);

    swap(&num1, &num2);

    printf("After swapping: n1 = %d, n2 = %d\n", num1, num2);

    return 0;
}

void swap(int *num1, int *num2)
{
    int temp;
    temp = *num1;
    *num1 = *num2;
    *num2 = temp;
}
