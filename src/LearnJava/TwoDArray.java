package LearnJava;

public class TwoDArray {

	public static void main(String[] args) {
		
		int[][] twoD=new int[2][3];
		
		twoD[0][0]=120;
		twoD[0][1]=1200;
		twoD[0][2]=200;
		
		twoD[1][0]=120;
		twoD[1][1]=120;
		twoD[1][2]=120;
		System.out.println(twoD[0][2]);
		for (int i=0;i<twoD.length;i++)
		{
			for (int j=0;j<twoD.length;j++)
			{
		System.out.println(" "+twoD[i][j]);
			}
		}

	}

}
