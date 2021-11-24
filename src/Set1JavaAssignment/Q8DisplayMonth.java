package Set1JavaAssignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//import sun.util.calendar.BaseCalendar.Date;

/*8. Given date in dd-MM-yyyy format.return the month in full name format(January)
input:"23-01-2012"
output:January*/


public class Q8DisplayMonth {

	public static void main(String[] args) throws ParseException {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a date:");
		String s1 = s.nextLine();
		System.out.println(getmonth(s1));

	}

	private static String getmonth(String s1) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
     	SimpleDateFormat sdf1 = new SimpleDateFormat("MMMM");//why M capital
		Date d = sdf.parse(s1);
		String s = sdf1.format(d);
		return s.toUpperCase();
	}

}
