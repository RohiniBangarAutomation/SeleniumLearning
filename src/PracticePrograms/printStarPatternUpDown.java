package PracticePrograms;

import java.util.Scanner;

public class printStarPatternUpDown {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of rows:");
		int rows=s.nextInt();
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=rows;j>=i;j--)
			{
				System.out.print("  "+j);//for * print * instead oj +j
			}
			System.out.println();
		}
		}

	}


