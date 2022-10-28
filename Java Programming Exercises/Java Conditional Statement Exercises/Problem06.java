// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double num1 = input.nextDouble();
        int x = (int) (num1 * 1000);

        System.out.print("Input floating-point another number: ");
        double num2 = input.nextDouble();
        int y = (int) (num2 * 1000);

        if (x == y) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");
        }

        input.close();
    }
}