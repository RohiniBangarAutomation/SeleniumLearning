package OOPSConcepts;

public class Encapsulation {

	private int ATM_PIN = 123;
	public int getAcc_Balance() {
		return Acc_Balance;
	}

	public void setAcc_Balance(int acc_Balance) {
		Acc_Balance = acc_Balance;
	}

	public int getAcc_no() {
		return Acc_no;
	}

	public void setATM_PIN(int aTM_PIN) {
		ATM_PIN = aTM_PIN;
	}

	private int Acc_Balance = 50000;
	public int Acc_no = 2341456;

	public static void main(String[] args) {
		// for including encapsulation
		// 1.always make instance variable private
		// 2.always make public accessor methods and forced calling code to use
		// these methods instead of
		// directly calling instance variables

		// 3.use naming conventions set() and get() for these methods

		// encap--wrapping (or binding) data and methods into single unit
		// hiding the data from outside world
		Encapsulation obj = new Encapsulation();
		obj.withdraw(123, 5000);
		// System.out.println(obj.Acc_Balance);
		// System.out.println(obj.ATM_PIN);

	}

	public void withdraw(int atm_pin, int amount) {
		if (ATM_PIN == atm_pin) {
			if (Acc_Balance >= amount) {
				Acc_Balance = Acc_Balance - amount;

				System.out.println("withdrawal amount:" + amount);
				System.out.println("Remaining Account balance:" + Acc_Balance);
			} else {
				System.out.println("insufficient fund");
			}

		} else {
			System.out.println("incorrect pin");
		}

	}

}
