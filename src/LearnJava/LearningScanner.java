package LearnJava;

import java.util.Scanner;

public class LearningScanner {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("enter 1st number--");
		int a = s.nextInt();

		System.out.println("enter 2nd number--");
		int b = s.nextInt();
		LearningScanner obj = new LearningScanner();
		obj.add(a, b);

	}

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Addition of two numbers is--" + c);

	}
}
