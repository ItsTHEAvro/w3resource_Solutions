// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input weight in pounds: ");
        double weight = input.nextDouble();
        weight = weight * 0.45359237;

        System.out.print("Input height in inches: ");
        double height = input.nextDouble();
        height = height * 0.0254;

        double BMI = weight / (height * height);
        
        System.out.println("Body Mass Index is " + BMI);
        input.close();
    }
}