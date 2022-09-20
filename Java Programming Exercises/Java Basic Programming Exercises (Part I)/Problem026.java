// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem026
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        String oct = input.nextLine();
        int[] octVal = {0, 1, 10, 11, 100, 101, 110, 111};
        System.out.print("Equivalent binary number: ");
        for(int i=0; i<oct.length(); i++)
        {
            System.out.print(octVal[oct.charAt(i)-'0']);
        }
        System.out.println();
        input.close();
    }
}