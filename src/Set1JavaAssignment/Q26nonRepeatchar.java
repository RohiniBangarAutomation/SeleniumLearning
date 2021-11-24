package Set1JavaAssignment;

import java.util.Scanner;

//26. Find no of characters in a given string which are not repeated.
//input: "hello"
//output: 3

public class Q26nonRepeatchar {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = s.next();
		// StringBuffer sb=new StringBuffer(str);
		int count = 1;
		boolean flag = true;
		// String word=Character.toString(str.charAt(0));
		//check number of chracter in string
		if (str.length() > 1) {
			for (int i = 0; i < str.length(); i++) {
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						flag = false;
						break;
					}
				}
				if (flag == true) { 
					//if same character is not present again in string
					count++;
					
				}
			}
		}
	
		System.out.println(count);
	}
}
