package Selenium;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotLearn {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		try{
			driver.findElement(By.xpath("//a[text()='search']"));
		}
		catch(Exception e)
		{
			File obj =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(obj, new File("/Users/Mithun/Documents/JAVA/myScreenshot.JPG"));
		}
		finally
		{
			System.out.println("Code ends here");
		}
		

	}

}
