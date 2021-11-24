package PropertiesFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingText {

	public static void main(String[] args) throws IOException {

		File f = new File("/Users/Mithun/Documents/JAVA/myFile.txt");

		FileWriter fw = new FileWriter(f);

		BufferedWriter writer = new BufferedWriter(fw);

		writer.write("hello i am from java code");
		writer.newLine();
		writer.write("hello i am from pune");
		writer.close();

		System.out.println("File created");

	}

}
