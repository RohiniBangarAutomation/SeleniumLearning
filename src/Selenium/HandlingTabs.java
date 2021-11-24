package Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingTabs {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.airbnb.co.in/india/stays");
		//Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='accept-btn']"))).click();
		//driver.findElement(By.xpath("//button[@data-testid='accept-btn']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/ul/li[1]/div/a"))).click();
		//driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/ul/li[1]/div/a")).click();
		
		Set<String> winId = driver.getWindowHandles();
		Iterator<String> itr = winId.iterator();
		
		String F_ID=itr.next();
		String S_ID=itr.next();
		
		driver.switchTo().window(S_ID);
		
		//Thread.sleep(5000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[1]/main/div/div[1]/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div[1]/div/div/div[1]/div[1]/div/div[1]/div[1]/div/span/div/a"))).click();
		
		winId = driver.getWindowHandles();
		itr = winId.iterator();
		
		System.out.println("first id:"+itr.next());
		System.out.println("second id:"+itr.next());
		
		String T_ID=itr.next();
		System.out.println(T_ID);
		driver.switchTo().window(T_ID);
		
		//Thread.sleep(5000);
		driver.close();
		
		driver.switchTo().window(S_ID);
		//Thread.sleep(5000);
		
		driver.close();
		driver.switchTo().window(F_ID);
		//Thread.sleep(5000);
		driver.close();


	}

}
