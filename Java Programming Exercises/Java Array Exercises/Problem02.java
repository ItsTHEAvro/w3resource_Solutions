// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem02 {
    public static void main(String[] args) {
        int[] arr1 = { 56, 83, 23, 42, 43, 52, 5, 7, 78 };
        int sum = 0;
        for (int it : arr1)
            sum += it;
        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Sum of the values is: " + sum);
    }
}