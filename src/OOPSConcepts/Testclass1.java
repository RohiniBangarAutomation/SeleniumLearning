package OOPSConcepts;

public class Testclass1 {

	public static void main(String[] args) {
		Bank obj = new Bank();
		obj.Customer_details(2341456);
		obj.ChangeAddress(2341456, "nashik,Pune");

		System.out.println(obj.getEmailid());
		obj.setEmailid("abc@gmail.com");
		System.out.println(obj.getEmailid());

		obj.setName("pooja");
        System.out.println(obj.getName());
        
        

	}

}
