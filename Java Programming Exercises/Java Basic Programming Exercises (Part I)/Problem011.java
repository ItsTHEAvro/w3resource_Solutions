// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem011
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Radius = ");
        double r = input.nextDouble();
        double perimeter = 2 * Math.PI * r, area = Math.PI * r * r;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
        input.close();
    }
}