// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String inputStr = input.next();

        char inputChar = inputStr.charAt(0);
        inputChar = Character.toLowerCase(inputChar);

        if (inputStr.length() > 1) {
            System.out.println("Error. Not a single character");
        } else if (!(inputChar >= 97 && inputChar <= 122)) {
            System.out.println("Error. Not a letter.");
        } else if (inputChar == 'a'
                || inputChar == 'e'
                || inputChar == 'i'
                || inputChar == 'o'
                || inputChar == 'u') {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }

        input.close();
    }
}