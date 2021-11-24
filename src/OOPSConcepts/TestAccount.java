package OOPSConcepts;

public class TestAccount {

	public static void main(String[] args) {

		Account obj = new Account();
		obj.setName("geeta");
		obj.setEmail("geeta@gmail.com");
		obj.setAmount(20000);
		
		System.out.println("name:"+obj.getName()+" \nemail:"+obj.getEmail()+" \namount:"+obj.getAmount());

	}

}
