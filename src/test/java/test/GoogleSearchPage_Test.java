package test;
/* If you don't know from where to download ChromeDriver then simply comment out that statement and run your test, you will get error. Now the error
 * itself give you the URL from where you can download ChromeDriver.
 */
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchPage_Test {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) 
	{
		googleSearch();
	}
	
	public static void googleSearch()
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("Location of this project is: " + projectPath + "\n");  // This will print "C:\Selenium - 2019's Prep\SeleniumJavaFramework"

		// System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 78.0.3904.70/chromedriver.exe");
		   System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 2.36/chromedriver.exe"); // If this don't work then use above statement
		// Raghav Pal used Chrome Driver Version 2.9 but it was showing "data:," in Chrome's address bar so he suggested to use version 2.36 which fixed the issue. Also Chrome Driver Version 78.0.3904.70 works as I tried it. As of Nov 9, 2019 this is the latest Chrome Driver. 
		driver = new ChromeDriver();   // Use this if u wish to run test on Chrome.
		
		driver.get("https://google.com/");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		// driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		GoogleSearchPage.button_search(driver).sendKeys(Keys.ENTER);
		//driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);  // Hitting ENTER key using SendKeys
		
//		driver.close();
		System.out.println("Test completed successfully");
	}
}

