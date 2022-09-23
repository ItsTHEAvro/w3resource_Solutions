// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem059
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = input.nextLine();
        str = str.toLowerCase();
        System.out.println(str);
        input.close();
    }
}