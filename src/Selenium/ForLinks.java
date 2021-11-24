package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Downloads/chromedriver 2");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();

		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());

		WebElement block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[7]/div[3]"));
		List<WebElement> perticularblock = block.findElements(By.tagName("a"));
		System.out.println(perticularblock.size());

		WebElement block1 = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[2]"));
		List<WebElement> exactblock = block1.findElements(By.tagName("a"));
		System.out.println(exactblock.size());
		driver.findElement(By.xpath("//strong[text()='English']")).click();
		driver.navigate().back();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
