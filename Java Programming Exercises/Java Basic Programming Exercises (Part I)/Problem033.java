// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem033
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num = input.nextInt(), sum = 0;
        while(num != 0)
        {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("The sum of the digits is: " + sum);
        input.close();
    }
}