// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem111 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, res;
        System.out.print("Enter a positive integer: ");
        num1 = input.nextInt();
        System.out.print("Enter another positive integer: ");
        num2 = input.nextInt();
        if(num1 > num2)
        {
            num1 = num1 ^ num2;
            num2 = num1 ^ num2;
            num1 = num1 ^ num2;
        }
        res = add(num1, num2);
        System.out.println("Result: " + res);
        input.close();
    }

    static int add(int n1, int n2)
    {
        while(n1 > 0)
        {
            n2++;
            n1--;
        }

        return n2;
    }
}