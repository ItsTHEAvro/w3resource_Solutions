// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem086
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the value of n: ");
        int n = input.nextInt();
        while(n != 1)
        {
            if(n%2 == 0) n /= 2;
            else n = (3 * n + 1) / 2;
        }
        System.out.println("value of n= " + n);
        input.close();
    }
}