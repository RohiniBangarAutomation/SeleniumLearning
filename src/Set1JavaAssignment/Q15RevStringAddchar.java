package Set1JavaAssignment;
/* Set 1-15. Get a input string. reverse it and parse it with '-'.
input:computer
output:r-e-t-u-p-m-o-c */
public class Q15RevStringAddchar {

	public static void main(String[] args) {
		String s = "computer", fin = "", rev = "";
		char temp = 0;
		int len = s.length();
		for (int i = len - 1; i >= 0; i--) {
			if (i == 0) {
				temp = s.charAt(i);
				fin = fin + temp;

			} else {
				temp = s.charAt(i);
				fin = fin + temp + "-";
			}
			rev=rev+s.charAt(i);

		}
		System.out.println(rev);
		System.out.println(fin);

	}

}
