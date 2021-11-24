package Overriding;

public class Base {

	public WebDriver getDriverInstance(String browsername)
	{
		if(browsername.equals("Chrome"))
		{
		return new Chrome();
		}else if(browsername.equals("IE"))
		{
			return new IE();
		}
		else
		{
			return new FF();
		}
	}

}
