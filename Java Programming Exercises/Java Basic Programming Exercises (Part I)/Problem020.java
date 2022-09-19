// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem020
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        long dec = input.nextLong();
        char hexChars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hex = "";
        while(dec > 0)
        {
            int rem = (int)(dec%16);
            hex =  hexChars[rem] + hex;
            dec /= 16;
        }
        System.out.println("Hexadecimal number is: " + hex);
        input.close();
    }
}