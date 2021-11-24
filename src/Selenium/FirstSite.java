package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class FirstSite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Rohini");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Bangar");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rohini@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9037874783");
		// driver.findElement(By.xpath("//label[text()=' Male ']")).click();
		driver.findElement(By.xpath("//label[text()=' FeMale']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox3']")).click();

		Select select = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		// select.selectByIndex(1);
		select.selectByValue("Android");
       //select.selectByVisibleText("Analytics");
		Select select1 = new Select(driver.findElement(By.xpath("//select[@id='countries']")));
		select1.selectByIndex(2);
		// select1.selectByValue("Albania");
		select1.selectByVisibleText("Algeria");

		Select select2 = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		select2.selectByIndex(4);
		// select2.selectByValue("1919");
		// select2.selectByVisibleText("1918");

		Select select3 = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		select3.selectByIndex(4);
		// select3.selectByValue("March");
		// select3.selectByVisibleText("April");

		Select select4 = new Select(driver.findElement(By.xpath("//select[@placeholder='Day']")));
		// select4.selectByIndex(3);
		// select4.selectByValue("2");
		select4.selectByVisibleText("20");
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Bangar");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Bangar");
//		
		driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']")).click();
		driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li"));
		//driver.close();
		

	}
}
