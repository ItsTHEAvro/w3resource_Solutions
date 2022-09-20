// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem027
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        long oct = input.nextLong();
        long dec = 0;
        int i = 0;
        String hex = "";
        char hexChars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(oct != 0)
        {
            int rem = (int)(oct%10);
            dec += rem * Math.pow(8, i);
            oct /= 10;
            ++i;
        }
        while(dec > 0)
        {
            int rem = (int)(dec%16);
            hex =  hexChars[rem] + hex;
            dec /= 16;
        }
        System.out.println("Equivalent hexadecimal number: " + hex);
        input.close();
    }
}