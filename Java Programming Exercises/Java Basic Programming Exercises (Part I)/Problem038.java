// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem038
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("The string is: ");
        char str[] = input.nextLine().toCharArray();
        int letter = 0, space = 0, number = 0, other = 0;
        for(int i = 0; i < str.length; ++i)
        {
            if(Character.isLetter(str[i])) ++letter;
            else if(Character.isDigit(str[i])) ++number;
            else if(Character.isSpaceChar(str[i])) ++space;
            else ++other;
        }
        System.out.println("Letter: " + letter);
        System.out.println("Space: " + space);
        System.out.println("Number: " + number);
        System.out.println("Other: " + other);
        input.close();
    }
}