package PracticePrograms;

import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
