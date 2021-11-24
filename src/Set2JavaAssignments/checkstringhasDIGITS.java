package Set2JavaAssignments;

public class checkstringhasDIGITS {

	public static void main(String[] args) {
		
		String str="12345i";
		
			if(str.matches("[0-9]+"))
			{
			System.out.println("string has only digits");	
			}
			else {
				System.out.println("string has other characters then digits");
		}
		
	}

}
