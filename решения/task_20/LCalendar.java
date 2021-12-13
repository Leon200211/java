package task_20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LCalendar{
    long getMillisecondsFromDateStr(String dateStr)
    {
        long millis = -1;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try{
            Date date = sdf.parse(dateStr);
            millis = date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return millis;
    }

    Calendar build(String dateStr)
    {
        Calendar calendar = Calendar.getInstance();

        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            calendar.setTime(sdf.parse(dateStr));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return calendar;
    }
}