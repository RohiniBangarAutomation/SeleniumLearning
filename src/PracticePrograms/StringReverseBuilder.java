package PracticePrograms;

public class StringReverseBuilder {

	public static void main(String[] args) {
		String input="My name is geeta";
		StringBuilder input1=new StringBuilder();
		
	input1.append(input);
	input1=input1.reverse();
	System.out.println("Reversed string:");
	for(int i=0;i<input1.length();i++)
	{
		System.out.print(""+input1.charAt(i));
	}

	}

}
