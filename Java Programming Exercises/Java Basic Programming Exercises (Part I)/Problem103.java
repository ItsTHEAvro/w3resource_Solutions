// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem103 {
    public static void main(String[] args) {
        int[] arr = {20, 21, 10, 14, 10, 23, 42, 15, 87};
        
        int i = 0, j = 0;

        for(i = arr.length - 1; i >= 0; i--)
        {
            if(arr[i] == 10) break;
        }

        int[] new_arr = new int[arr.length - i - 1];

        for(i = i+1; i < arr.length; i++, j++)
        {
            new_arr[j] = arr[i];
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("New Array: " + Arrays.toString(new_arr));
    }
}