package AutomationGoogleAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//4.  To verify that the user is able to Sign-in into all the Google apps (My Account, Search, Maps, YouTube, 
//		Play, News, Gmail, Drive, Calender, Google+, Translate, Photos)

public class SignInToGooglePhotos {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver 2");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/div/div/div/a")).click();
		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/ul[1]/li[14]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/a[2]")).click();
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"))
				.sendKeys("khairerohini1@gmail.com");
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"))
				.click();
	}

}
