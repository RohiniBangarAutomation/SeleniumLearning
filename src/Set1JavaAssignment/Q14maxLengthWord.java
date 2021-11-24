package Set1JavaAssignment;

import java.util.Scanner;

public class Q14maxLengthWord {

	// 14.find the max length-word in a given string and return the max-length word.
	// if two words are of same length return the first occuring word of max-length
	// input:"hello how are you aaaaa"
	// output:hello(length-5)

	public static void main(String[] args) {
		//input string
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = s.nextLine();
		
		//declare variables
		int length = 0, maxWordLength = 0;
		String word = "", result = "";
		
		//parse string
		for (int i = 0; i < str.length(); i++) 
		{
			if (str.charAt(i) == ' ') //check space between word
			{ //compare length of second word(length) and max word length
				if (length >= maxWordLength) 
				{ //assign max length word and word 
					maxWordLength = length;
					result = word;
				}
				//clear the length and word after space
				length = 0;
				word = "";
			} 
			else 
			{
				length++; //calculate the length of word 
				word = word + str.charAt(i); //store word till space
			}
		}
		
		if ( length > maxWordLength) //check for length of last word  and length of max word 
		{
			System.out.print(word);
			System.out.print("(length - "+length+")");		
		}
		else 
		{
			System.out.print(result);
			System.out.print("(length - "+maxWordLength+")");
		}
	}

}
