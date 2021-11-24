package PracticePrograms;

public class Print4by4stars {

	public static void main(String[] args) {
		//   j j j j
		// i=* * * *
		// i=* * * * rows
		// i=* * * *
		// i=* * * *
		//    columns
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
