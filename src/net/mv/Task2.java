package net.mv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Task2 {

	public int year;
	public String m1;
	public String m2;


	public Task2(int Y, String A, String B) throws ParseException {
	    this.year = Y;
	    this.m1 = A;
	    this.m2 = B;


	    String dateOneInput = year + "-" + m1;
	    String dateTwoInput = year + "-" + m2;

	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMM");

	    //DATE 1
	    Calendar c1 = Calendar.getInstance();
	    c1.setTime(formatter.parse(dateOneInput));
	    //Get first monday of the month
	    c1.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
	    c1.set(Calendar.DAY_OF_WEEK_IN_MONTH, 1);
		LocalDate date1 = c1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	    System.out.println("Date 1 : " + c1.getTime());

		

		// DATE 2
		Calendar c2 = Calendar.getInstance();
		c2.setTime(formatter.parse(dateTwoInput));
		// Get last sunday of the month
		c2.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		c2.set(Calendar.DAY_OF_WEEK_IN_MONTH, -1);
		LocalDate date2 = c2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("Date 2 : " + c2.getTime());

		System.out.println(ChronoUnit.WEEKS.between(date1, date2));
		
	}

	public static void main(String[] args) throws ParseException {
		Task2 t = new Task2(2012, "January", "December");
	}
}
