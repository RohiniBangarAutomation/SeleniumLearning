package LearnJava;

public class TryCatchExample {

	public static void main(String[] args) {
		try {
			// int[] a=new int[3];
			int a[] = { 1, 2, 3 };
			System.out.println("" + a[2]);
			System.out.println("4th element of an array" + a[4]);
			System.out.println("" + a[2]);
		} catch (Throwable e) {
			System.out.println("you are in catch");

		}
		// System.out.println("4th element of an array"+a[4]);
		finally {
			System.out.println("finally must execute");
		}

	}

}
