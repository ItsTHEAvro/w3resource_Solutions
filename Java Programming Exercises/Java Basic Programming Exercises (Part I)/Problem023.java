// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem023
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        long bin = input.nextLong();
        long dec = binToDec(bin);
        char hexChars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hex = "";
        while(dec > 0)
        {
            int rem = (int)(dec%16);
            hex =  hexChars[rem] + hex;
            dec /= 16;
        }
        System.out.println("Hexadecimal value is: " + hex);
        input.close();
    }

    public static long binToDec(long bin)
    {
        long dec = 0;
        int i = 0;
        while(bin != 0)
        {
            int rem = (int)(bin%10);
            dec += rem * Math.pow(2, i);
            bin /= 10;
            ++i;
        }
        return dec;
    }
}