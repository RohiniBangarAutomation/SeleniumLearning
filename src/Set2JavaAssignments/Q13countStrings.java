package Set2JavaAssignments;

import java.util.StringTokenizer;

public class Q13countStrings {
	/*
	 * 13) count the number of times the second word in second string occurs in
	 * first string-case sensitive
	 * 
	 * input1=hai hello hai where hai Hai; input2=what hai output=3;
	 */
	public static void main(String[] args) {
		String input1 = "Hai hello how are you?? hai hai";
		String input2 = "what hai";
	
		int count = 0;
		StringTokenizer t1 = new StringTokenizer(input2, " ");
		String s1 = t1.nextToken();
		String s2 = t1.nextToken();
		StringTokenizer t2 = new StringTokenizer(input1, " ");
		while (t2.hasMoreTokens()) {
			if (t2.nextToken().equals(s2))
				count++;
		}
		System.out.println(count+" times second input string appeared in first string");
	}

}
