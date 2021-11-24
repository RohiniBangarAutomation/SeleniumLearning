package Assignments;

import java.util.Scanner;

public class addsubtract {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=s.nextInt();
		for(int i=0;i<=n;i++) 
		{
			if(i%2==0)
			{
				System.out.println("even numbers are:"+i);
			}
			else
				System.out.println("odd numbers are:"+i);
			
		}
	}

}
