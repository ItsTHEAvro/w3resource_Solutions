// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the time zone offset to GMT: ");
        int offset = input.nextInt();
        
        long milliseconds = System.currentTimeMillis();
        long seconds = milliseconds / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;

        hours = (offset + hours) % 24;
        minutes = minutes % 60;
        seconds = seconds % 60;
        
        System.out.printf("Current time is %d:%d:%d", hours, minutes, seconds);
        input.close();
    }
}