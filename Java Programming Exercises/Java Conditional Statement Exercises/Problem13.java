// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number of terms: ");
        int n = input.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.printf("Number is: %d and cube of %d is: %d\n", i, i, i*i*i);
        }

        input.close();
    }
}