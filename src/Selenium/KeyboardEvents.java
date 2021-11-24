package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardEvents {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver 2");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Freely usable photos & more']")).click();
		driver.findElement(By.xpath("//a[text()='View source']")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='View source']")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='View source']")).sendKeys(Keys.PAGE_UP);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='View source']")).sendKeys(Keys.DELETE);
		Thread.sleep(3000);

	}

}
