package Assignment2;

import java.util.Scanner;
/* 1. A number is given as input. Find the odd digits in the number, add them and find if the sum is odd or not.if even return -1, if odd return 1
input:52315
logic:5+3+1+5=14(even)
output:-1
input:1112
logic:1+1+1=3(odd)
output:1*/

public class AddOddNumbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number:");
		int a = s.nextInt();

		int sum = 0;
		while(a > 0) {
			int rem = a % 10;
			if (rem % 2 == 1) {
				sum = sum + rem;
			}
			a = a / 10;
		}

		if (sum % 2 == 0) {
			System.out.println("sum of odd digits is even which is:" + sum + "\nreturn -1");
		} else {
			System.out.println("sum of odd digits is odd which is:" + sum + "\nreturn 1");
		}

	}

}
