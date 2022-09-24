// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem070
{
    public static void main(String[] args)
    {
        String str1, str2;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        str1 = input.nextLine();
        System.out.print("Input another string of different length: ");
        str2 = input.nextLine();
        if(str1.length() == str2.length())
        {
            System.out.println("Both strings are the same length!");
        }
        else if(str1.length() > str2.length())
        {
            System.out.println(str2 + str1 + str2);
        }
        else System.out.println(str1 + str2 + str1);
        input.close();
    }
}