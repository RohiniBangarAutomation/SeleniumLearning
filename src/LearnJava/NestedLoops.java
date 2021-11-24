package LearnJava;

public class NestedLoops {

	public static void main(String[] args) {
	

		int x=0;
		while(x<2)
		{
			for(int y=0;y<3;y++)
			{
				int z=0;
				do
				{
					System.out.println("x--"+x+"y--"+y+"z--"+z);
				z++;	
				}while(z<4);
			}
		x++;
		}

	}

}
