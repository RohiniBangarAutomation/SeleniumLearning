package AutomationGoogleAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

import Selenium.ListenerCode;

// 1.  To verify that the Google web page is launched successfully

public class VerifyGoogleLaunch {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver 2");
		ChromeDriver webdriver = new ChromeDriver();
		webdriver.manage().window().maximize();

		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
	
		ListenerCode listener = new ListenerCode();
		EventFiringMouse mouse = new EventFiringMouse(webdriver, listener);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Locatable item;
		Coordinates cord;
		item = (Locatable) driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/a"));
		cord = item.getCoordinates();
		mouse.mouseMove(cord);
		System.out.println("Sign in button is located");
		
		Thread.sleep(3000);
		item = (Locatable) driver
				.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		cord = item.getCoordinates();
		mouse.mouseMove(cord);
		System.out.println("Google Search button is located");
		
		Thread.sleep(3000);
		item = (Locatable) driver
				.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[2]"));
		cord = item.getCoordinates();
		mouse.mouseMove(cord);
		System.out.println("I am feeling lucky button is located");
		
		Thread.sleep(3000);
		item = (Locatable) driver
				.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		cord = item.getCoordinates();
		mouse.mouseMove(cord);
		System.out.println("search box is located ");
		Thread.sleep(2000);
		webdriver.close();

	}

}
