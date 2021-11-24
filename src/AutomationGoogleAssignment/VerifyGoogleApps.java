package AutomationGoogleAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/* 2.  To verify all the Google apps (My Account, Search, Maps, YouTube, Play, News,
		Gmail, Drive, Google+, Translate, Photos) in the dialog box*/

public class VerifyGoogleApps {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver 2");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		// driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/div/div/div/a")).click();
		System.out.println("Google Apps are displayed after clicking on google apps");
		Thread.sleep(3000);
		driver.close();

	}

}
