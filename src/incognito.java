import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class incognito {

	public static void main(String[] args) {
		//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--incognito");
		//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver 8");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		String Tittle = driver.getTitle();
		System.out.println("Tittle of Page is" + Tittle);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/a")).click();
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"))
				.sendKeys("bangarrohini96");

		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"))
				.click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")).sendKeys("Mithun@2");
	}

}
