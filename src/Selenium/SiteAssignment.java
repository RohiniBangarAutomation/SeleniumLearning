package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SiteAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.thepancard.com/newpancard.php?gclid=CjwKCAjwtJ2FBhAuEiwAIKu19u2RjBsX55zSKwUd7HuQdI652Xy2oUHavEAsOSa9PyHHJe4hHPbiDRoCJqoQAvD_BwE");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='rblCategory_1']")).click();
		driver.findElement(By.xpath("//input[@id='rblGender_1']")).click();

		Select select = new Select(driver.findElement(By.xpath("//select[@id='proof_dob']")));
		select.selectByIndex(3);
//		//select.selectByValue("Birth Certificate");
		// select.selectByVisibleText(" Birth Certificate");
//		
		Select select1 = new Select(driver.findElement(By.xpath("//select[@id='ddlPOI']")));
		select1.selectByIndex(9);
		// select1.selectByValue(" Arm's License");
		List<WebElement> dropdownvalue = select.getOptions();
	System.out.println(dropdownvalue.size());
		System.out.println(dropdownvalue);
		 driver.findElement(By.xpath("//input[@id='txtNameLN']")).sendKeys("Bangar");;

//		Select select2 = new Select(driver.findElement(By.xpath("//select[@id='ddlPOA']")));
//		select2.selectByIndex(2);

		driver.findElement(By.xpath("//input[@id='txtMobNo']")).sendKeys("9876573653");
		driver.findElement(By.xpath("//input[@id='txtEmailId']")).sendKeys("abc@gmail.com");

		driver.findElement(By.xpath("//input[@id='rbRAAdd_0']")).click();
		driver.findElement(By.xpath("//input[@id='agree_check']")).click();
		driver.findElement(By.xpath("//input[@id='submit']")).click();

	}

}
