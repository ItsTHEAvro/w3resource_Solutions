// Author: Jyotirmoy Avro

import java.io.File;

public class Problem045 
{
    public static void main(String[] args)
    {
        System.out.println("./Problem045_abc.txt  : " + new File("Problem045_abc.txt").length() + " bytes");
        System.out.println("./Problem045_test.txt : " + new File("Problem045_test.txt").length() + " bytes");
    }
}