package Set2JavaAssignments;

import java.util.Iterator;

//18)String a="a very fine day"
//output:A Very Fine Day

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q18CapitaliseWord {

//18)String a="a very fine day"
//output:A Very Fine Day

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.nextLine();
		
		// "a very fine day"
		System.out.println(toTitleCase(s));
	}
		public static String toTitleCase(String s) {
		    String[] arr = s.split(" ");
		    StringBuffer sb = new StringBuffer();

		    for (int i = 0; i < arr.length; i++) {
		        sb.append(Character.toUpperCase(arr[i].charAt(0)))
		            .append(arr[i].substring(1)).append(" ");
		    }          
		    return sb.toString().trim();
		} 
}
