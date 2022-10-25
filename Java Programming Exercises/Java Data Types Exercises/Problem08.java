// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input a number: ");
        double num = input.nextDouble();

        System.out.printf("Square: %.2f\n", num * num);
        System.out.printf("Cube: %.2f\n", num * num * num);
        System.out.printf("Fourth Power: %.2f\n", num * num * num * num);
        input.close();
    }
}