// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n, ans;
        n = input.nextInt();
        ans = (int) ((Math.sqrt(8 * (long)n + 1) - 1) / 2);
        System.out.println("Number of rows: " + ans);
        input.close();
    }
}