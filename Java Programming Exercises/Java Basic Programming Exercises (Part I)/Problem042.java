// Author: Jyotirmoy Avro

import java.io.Console;

public class Problem042
{
    public static void main(String[] args)
    {
        Console con = System.console();
        System.out.print("Input your password: ");
        char[] ch = con.readPassword();
        String password = String.valueOf(ch);
        System.out.println("Your password was: " + password);
    }
}