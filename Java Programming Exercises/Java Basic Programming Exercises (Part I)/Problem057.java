// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem057
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num = input.nextInt();
        int counter = 0;
        for(int i=1; i<=(int) Math.sqrt(num); i++)
        {
            if(num%i==0 && i*i!=num) counter += 2;
            else if(i*i==num) counter++;
        }
        System.out.println(counter);
        input.close();
    }
}