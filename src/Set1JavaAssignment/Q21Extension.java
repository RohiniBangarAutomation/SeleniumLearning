package Set1JavaAssignment;

/*21.Find the extension of a given string file.
input: "hello.jpeg"
output: "jpeg"*/
import java.io.File;

public class Q21Extension {

	public static void main(String[] args) {
		File file = new File("/Users/Mithun/Documents/JAVA/myFile.txt");
		System.out.println("File Extension is:" + getFileExtension(file));

	}

	private static String getFileExtension(File file) {
		String fileName = file.getName();
		if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
			return fileName.substring(fileName.lastIndexOf("."));
		else
			return "";
	}
}
