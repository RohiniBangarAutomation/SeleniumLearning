package Set1JavaAssignment;

import java.util.Scanner;

public class DemoClass {
	public static void main(String[] args) {
		String s1="abcdetteegg";
		boolean b=consecutiveCharactersCheck(s1);
		if(b==true)
			System.out.println("presence of consecutive characters");
		else
			System.out.println("absence of consecutive characters");
		}

	public static boolean consecutiveCharactersCheck(String s1) {
		boolean b=false;
		int c=0;
		for(int i=0;i<s1.length()-1;i++)
			if((s1.charAt(i+1)-s1.charAt(i))==1)
					c++;
		if(c>=2)
			b=true;
		return b;
	}

	}


