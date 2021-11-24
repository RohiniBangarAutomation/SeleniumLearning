package OOPSConcepts;

public class RBI {

	int LoanAmount = 1000000;
	float InterestAmount = 0;
	float InterestRate = 7;
	String Qualification = "Computer Basics";

	int Acc_no = 54321;
	int Acc_Balance = 10000;

	public static void main(String[] args) {

		RBI obj = new RBI();
		obj.Home_Loan();
		obj.CalcInterestRate();
		obj.ApplyingForJob();
		obj.withdraw(54321, 15000);
		obj.deposit(54321, 5000);

	}

	public void Home_Loan() {
		System.out.println("Home loan amount of your account is:" + LoanAmount);
	}

	public void CalcInterestRate() {
		InterestAmount = LoanAmount * (InterestRate / 100);
		System.out.println("Interest rate of your home loan is " + InterestRate + "%");
		System.out.println("Yearly Interest of your home loan is: " + InterestAmount);

	}

	public void ApplyingForJob() {
		if (Qualification == "Computer Basics") {
			System.out.println("You are 12 th pass you can apply for Bank post ");
		} else {
			System.out.println("you are less than 12 th pass you can not apply for Bank post");
		}
	}

	public void withdraw(int acc_no, int amount) {

		if (Acc_no == acc_no) {
			if (Acc_Balance >= amount) {
				Acc_Balance = Acc_Balance - amount;

				System.out.println("\nwithdrawal amount--> " + amount);
				System.out.println("Remaining Account balance after withdrawal--> " + Acc_Balance);
			} else {
				System.out.println("\nInsufficient fund");
			}
		} else {
			System.out.println("please enter correct account number");
		}
	}

	public void deposit(int acc_no, int amount) {
		if (Acc_no == acc_no) {
			Acc_Balance = Acc_Balance + amount;
			System.out.println();
			System.out.println("Amount to be deposited is--> " + amount);
			System.out.println("Account balance after a deposit--> " + Acc_Balance);
		} else {
			System.out.println("\nPlease enter correct Account number");
		}
	}

}
