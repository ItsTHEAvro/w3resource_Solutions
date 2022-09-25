// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem084
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = input.nextLine();
        if (str.length() < 3)
        {
            System.out.println("String length must be greater than three and more.");
        }
        else
        {
            System.out.println(str.substring(str.length()-3) + str + str.substring(str.length()-3));
        }
        input.close();
    }
}