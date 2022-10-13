// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem107 {
    public static void main(String[] args) {
        int[] arr = {20, 12, 44, 18, 21, 23, 42, 43, 44};
        boolean res = false;
        for(int i = 0; i < arr.length-2; i++)
        {
            if((arr[i+1] == arr[i] + 1) && (arr[i+2] == arr[i+1] + 1))
            res = true;
        }
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println(res);
    }
}