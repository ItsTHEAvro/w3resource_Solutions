// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n;
        n = input.nextInt();
        boolean ans = (n > 0) && ((n & (n-1)) == 0) && (n%3 == 1);
        System.out.println(ans);
        input.close();
    }
}