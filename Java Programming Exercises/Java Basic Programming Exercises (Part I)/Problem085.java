// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem085
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = input.nextLine();
        System.out.println(str.startsWith("Hello"));
        input.close();
    }
}