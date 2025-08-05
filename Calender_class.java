package type_conversion;

import java.util.Calendar;
import java.util.Date;

public class Calender_class {
	public static void main(String args[]) {
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		System.out.printf("The date is: " + d);

		c.set(2025, Calendar.JULY, 23); // Use Calendar.JULY, not c.JULY

		int year = c.getWeekYear();
		System.out.printf("\nThe year is: " + year);

		int h = c.getFirstDayOfWeek();
		System.out.printf("\nThe first day of the week is: " + h);

		System.out.println("\nDay of week: " + c.get(Calendar.DAY_OF_WEEK));
		System.out.println("Day of year: " + c.get(Calendar.DAY_OF_YEAR));
		System.out.println("Week in month: " + c.get(Calendar.WEEK_OF_MONTH));
		System.out.println("Week in year: " + c.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Day of week in month: " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("Hour: " + c.get(Calendar.HOUR));
		System.out.println("Minute: " + c.get(Calendar.MINUTE));
		System.out.println("Second: " + c.get(Calendar.SECOND));
		System.out.println("AM or PM: " + c.get(Calendar.AM_PM));
		System.out.println("Hour(24-hr clock): " + c.get(Calendar.HOUR_OF_DAY));
	}
}