// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem065
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = input.nextInt();
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();
        System.out.println(num1 - ((num1 / num2) * num2));
        input.close();
    }
}