// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem044
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = input.nextInt();
        System.out.printf("%d + %d%d + %d%d%d = %d\n", n, n, n, n, n, n, (n+((n*10)+n)+((n*100)+(n*10)+n)));
        input.close();
    }
}