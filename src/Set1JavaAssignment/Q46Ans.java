package Set1JavaAssignment;

import java.util.Arrays;

import java.util.Scanner;
/*46. Retrieve the elements in a array, which is an input, which are greater
than a specific input number. Add them and find the reverse of the sum.*/

public class Q46Ans {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		int sum = 0;
		int arr[] = { 12, 10, 4, 8, 9, 5 };
		System.out.println("Array elements are:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
			if (arr[i] > num)

			{
				sum = sum + arr[i];
			}
		}
		System.out.println(" sum :" + sum);
		int reverse = 0;
		while (sum != 0) {
			int rem = sum % 10;
			reverse = reverse * 10 + rem;
			sum = sum / 10;
		}
		System.out.println(" reverse:" + reverse);

	}

}
