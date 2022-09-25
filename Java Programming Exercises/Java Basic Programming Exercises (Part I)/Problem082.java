// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem082 {
    public static void main(String[] args) {
        int[] arr = { 20, 30, 40, 50, 67 };
        System.out.println("Original array: " + Arrays.toString(arr));
        int maxElem = max(arr[0],max(arr[arr.length-1], arr[arr.length/2]));
        System.out.println("Largest element between first, last, and middle values: " + maxElem);
    }

    public static int max(int a, int b)
    {
        return ((a > b) ? a : b);
    }
}