// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem035
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon: ");
        int side = input.nextInt();
        System.out.print("Input the length of one of the sides: ");
        double length = input.nextDouble(), area;
        area = (side * length * length)/(4*Math.tan(Math.PI/side));
        System.out.println("The area is: " + area);
        input.close();
    }
}