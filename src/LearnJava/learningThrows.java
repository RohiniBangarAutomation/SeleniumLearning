package LearnJava;

public class learningThrows {

	public static void main(String[] args) throws Throwable {

		// throws keyword is used to declare exceptions
		// it doesn't throw an exception
		// it specifies that there may occur an exception in method.
		// it is always used with method signature

		int i = 4 / 0;
		System.out.println(i);
		Thread.sleep(4000);

	}

}
