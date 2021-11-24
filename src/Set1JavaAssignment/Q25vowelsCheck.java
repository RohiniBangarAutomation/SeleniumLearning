package Set1JavaAssignment;

//25. Check whether a given string is palindrome also check whether it has atleast 2 different vowels
//input: "madam"
//output: false(no 2 diff vowels)
public class Q25vowelsCheck {

	public static boolean palindromeAndVowelCheck(String s) {
		boolean flag = true;
		int count = 0;
		String vowel = "aeiou";
		StringBuffer sb = new StringBuffer(s);
		String pali = sb.reverse().toString();
		if (!pali.equals(s))
			flag = false;
		else {
			loop: for (int i = 0; i < vowel.length(); i++)
				for (int j = 0; j < s.length(); j++)
					if (vowel.charAt(i) == s.charAt(j)) {
						count++;
						continue loop;
					}
			if (count < 2)
				flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
		String s = "peacaep";
		System.out.println(palindromeAndVowelCheck(s));
	}
}
