package Overriding;

public class Test extends Base{
	String browsername="Chrome";

	public static void main(String[] args) {
		Test t=new Test();
		t.launch();

	}
	public void launch()
	{
		WebDriver driver=getDriverInstance(browsername);
		driver.click();
		
	}

}
