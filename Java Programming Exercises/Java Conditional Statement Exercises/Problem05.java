// Author: Jyotirmoy Avro

import java.util.Random;
import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int randomNum = rand.nextInt((num % 7) + 1) + 1;

        System.out.println(getDay(randomNum));

        input.close();
    }

    static String getDay(int n) {
        String day = "";
        switch (n) {
            case 1:
                day = "Saturday";
                break;
            case 2:
                day = "Sunday";
                break;
            case 3:
                day = "Monday";
                break;
            case 4:
                day = "Tuesday";
                break;
            case 5:
                day = "Wednesday";
                break;
            case 6:
                day = "Thursday";
                break;
            case 7:
                day = "Friday";
                break;
            default:
                day = "Invalid range";
        }
        return day;
    }
}