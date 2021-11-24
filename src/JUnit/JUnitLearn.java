package JUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JUnitLearn {
	static ChromeDriver driver;

	@Test
	public void AChromeLoading() {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");

	}

	@Test
	public void BLang() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//strong[text()='English']"))).click();
		//driver.findElement(By.xpath("//strong[text()='English']")).click();
	}

}
