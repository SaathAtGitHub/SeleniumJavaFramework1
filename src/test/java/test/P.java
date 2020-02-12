package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pages.GoogleSearchPage;

public class P {
	static WebDriver driver = null;

	public static void main(String[] args) {
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		// driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		GoogleSearchPage.button_search(driver).sendKeys(Keys.ENTER);
		//driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);  // Hitting ENTER key using SendKeys

	}

}
