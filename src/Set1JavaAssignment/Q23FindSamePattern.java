package Set1JavaAssignment;

import java.util.Scanner;

public class Q23FindSamePattern {
	/*
	 * 23.Find if a given pattern appears in both the input strings at same
	 * postions. input1: "hh--ww--" input2: "rt--er--" output: true(false otherwise)
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first string:");
		String s1 = s.nextLine();
		System.out.println("Enter second string:");
		String s2 = s.nextLine();
		boolean flag = false;

		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == '-') // for comparing'-'
				{
					if (!(s2.charAt(i) == '-')) // if not '-'
					{
						System.out.println("false");

						break;
					} else // '-' at both strings
					{
						flag = true;
					}
				} else // compare characters
				{
					if (s2.charAt(i) == '-') // if s2 has '-'
					{
						System.out.println("false");

						break;
					} else // both string has characters
					{
						flag = true;
					}
				}
			}
			if (flag == true) {
				System.out.println("True");
			}

		} else {
			System.out.println("false");
		}

	}

}
