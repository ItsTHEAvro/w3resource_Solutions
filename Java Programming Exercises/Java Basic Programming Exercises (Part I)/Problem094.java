// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem094 {
    public static void main(String[] args) {
        int[] arr = { 1, 7, 8, 5, 7, 13, 0, 2, 4, 9 };
        int i = 0;
        System.out.println("Original Array: " + Arrays.toString(arr));
        while (i < arr.length && arr[i] % 2 == 0)
            i++;
            
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] % 2 != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        System.out.println("New Array: " + Arrays.toString(arr));
    }
}