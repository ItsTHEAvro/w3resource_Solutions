// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number: ");
        int n = input.nextInt();

        int count = 1, spaceCount = 1, start = 0;

        for (int i = 1; i < n * 2; i++) {
            for (int space = n - spaceCount; space > 0; space--) {
                System.out.print(" ");
            }

            if (i < n) {
                start = i;
                spaceCount++;
            } else {
                start = 2 * n - i;
                spaceCount--;
            }

            for (int j = 0; j < count; j++) {
                System.out.print(start);
                if (j < count / 2)
                    start--;
                else
                    start++;
            }

            if (i < n)
                count += 2;
            else
                count -= 2;
            System.out.println();
        }

        input.close();
    }
}
