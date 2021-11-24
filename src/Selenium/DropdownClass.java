package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']")).click();

		List<WebElement> countryname = driver.findElements(By.xpath("//ul[@id='select2-country-results']/li"));

		System.out.println(countryname.size());
		// String cname = "India";
		for (int i = 0; i < countryname.size(); i++) {
			if (countryname.get(i).getText().contains("Denmark")) {
				countryname.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//div[@id='msdd']")).click();

		List<WebElement> lang = driver.findElements(By.xpath("//li[@class='ng-scope']/a"));
		System.out.println(lang.size());
		// String lname = "Arabic";
		for (int i = 0; i < lang.size(); i++) {
			if (lang.get(i).getText().contains("Arabic")) {
				lang.get(i).click();
				break;
			}
		}

	}

}
