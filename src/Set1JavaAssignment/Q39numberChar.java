package Set1JavaAssignment;

import java.util.StringTokenizer;

public class Q39numberChar {
	// 39.GIVEN A STRING 555-666-1234
	// DISPLAY AS 55-56-661-234?


		public static void main(String[] args) {
			String s="555-666-1234";
			System.out.println(changePattern(s));
			}
		public static String changePattern(String s) {
			
			StringTokenizer t=new StringTokenizer(s,"-");
			String s1=t.nextToken();
			String s2=t.nextToken();
			String s3=t.nextToken();
			//System.out.println(s1.length()-1);
				
			StringBuffer sb=new StringBuffer();
			sb.append(s1.substring(0, s1.length()-1)).append('-');
			sb.append(s1.charAt(s1.length()-1)).append(s2.charAt(0)).append('-');
			sb.append(s2.substring(1, s2.length())).append(s3.charAt(0)).append('-');
			sb.append(s3.substring(1, s3.length())).append('?');
			
			return sb.toString();
		}

}