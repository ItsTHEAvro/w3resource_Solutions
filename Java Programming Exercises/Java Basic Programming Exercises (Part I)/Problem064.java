// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem064
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

    public static boolean solve(int x, int y)
    {
        if (x < 25 || y > 75 || y < 25 || x > 75) return false;
        int d1 = x % 10;
        int d2 = y % 10;
        x /= 10;
        y /= 10;
        return (x == y || x == d1 || x == d2 || d1 == d2);
    }
}