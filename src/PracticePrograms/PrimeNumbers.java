package PracticePrograms;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String arg[]) {
		int count;
		System.out.print("Enter n value : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Prime numbers between 1 to " + n + " are ");
		for (int i = 2; i <= n; i++)
		{
			count = 0;
			for (int j = 1; j <= i; j++) 
			{
				if (i % j == 0) 
				{
					count++;
				}
			}
			if (count == 2)
				System.out.print(i + "  ");
			
		}
		
	}

}
