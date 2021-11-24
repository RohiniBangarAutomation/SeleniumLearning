package TestNG;

import org.testng.annotations.Test;

public class Groups {
	

	@Test(priority = 4, groups = "Run")
	public void test() {
	System.out.println("i am test1");
	}

	 @Test(priority = 3, groups = "Run")
	public void test2() {
	System.out.println("i am test2");
	}

	 @Test(priority = 2, dependsOnMethods = { "test2" }, groups = "Not Run")
	public void test3() {
	System.out.println("i am test3");
	}

	 @Test(groups = "Run")
	public void testfour() {
	System.out.println("i am test4");

	 }
	}


