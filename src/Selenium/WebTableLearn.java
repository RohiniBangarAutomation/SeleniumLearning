package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableLearn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		int row = driver.findElements(By.xpath("//tbody/tr/td/a")).size();
		int col = driver.findElements(By.xpath("//thead/tr/th")).size();

		// tbody/tr[1]/td[3]

		String first = "//tbody/tr[";
		String mid = "]/td[";
		String last = "]";

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				WebElement table = driver.findElement(By.xpath(first + i + mid + j + last));
				System.out.print(table.getText() + " || ");
			}
			System.out.println();
		}

	}

}
