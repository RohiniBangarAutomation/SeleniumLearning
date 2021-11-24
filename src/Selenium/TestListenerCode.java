package Selenium;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestListenerCode {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver");
		ChromeDriver webdriver = new ChromeDriver();
		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//strong[text()='English']")).click();
		ListenerCode listener = new ListenerCode();
		driver.register(listener);

		driver.findElement(By.xpath("//strong[text()='English']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.navigate().to("https://www.google.com/");
		
		driver.get("https://www.airbnb.co.in/india/stays");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/ul/li[1]/div/a")).click();
		Thread.sleep(5000);
		Set<String> winId = driver.getWindowHandles();
		Iterator<String> itr = winId.iterator();

		String F_ID = itr.next();
		String S_ID = itr.next();

		driver.switchTo().window(S_ID);
		Thread.sleep(5000);
		
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

	}

}
