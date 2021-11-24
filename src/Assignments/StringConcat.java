package Assignments;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		String s3 = "";
		String s4 = "";

		int a = 0, b = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the 1st string:");
		String s1 = s.nextLine();
		System.out.println("enter the 2st string:");
		String s2 = s.nextLine();
		if (s1.length() == s2.length()) {
			s3 = s1 + s2;
			System.out.println("Concatination of given strings:" + s3);
		} else if (s1.length() > s2.length()) {
			// s4=s1-s2;
			System.out.println(a);
			System.out.println("string 1 is of extra length");
			// b=s1.length()-a;
			if ((s1.length() - a) == s2.length()) {

				s3 = s1 + s2;
				System.out.println(s3);
			}
		}

	}

}
