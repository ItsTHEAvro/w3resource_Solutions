// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        String num = input.nextLine();
        int len = num.length();
        boolean res = true;
        for(int i=0; i < len/2; i++)
        {
            if(num.charAt(i) != num.charAt(len - i -1))
            {
                res = false;
            }
        }
        System.out.printf("Is %s a palindrome number?\n", num);
        System.out.println(res);
        input.close();
    }
}