package TestNG;

import org.testng.annotations.Test;

public class MultiDataProvider {
	@Test(dataProviderClass = DataPro1.class, dataProvider = "getData")
	public void formfill(String Firstname, String lastname, String password, int age) {
		System.out.println(Firstname + " " + lastname + " " + password + " " + age);

	}
	@Test(dataProviderClass = DataPro2.class,dataProvider = "getData")
	public void formfill1(String Firstname, String lastname, String password, int age) {
		System.out.println(Firstname + " " + lastname + " " + password + " " + age);

	}

}
