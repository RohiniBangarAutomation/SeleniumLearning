package OOPSConcepts;

public class TestClass {

	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation();
		obj.withdraw(123, 5000);
		System.out.println(obj.getAcc_Balance());
		System.out.println(obj.getAcc_no());
		obj.setATM_PIN(456);
		obj.withdraw(456, 5000);
	}

}
