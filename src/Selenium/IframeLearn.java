package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeLearn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/alert.php#load_box");
		//Thread.sleep();
		driver.manage().window().maximize();
		
		//System.out.println(driver.findElements(By.tagName("iframe")).size());
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		System.out.println("switched sucssefully");
		driver.findElement(By.xpath("//button[text()='Click the button to display an alert box:']")).click();
		//driver.switchTo().defaultContent();//out of every frame
		//driver.switchTo().parentFrame();//out of current frame to last frame
	
	}

}
