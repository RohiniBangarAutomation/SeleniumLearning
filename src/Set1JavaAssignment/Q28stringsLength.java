package Set1JavaAssignment;

public class Q28stringsLength {

	/*
	 * 28.An arraylist of Strings is given as input. The count of the String
	 * elements that are not of size input2 string is to be returned. input1:
	 * {"aaa","bb","cccc","d"} input2: "bb" output: 3("bb"-length:2)
	 */

	public static void main(String[] args) {

		String s1[] = { "aaa", "bb", "cccc", "d" };
		String s2 = "bb";
		int count=0;
		System.out.println("Strings which are not size of bb:");
		for(int i=0;i<s1.length;i++)
		{
			if(!(s1[i].length()==s2.length()))
			{
				count++;
				System.out.print(" "+s1[i]);
			}
		}
		System.out.println("\ncount: "+count);
		System.out.println("bb-length:"+s2.length());

	}

}
