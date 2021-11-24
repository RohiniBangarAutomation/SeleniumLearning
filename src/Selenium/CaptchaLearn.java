package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptchaLearn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Simple-Math-Captcha-Plugin-for-jQuery-ebcaptcha/demo/");
		driver.manage().window().maximize();
		String text = driver.findElement(By.xpath("//label[@id='ebcaptchatext']")).getText();
		String first_string= text.substring(8, 9);
		String second_string= text.substring(12, 13);
		
		int a=Integer.parseInt(first_string);
		System.out.println("First num:"+a);
		int b=Integer.parseInt(second_string);
		System.out.println("second num:"+b);
		int c=a+b;
		System.out.println("Addition:"+c);
		String input=String.valueOf(c);
		driver.findElement(By.xpath("//input[@id='ebcaptchainput']")).sendKeys(input);
	}

}
