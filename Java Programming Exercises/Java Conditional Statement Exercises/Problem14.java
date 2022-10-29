// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number (Table to be calculated): ");
        int x = input.nextInt();

        System.out.print("Input number of terms: ");
        int n = input.nextInt();

        for(int i=0; i<=n; i++) {
            System.out.printf("%d X %d = %d\n", x, i, x*i);
        }

        input.close();
    }
}