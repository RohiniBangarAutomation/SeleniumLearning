package Set1JavaAssignment;

import java.util.Scanner;

public class Q7addsubtract {
	/*
	 * 7. Retrieve the odd numbers till given input number. add and subtract it
	 * consecutively and return the result. Input:9 Output:1+3-5+7-9=-3
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = s.nextInt();
		int sum = 0, sub = 0;
		int flag = 1;
		int flag1 = 0;
		int result = 0;
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 1) {
				System.out.print(" " + i);
				if (flag1 == 0) {
					result = i;
					flag1 = 1;

		} else {
					if (flag == 1) {
					result = result + i;
						flag = 0;

					} else {
						result = result - i;
						flag = 1;
					}
				}

			}

		}
		System.out.println(" result: " + result);

	}

}
