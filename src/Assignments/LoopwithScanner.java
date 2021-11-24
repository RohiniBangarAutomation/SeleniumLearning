package Assignments;

import java.util.Scanner;

public class LoopwithScanner {

	public static void main(String[] args) {
		
			   Scanner s=new Scanner(System.in);
				
				  System.out.println("enter the number:");
				  int a=s.nextInt();
				  
			 
			  /* System.out.print("even numbers are:");
			   for(int i=0;i<=a;i+=2)
			   {
				   System.out.print(i+" ");
			   }
			   System.out.print("odd numbers are:");
			   for(int i=1;i<=a;i+=2)
			   {
				   System.out.print(i+" ");
			   }*/
			   
			  System.out.print("even numbers:");
			   int num=0;
			   while(num<=a)
			   {
				   System.out.print(" "+num);
				   num+=2;
				   
			   }
			   
			   System.out.print("\nOdd numbers:");
			   num=1;
			   while(num<=a)
			   {
				   System.out.print(" "+num);
				   num+=2;
				   
				   }
				   
				   
			   }
			   
			   

	}


