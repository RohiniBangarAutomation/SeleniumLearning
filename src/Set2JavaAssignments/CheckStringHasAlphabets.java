package Set2JavaAssignments;

import java.util.Scanner;

public class CheckStringHasAlphabets {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = s.next();

		if (str.matches("[a-zA-Z]+")) {
			System.out.println("string has only alphabets");
		} else {
			System.out.println("string has other characters than alphabets");
		}

	}

}
