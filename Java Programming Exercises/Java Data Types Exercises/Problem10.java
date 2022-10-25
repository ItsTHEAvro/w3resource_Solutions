// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input six non-negative digits: ");
        int num = input.nextInt();

        System.out.print(num / 100000 + " ");
        num %= 100000;        

        System.out.print(num / 10000 + " ");
        num %= 10000;

        System.out.print(num / 1000 + " ");
        num %= 1000;

        System.out.print(num / 100 + " ");
        num %= 100;

        System.out.print(num / 10 + " ");
        num %= 10;

        System.out.print(num);

        input.close();
    }
}