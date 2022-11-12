// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem07 {
    public static void main(String[] args) {
        int[] arr = { 56, 83, 23, 42, 43, 52, 5, 7, 78 };
        int index = 2;
        System.out.println("Original array: " + Arrays.toString(arr));
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Modified array: " + Arrays.toString(arr));
    }
}