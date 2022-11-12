// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem04 {
    public static void main(String[] args) {
        int[] arr = { 56, 83, 23, 42, 43, 52, 5, 7, 78 };
        int sum = 0;
        for (int it : arr)
            sum += it;
        double avg = sum * 1.0 / arr.length;
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.printf("Average value of array elements: %.2f", avg);
    }
}