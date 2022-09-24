// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem063
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = input.nextInt();
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();
        System.out.println("Result: " + solve(num1, num2));
        input.close();
    }

    public static int solve(int x, int y)
    {
        if (x == y) return 0;
        if (x % 6 == y % 6)
        {
            return ((x > y) ? y : x);
        }
        return ((x > y) ? x : y);
    }
}