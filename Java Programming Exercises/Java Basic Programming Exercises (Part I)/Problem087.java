// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem087
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = input.nextInt(), sum = 0;
        while(n != 0)
        {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Each digit of the sum in English: " + printSum(sum));
        input.close();
    }

    public static String printSum(int n)
    {
        String str = "";
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        while(n != 0)
        {
            str = nums[n % 10] + " " + str;
            n /= 10;
        }
        return str;
    }
}