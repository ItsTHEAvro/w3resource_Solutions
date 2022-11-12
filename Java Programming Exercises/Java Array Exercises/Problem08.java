// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem08 {
    public static void main(String[] args) {
        int[] arr1 = { 56, 83, 23, 42, 43, 52, 5, 7, 78 };
        int[] arr2 = new int[arr1.length];
        System.out.println("Source array: " + Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("New array: " + Arrays.toString(arr2));
    }
}