package LearnJava;

public class MethodArgs {

	public static void main(String[] args) {
		
		MethodArgs obj=new MethodArgs();
		obj.add(12, 230);
		
	}
	public void add() //void method
	{
		
	}
	public void add(int x) //single arg
    {
		
    }
    public void add(int x,int y) //double args 
    {
    	int c=x+y;
    	System.out.println(c);
    	
    }
}
