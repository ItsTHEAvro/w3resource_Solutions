// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        double avg = 0;

        System.out.println("Input the 5 numbers: ");
        
        for(int i=1; i<=5; i++) {
            int n = input.nextInt();
            sum += n;
        }
        avg = sum / 5;

        System.out.printf("The Sum of 5 no is: %d\n", sum);
        System.out.printf("The Average is: %.2f\n", avg);
        
        input.close();
    }
}