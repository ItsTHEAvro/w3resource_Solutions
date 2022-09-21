// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem036
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        double temp_x1 = input.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double temp_y1 = input.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double temp_x2 = input.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double temp_y2 = input.nextDouble();
        double radius = 6371.01;
        double x1 = Math.toRadians(temp_x1);
        double y1 = Math.toRadians(temp_y1);
        double x2 = Math.toRadians(temp_x2);
        double y2 = Math.toRadians(temp_y2);
        double distance = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println("The distance between those points is: " + distance + " km");
        input.close();
    }
}