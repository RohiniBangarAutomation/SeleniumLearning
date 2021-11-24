package PropertiesFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingText {

	public static void main(String[] args) throws IOException {

		File f = new File("/Users/Mithun/Documents/JAVA/myFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);

		String line = null;

		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();
		System.out.println("Reading completed");

	}

}
