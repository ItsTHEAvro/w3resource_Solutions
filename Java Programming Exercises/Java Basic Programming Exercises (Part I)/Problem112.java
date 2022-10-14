// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem112 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n, ans = 0, temp;
        temp = n = input.nextInt();
        while (temp > 0) {
            ans += temp / 5;
            temp /= 5;
        }
        System.out.printf("Number of trailing zeros in %d! is %d", n, ans);
        input.close();
    }
}