package PracticePrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadLineByProgram {
	
		 
		public static void main(String[] args) {
		try {
		Scanner scanner = new Scanner(new File("/Users/Mithun/Documents/JAVA/myFile.txt"));
		while (scanner.hasNextLine()) {
		System.out.println(scanner.nextLine());
		}
		scanner.close();
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		}
		}
		
}
