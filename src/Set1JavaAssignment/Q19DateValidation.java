package Set1JavaAssignment;

import java.util.Scanner;
/*
19.accept a string and find if it is of date format "dd/mm/yyyy".
input:01/13/2012
output:false */

class Q19DateValidation {

	static int MAX_VALID_YR = 9999;
	static int MIN_VALID_YR = 1800;

	static boolean isLeap(int year) 
	{

		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
	}

	static boolean isValidDate(int d, int m, int y) 
	{

		if (y > MAX_VALID_YR || y < MIN_VALID_YR)
			return false;
		if (m < 1 || m > 12)
			return false;
		if (d < 1 || d > 31)
			return false;

		if (m == 2) {
			if (isLeap(y))
				return (d <= 29);
			else
				return (d <= 28);
		}

		if (m == 4 || m == 6 || m == 9 || m == 11)
			
			return (d <= 30);

		return true;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a date:");
		int d = s.nextInt();
		int m = s.nextInt();
		int y = s.nextInt();
		if (isValidDate(d, m, y))
			System.out.println("This is a valid date");
		else
			System.out.println("Invalid date");

	}
}