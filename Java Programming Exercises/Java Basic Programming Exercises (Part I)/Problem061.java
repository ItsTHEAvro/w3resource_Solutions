// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem061
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a word: ");
        char[] word = input.nextLine().trim().toCharArray();
        String ans = "";
        for(int i=word.length-1; i>=0; --i) ans += word[i];
        System.out.println("Reverse word: " + ans.trim());
        input.close();
    }
}