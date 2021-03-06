package Set1JavaAssignment;
/*
11.Two inputs of a string array and a string is received. The array shld be sorted in descending order. 
The index of second input in a array shld be retrieved.
input1:{"ga","yb","awe"}
input2:awe
output:2

*/

import java.util.*;

public class Q11Ans {
	public static void main(String[] args) {
		String[] s1 = { "good", "yMe", "awe" };
		String s2 = "awe";
		System.out.println(stringRetrieval(s1, s2));
	}

	public static int stringRetrieval(String[] s1, String s2) {
		ArrayList<String> l1 = new ArrayList<String>();
		for (int i = 0; i < s1.length; i++)
			l1.add(s1[i]);
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println(l1);
		int n = l1.indexOf(s2);
		return n;
	}
}
