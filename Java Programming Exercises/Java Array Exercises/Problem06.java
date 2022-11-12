// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem06 {
    public static void main(String[] args) {
        int[] arr = { 56, 83, 23, 42, 43, 52, 5, 7, 78 };
        int element = 23;
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Index of " + element + ": " + getIndex(arr, element));
    }

    public static int getIndex(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item)
                return i;
        }
        return -1;
    }
}