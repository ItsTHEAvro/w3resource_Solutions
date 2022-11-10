// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        double num = input.nextDouble();

        if (num > 0) {
            System.out.print("Positive");
            if(num > 1000000) System.out.print(" large");
            if(num < 1) System.out.print(" small");
        }

        else if (num < 0) {
            System.out.print("Negative");
            if(Math.abs(num) > 1000000) System.out.print(" large");
            if(Math.abs(num) < 1) System.out.print(" small");
        }
        
        else System.out.println("Number is zero");

        input.close();
    }
}
