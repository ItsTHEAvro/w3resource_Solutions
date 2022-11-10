// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem01 {
    public static void main(String[] args) {
        int[] arr1 = { 56, 83, 23, 42, 43, 52, 5, 7, 78 };
        System.out.println("Original array:\n" + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("Sorted array: \n" + Arrays.toString(arr1));

        System.out.println();

        String[] arr2 = { "Java", "PHP", "Python", "C++", "C#", "C", "Perl", "Kotlin" };
        System.out.println("Original array:\n" + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Sorted array:\n" + Arrays.toString(arr2));
    }
}