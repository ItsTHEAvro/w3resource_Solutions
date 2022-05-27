/*
Problem: Write a program in C
to show the simple structure of a function.
Author: Jyotirmoy Avro
*/

#include <stdio.h>

// Declaring user-defined functions before the main function
int sum(int, int);

// Defining the main function with void as parameter
int main(void)
{
    int x, y, z;
    printf("Enter two numbers: ");
    scanf("%d %d", &x, &y);
    z = sum(x, y); // Calling the function
    printf("\nSum of %d and %d is:\n", x, y);
    printf("%d + %d = %d\n", x, y, z);
    return 0;
}

// Defining the previously declared functions
int sum(int a, int b)
{
    return a+b; // Returning a value from the function
}
