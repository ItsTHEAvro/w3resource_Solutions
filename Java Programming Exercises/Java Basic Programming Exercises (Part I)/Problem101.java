// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem101 {
    public static void main(String[] args) {
        int[] arr = {20, 21, 10, 14, 10, 42, 15, 87};
        int count10 = 0, count20 = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 10) ++count10;
            if(arr[i] == 20) ++count20;
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println(String.valueOf(count10 > count20));
    }
}