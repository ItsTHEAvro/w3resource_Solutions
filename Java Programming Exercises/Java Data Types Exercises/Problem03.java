// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();
        int temp = num, sum = 0;
        while(temp > 0)
        {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.printf("The sum of all digits in %d is %d", num, sum);
        input.close();
    }
}