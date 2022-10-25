// Author: Jyotirmoy Avro

public class Problem11 {
    public static void main(String[] args) {
        double dn1 = 0.000213456321d;
        double dn2 = dn1 / 0;
        double dn3 = Double.POSITIVE_INFINITY * 0;
        
        System.out.println("\nFinite doubles\n--------------");
        System.out.println("Is " + dn1 + " is finite? " + Double.isFinite(dn1));
        System.out.println("Is " + dn2 + " (dn1/0) is finite? " + Double.isFinite(dn2));
        System.out.println("Is " + dn3 + " is finite? " + Double.isFinite(dn3));

        float fn1 = 5.3f;
        float fn2 = fn1 / 0;
        float fn3 = 0f / 0f;
        System.out.println("\n\nFinite floats\n-------------");
        System.out.println("Is " + fn1 + " is finite? " + Float.isFinite(fn1));
        System.out.println("Is " + fn2 + " (fn1/0) is finite? " + Float.isFinite(fn2));
        System.out.println("Is " + fn3 + " is finite? " + Float.isFinite(fn3));
    }
}