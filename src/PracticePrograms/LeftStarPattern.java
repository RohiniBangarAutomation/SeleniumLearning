package PracticePrograms;

import java.util.Scanner;

public class LeftStarPattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of rows:");
		int rows=s.nextInt();
		for(int i=0;i<rows;i++)
		{
			for(int j=rows-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
