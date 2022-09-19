// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem017
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first binary number: ");
        long a = input.nextLong();
        System.out.print("Input the second binary number: ");
        long b = input.nextLong();
        int i = 0, rem = 0;
        int[] sum = new int[25];
        while(a != 0 || b != 0)
        {
            sum[i++] = (int)(((a%10) + (b%10) + rem) % 2);
            rem = (int)(((a%10) + (b%10) + rem) / 2);
            a /= 10;
            b /= 10;
        }
        if (rem != 0) sum[i++] = rem;
        --i;
        while(i >= 0) System.out.print(sum[i--]);
        input.close();
    }
}