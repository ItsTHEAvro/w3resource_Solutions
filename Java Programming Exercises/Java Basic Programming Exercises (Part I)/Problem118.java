// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem118 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str, target;
        System.out.print("Enter a string: ");
        str = input.nextLine();
        System.out.print("Enter string to search for: ");
        target = input.nextLine();
        System.out.printf(String.valueOf(strStr(str, target)));
        input.close();
    }

    static int strStr(String source, String target) {
        if (source == null || target == null)
            return -1;
        if (target.equals("") || target.equals(source))
            return 0;

        int i = 0;
        int last = source.length() - target.length() + 1;

        while (i < last) {
            if (source.charAt(i) == target.charAt(0)) {
                boolean equal = true;
                for (int j = 0; j < target.length() && equal; ++j) {
                    if (source.charAt(i + j) != target.charAt(j))
                        equal = false;
                }

                if (equal)
                    return i;

            }
            ++i;

        }
        return -1;
    }
}