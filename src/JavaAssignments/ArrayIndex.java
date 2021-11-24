package JavaAssignments;

import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args) {
		int j=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no. of array elements:");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array elements:");
		for(j=0;j<n;j++)
		{
			arr[j]=s.nextInt();
		}
		System.out.println("array elements are:");
		for(j=0;j<n;j++)
		{
			System.out.print(" "+arr[j]);
		}
		while(arr[j]>0)
		{
			int a=arr[j]-arr[j+1];
			arr[j]=arr[j+1];
			//arr[j]++;
			//if()
			
		}
		System.out.println(arr[j]);
	
	
		
	
	
		
	}

}
