// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        double num = input.nextDouble();
        if (num < 0) {
            System.out.println("Number is negative");
        } else if (num > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is zero");
        }
        
        input.close();
    }
}