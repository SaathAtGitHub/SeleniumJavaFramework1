/* I created this file while I watched "Selenium Framework for Beginners 29 | Selenium Waits | How to use Implicit and Explicit waits"
 * located at https://www.youtube.com/watch?v=UN8cauyoZsk&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=31
 * 
 * Tip: If you don't know from where to download ChromeDriver then simply comment out that statement and run your test, you will get error. Now the error
 * itself give you the URL from where you can download ChromeDriver.
 * 
 * TEST RESULT: Pass (I ran this test on January 29, 2020)
 * This test throws exception and that's expected result because I'm testing EXPLICIT Wait by creating WebDriverWait object in this test
 * which will wait for 20 seconds for the WebElement that has "abcdef" name, before throwing exception.
 */
package interview;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class FluentWait_WithPollingNignoringAnyExceptionYouWish {

	public static void main(String[] args) 
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("Location of this project is: " + projectPath + "\n");  
		// Above will print "C:\Selenium - 2019's Prep\SeleniumJavaFramework"

		System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 2.36/chromedriver.exe"); // If this don't work then use above statement
		WebDriver driver = new ChromeDriver();   // Use this if u wish to run test on Chrome.

		driver.get("https://www.seleniumhq.org/");
		
	   // Waiting 30 seconds for an element to be present on the page, checking
	   // for its presence once every 5 seconds.
	   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	       .withTimeout(30, TimeUnit.SECONDS)
	       .pollingEvery(5, TimeUnit.SECONDS)
	       .ignoring(NoSuchElementException.class);  // Here you can use any exception you want

	   // Since there is not WeElement having id as "foo" so we will get error BUT the goal is that using Fluent Wait 
	   // (coded above and below) we will make WebDriver to wait for 20 seconds to keep polling / searching for "foo" 
	   // WebElement - once it don't find, it will throw error. Use Try-Catch if you wish to complete test without 
	   // throwing error.
	   WebElement foo_WebElement = wait.until(new Function<WebDriver, WebElement>() {
	     public WebElement apply(WebDriver driver) {
	       return driver.findElement(By.id("foo")); 
	       // In real-time you will need a real WebElement's ID (for which you want WebDriver to wait) replacing "foo" in above statement.
	     }
	   }	);
		
		driver.close(); // Browser won't get closed if the test throws error before this statement.
	}
}
