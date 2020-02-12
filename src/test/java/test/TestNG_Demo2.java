/* Created this file while watching this video: “Selenium Framework for Beginners 13 | Selenium What is testng.xml | How to create testng.xml” 
 * located at https://www.youtube.com/watch?v=gBpLmQgkqsw&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=15
 *
 * Following files created / used in above video:
 * TestNG_Demo.java (This file was already created but it is used in this video)
TestNG_Demo2.java
testng_forParallelTestExecution.xml  

 * TEST RESULT: The 2 tests run parallelly as both opens Chrome, do google search and close both browsers. 
 * 
 * Following is related to "testng_forParallelTestExecution.xml": <include> in and <exclude> fails to include and exclude methods specified 
 * in those tags. I didn't dig much in to it as the priority is complete this playlist. 
 */
package test;
/* If you don't know from where to download ChromeDriver then simply comment out that statement and run your test, you will get error. Now the error
 * itself give you the URL from where you can download ChromeDriver.
 * I've created this file by by following steps explained @ 9:02, in this video: "Selenium Framework for Beginners 9 | What is TestNG | How to install TestNG for Selenium" located
 * at https://www.youtube.com/watch?v=AzVyetnW3hU&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=10

 */
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {
	
	WebDriver driver = null;
	public static String projectPath = System.getProperty("user.dir"); // This was previously declared as "String projectPath;" but I want to use it
	// in other classes of the "test" package, so I declared it this way. I can use "projectPath" in a class located in a different package
	// as well by importing that class by following this syntax: "import <package_name>.<class_name>;"
	// These are the classes where I've used "projectPath" variable: 
	// pages.AccessVaribleFromDiffClassLocatedInDiffPackage
	// test.ExtentReportsDemoWithTestNG
	
	@BeforeTest
	public void setUpTest()
	{
		projectPath = System.getProperty("user.dir");
		System.out.println("Location of this project is: " + projectPath + "\n");  // This will print "C:\Selenium - 2019's Prep\SeleniumJavaFramework"

		// System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 78.0.3904.70/chromedriver.exe");
		   System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 2.36/chromedriver.exe"); // If this don't work then use above statement
		// Raghav Pal used Chrome Driver Version 2.9 but it was showing "data:," in Chrome's address bar so he suggested to use version 2.36 which fixed the issue. Also Chrome Driver Version 78.0.3904.70 works as I tried it. As of Nov 9, 2019 this is the latest Chrome Driver. 
		driver = new ChromeDriver();   // Use this if u wish to run test on Chrome.
	}
	
	@Test
	public void chk(){
		System.out.println("projectPath: " + projectPath);
	}
	
	@Test
	public void googleSearch2()
	{
		System.out.println("Executing TestNG_Demo2 > 'googleSearch2' method");
		driver.get("https://google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);  // Hitting ENTER key using SendKeys
	}
	
	@Test
	public void googleSearch3()
	{
		System.out.println("Executing TestNG_Demo2.java > 'googleSearch3' method");
		driver.get("https://google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);  // Hitting ENTER key using SendKeys
	}
	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		System.out.println("TestNG_Demo2 > Test completed successfully");
	}
}

