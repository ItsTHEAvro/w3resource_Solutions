// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem049
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = input.nextInt();
        if((num % 2) == 0) System.out.println(1);
        else System.out.println(2);
        input.close();
    }
}