package AutomationGoogleAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//7.  To validate that the Google performs the search operation properly

public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver 2");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		search.sendKeys("amitabh bachhan");
		search.submit();
		System.out.println(driver.findElement(By.tagName("a")).getSize());
	}

}
