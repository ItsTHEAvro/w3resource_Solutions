// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem025
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        long oct = input.nextLong();
        long dec = 0;
        int i = 0;
        while(oct != 0)
        {
            int rem = (int)(oct%10);
            dec += rem * Math.pow(8, i);
            oct /= 10;
            ++i;
        }
        System.out.println("Equivalent decimal number: " + dec);
        input.close();
    }
}