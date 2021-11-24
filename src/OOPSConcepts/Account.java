package OOPSConcepts;

public class Account {

	private int acc_no;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAcc_no() {
		return acc_no;
	}

	private String name,email;
	private int amount;
	
}
