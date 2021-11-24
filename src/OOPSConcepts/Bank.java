package OOPSConcepts;

import java.util.Scanner;

public class Bank {

	private int ATM_PIN = 123;
	public String name="Geeta";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String Address="Manchar,Pune";
	public String emailid="Geeta123@gmail.com";

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

		Bank obj = new Bank();

		System.out.println("Account Number is--> " + obj.Acc_no);
		System.out.println("Account Balance is--> " + obj.Acc_Balance);

		obj.Withdraw(123, 5000);
		obj.Deposit(2341456, 10000);
		obj.Change_ATMpin(2341456, 123);

	}

	public void Withdraw(int atm_pin, int amount) {
		if (ATM_PIN == atm_pin) {
			if (Acc_Balance >= amount) {
				Acc_Balance = Acc_Balance - amount;

				System.out.println("\nwithdrawal amount--> " + amount);
				System.out.println("Remaining Account balance after withdrawal--> " + Acc_Balance);
			} else {
				System.out.println("\nInsufficient fund");
			}

		} else {
			System.out.println("\nIncorrect pin");
		}
	}

	public void Deposit(int acc_no, int amount) {
		if (Acc_no == acc_no) {
			Acc_Balance = Acc_Balance + amount;
			System.out.println();
			System.out.println("Amount to be deposited is--> " + amount);
			System.out.println("Account balance after a deposit--> " + Acc_Balance);
		} else {
			System.out.println("\nPlease enter correct Account number");
		}
	}

	public void Change_ATMpin(int acc_no, int atm_pin) {
		if (Acc_no == acc_no) {
			if (ATM_PIN == atm_pin) {
				System.out.println("Your Account no is:" + Acc_no);
				Scanner s = new Scanner(System.in);
				System.out.println("Enter new ATM PIN NUmber--> ");
				int a = s.nextInt();
				ATM_PIN = a;

				System.out.println("New atm pin no is--> " + a);

			} else {
				System.out.println("\nIncorrect pin number");
			}
		} else {
			System.out.println("Please enter correct account number");
		}

	}
	public void Customer_details(int acc_no)
	{
		if(Acc_no==acc_no)
		{
			System.out.println("Customer details are below:");
			System.out.println("\nName-"+name+" Address-"+Address+" Emailid-"+emailid);
		}
		else
		{
			System.out.println("Incorrect account number");
		}
	}
	public void ChangeAddress(int acc_no,String address)
	{
		if(Acc_no==acc_no)
		{
			Address=address;
			
			System.out.println("New address is:"+address);
	
		}
		else
		{
			System.out.println("enter correct account number");
		}
	}

}
