// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem029
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        String hex = input.nextLine();
        hex = hex.toUpperCase();
        int dec = 0, i = 0;
        long bin = 0;
        String hexChars= "0123456789ABCDEF";
        for(int j =0; j<hex.length(); j++)
        {
            char ch = hex.charAt(j);
            int digit = hexChars.indexOf(ch);
            dec = 16*dec + digit;
        }
        while(dec != 0)
        {
            int rem = (dec%2);
            bin += rem * Math.pow(10, i);
            dec /= 2;
            ++i;
        }
        System.out.println("Equivalent Binary number is: " + bin);
        input.close();
    }
}