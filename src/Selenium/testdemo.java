package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class testdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver 2");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/a")).click();
	
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/div/div/div/a/svg")).click();
	}

}
