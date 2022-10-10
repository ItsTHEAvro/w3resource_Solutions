// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem099 {
    public static void main(String[] args) {
        int[] arr = {20, 10, 20, 3, 20, 5, 20, 7, 20, 10};
        boolean res = true;
        int i = 0, num = 20;
        for(i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] != num && arr[i+1] != num)
            {
                res = false;
            }
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println(res);
    }
}