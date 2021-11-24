package Set1JavaAssignment;

import java.util.Scanner;

/*6. Sum of fibonaaci series upto given input.
sum of first 3 
logic:1+1+2
output:4*/
public class Q6Fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number:");
		int n = s.nextInt();

		int prev_no = 0, next_no = 1, sum = 0;

		System.out.print("\nFibonacci series of " + n + " terms:");

		for (int i = 1; i <= n; i++) {
			System.out.print(prev_no + "  ");

			sum = prev_no + next_no; // 0+1 //1+1
			prev_no = next_no; // nn=1
			next_no = sum;
		}
	}

}
