// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem104 {
    public static void main(String[] args) {
        int[] arr = {20, 12, 44, 18, 21, 10, 14, 10, 23, 42, 15, 87};
        
        int i = 0;

        for(i = 0; i < arr.length; i++)
        {
            if(arr[i] == 10) break;
        }

        int[] new_arr = new int[i];

        for(int j = 0; j < i; j++)
        {
            new_arr[j] = arr[j];
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("New Array: " + Arrays.toString(new_arr));
    }
}