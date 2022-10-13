// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n, ans;
        n = input.nextInt();
        ans = ((n - 1) % 9) + 1;
        System.out.println("The single digit number is: " + ans);
        input.close();
    }
}