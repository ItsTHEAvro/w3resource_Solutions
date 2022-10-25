// Author: Jyotirmoy Avro

import java.math.BigInteger;

public class Problem14 {
    public static void main(String[] args) {
        BigInteger bigVal = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println("BigInteger value: " + bigVal);
        
        System.out.println("BigInteger to byte: " + bigVal.byteValue());
        System.out.println("BigInteger to short: " + bigVal.shortValue());
        System.out.println("BigInteger to int: " + bigVal.intValue());
        System.out.println("BigInteger to long: " + bigVal.longValue());
        System.out.println("BigInteger to float: " + bigVal.floatValue());
        System.out.println("BigInteger to double: " + bigVal.doubleValue());        
    }
}