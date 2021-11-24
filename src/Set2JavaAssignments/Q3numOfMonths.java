package Set2JavaAssignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//3)  months between two dates
public class Q3numOfMonths {
	public static void main(String[] args) throws ParseException {
		String s1 = "30/05/2012";
		String s2 = "01/06/2013";
		

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse(s1);
		Date d2 = sdf.parse(s2);
		Calendar cal = Calendar.getInstance();

		cal.setTime(d1);
		int months1 = cal.get(Calendar.MONTH);
		int year1 = cal.get(Calendar.YEAR);
		cal.setTime(d2);
		int months2 = cal.get(Calendar.MONTH);
		int year2 = cal.get(Calendar.YEAR);
		int n = ((year2 - year1) * 12) + (months2 - months1);
		System.out.println("Number of months between given dates are:"+n);
	}
}
