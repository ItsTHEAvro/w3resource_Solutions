// Author: Jyotirmoy Avro

public class Problem12 {
    public static void main(String[] args) {
        int num1 = Integer.MIN_VALUE;
		int num2 = Integer.MAX_VALUE;
		System.out.println("Signed integers: " + num1 + ", " + num2);

		System.out.println("-----------------------------------------");
		System.out.println("Result of comparing signed numbers: " + Integer.compare(num1, num2));
        System.out.println("Result of comparing unsigned numbers: " + Integer.compareUnsigned(num1, num2));
    }
}