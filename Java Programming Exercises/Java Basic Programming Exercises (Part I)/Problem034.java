// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem034
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        double side = input.nextDouble(), area;
        area = (6 * side * side)/(4*Math.tan(Math.PI/6));
        System.out.println("The area of the hexagon is: " + area);
        input.close();
    }
}