// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2;
        System.out.print("Input first floatingpoint number: ");
        num1 = input.nextDouble();
        System.out.print("Input second floatingpoint number: ");
        num2 = input.nextDouble();

        num1 *= 100;
        num2 *= 100;
        num1 = (int) num1;
        num2 = (int) num2;
        if (num1 == num2) {
            System.out.println("These number are equal up to two decimal places.");
        } else {
            System.out.println("These numbers are different.");
        }

        input.close();
    }
}
