// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem002
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        int sum = a+b;
        System.out.println(a + " + " + b + " = " + sum);
        input.close();
    }
}