// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem056
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input lower bound: ");
        int low = input.nextInt();
        System.out.print("Input upper bound: ");
        int high = input.nextInt();
        System.out.print("Input value of k: ");
        int k = input.nextInt();
        if(low > high)
        {
            int temp = low;
            low = high;
            high = temp;
        }
        if(low%k == 0) System.out.println(high/k - low/k + 1);
        else System.out.println(high/k - low/k);
        input.close();
    }
}