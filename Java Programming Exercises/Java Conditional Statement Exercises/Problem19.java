// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of rows: ");
        int n = input.nextInt();

        int sCount = n + 3;
        for (int i = 1; i <= n; i++) {
            for (int space = sCount; space != 0; space--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            sCount--;
        }

        input.close();
    }
}
