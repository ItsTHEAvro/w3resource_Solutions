// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem078 {
    public static void main(String[] args) {
        int[] arr = {5, 7};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println(arr[0] == 4 || arr[0] == 7 || arr[1] == 4 || arr[1] == 7);
    }
}