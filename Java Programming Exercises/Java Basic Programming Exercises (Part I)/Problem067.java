// Author: Jyotirmoy Avro

public class Problem067
{
    public static void main(String[] args)
    {
        String str = "Python 3.0";
        String word = "Tutorial";
        str = str.substring(0, 7) + word + str.substring(6);
        System.out.println(str);
    }
}