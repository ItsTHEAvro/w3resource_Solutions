// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of terms: ");
        int n = input.nextInt();
        int sum = 0;

        System.out.printf("The first %d odd numbers are:\n", n);
        for(int i=1; i<=n; i++) {
            System.out.println(2*i - 1);
            sum += (2*i - 1);
        }

        System.out.printf("The Sum of Odd Natural Number upto %d terms: %d\n", n, sum);
        
        input.close();
    }
}