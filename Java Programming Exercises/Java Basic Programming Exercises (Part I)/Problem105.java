// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem105 {
    public static void main(String[] args) {
        int[] arr = {20, 12, 44, 18, 21, 10, 14, 10, 23, 42, 20, 12, 44};
        int group_length = 3;
        boolean res = true;
        for(int i = 0; i < group_length; i++)
        {
            if(arr[i] != arr[arr.length-group_length+i])
            {
                res = false;
                break;
            }
        }
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println(res);

    }
}