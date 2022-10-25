// Author: Jyotirmoy Avro

public class Problem13 {
    public static void main(String[] args) {
        int num1 = -1234;
        int num2 = 56;
        System.out.println("Floor division using '/' operator: " + (num1 / num2));
        System.out.println("Floor division using floorDiv() method is: " + Math.floorDiv(num1, num2));
        
        System.out.println();
        
        System.out.println("Floor modulus using '%' operator: " + (num1 % num2));
        System.out.println("Floor modulus using floorMod() method is: " + Math.floorMod(num1, num2));
    }
}