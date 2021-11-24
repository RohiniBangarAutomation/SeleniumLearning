package JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo2 {
	@Before
	public void clicking() {
		System.out.println("Clicked successfully");
		
	}
	@Test
	public void opening_tab() {
		System.out.println("Tab opened");
		
	}
	@After
	public void closing_Tab() {
		System.out.println("Tab closed");
	}

}
