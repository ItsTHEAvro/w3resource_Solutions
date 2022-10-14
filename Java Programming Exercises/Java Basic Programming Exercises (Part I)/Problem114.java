// Author: Jyotirmoy Avro

public class Problem114 {
    public static void main(String[] args) {
        String str = "ABCDEF";
        int offset = 3;
        String res = str.substring(offset) + str.substring(0, offset);
        System.out.println("Original string: " + str);
        System.out.println("Rotated string: " + res);
        }
}