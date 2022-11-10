// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, num3;
        System.out.print("Input first number: ");
        num1 = input.nextDouble();
        System.out.print("Input second number: ");
        num2 = input.nextDouble();
        System.out.print("Input third number: ");
        num3 = input.nextDouble();
        if (num1 < num2 && num1 < num3) {
            System.out.println("Increasing order");
        } else if (num1 > num2 && num2 > num2) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }

        input.close();
    }
}
