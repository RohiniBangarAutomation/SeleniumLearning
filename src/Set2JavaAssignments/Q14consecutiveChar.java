package Set2JavaAssignments;

public class Q14consecutiveChar {

//	14) find the no.of charcters,that has repeated 3 consecutive times
//	input1:"aaabbccc"
//	ouput1=2;

	public static void main(String[] args) {
		String str = "aaabbccc";
		
		int ch = 0;
		int count = 0;
		
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1))
				ch++;
			else
				ch = 0;

			if (ch == 2)
				count++;
		}
		System.out.println(count+" times three consecutive characters appeared in string");
	}

}
