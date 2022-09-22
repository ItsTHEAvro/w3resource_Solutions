// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem041
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        System.out.println("The ASCII value of " + ch + " is " + (int)ch);
        input.close();
    }
}