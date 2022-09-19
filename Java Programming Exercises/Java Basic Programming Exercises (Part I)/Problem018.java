// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem018
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first binary number: ");
        long a = input.nextLong();
        System.out.print("Input the second binary number: ");
        long b = input.nextLong();
        long prod = binToDec(a) * binToDec(b);

        System.out.println("Product of two binary numbers: " + decToBin(prod));
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

    public static long decToBin(long dec)
    {
        long bin = 0;
        int i = 0;
        while(dec != 0)
        {
            int rem = (int)(dec%2);
            bin += rem * Math.pow(10, i);
            dec /= 2;
            ++i;
        }
        return bin;
    }
}