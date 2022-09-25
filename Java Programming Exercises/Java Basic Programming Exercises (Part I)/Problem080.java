// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem080 {
    public static void main(String[] args) {
        int[] arr = { 20, 30, 40 };
        int max = arr[0];
        if(max < arr[2]) max = arr[2];
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Larger value between first and last element: " + max);
    }
}