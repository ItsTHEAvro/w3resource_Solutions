// Author: Jyotirmoy Avro

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Problem047
{
    public static void main(String[] args)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        dateFormat.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		System.out.println("Now: " + dateFormat.format(System.currentTimeMillis()));
    }
}