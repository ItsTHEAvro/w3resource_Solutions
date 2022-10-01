// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem093 {
    public static void main(String[] args) {
        int[] arr = {10, 10, 3, 5, 2, 6, 7, 1, 20, 20};
        boolean found1010 = false, found2020 = false;
        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i] == 10 && arr[i+1] == 10) found1010 = true;
            if(arr[i] == 20 && arr[i+1] == 20) found2020 = true;
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println(found1010 != found2020);
    }
}