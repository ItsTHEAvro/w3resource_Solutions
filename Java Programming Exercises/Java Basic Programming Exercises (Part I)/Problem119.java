// Author: Jyotirmoy Avro

import java.util.Arrays;
import java.util.Scanner;

public class Problem119 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input element count: ");
        int count = input.nextInt();
        System.out.println("\nInput array elements");
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Input next element: ");
            arr[i] = input.nextInt();
        }
        System.out.print("Input element to search for: ");
        int num = input.nextInt();
        System.out.println("\nOriginal array: " + Arrays.toString(arr));
        System.out.printf("Index of %d is: %d", num, search(arr, count, num));
        input.close();
    }

    static int search(int[] arr, int len, int target)
    {
        int lower = 0, upper = len - 1, index = -1;
        while(lower <= upper)
        {
            int mid = (lower + upper) >> 1;
            if (arr[mid] == target) index = mid;
            if (arr[mid] < target) upper = mid - 1;
            else lower = mid + 1;
        }
        return index;
    }
}