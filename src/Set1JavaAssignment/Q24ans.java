package Set1JavaAssignment;

import java.util.Scanner;

public class Q24ans {

	public static void main(String[] args) {
//		Input a int array. Square the elements in even position and cube the elements in odd position and add them as result.
//		input: {1,2,3,4}
//		output: 1^3+2^2+3^3+4^2

		Scanner s=new Scanner(System.in);
		System.out.println("enter number:");
		int n=s.nextInt();
		int i,sum=0,sum1=0;
		int[] arr=new int[n];
		System.out.println("enter array elements:");
		for(i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("sum of square\tsum of cube");
		for(i=0;i<n;i++)
		{
		if(i%2==0)
		{
			sum=sum+(arr[i]*arr[i]);
		}
		if(i%2==1)
		{
			sum1=sum1+(arr[i]*arr[i]*arr[i]);
		}
		}
		System.out.println(" \t "+sum+" \t "+sum1);
	}

}
