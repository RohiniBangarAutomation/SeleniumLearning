package Set2JavaAssignments;
//20) for the given string display the middle 2 value, case satisfies only if string is of even length
//ip - java
//op - av

import java.util.Scanner;

public class Q20StringMiddleChar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = s.next();
		Q20StringMiddleChar sm = new Q20StringMiddleChar();
		sm.getMiddleChar(str);

	}

	private void getMiddleChar(String str) {
		StringBuffer sb = new StringBuffer();
		int middle = str.length() / 2;
		if (str.length() % 2 == 0) {
			sb.append(str.substring(middle - 1, middle + 1));
			System.out.println(sb.toString());
		} else
			System.out.println("String is of odd length");

	}

}
