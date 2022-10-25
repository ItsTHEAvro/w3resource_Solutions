// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input distance in meters: ");
        double distance = input.nextDouble();
        System.out.print("Input hour: ");
        double hours = input.nextDouble();
        System.out.print("Input minuter: ");
        double minutes = input.nextDouble();
        System.out.print("Input seconds: ");
        double seconds = input.nextDouble();

        double mPs = distance / (seconds + (minutes * 60) + (hours * 3600));
        double kmPh = (distance / 1000.0) / (hours + (minutes / 60) + (seconds / 3600));
        double milesPh = (distance / 1609.0) / (hours + (minutes / 60) + (seconds / 3600));

        System.out.printf("Your speed in meters/second is %.8f\n", mPs);
        System.out.printf("Your speed in km/h is %.8f\n", kmPh);
        System.out.printf("Your speed in miles/h is %.8f\n", milesPh);
        input.close();
    }
}