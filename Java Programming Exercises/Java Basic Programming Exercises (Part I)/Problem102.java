// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem102 {
    public static void main(String[] args) {
        int[] arr = {20, 21, 10, 14, 10, 42, 15, 87};
        boolean res = false;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 10 || arr[i] == 30) res = true;
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println(res);
    }
}