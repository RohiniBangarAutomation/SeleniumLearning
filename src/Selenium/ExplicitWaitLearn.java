package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitLearn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.navigate().to("https://www.wikipedia.org/");

		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//strong[text()='English']"))).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//strong[text()='Polski']"))).click();
		//driver.findElement(By.xpath("//strong[text()='English']")).click();
		//driver.findElement(By.xpath("//strong[text()='Polski']")).click();

	}

}
