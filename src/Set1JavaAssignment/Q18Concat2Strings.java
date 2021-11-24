package Set1JavaAssignment;

import java.util.Scanner;

public class Q18Concat2Strings {
	/*
	 * 18.Two input strings are accepted. If the two strings are of same length
	 * concat them and return, if they are not of same length, reduce the longer
	 * string to size of smaller one, and concat them input1:"hello" input2:"hi"
	 * output:"lohi" input1:"aaa" input2:"bbb" output:"aaabbb"
	 */

	public static void main(String[] args) {
		String result = "";
		String fin = "";
		String s3 = "";
		// int diff=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first string:");
		String s1 = s.nextLine();
		System.out.println("Enter second string:");
		String s2 = s.nextLine();
		int l1 = s1.length();
		int l2 = s2.length();
		if (s1.length() == s2.length()) {
			result = s1 + s2;
			System.out.println("concatenated string:" + result);
		} else if (s1.length() > s2.length()) {
			for (int i = l1 - l2; i < l1; i++) {
				s3 = s3 + s1.charAt(i);

			}
			fin = s3 + s2;
			System.out.println("Reduced string:" + s3);
			System.out.println("concat of strings:" + fin);
		} else if (s2.length() > s1.length()) {
			for (int i = l2 - l1; i < l2; i++) {
				s3 = s3 + s2.charAt(i);

			}
			fin = s1 + s3;
			System.out.println("Reduced string:" + s3);
			System.out.println("concat of strings:" + fin);
		}

	}

}
