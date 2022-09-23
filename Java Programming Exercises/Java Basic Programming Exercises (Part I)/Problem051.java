// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem051
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String numStr = input.next();
        int num = Integer.parseInt(numStr);
        System.out.println("The integer value is: " + num);
        input.close();
    }
}