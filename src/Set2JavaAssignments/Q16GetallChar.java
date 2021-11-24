package Set2JavaAssignments;

public class Q16GetallChar {
	// 16)Get all the numbers alone from the string and return the sum.

	// Input"123gif"
	// Output:6

	public static void main(String[] args) {
		String s = "1234gif";

		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				String s1 = String.valueOf(c);
				sum = sum + Integer.parseInt(s1);
			}
		}
		System.out.println("Sum of numbers from string:" + sum);
	}

}
