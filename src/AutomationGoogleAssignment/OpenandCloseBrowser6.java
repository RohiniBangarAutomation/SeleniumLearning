package AutomationGoogleAssignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenandCloseBrowser6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver 2");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.close();
		

	}

}
