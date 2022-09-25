// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem072
{
    public static void main(String[] args)
    {
        String str1;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        str1 = input.nextLine();
        if(str1.length() < 3)
        {
            if(str1.length() == 1)
            {
                System.out.println(str1.charAt(0) + "##");
            }
            else if (str1.length() == 2) 
            {
                System.out.println(str1.substring(0, 2) + "#");
            }
            else System.out.println("###");
        }
        else System.out.println(str1.substring(0, 3));
        input.close();
    }
}