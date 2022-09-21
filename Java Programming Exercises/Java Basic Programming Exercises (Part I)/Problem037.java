// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem037
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        char str[] = input.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for(int i = str.length-1; i >= 0; --i)
        {
            System.out.print(str[i]);
        }
        System.out.println();
        input.close();
    }
}