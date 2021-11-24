package OOPSConcepts;

public class ATM {

	public static void main(String[] args) {

		Bank obj = new Bank();

		/*obj.Withdraw(123, 5000);
		obj.Deposit(2341456, 10000);
		obj.Change_ATMpin(2341456, 123);

		obj.Deposit(2341456, 5000);
		obj.setAcc_Balance(20000);
		System.out.println(obj.getAcc_Balance());

		System.out.println(obj.getAcc_no());*/

		obj.setATM_PIN(345);
		obj.Change_ATMpin(2341456, 345);

		obj.Withdraw(234, 10000);

	}

}
