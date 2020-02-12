
/* If you don't know from where to download ChromeDriver then simply comment out that statement and run your test, you will get error. Now the error
 * itself give you the URL from where you can download ChromeDriver.
 * I've created this file by by following steps explained @ 9:02, in this video: "Selenium Framework for Beginners 9 | What is TestNG | How to install TestNG for Selenium" located
 * at https://www.youtube.com/watch?v=AzVyetnW3hU&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=10
 * 
 * TEST RESULT: (Fail)
 * Because of Eclipse's fault (may be version issue), I'm NOT getting value of of "browserName" on this line "(browserName.equalsIgnoreCase("chrome"))" - as a result,
 * this test fails. But I restarted Eclipse and ran this test, then I was getting  value of of "browserName" but the on the consecutive runs,
 * Eclipse failed to get value of of "browserName".
 * 
 * SOLUTION: Try exporting this project in a different version (preferably greater version then Eclipse Neon) of Eclipse and run this test. It should work in that version.
 */
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import config.PropertiesFile_Demo;

public class CrossBrowserTestingUsingPropertiesFile {
	
	WebDriver driver = null;
	public static String browserName = null;
	public static String projectPath = System.getProperty("user.dir"); 
	
	@BeforeTest
	public void setUpTest()
	{
		PropertiesFile_Demo.getProperties(); // Calling getProperties() function located in a diff class, to fetch value of "browserName" from "config.properties" file,   
		System.out.println("Checking " + browserName);

		if (browserName.equalsIgnoreCase("chrome")) 
		{
			// System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 78.0.3904.70/chromedriver.exe");
			   System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 2.36/chromedriver.exe"); // If this don't work then use above statement
			// Raghav Pal used Chrome Driver Version 2.9 but it was showing "data:," in Chrome's address bar so he suggested to use version 2.36 which fixed the issue. Also Chrome Driver Version 78.0.3904.70 works as I tried it. As of Nov 9, 2019 this is the latest Chrome Driver. 
			driver = new ChromeDriver();   // Use this if u wish to run test on Chrome.
		}else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", projectPath + "/driver/geckodriver/geckodriver-v0.19.0-win64/geckodriver.exe");
			driver = new FirefoxDriver();  // Use this if u wish to run test on FF.
		}
	}
	
	@Test
	public void chk(){
		System.out.println("projectPath: " + projectPath);
	}
	
	@Test
	public void googleSearch()
	{
		System.out.println("Executing TestNG_Demo.java > 'googleSearch' method");
		driver.get("https://google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);  // Hitting ENTER key using SendKeys
	}
	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("TestNG_Demo > Test completed successfully");
		PropertiesFile_Demo.setProperties();
	}
}

