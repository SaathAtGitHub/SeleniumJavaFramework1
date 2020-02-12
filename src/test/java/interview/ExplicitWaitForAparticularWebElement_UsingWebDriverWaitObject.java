/* I created this file while I watched "Selenium Framework for Beginners 29 | Selenium Waits | How to use Implicit and Explicit waits"
 * located at https://www.youtube.com/watch?v=UN8cauyoZsk&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=31
 * 
 * If you don't know from where to download ChromeDriver then simply comment out that statement and run your test, you will get error. Now the error
 * itself give you the URL from where you can download ChromeDriver.
 * 
 * TEST RESULT: Pass (I ran this test on January 29, 2020)
 * This test throws exception and that's expected result because I'm testing EXPLICIT Wait by creating WebDriverWait object in this test
 * which will wait for 20 seconds for the WebElement that has "abcdef" name, before throwing exception.
 */
package interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitForAparticularWebElement_UsingWebDriverWaitObject {

	public static void main(String[] args) 
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("Location of this project is: " + projectPath + "\n");  
		// Above will print "C:\Selenium - 2019's Prep\SeleniumJavaFramework"

		System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 2.36/chromedriver.exe"); // If this don't work then use above statement
		WebDriver driver = new ChromeDriver();   // Use this if u wish to run test on Chrome.

		driver.get("https://www.seleniumhq.org/");
		
		// U can create explicit wait using below two statements. 
		// Explicit wait is dedicated to a particular WebElement while implicitly wait is applicable to the 
		// whole browser (session) 
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcdef"))); 
		// In above statement, there's no element with "abcdef" name but since we want to check if the 
		// WebDriver is going to wait here for 20 seconds before 
		// it throws "No Such Element" exception error. Explicit wait can be set for specific elements, 
		// also Explicit wait can be set for a specific condition.
		
		driver.close(); // Browser won't get closed if the test throws error before this statement.
	}
}
