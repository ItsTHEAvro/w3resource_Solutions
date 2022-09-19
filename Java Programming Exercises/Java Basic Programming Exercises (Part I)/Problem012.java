// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem012
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number = ");
        double num1 = input.nextDouble();
        System.out.print("Input second number = ");
        double num2 = input.nextDouble();
        System.out.print("Input third number = ");
        double num3 = input.nextDouble();
        double avg = (num1 + num2 + num3)/3;
        System.out.println("Average of " + num1 + ", " + num2 + ", " + num3 + " is = " + avg);
        input.close();
    }
}