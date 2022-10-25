// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input a floating point number: ");
        float num1 = input.nextFloat();
        System.out.println("Initial float value: " + num1);
        System.out.println("Next floating-point adjacent in the direction of");
        System.out.println("Positive Infinity: " + Math.nextUp(num1));
        System.out.println("Negative Infinity: " + Math.nextDown(num1));
        
        System.out.println("\n");
        
        System.out.print("Input another floating point number: ");
        double num2 = input.nextDouble();
        System.out.println("Initial double value: " + num2);
        System.out.println("Next floating-point adjacent in the direction of");
        System.out.println("Positive Infinity: " + Math.nextUp(num2));
        System.out.println("Negative Infinity: " + Math.nextDown(num2));
        input.close();
    }
}