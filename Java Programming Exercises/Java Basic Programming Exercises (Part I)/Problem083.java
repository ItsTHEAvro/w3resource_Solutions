// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem083 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, -5, 4 };
        int[] arr2 = { 1, 4, -5, -2 };
        System.out.println("Array1: " + Arrays.toString(arr1));
        System.out.println("Array2: " + Arrays.toString(arr2));
        String str = "";
        for(int i=0; i<arr1.length; i++)
        {
            str += Integer.toString(arr1[i] * arr2[i]) + " ";
        }
        System.out.println("Result: " + str);
    }
}