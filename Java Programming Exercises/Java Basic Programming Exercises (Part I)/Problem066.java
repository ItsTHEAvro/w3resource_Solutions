// Author: Jyotirmoy Avro

public class Problem066
{
    public static void main(String[] args)
    {
        int sum = 0, counter = 0, n = 0;
        while(counter < 100)
        {
            if(isPrime(n))
            {
                sum += n;
                ++counter;
            }
            ++n;
        }
        System.out.println("Sum of the first 100 prime numbers: " + sum);
    }

    static boolean isPrime(int n)
    {
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++)
        {
            if(n % i == 0) return false;
        }
        return true;
    }
}