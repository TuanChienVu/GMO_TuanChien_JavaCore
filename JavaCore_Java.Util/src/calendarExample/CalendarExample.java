package calendarExample;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {

	public static void main(String[] args) {
//		Create calendar instance
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		
//		get time date
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int millis = calendar.get(Calendar.MILLISECOND);
		int hour12 = calendar.get(Calendar.AM_PM);
		int GMT = calendar.get(Calendar.ZONE_OFFSET);
		
//		get current TimeZone
		TimeZone timeZone = calendar.getTimeZone();
		
		System.out.println("Year: " + year);
	    System.out.println("Month: " + (month+1));
	    System.out.println("Day: " + day);
	    System.out.println("Hour: " + hour);
	    System.out.println("Minute: " + minute);
	    System.out.println("Second: " + second);
	    System.out.println("Milli Second: " + millis);
	    System.out.println("AM/ PM: " + hour12);
	    System.out.println("GMT: " + GMT);
	    System.out.println("Current week of this month: " + calendar.get(Calendar.WEEK_OF_MONTH));
	    System.out.println("Current week of this year: " + calendar.get(Calendar.WEEK_OF_YEAR));
	    System.out.println("Current TimeZone is : " + timeZone.getDisplayName());
	    System.out.println(hour + ":" + minute + ":" + second + ":" + millis + "," + day + "/" + (month+1) + "/" + year);
	    
	}

}
