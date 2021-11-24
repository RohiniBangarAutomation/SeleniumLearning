package Set1JavaAssignment;

import java.util.Scanner;

/*45. Retrieve the non-prime numbers within the range of a given input. Add-up the non-prime numbers
 *  and return the result.
 */

public class primeno {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a no:");
		int n = s.nextInt();
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {

				flag = false;

				System.out.println("not a primeno");

				break;

			}

		}
		if (flag == true) {
			System.out.println("prime no");
		}

	}
}
