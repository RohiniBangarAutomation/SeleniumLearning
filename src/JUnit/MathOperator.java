package JUnit;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MathOperator {
	@BeforeClass
	public static void beforeclass() {
		System.out.println("--Before class---");
		
	}
	@Before
	public void BeforeEveryTest() {
		System.out.println("---Before test---");
		
	}
	@Test
	public void test1() {
		if (multiply(10, 30) == 300) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
			fail("multiply of 10 and 30 failed");
		}
	}
	//@Ignore
	@Test
	public void test2() {
		if (add(10, 20) == 30) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
			fail("add of 10 and 30 failed");
		}
	}
	@After
	public void AfterEveryTest() {
		System.out.println("---After test---");
		
	}
	@AfterClass
	public static void Afterclass() {
		System.out.println("--after class---");
		
	}

	public int multiply(int x, int y) {

		return x * y;

	}

	public int add(int x, int y) {
		
		return x + y;
	}

	public void divide() {

	}

}
