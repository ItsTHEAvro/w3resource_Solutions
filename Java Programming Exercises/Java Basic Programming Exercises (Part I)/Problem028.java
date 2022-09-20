// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem028
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        String hex = input.nextLine();
        hex = hex.toUpperCase();
        int dec = 0;
        String hexChars= "0123456789ABCDEF";
        for(int i =0; i<hex.length(); i++)
        {
            char ch = hex.charAt(i);
            int digit = hexChars.indexOf(ch);
            dec = 16*dec + digit;
        }
        System.out.println("Equivalent decimal number is: " + dec);
        input.close();
    }
}