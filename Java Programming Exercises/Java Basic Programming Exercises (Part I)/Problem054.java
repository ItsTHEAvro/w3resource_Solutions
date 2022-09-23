// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem054
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = input.nextInt();
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();
        System.out.print("Input the third number: ");
        int num3 = input.nextInt();
        System.out.println("The result is: " + solve(num1, num2, num3));
        input.close();
    }

    public static boolean solve(int x, int y, int z)
    {
        return ((x%10 == y%10)||(y%10 == z%10)||(z%10 == x%10));
    }
}