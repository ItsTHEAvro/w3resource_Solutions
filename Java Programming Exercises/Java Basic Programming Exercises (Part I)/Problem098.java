// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem098 {
    public static void main(String[] args) {
        int[] arr = {20, 10, 20, 3, 5, 2, 7, 10, 20};
        boolean res = false;
        int i = 0, num = 20, count = 0;
        for(i = 0; i < arr.length; i++)
        {
            if(i < arr.length - 1 && arr[i] == num && arr[i+1] == num)
            {
                count = 0;
                break;
            }
            else
            {
                if(arr[i] == 20) count++;
            }
        }
        if(count == 3) res = true;
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println(res);
    }
}