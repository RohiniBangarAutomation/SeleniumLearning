package LearnJava;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {

			int a = 4 / 0;
			System.out.println(a);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("i am ArrayIndexOutOfBoundsException");
		} catch (ArithmeticException e) {
			System.out.println("i am arithmetic exception"+e);
		} catch (Error e) {
			System.out.println("i am an error");
		}

		finally {
			System.out.println("my code ends here");
		}
	}

}
