package LearnJava;

public class Break {

	public static void main(String[] args) {
		//AccessModifier o=new AccessModifier();
		for (int i = 0; i < 10; i++) {
			if (i == 5)
				// break;
				continue;
			System.out.println(i);
		}
		System.out.println("i am out of the loop");

	}

}
