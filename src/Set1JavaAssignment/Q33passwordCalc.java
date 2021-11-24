package Set1JavaAssignment;

import java.util.Scanner;

public class Q33passwordCalc {

	/*
	 * 33.validate a password i) there should be atleast one digit ii) there should
	 * be atleast one of '#','@' or '$' . iii)the password should be of 6 to 20
	 * characters iv) there should be more uppercase letter than lower case. v)
	 * should start with an upper case and end with lower case
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a password:");
		String pass = s.next();
		boolean b = validatingPassword(pass);
		if (b == true)
			System.out.println("valid password");
		else
			System.out.println("Invalid Password");
	}

	public static boolean validatingPassword(String pass) 
	{
		boolean b1 = false, b2 = false;
		if (Character.isUpperCase(pass.charAt(0)))

			if (Character.isLowerCase(pass.charAt(pass.length() - 1)))

				if (pass.length() >= 6 && pass.length() <= 20)

					for (int i = 0; i < pass.length(); i++) 
					{
						char c = pass.charAt(i);
						if (Character.isDigit(c)) 
						{
							b1 = true;
							break;
						}
					}
		int x = 0, y = 0;
		for (int i = 0; i < pass.length(); i++)

			if (Character.isUpperCase(pass.charAt(i)))
				x++;
			else if (Character.isLowerCase(pass.charAt(i)))
				y++;
		if (b1 == true)

			if (x > y)

				for (int i = 0; i < pass.length(); i++) 
				{
					char c = pass.charAt(i);
					if (c == '#' || c == '@' || c == '$') 
					{
						b2 = true;
						break;
					}
				}
		return b2;
	}
}
