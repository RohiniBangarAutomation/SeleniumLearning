package Set1JavaAssignment;

import java.util.Scanner;

/*17. A integer input is accepted. find the square of individual digits and find their sum.
input:125
output:1*1+2*2+5*5*/
public class Q17IntSquare {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = s.nextInt();

		int rem = 0;
		int sum = 0;
		while (a > 0) {
			rem = a % 10;
			sum = sum + (rem * rem);
			a = a / 10;
		}
		System.out.println(sum);

	}

}
