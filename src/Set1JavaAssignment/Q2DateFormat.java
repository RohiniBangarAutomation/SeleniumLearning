package Set1JavaAssignment;

import java.util.Calendar;
import java.util.Scanner;

/* 2.Find the day(Friday) of a date input given as MM-dd-yyyy (format)
input:12-27-2012
output:Thursday*/

public class Q2DateFormat {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter month day and year:");
		String month = s.next();
		String day = s.next();
		String year = s.next();

		Calendar c = Calendar.getInstance();
		c.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
		String dayofweek = getdayofweek(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(dayofweek);
	}

	private static String getdayofweek(int value) {
		String day = "";
		switch (value) {
		case 1:
			day = "sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednsday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "saturday";
			break;

		}
		return day;

	}

}
