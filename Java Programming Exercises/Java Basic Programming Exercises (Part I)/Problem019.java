// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem019
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        long dec = input.nextLong();
        long bin = 0;
        int i = 0;
        while(dec != 0)
        {
            int rem = (int)(dec%2);
            bin += rem * Math.pow(10, i);
            dec /= 2;
            ++i;
        }
        System.out.println("Binary number is: " + bin);
        input.close();
    }
}