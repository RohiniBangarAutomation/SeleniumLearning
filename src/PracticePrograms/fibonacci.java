package PracticePrograms;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbet till you want to print fibonacci series:");
		int n=s.nextInt();
		
		int pre_no=0,next_no=1;
		int sum=0;
		System.out.println("fibonacci series of "+n+" terms:");
		for(int i=1;i<=n;i++)
		{
			System.out.print(" "+pre_no);
			sum=pre_no+next_no;
			pre_no=next_no;
			next_no=sum;
			
		}
		//System.out.println(sum);

	}

}
