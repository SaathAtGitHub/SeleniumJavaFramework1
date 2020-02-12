package test;
/* If you don't know from where to download ChromeDriver then simply comment out that statement and run your test, you will get error. Now the error
 * itself give you the URL from where you can download ChromeDriver.
 * I've created this file by by following steps explained @ 9:02, in this video: "Selenium Framework for Beginners 9 | What is TestNG | How to install TestNG for Selenium" located
 * at https://www.youtube.com/watch?v=AzVyetnW3hU&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=10
 * 
 * TEST RESULT: 
 * I created testng_forParallelTestExecution.xml (located in the root of this project) and included 2 test files: TestNG_Demo.java and TestNG_Demo2 test files 
 * successfully and it ran above 2 tests (.java files) parallelly as it opened 2 Chrome browsers parallely, ran the tests, closed both the browsers - so this test ran successfully.
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

public class TestNG_Demo {
	
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
	}
}

