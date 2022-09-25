// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem076
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input 1st array element count: ");
        int count1 = input.nextInt();
        System.out.print("Input 2nd array element count: ");
        int count2 = input.nextInt();
        if(count1 < 2 || count2 < 2)
        {
            System.out.println("The length of the array must be greater than or equal to 2.");
        }
        else
        {
            System.out.println("\nInput 1st array elements");
            int[] arr1 = new int[count1];
            for(int i=0; i<count1; i++)
            {
                System.out.print("Input next element: ");
                arr1[i] = input.nextInt();
            }
            System.out.println("\nInput 2nd array elements");
            int[] arr2 = new int[count2];
            for(int i=0; i<count2; i++)
            {
                System.out.print("Input next element: ");
                arr2[i] = input.nextInt();
            }

            System.out.println(arr1[0] == arr2[0] || arr1[arr1.length-1] == arr2[arr2.length-1]);
        }
        input.close();
    }
}