// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem05 {
    public static void main(String[] args) {
        int[] arr = { 56, 83, 23, 42, 43, 52, 5, 7, 78 };
        int element = 23;
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array contains " + element + ": " + hasElement(arr, element));
    }

    public static boolean hasElement(int[] arr, int item) {
        for (int it : arr) {
            if (it == item)
                return true;
        }
        return false;
    }
}