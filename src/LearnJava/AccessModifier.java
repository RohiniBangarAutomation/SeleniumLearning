package LearnJava;

public class AccessModifier {

	public int publicVar = 10;
	int defaultVar = 11;
	private int privateVar = 13;
	protected int protVar = 16;

	public static void main(String[] args) {

//access modifier specifies access level of java component

		// it divides in two categories----1.class level 2.member level-this includes
		// variables and methods

		// class level
		
		// public-if class is marked as public then it is accessible anywhere
		// within the package or outside the package also
		// default-if class is default then it is accessible in same package

		// member level--variable and methods
		
		// public -same as class
		// default-same as class
		// protected-accessible in same package or in other package also but by using
		// inheritance
		// private-accessible within the class only
	}

}
