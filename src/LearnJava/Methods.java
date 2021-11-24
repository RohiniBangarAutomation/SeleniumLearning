package LearnJava;

public class Methods {
	int a=4; //global variable,scope of variable is in whole class
	
	public static void main(String[] args)
	{
	
	Methods obj=new Methods();
	obj.sum();
	obj.sub();
	obj.div();
	obj.mult();
	
	}
	
	public void sum()
	{
		int i=50; //local variable,scope of variable is within the class
		int j=25;
		int k=i+j;
		System.out.println(k);
	}
	
	public void sub()
	{
		int i=50;
		int j=15;
		int k=i-j;
		System.out.println(k);
	}
	public void div()
	{
		int i=100;
		int j=5;
		int k=i/j;
		System.out.println(k);
	}
	public void mult()
	{
		int i=10;
		int j=15;
		int k=i*j;
		System.out.println(k);
	}

}
