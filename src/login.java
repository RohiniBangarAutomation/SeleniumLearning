
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver 8");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://newtrade.sharekhan.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//WebElement log = driver.findElement(By.xpath("/html/body/div[3]/div[1]/header/div/div[2]/ul/li[3]/a[1]"));
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.elementToBeClickable(log)).click();
		
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div[1]/form/md-input/span/input"))
				.sendKeys("3002828");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div[1]/form/div/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div/div[1]/div[1]/form/md-input/span/input"))
				.sendKeys("Mithun@2");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[2]/div/loginpage/div/div/div/div/div/div/div[2]/div/div[1]/div[1]/form/div[4]/div/button"))
				.click();
	}

}
