package Assignment2;

import java.util.Scanner;

public class IntSquare {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = s.nextInt();
		
	
		
		    	int rem = 0;
		    	int sum = 0;
		    	while (a>0)
		    	{
		    	rem = a % 10;
		    	sum = sum + (rem * rem);
		    	a = a / 10;
		        }
		    	System.out.println(sum);
		    
	}

}
