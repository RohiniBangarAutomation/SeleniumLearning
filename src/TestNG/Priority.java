package TestNG;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 4)
	public void test1() {
		System.out.println("I am test 1");
	}

	@Test(priority = 3)
	public void test2() {
		System.out.println("I am test 2");
	}

	@Test(priority = 2)
	public void test3() {
		System.out.println("I am test 3");
	}

	@Test(priority = 1)
	public void test4() {
		System.out.println("I am test 4");
	}

}
