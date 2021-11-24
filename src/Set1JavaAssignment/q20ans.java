package Set1JavaAssignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class q20ans {

//		Get a integer array as input. Find the average of the elements which are in the position of prime index
//		input:{1,2,3,4,5,6,7,8,9,10}
	// 0 1 2 3 4 5 6 7 8 9
//		logic:3+4+6+8(the indeces are prime numbers)
//		output:21
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements you want to enter:");
		int n = sc.nextInt();
		int[] a = new int[20];
		int sum = 0;
		boolean flag = true;
		System.out.println("Enter elements of array:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
		System.out.print("Array elements are:");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + a[i]);

		}
		for (int i = 2; i < a.length; i++) 
		{
			
			for (int j = 2; j < i; j++) 
			{
				if (i % j == 0) 
				{

					flag = false;
					break;
				}
			}
			if (flag == true) 
			{
				sum = sum + a[i];
			}
			flag = true;
		}
		System.out.println("\nsum:" + sum);

	}

}
