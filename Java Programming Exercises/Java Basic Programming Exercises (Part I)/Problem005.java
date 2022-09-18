// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem005
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = input.nextInt();
        System.out.print("Input second number: ");
        int b = input.nextInt();
        int res = a*b;
        System.out.println(a + " x " + b + " = " + res);
        input.close();
    }
}