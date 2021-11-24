package PracticePrograms;

public class print1to4 {

	public static void main(String[] args) {
		// 1 2 3 4
		// 2 3 4 1
		// 3 4 1 2
		// 4 1 2 3
		
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print(" "+j);
				
			}
			System.out.println();
		}

	}

}
