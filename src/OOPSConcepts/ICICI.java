package OOPSConcepts;

public class ICICI extends RBI {

	public static void main(String[] args) {

		ICICI obj = new ICICI();
		obj.Home_Loan();
		obj.CalcInterestRate();
		obj.ApplyingForJob();
		obj.withdraw(54321, 15000);
		obj.deposit(54321, 5000);
	}

	public void Home_Loan() {
		System.out.println("Home loan amount of your ICICI account is:" + LoanAmount);
	}

	public void CalcInterestRate() {
		InterestAmount = LoanAmount * (InterestRate / 100);
		System.out.println("Interest rate of your ICICI account home loan is " + InterestRate + "%");
		System.out.println("Yearly Interest of your ICICI account home loan is: " + InterestAmount);

	}
	public void ApplyingForJob() {
		if (Qualification == "Computer Basics") {
			System.out.println("You are 12 th pass you can apply for Bank post ");
		} else {
			System.out.println("you are less than 12 th pass you can not apply for Bank post");
		}
	}

}
