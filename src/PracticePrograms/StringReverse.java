package PracticePrograms;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		String str="";
	Scanner s=new Scanner(System.in);
	System.out.println("Enter aString:");
	str=s.next();
	String rev="";
	
	int len=str.length();
	for(int i=len-1;i>=0;i--)
	{
		 rev=rev+str.charAt(i);
	}
	System.out.println("reversed string is:"+rev);
	}

}
