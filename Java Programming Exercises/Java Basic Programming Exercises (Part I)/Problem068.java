// Author: Jyotirmoy Avro

public class Problem068
{
    public static void main(String[] args)
    {
        String str = "Python 3.0";
        String newStr = str.substring(str.length()-3);
        System.out.println(newStr + newStr + newStr);
    }
}