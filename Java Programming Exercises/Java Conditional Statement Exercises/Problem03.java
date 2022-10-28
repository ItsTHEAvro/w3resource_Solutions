// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem03 {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = input.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = input.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("The numbers are equal.");
        } else {
            if (num1 > num2 && num1 > num3) {
                System.out.println("The greatest: " + num1);
            }
            if (num2 > num1 && num2 > num3) {
                System.out.println("The greatest: " + num2);
            }
            if (num3 > num1 && num3 > num2) {
                System.out.println("The greatest: " + num3);
            }
        }

        input.close();

    }
}