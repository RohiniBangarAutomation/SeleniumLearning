package LearnJava;

public class ThrowExample {

	public static void main(String[] args) throws Throwable {
		int per = 70;
		if (per < 60) {
			throw new Exception("percentage should be first class");
		} else {
			System.out.println("congrats you have first class");
		}
	}

}
