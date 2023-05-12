package calender.date.format;

import java.util.Calendar;
import java.util.Date;

public class Date_after_30 {

	public static void main(String[] args) {

		Date today = new Date();

		Calendar cal = Calendar.getInstance();

		cal.setTime(today);

		cal.add(Calendar.DATE, 30);  // date after 30 days
		
		System.out.println(cal.getTime());
	}
}
