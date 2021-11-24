package Set1JavaAssignment;

import java.util.Scanner;

public class Q13PalindromeExamp {

	public static void main(String[] args) {

//		13.Retrieve the palindorme-true number set from given number limit and return the sum
//		input1:90 input2:120
//		logic:99+101+111
//		output:311
		Scanner s = new Scanner(System.in);
		System.out.println("Enter start number:");
		int start = s.nextInt();
		System.out.println("Enter end number:");
		int end = s.nextInt();
		if (start > end) {
			System.out.println("Start number should be smaller than end number");

		} else {
			int sum = 0, total = 0;
			boolean flag = false;
			System.out.println("Palinrome numbers are:");
			for (int i = start; i <= end; i++) {
				int n = i;
				while (n > 0) {
					int rem = n % 10;
					sum = (sum * 10) + rem;
					n = n / 10;

				}
				if (i == sum) {
					flag = true;
					System.out.println(" " + i);
					total = total + sum;
			
				}
				sum = 0;

			}
			if (flag == true) {
				System.out.print("Sum of palindrome numbers:" + total);
			} else {
				System.out.println("there is no palindrome numbers");
			}
		}

	}
}
