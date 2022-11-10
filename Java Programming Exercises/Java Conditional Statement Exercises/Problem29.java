// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer number less than ten billion: ");

        int count = 0;
        if (input.hasNextLong()) {
            long num = input.nextLong();
            if (num < 0)
                num *= -1;
            if (num >= 10000000000L) {
                System.out.println("The number is greater or equals to 10,000,000,000!");
            } else {
                while (num > 0) {
                    num /= 10;
                    count++;
                }
                System.out.println("Number of digits in the number: " + count);
            }
        } else {
            System.out.println("The number is not an integer.");
        }

        input.close();
    }
}
