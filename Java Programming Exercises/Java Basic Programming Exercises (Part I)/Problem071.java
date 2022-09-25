// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem071
{
    public static void main(String[] args)
    {
        String str1, str2;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        str1 = input.nextLine();
        System.out.print("Input another string: ");
        str2 = input.nextLine();
        if(str1.length() == 0 || str2.length() == 0)
        {
            System.out.println("Length of the strings must be 1 and above!");
        }
        else System.out.println(str1.substring(1) + str2.substring(1));
        input.close();
    }
}