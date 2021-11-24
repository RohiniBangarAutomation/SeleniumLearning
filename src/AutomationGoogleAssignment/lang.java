package AutomationGoogleAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetElementText;

public class lang {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver 2");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		// getting initial language of homepage
		String lang = driver.findElement(By.xpath("/html")).getAttribute("lang");
		System.out.println(lang);
		String substring = lang.substring(0, 2);
		System.out.println("Google home page Inital language--" + substring);

		// sign in button verification
		String href = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/a"))
				.getAttribute("href");

		if (href.contains("hl=" + substring) == true) {

			System.out.println("Sign in button is in " + substring + " Language");

		} else {
			if (!(href.contains("hl="))) {
				System.out.println("language of Sign in button is not found");
			} else {

				int index = href.indexOf("hl=", 0);
				System.out.println(index);
				String signInLang = href.substring(index + 3, index + 5);

				System.out.println("language of Sign in button is: " + signInLang + " different than original language"
						+ substring);
			}
		}
		// check if language disapears
		List<WebElement> googleLangs = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));

		System.out.println(googleLangs.size());
		String url = "";
		int flag = 1;
		for (int i = 0; i < googleLangs.size(); i++) {
			url = googleLangs.get(i).getAttribute("href");
			System.out.println(url);
			if (!(url.contains("hl=" + substring))) {
				flag = 1;
			} else {
				flag = 0;
				break;
			}

		}
		if (flag == 1) {
			System.out.println(substring + " language is missing from home page");
		} else {
			System.out.println(substring + " language is visible in home page-false output");
		}
		//List<WebElement> langs = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		WebElement div=driver.findElement(By.xpath("//div[@id='SIvCob']"));
		List<WebElement> langs=div.findElements(By.tagName("a"));
		System.out.println(langs.size());
		for (int i =0; i<langs.size(); i++) {
		if(!(langs.get(i).getAttribute("href").contains("hl=")))
				{
			langs.get(i).click();
				}
		}
		//List<WebElement> langs = div.findElements(By.tagName("a"));
		
//		for (int i =0; i<langs.size(); i++) {
//			//driver.navigate().refresh();
//			if(langs.get(i).getAttribute("href").contains("hl="))
//			{
				
				//driver.findElement(By.tagName("a")).getAttribute("href").contains("hl=");
			
			driver.findElement(By.xpath("//a[text()='हिन्दी']"));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='বাংলা']"));
			//driver.navigate().refresh();
			// String link =
			// googleLangs.get(i).getAttribute("href");//"https://www.google.com/setprefs?sig=0_0IM9y_Gzw8O92rNDTc_Jlus4Qms%3D&hl=hi&source=homepage&sa=X&ved=0ahUKEwiK7KjHvM7yAhWWIrkGHYjPAH8Q2ZgBCA8";
			// System.out.println(link);

			// driver.findElementByLinkText(link).click();
			// driver.get(link);
			//}
		
			driver.close();
		}
}
		
	

