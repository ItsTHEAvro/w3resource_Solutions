// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem075
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input element count: ");
        int count = input.nextInt();
        if(count < 2)
        {
            System.out.println("The length of the array must be greater than or equal to 2.");
        }
        else
        {
            System.out.println("\nInput array elements");
            int[] arr = new int[count];
            for(int i=0; i<count; i++)
            {
                System.out.print("Input next element: ");
                arr[i] = input.nextInt();
            }
            System.out.println((arr[0]) == arr[arr.length - 1]);
        }
        input.close();
    }
}