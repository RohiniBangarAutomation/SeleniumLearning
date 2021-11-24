package OOPSConcepts;

public class Dog extends Animals{

	public static void main(String[] args) {
		
		Animals obj=new Dog();
		obj.sound();
		

	}
	public void sound()
	{
		System.out.println("wuff wuff");
	}

}
