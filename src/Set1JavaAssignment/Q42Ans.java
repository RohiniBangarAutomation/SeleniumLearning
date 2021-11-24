package Set1JavaAssignment;

import java.util.Scanner;

/*42. input1=commitment;
  output=cmmitmnt;
c be the first index position 
remove even vowels from the string*/

public class Q42Ans {

	public static void main(String args[]) {

		String str1, str2 = "";
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a String : ");
		str1 = scan.nextLine();
		for (int i = 1; i < str1.length(); i++) {
			if (i % 2 == 0) {
				str2 = str1.replaceAll("[aeiouAEIOU]", "");

			}

		}
		System.out.print("All Vowels Removed Successfully..!!\nNew String is : ");

		System.out.print(str2);
	}
}
