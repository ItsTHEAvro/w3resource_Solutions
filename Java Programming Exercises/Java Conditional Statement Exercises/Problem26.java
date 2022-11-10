// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number: ");
        int n = input.nextInt();

        int count = 1, spaceCount = 1;
        char ch = 'A';

        for (int i = 1; i < n * 2; i++) {
            for (int space = n - spaceCount; space > 0; space--) {
                System.out.print(" ");
            }

            if (i < n) {
                spaceCount++;
            } else {
                spaceCount--;
            }

            for (int j = 0; j < count; j++) {
                System.out.print(ch);
                if (j < count / 2)
                    ch++;
                else
                    ch--;
            }

            if (i < n)
                count += 2;
            else
                count -= 2;

            ch = 'A';
            System.out.println();
        }
        input.close();
    }
}
