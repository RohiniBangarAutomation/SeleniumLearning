package AutomationGoogleAssignment;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver 2");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		//boolean signin=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/a")).isDisplayed();
		//System.out.println("Sign in button is displayed on google home page:"+signin);
		try{
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/a"));
			 //Since, no exception, so element is present
			 System.out.println("Element present");
			}
			catch(NoSuchElementException e){
			 //Element is not present
			 System.out.println("Element not present");
			}

	}

}
