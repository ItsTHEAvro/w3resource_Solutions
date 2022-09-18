// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem007
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = input.nextInt();
        for(int i = 1; i<=10; i++)
        {
            System.out.println(a + " x " + i + " = " + (a*i));
        }
        input.close();
    }
}