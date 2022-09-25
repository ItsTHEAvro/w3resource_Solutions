// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem073
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str1, str2;
        System.out.print("Input a string: ");
        str1 = input.nextLine();
        System.out.print("Input another string: ");
        str2 = input.nextLine();
        String res = "";
        if(str1.length() == 0 && str2.length() > 0)
        {
           res = "#" + str2.charAt(0);
        }
        else if(str1.length() > 0 && str2.length() == 0)
        {
           res = str1.charAt(0) + "#";
        }
        else res = "" + str1.charAt(0) + str2.charAt(0);
        
        System.out.println(res);
        input.close();
    }
}