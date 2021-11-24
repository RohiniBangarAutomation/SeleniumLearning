package Polymorphism;

public class Overloading {

	// same method name and different signature
	// in same class we have multiple methods with same method name but different
	// signature
	// all methods should be in same class
	
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.addition(4, 5);
		byte a = 7;
		byte b = 6;
		obj.addition(a, b);

	}

	public void addition(int x, int y) {
		System.out.println(x + y);
	}
}
