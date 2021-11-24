package Set2JavaAssignments;

import java.util.Scanner;
//22)no of days in a month in specific year
public class Q22DaysInaMonth {

	public static void main(String[] args) {
		int daysinamonth = 0;
		String NameofMonth = "";

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a month number:");
		int month = s.nextInt();
		System.out.println("Enter a year:");
		int year = s.nextInt();

		switch (month) {
		case 1:
			NameofMonth = "January";
			daysinamonth = 31;
			break;
		case 2:
			NameofMonth = "February";
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 100)) {
				daysinamonth = 29;
			} else
				daysinamonth = 28;

			break;
		case 3:
			NameofMonth = "March";
			daysinamonth = 31;
			break;
		case 4:
			NameofMonth = "April";
			daysinamonth = 30;
			break;
		case 5:
			NameofMonth = "May";
			daysinamonth = 31;
			break;
		case 6:
			NameofMonth = "June";
			daysinamonth = 30;
			break;
		case 7:
			NameofMonth = "July";
			daysinamonth = 31;
			break;
		case 8:
			NameofMonth = "August";
			daysinamonth = 31;
			break;
		case 9:
			NameofMonth = "September";
			daysinamonth = 31;
			break;
		case 10:
			NameofMonth = "October";
			daysinamonth = 31;
			break;
		case 11:
			NameofMonth = "November";
			daysinamonth = 30;
			break;
		case 12:
			NameofMonth = "December";
			daysinamonth = 31;
			break;

		}
		System.out.println(NameofMonth + " " + year + " has " + daysinamonth + " days");
	}

}
