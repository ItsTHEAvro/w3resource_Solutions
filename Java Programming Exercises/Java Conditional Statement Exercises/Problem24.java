// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int space = n - i; space > 0; space--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

        input.close();
    }
}
