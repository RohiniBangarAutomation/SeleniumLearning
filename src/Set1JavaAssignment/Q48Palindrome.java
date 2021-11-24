package Set1JavaAssignment;

import java.util.Scanner;

public class Q48Palindrome {

	public static void main(String[] args) {
	int num;
	int sum=0,temp = 0;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number:");
	 num=s.nextInt();
	 temp=num;
	 while(num>0)
	 {
		int rem=num%10;
		sum=(sum*10)+rem;
		num=num/10;
		 
	 }
	 if(temp==sum)
	 {
System.out.println("number is palindrome");
	}else
		System.out.println("number is not palindrome");

}
}
