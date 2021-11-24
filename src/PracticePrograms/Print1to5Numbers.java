package PracticePrograms;

import java.util.Scanner;

public class Print1to5Numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows= s.nextInt();
		System.out.println("Number Pattern is as below:");
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  "+j);

			}
			System.out.println();
		}
	}
}
