// Author: Jyotirmoy Avro

import java.util.Scanner;

public class Problem055
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input seconds: ");
        long seconds = input.nextLong();
        long sec = seconds % 60;
        long mins = seconds / 60;
        long hours = mins / 60;
        mins = mins % 60;
        System.out.println(hours + ":" + mins + ":" + sec);
        input.close();
    }
}