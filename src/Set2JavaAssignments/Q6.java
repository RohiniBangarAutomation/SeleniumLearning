package Set2JavaAssignments;

public class Q6 {
	/*6)	input1="abc2012345"
			input2="abc2112660"
			input 3=4
		here "abc**" refers to customer id.
		12345 refers to last month eb reading and 12660 refers to this month eb reading
		find the difference between two readings and multiply it by input3

		ie., output=(12660-12345)*4
*/

		public static void main(String[] args) {
			String s1="abc2012345";
			String s2="abc2112660";
			int s3=4;
	
			int n1=Integer.parseInt(s1.substring(5, s1.length()));
			int n2=Integer.parseInt(s2.substring(5, s2.length()));
			int n=Math.abs((n2-n1)*s3);
			System.out.println("difference between two readings and multiply it by input3:\n"+n);
		}
		

}
