package Set1JavaAssignment;

import java.util.Scanner;

public class Q27CheckNegativeNumber {
	/*
	 * 27. Get a input string. Find if it is a negative number, if true return the
	 * absolute value, in other cases return -1. input: "-123" output: 123 input:
	 * "@123" output: -1
	 */

	public static int negativeString(String str) {
		int n1 = 0;
		if (str.startsWith("-")) {
			int num = Integer.parseInt(str);
			if (num < 0)
				n1 = Math.abs(num);
		} else
			n1 = -1;
		return n1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		String str = s.next();
		System.out.println(negativeString(str));
	}

}
