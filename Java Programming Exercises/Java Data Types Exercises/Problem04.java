// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        long minutes = input.nextLong();
        int days = (int) minutes / (24 * 60);
        int years = (int) days / 365;
        days = days % 365;
        System.out.printf("%d minutes is approximately %d years and %d days.", minutes, years, days);
        input.close();
    }
}