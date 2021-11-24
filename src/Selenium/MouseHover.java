package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver 2");
		ChromeDriver webdriver = new ChromeDriver();
		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
		ListenerCode listener = new ListenerCode();
		EventFiringMouse mouse = new EventFiringMouse(webdriver, listener);
		driver.manage().window().maximize();
		driver.get("https://www.bankofbaroda.in/index.htm");
		Locatable item = (Locatable) driver
				.findElement(By.xpath("/html/body/form/div[3]/div/div[1]/header/div[4]/div/ul/li[1]/ul/li[4]/a"));
		Coordinates cord = item.getCoordinates();
		mouse.mouseMove(cord);
		Locatable item1 = (Locatable) driver
				.findElement(By.xpath("/html/body/form/div[3]/div/div[1]/header/div[4]/div/ul/li[1]/ul/li[3]/a"));
		Coordinates cord1 = item1.getCoordinates();
		mouse.mouseMove(cord1);

	}

}
