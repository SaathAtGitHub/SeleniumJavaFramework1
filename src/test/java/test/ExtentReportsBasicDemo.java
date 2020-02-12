/*  I created this file while watching “Selenium Framework for Beginners 10 | What is Extent Reports | How to use Extent Reports in Selenium” 
 * located at https://www.youtube.com/watch?v=eF_Vb-d4kIo&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=11
 * Raghav Pal copied code example located under “Basic Usage Example" section at http://extentreports.com/docs/versions/3/java/#examples 
 */
package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.GoogleSearchPage;

public class ExtentReportsBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");  // Your report will be store in extentReports.html. U can give absolute path as well. The report will be saved at your default project location.
		
		 // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("Google Search Test One", "This is a test to validate Google search functionlity");
        
		String projectPath = System.getProperty("user.dir");
		System.out.println("Location of this project is: " + projectPath + "\n");  // This will print "C:\Selenium - 2019's Prep\SeleniumJavaFramework"
		System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 2.36/chromedriver.exe"); // If this don't work then use above statement
		
		driver = new ChromeDriver();   // Use this if u wish to run test on Chrome.
        
		test.log(Status.INFO, "===== Starting My Test Case.. =====");
		driver.get("https://google.com/");
		test.pass("Successfully navigated to Google.com..");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation");
		test.pass("Successfully entered 'Automation' in the Searchbox..");
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.ENTER);
		test.pass("Successfully pressed ENTER key..");
		
		driver.close();
		test.pass("Successfully closed the browser..");
		
        test.info("Using this 'test.info' statement, you can provide the info you wish..");
        test.log(Status.INFO, "===== Ending My Test Case.. =====");
        
        
        // ====== Below is test1
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test Two", "I'm failing test here so you can see it in Extent Report..");
        
		System.out.println("Location of this project is: " + projectPath + "\n");  // This will print "C:\Selenium - 2019's Prep\SeleniumJavaFramework"
		System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 2.36/chromedriver.exe"); // If this don't work then use above statement
		
		driver = new ChromeDriver();   // Use this if u wish to run test on Chrome.
        
		test1.log(Status.INFO, "===== Starting test1 Test Case.. =====");
		driver.get("https://google.com/");
		test1.pass("Opened new browser window opened and Successfully navigated to Google.com..");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		test1.fail("Using 'test.fail' you can fail your Test Step n this is how it will look in Extent Report..");
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.ENTER);
		test1.fail("Using 'test.fail' you can fail your Test Step n this is how it will look in Extent Report..");
		
		driver.close();
		test1.pass("Successfully closed the browser..");
		
		test1.log(Status.FAIL, "This TC is failed..");
		test1.log(Status.INFO, "===== Ending test1 Test Case.. =====");
		
        
        // calling flush writes everything to the log file - I think this means all the reporting events above will get written to your 
        // report because when I ran this test without "extent.flush();", then "extentReports.html" did not created under project tree. 
        extent.flush(); // "Flush method is used to erase any previous data on the report and create a new report" per this: https://www.softwaretestinghelp.com/extent-reports-selenium-webdriver/
        
        /*
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
        */
        
//        driver = nothing;

	}

}
