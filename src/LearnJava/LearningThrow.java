package LearnJava;

public class LearningThrow {

	public static void main(String[] args) throws Throwable {

		// throw keyword is used to throw an exception

		int age = 40;

		if (age < 18)
			throw new ArithmeticException("age should not be less than 18");
		else
			System.out.println("you can vote");

	}

}
