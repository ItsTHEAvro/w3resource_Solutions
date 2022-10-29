// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of rows: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        input.close();
    }
}