// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem02 {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = input.nextDouble();

        System.out.print("Input b: ");
        double b = input.nextDouble();
        
        System.out.print("Input c: ");
        double c = input.nextDouble();

        double det = b * b - 4.0 * a * c;

        if (det == 0.0) {
            double root_1 = -b / (2.0 * a);
            System.out.println("The root is " + root_1);
        } else if (det > 0.0) {
            double root_1 = (-b + Math.pow(det, 0.5)) / (2.0 * a);
            double root_2 = (-b - Math.pow(det, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + root_1 + " and " + root_2);
        } else {
            System.out.println("The equation has no real roots.");
        }

        input.close();

    }
}