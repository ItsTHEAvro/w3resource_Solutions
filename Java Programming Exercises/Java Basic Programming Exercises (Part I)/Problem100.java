// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem100 {
    public static void main(String[] args) {
        int[] arr1 = {20, 21, 10, 14, 42, 15, 87};
        int[] arr2 = {18, 20, 11, 20, 40, 16, 88};
        int count = 0;
        for(int i = 0; i < arr1.length - 1; i++)
        {
            if(arr1[i] != arr2[i] && Math.abs(arr1[i]-arr2[i]) <= 1) count++;
        }
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Count: " + count);
    }
}