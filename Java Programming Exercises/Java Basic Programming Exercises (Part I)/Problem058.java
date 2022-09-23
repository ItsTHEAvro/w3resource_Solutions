// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem058
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = input.nextLine(), ans = "";
        Scanner strScanner = new Scanner(str);
        while(strScanner.hasNext())
        {
            String word = strScanner.next();
            ans += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        strScanner.close();
        System.out.println(ans);
        input.close();
    }
}