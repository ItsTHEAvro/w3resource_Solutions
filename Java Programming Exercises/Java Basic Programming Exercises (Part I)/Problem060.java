// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem060
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = input.nextLine();
        String[] words = str.split(" ");
        System.out.println("Penultimate word: " + words[words.length - 2]);
        input.close();
    }
}