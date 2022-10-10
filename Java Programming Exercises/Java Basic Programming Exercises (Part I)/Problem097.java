// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem097 {
    public static void main(String[] args) {
        int[] arr = {20, 10, 3, 5, 2, 20, 7, 10, 3};
        boolean res = false;
        int i = 0, num = 10;
        for(i = 0; i < arr.length-1; i++)
        {
            if((arr[i] == num && arr[i+1] == num) 
            || (i < arr.length-2 && arr[i] == num && arr[i+2] == num))
            {
                res = true;
            }
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println(res);
    }
}