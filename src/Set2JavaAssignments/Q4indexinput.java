package Set2JavaAssignments;

public class Q4indexinput {

	/*
	 * 4) intput="xyzwabcd" intput2=2; input3=4; output=bawz
	 * 
	 */

	public static void main(String[] args) {
		String s1 = "xyzwabcd";
		int n1 = 2, n2 = 4;
		// System.out.println(n1+n2);

		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		String s2 = sb.substring(n1, n1 + n2);
		System.out.println("output:" + s2);
	}
}