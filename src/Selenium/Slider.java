package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(
				"https://www.flipkart.com/mobiles/mi~brand/pr?sid=tyy%2C4io&otracker=nmenu_sub_Electronics_0_Mi&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3DMax");

		WebElement slider = driver.findElement(By.xpath("//section[2]/div[3]/div[1]/div[1]/div"));

		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.dragAndDropBy(slider, 80, 0).perform();
	}

}
