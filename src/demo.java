import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class demo {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver 8");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("https://about.google/intl/en/products/");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div/div/span[2]/a[2]")).click();
//		Thread.sleep(3000);

		// TODO Auto-generated method stub
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/div/div/div/a")).click();
		driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/ul[1]/li[1]/a"))
				.sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/ul[1]/li[1]/a"))
				.sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/ul[1]/li[1]/a"))
				.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='More from Google']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div/div/span[2]/a[2]")).click();
		//driver.findElement(By.xpath("/html/body/div/div/span[2]/a[2]")).click();
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/main/div/section[1]/div/div[2]/div/div[4]/section/div[2]/a"))
				.sendKeys(Keys.PAGE_DOWN);
//		Thread.sleep(3000);
		// driver.findElement(By.cssSelector("#cookieBar > div > span.cookieBarButtons >
		// a.cookieBarButton.cookieBarConsentButton");

		try {
			boolean product = driver.findElement(By.xpath("/html/body/main/div/section[4]/div/div[1]/div[1]/div/a/div"))
					.isDisplayed();
		} catch (Exception e) {
			System.out.println("Google product not available");
		}
		driver.quit();

	}

}
