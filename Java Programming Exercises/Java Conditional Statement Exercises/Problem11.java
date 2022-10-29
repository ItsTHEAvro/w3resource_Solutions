// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number: ");
        int n = input.nextInt();
        int sum = 0;

        System.out.printf("The first %d natural numbers are:\n", n);
        for(int i=1; i<=n; i++) {
            System.out.println(i);
            sum += i;
        }

        System.out.printf("The Sum of Natural Number upto %d terms: %d\n", n, sum);
        
        input.close();
    }
}