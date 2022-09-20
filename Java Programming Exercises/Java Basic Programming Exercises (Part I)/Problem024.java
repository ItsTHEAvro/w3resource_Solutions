// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem024
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        long bin = input.nextLong();
        long dec = 0, oct = 0;
        int i=0;
        while(bin != 0)
        {
            int rem = (int)(bin%10);
            dec += rem * Math.pow(2, i);
            bin /= 10;
            ++i;
        }
        i = 0;
        while(dec != 0)
        {
            int rem = (int)(dec%8);
            oct += rem * Math.pow(10, i);
            dec /= 8;
            ++i;
        }
        System.out.println("Octal number is: " + oct);
        input.close();
    }
}