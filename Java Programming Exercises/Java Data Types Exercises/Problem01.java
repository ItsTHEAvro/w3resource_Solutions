// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double tempFahrenheit = input.nextDouble();
        double tempCelcius = ((5.0 * (tempFahrenheit - 32.0)) / 9.0);
        System.out.printf("%.1f degree Fahrenheit is equal to %.1f in Celcius.", tempFahrenheit, tempCelcius);
        input.close();
    }
}