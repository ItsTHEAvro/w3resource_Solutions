// Author: Jyotirmoy Avro

import java.util.Arrays;

public class Problem113 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9, 11, 12, 14};
        int[] arr2 = {2, 4, 6, 8, 10, 13};
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Merged Array: " + Arrays.toString(mergeArray(arr1, arr2)));
    }

static int[] mergeArray(int[] arr1, int[] arr2) {

		int n = arr1.length, m = arr2.length;
	
        int[] mergedArr = new int[n + m];
		
		int arr1Index = 0, arr2Index = 0, mergedArrIdx = 0;
		
        while (arr1Index < n && arr2Index < m) {
			if (arr1[arr1Index] < arr2[arr2Index]) {
				mergedArr[mergedArrIdx++] = arr1[arr1Index++];
			} else {
				mergedArr[mergedArrIdx++] = arr2[arr2Index++];
			}
		}
		
        while (arr1Index < n) {
			mergedArr[mergedArrIdx++] = arr1[arr1Index++];
		}

		while (arr2Index < m) {
			mergedArr[mergedArrIdx++] = arr2[arr2Index++];
		}

		return mergedArr;
	}
}