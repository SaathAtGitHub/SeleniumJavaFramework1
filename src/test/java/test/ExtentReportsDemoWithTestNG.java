/* Created this file while watching this video: “Selenium Framework for Beginners 11 | How to use Extent Reports with TestNG in Selenium Java” 
 * located at https://www.youtube.com/watch?v=PzmEiG08L78&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=12
 * 
 * TEST RESULT: Pass and it successfully crate Extent Report named as "ExtentReport_for_ExtentReportsDemoWithTestNG.html" but this test
 * failed to take SS as coded. In this video, Raghav Pal copied the code from "TestNG Examples" > "Using ExtentTestNGReportBuilder" 
 * found at http://extentreports.com/docs/versions/3/java/#examples 
 */
package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import test.TestNG_Demo;

public class ExtentReportsDemoWithTestNG {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		// start reporters
		htmlReporter = new ExtentHtmlReporter("ExtentReport_for_ExtentReportsDemoWithTestNG.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@BeforeTest
	public void setUpTest()
	{
		// projectPath = System.getProperty("user.dir");
		System.out.println("Location of this project is: " + TestNG_Demo.projectPath + "\n");  // This will print "C:\Selenium - 2019's Prep\SeleniumJavaFramework"

		// System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 78.0.3904.70/chromedriver.exe");
		   System.setProperty("webdriver.chrome.driver", TestNG_Demo.projectPath + "/driver/Chrome Driver Version 2.36/chromedriver.exe"); // If this don't work then use above statement
		// Raghav Pal used Chrome Driver Version 2.9 but it was showing "data:," in Chrome's address bar so he suggested to use version 2.36 which fixed the issue. Also Chrome Driver Version 78.0.3904.70 works as I tried it. As of Nov 9, 2019 this is the latest Chrome Driver. 
		driver = new ChromeDriver();   // Use this if u wish to run test on Chrome.
	}
	
	@Test
	public void test1() throws Exception
	{
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        
        driver.get("http://google.com");
        test.pass("Navigated to Google.com");
        
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        // log with snapshot
        //test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath( TestNG_Demo.projectPath + "Screenshots/screenshot_ExtentReportsDemoWithTestNG.png").build());
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        // test with snapshot
        // test.addScreenCaptureFromPath(TestNG_Demo.projectPath + "Screenshots/screenshot_ExtentReportsDemoWithTestNG.png");
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test
	public void test2() throws Exception
	{
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        // log with snapshot
        //test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath( TestNG_Demo.projectPath + "Screenshots/screenshot_ExtentReportsDemoWithTestNG.png").build());
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        // test with snapshot
        // test.addScreenCaptureFromPath(TestNG_Demo.projectPath + "Screenshots/screenshot_ExtentReportsDemoWithTestNG.png");
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@AfterTest
	public void tearDownTest()
	{
		// driver.close();
		System.out.println("Test completed successfully");
	}

	@AfterSuite
	public void tearDown()
	{
		// calling flush writes everything to the log file
        extent.flush();
	}

}
