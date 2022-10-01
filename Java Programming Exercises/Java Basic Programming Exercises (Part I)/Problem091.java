// Author: Jyotirmoy Avro

public class Problem091 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println("First 50 odd numbers are: ");
        for(int i = 1; i<=100; i+=2)
        {
            System.out.println(i);
        }
        long time = System.nanoTime() - start;
        System.out.println("Time taken: " + time + " nanoseconds.");
    }
}