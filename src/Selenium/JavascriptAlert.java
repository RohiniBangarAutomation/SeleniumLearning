package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlert {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/alert.php#load_box");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		System.out.println("switched sucssefully");
		driver.findElement(By.xpath("//button[text()='Click the button to display an alert box:']")).click();
		//driver.switchTo().defaultContent();//out of every frame
		//driver.switchTo().parentFrame();//out of current frame to last frame
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[text()='Input Alert']")).click();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));
		driver.findElement(By.xpath("//button[text()='Click the button to demonstrate the Input box.']")).click();
		Alert alert1=driver.switchTo().alert();
		alert1.sendKeys("Rohini");
		Thread.sleep(3000);
		alert1.accept();
		Thread.sleep(3000);

	}

}
