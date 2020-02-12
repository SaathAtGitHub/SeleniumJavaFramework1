/* If you don't know from where to download ChromeDriver then simply comment out that statement and run your test, you will get error. Now the error
 * itself give you the URL from where you can download ChromeDriver.
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait_Example {

	public static void main(String[] args) 
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("Location of this project is: " + projectPath + "\n");  // This will print "C:\Selenium - 2019's Prep\SeleniumJavaFramework"

		System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 2.36/chromedriver.exe"); // If this don't work then use above statement
		WebDriver driver = new ChromeDriver();   // Use this if u wish to run test on Chrome.

		driver.get("https://www.seleniumhq.org/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		// Above is implicitly wait, meaning WebDriver will wait for 10 seconds before it close the browser. By default, wait time is 0. Implicit wait is applicable for the entire session of browser.
		
		driver.close();
	}
}
