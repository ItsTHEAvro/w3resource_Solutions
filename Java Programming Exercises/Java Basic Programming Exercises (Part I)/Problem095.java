// Author: Jyotirmoy Avro

import java.util.Arrays;
import java.util.Scanner;

public class Problem095 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = String.valueOf(i);
        }
        System.out.println("New Array: " + Arrays.toString(arr));
        input.close();
    }
}