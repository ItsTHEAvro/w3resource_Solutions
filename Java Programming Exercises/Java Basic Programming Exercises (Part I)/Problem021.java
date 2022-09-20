// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem021
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        long dec = input.nextLong();
        long oct = 0;
        int i = 0;
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