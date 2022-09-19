// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem015
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number = ");
        int a = input.nextInt();
        System.out.print("Input second number = ");
        int b = input.nextInt();
        System.out.printf("Before swapping: a = %d, b = %d\n", a, b);
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("After swapping: a = %d, b = %d\n", a, b);
        input.close();
    }
}