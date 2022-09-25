// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem079 {
    public static void main(String[] args) {
        int[] arr = { 20, 30, 40 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        int[] new_arr = { arr[1], arr[2], arr[0] };
        System.out.println("Rotated Array: " + Arrays.toString(new_arr));
    }
}