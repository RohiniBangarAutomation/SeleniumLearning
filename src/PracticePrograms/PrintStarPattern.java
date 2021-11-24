package PracticePrograms;

import java.util.Scanner;

public class PrintStarPattern {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter no.of rows:");
	int rows=s.nextInt();
	
	for(int i=1;i<=rows;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
	}

}
