package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

public class PracticeMouseHover {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver");
		WebDriver webdriver = new ChromeDriver();
		
		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
		ListenerCode listener = new ListenerCode();
		EventFiringMouse mouse = new EventFiringMouse(webdriver, listener);
		driver.get("http://way2automation.com/way2auto_jquery/alert.php#load_box");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Locatable item;
		Coordinates cord;
		item = (Locatable) driver.findElement(By.xpath("//a[text()='Interaction']"));
		cord = item.getCoordinates();
		Thread.sleep(3000);
		mouse.mouseMove(cord);
		
		item = (Locatable) driver.findElement(By.xpath("//a[text()='Widget']"));
		cord = item.getCoordinates();
		Thread.sleep(3000);
		mouse.mouseMove(cord);
		
		item = (Locatable) driver.findElement(By.xpath("//a[text()='Dynamic Elements']"));
		cord = item.getCoordinates();
		Thread.sleep(3000);
		mouse.mouseMove(cord);
		
	
	}

}
