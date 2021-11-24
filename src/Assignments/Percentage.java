package Assignments;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args)
	{
		
   Scanner s=new Scanner(System.in);
   
   System.out.println("Enter percentage:");
   int a=s.nextInt();
   
   if(a>=60)
   {
	   System.out.println("This is A grade");
   }
   else if(a<60 && a>50)
   {
	   System.out.println("this is grade B");
   }
   else
   {
	   System.out.println("This is grade c");
   }

	}

}
