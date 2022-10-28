// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = input.nextDouble();

        if (num == 0) {
            System.out.println("Zero");
        } else if (num > 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }

        if (Math.abs(num) < 1) {
            System.out.println("Small");
        }

        if (Math.abs(num) > 1000000) {
            System.out.println("Large");
        }

        input.close();
    }
}