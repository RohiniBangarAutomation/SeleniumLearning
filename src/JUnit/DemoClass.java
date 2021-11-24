package JUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoClass {
	@BeforeClass
	public static void Connectionopen() {
		System.out.println("connection Successful");
	}

	@Before
	public void OpeningBrowser() {
		System.out.println("Opening browser Successful");
	}

	@Test
	public void Login() {
		System.out.println("Login Successful");
	}

	@Test
	public void Flight_book() {
		System.out.println("Flight booking Successful");
	}

	@After
	public void Closing_Browser() {
		System.out.println("Closing Successful");

	}

	@AfterClass
	public static void Connectionclose() {
		System.out.println("conn Closing Successful");

	}

}
