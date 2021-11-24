package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeTest
	public void OpeningBrowser() {
		System.out.println("Opening Browser Successful");
	}

	@BeforeMethod
	public void Connectionopen() {
		System.out.println("Connection Successful");
	}

	@Test
	public void Login() {
		System.out.println("Login Successful");
	}

	@Test
	public void Flight_book() {
		System.out.println("Flight booking Successful");
	}

	@AfterMethod
	public void Connectionclose() {
		System.out.println("connection Closing Successful");

	}

	@AfterTest
	public void Closing_Browser() {
		System.out.println("Closing browser Successful");

	}

}
