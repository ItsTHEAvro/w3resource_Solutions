// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem092 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 6, 7, 1, 10};
        int even = 0, odd = 0;
        for(int num : arr)
        {
            if(num % 2 == 0) ++even;
            else ++odd;
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Number of even elements: " + even);
        System.out.println("Number of odd elements: " + odd);
    }
}