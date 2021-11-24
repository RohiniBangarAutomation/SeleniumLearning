package Set2JavaAssignments;

public class Q8checkStringhasDigits {
	
/*	8)Given array of string check whether all the elements contains only digits not any alaphabets.
	if condn satisfied print 1 else -1.
	Input:{"123","23.14","522"}
	output:1

	Input1:{"asd","123","42.20"}
	output:-1
*/

	public static void main(String[] args) {
		//String[] str={"123","23.14","522"};
		String[] str={"asd","123","42.20"};
	
		int n=0;
		for(int i=0;i<str.length;i++){
			String s1=str[i];
			for(int j=0;j<s1.length();j++){
				char c1=s1.charAt(j);
				if(Character.isDigit(c1))
					n=1;
				else {
					n=-1;
					break;
					} 
				}
			}
		System.out.println(n);
	}
	

}
