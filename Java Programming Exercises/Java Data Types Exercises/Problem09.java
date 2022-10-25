// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input 1st integer: ");
        int num1 = input.nextInt();
        
        System.out.print("Input 1st integer: ");
        int num2 = input.nextInt();

        System.out.println("Sum of two integers: " + (num1 + num2));
        System.out.println("Difference of two integers: " + (num1 - num2));
        System.out.println("Product of two integers: " + (num1 * num2));
        System.out.printf("Average of two integers: %.2f\n", (double) ((num1 + num2) / 2.0));
        System.out.println("Distance of two integers: " + Math.abs(num1 - num2));
        System.out.println("Max integer: " + Math.max(num1, num2));
        System.out.println("Min integer: " + Math.min(num1, num2));
        input.close();
    }
}