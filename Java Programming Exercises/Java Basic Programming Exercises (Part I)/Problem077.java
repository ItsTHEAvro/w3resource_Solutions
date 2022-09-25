// Author: Jyotirmoy Avro

import java.util.Arrays;
import java.util.Scanner;

public class Problem077 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nInput 1st array elements (3)");
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Input next element: ");
            arr1[i] = input.nextInt();
        }
        System.out.println("\nInput 2nd array elements (3)");
        int[] arr2 = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Input next element: ");
            arr2[i] = input.nextInt();
        }
        
        int[] arr = new int[2];
        arr[0] = arr1[0];
        arr[1] = arr2[2];

        System.out.println("Array1: " + Arrays.toString(arr1));
        System.out.println("Array2: " + Arrays.toString(arr2));
        System.out.println("New Array: " + Arrays.toString(arr));

        input.close();
    }
}