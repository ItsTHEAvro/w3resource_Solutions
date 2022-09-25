// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem081 {
    public static void main(String[] args) {
        int[] arr = { 20, 30, 40 };
        System.out.println("Original array: " + Arrays.toString(arr));
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        System.out.println("New array after swaping the first and last elements: " + Arrays.toString(arr));
    }
}