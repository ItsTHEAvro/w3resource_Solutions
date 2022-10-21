// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        System.out.printf("Square root of %d is %d\n", num, sqrt(num));
        input.close();
    }

    static int sqrt(int num)
    {
        if (num <= 1) return num;
        int start = 0, end = num/2, ans = 0;
        while(start <= end)
        {
            int mid = (start + end)/2;
            if(mid*mid == num) return (int) mid;
            if(mid*mid < num) 
            {
                start = mid + 1;
                ans = mid;
            }
            else end = mid - 1;
        }
        return ans;
    }
}