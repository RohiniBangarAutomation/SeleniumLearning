package Set2JavaAssignments;

import java.util.StringTokenizer;

public class Q19Vowelscount {
	/*
	 * 19)Take the word with a max length in the given sentance in that check for
	 * vowels if so count the no.of occurances ! Input 1="Bhavane is a good girl"
	 * Output =3 Input 1="Bhavanee is a good girl" Output =4
	 */
	public static void main(String[] args) {
		String s1 = "Bhavaneee is a good girl";
	
		int count = 0, max = 0;
		String s4 = "AEIOUaeiou";
		String s3 = new String();
		StringTokenizer t = new StringTokenizer(s1, " ");
		while (t.hasMoreTokens()) {
			String s2 = t.nextToken();
			int n2 = s2.length();
			if (n2 > max) {
				max = n2;
				s3 = s2;
			}
		}
		for (int i = 0; i < s3.length(); i++)
			for (int j = 0; j < s4.length(); j++)
				if (s3.charAt(i) == s4.charAt(j))
					count++;
		System.out.println("count of vowels in max length word:"+count);
	}

}
