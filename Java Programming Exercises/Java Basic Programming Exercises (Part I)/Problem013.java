// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem013
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Width = ");
        double width = input.nextDouble();
        System.out.print("Height = ");
        double height = input.nextDouble();
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.printf("Area is %.2f * %.2f = %.2f\n", width, height, area);
        System.out.printf("Perimeter is 2 * (%.2f + %.2f) = %.2f", width, height, perimeter);
        input.close();
    }
}