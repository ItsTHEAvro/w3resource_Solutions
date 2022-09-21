// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem032
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int a = input.nextInt();
        System.out.print("Input second integer: ");
        int b = input.nextInt();
        if(a == b)
        {
            System.out.printf("%d == %d\n", a, b);
        }
        if(a != b)
        {
            System.out.printf("%d != %d\n", a, b);
        }
        if(a > b)
        {
            System.out.printf("%d > %d\n", a, b);
        }
        if(a < b)
        {
            System.out.printf("%d < %d\n", a, b);
        }
        if(a >= b)
        {
            System.out.printf("%d >= %d\n", a, b);
        }
        if(a <= b)
        {
            System.out.printf("%d <= %d\n", a, b);
        }
        input.close();
    }
}