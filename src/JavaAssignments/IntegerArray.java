package JavaAssignments;

import java.util.Scanner;

public class IntegerArray {

	

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of array elements you want to store:");
		int n=s.nextInt();
		
		int[] a=new int[n];
		int i,a1,a2;
		int j=0;
		System.out.println("enter the elements of an array:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int diff=0,maxdiff=0;
			for(i = 0; i < n; i++)
	        {
	            for(j = i + 1; j < n; j++)
	            {
	            	diff=Math.abs(a[i]-a[j]);
	            	
	            	if(diff>maxdiff)
	            	{
	            		maxdiff=diff;
	            		a1=i;
	            		a2=j;
	            	}
		}
	        }
			System.out.println("Greatest Difference:"+maxdiff);
	        System.out.println("Two elements with largest difference:"+a[i]+" and "+a[j]);
	}
}

	