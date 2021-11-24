package PracticePrograms;

public class flaguse {

	public static void main(String[] args) {
		
		int n=10;
		int flag=0;
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				flag=1;
				
			}
			
			if(flag==0)
			{
				System.out.println(" "+i);
			}
			flag=0;
		}
	}

	

}
