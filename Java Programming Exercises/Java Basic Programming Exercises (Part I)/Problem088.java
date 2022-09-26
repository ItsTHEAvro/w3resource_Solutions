// Author: Jyotirmoy Avro

public class Problem088 {
    public static void main(String[] args) {
        System.out.println("\nCurrent system environment:");
        System.getenv().forEach((key, value) -> System.out.println(key + ": " + value));
        // System.out.println(System.getenv());
        
        System.out.println("\n\nCurrent system properties:");
        System.getProperties().forEach((key, value) -> System.out.println(key + ": " + value));
        // System.out.println(System.getProperties());
    }
}