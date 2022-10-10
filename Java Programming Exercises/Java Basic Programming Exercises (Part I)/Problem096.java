// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem096 {
    public static void main(String[] args) {
        int[] arr = {20, 10, 3, 5, 2, 20, 7, 1};
        boolean found10 = false, res = false;
        int i = 0;
        for(i = 0; i < arr.length-1; i++)
        {
            if(arr[i] == 10) 
            {
                found10 = true;
                break;
            }
        }
        for(; i < arr.length-1; i++)
        {
            if(found10 && arr[i] == 20) res = true;
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println(res);
    }
}