// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inch = input.nextDouble();
        double meter = inch * 0.0254;
        System.out.printf("%.1f inch is %.1f meters.", inch, meter);
        input.close();
    }
}