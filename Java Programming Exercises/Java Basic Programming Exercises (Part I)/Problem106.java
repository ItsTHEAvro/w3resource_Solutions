// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem106 {
    public static void main(String[] args) {
        int[] arr = {20, 12, 44, 18, 21, 10, 14, 10, 23, 42, 20, 12, 44};
        System.out.println("Original Array: " + Arrays.toString(arr));
        int temp = arr[0];
        for(int i=1; i < arr.length; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        System.out.println("New Array: " + Arrays.toString(arr));
    }
}