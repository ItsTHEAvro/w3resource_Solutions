// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem006
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = input.nextInt();
        System.out.print("Input second number: ");
        int b = input.nextInt();
        int sum = a+b;
        int sub = a-b;
        int prod = a*b;
        int div = a/b;
        int rem = a%b;
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " x " + b + " = " + prod);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " mod " + b + " = " + rem);
        input.close();
    }
}