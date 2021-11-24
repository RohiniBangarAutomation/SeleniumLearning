package TestNG;

import org.testng.annotations.Test;

public class DependsOn {
	@Test(priority = 3)
	public void login() {
		System.out.println("login");
	}

	@Test(priority = 1, dependsOnMethods = "login")
	public void dopayment() {
		System.out.println("login");
	}

	@Test(priority = 2, dependsOnMethods = "dopayment")
	public void payment() {
		System.out.println("login");

	}

}
