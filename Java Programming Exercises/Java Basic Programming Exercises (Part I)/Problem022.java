// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem022
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        long bin = input.nextLong();
        long dec = 0;
        int i = 0;
        while(bin != 0)
        {
            int rem = (int)(bin % 10);
            dec += rem * Math.pow(2, i);
            bin /= 10;
            ++i;
        }
        
        System.out.println("Decimal number is: " + dec);
        input.close();
    }
}