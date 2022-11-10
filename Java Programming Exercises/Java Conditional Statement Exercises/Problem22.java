// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of rows: ");
        int n = input.nextInt();

        int tmp = 1;

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    tmp = 1;
                else
                    tmp = tmp * (i - j + 1) / j;
                System.out.print(" " + tmp);
            }
            System.out.println();
        }

        input.close();
    }
}
