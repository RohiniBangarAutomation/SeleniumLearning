package PracticePrograms;

import java.util.Scanner;

public class CheckIfNoisPrime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=s.nextInt();
		primecal(num);
		

	}

	private static void primecal(int num) {
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println(num+" is a Prime number");
		else
			System.out.println("not prime number");
		
	}

}
