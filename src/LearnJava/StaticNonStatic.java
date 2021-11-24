package LearnJava;

public class StaticNonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod();
		StaticNonStatic obj=new StaticNonStatic();
		obj.NonStaticMethod();
		

	}
	public void NonStaticMethod()
	{
		StaticMethod();
		nonStaticMethod();
		
		System.out.println("i am non static method");
	}
	public static void StaticMethod()
	{
		
		System.out.println("i am static method");
	}
	
	public void nonStaticMethod()
	{
		
		System.out.println("i am non static method");
	}
}
