package Set1JavaAssignment;

/*36. find the three consecutive characters in a string. if the string consists any three 
consecutive characters return 1 else return -1
like AAAxyzaaa will return true.
*/
public class Q36 {

	public static void main(String[] args) {
		String s1 = "Abcdebh";
		boolean flag = consecutiveCharactersCheck(s1);
		if (flag == true)
			System.out.println("presence of consecutive characters");
		else
			System.out.println("absence of consecutive characters");
	}

	public static boolean consecutiveCharactersCheck(String s1) {
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < s1.length() - 1; i++) {
			if ((s1.charAt(i + 1) - s1.charAt(i)) == 1) {
				count++;
			}
			if (count >= 2) {
				flag = true;
			}

		}
		return flag;
	}
}
