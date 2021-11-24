package LearnJava;

public class MethodOverloading {

	public static void main(String[] args) {
	
		MethodOverloading obj=new MethodOverloading ();
		add(10,20);
		

	}
	public void add()
	{
		
	}
	public void add(int x)
	{
		
	}
	public static void add(int x,int y)
	{
		int c=x+y;
		System.out.println(c);
		
	}
	

}
