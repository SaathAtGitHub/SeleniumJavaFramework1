/* This test is not working n I'm getting error. I didn't gave much time to debug coz this code deals with JUnit and I didn't imported / check required JARs for JUnit.
 * and this project is a Maven project - may be that could be the reason y this test isn't working.
 * I copied code from "Guide To Generate Extent Reports In Selenium WebDriver" located at https://www.softwaretestinghelp.com/extent-reports-selenium-webdriver/
 * Above web page was Last Updated on November 10, 2019
 */
package test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReports_withJUnit_XXXX 
{
		
//package com.objectrepository.demo;

	public class ExtentDemo 
	{
		public ExtentTest test;
		public ExtentReports report;
		
		@BeforeClass
		public void startTest()
		{
	//		report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReport_inJUnit.html");
			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/ExtentReport_inJUnit.html");
	//		test = report.startTest("ExtentDemo");
		}
		
		@Test
		public void extentReportsDemo()
		{
			String projectPath = System.getProperty("user.dir");
			System.out.println("Location of this project is: " + projectPath + "\n");  // This will print "C:\Selenium - 2019's Prep\SeleniumJavaFramework"
			System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 2.36/chromedriver.exe"); // If this don't work then use above statement
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.co.in");
			
			if(driver.getTitle().equals("Google"))
			{
	//			test.log(LogStatus.PASS, "Navigated to the specified URL");
				test.log(Status.PASS, "Navigated to the specified URL so: PASS");
			}
			else
			{
				test.log(Status.FAIL, "Test Failed");
			}
		}
		
		@AfterClass
		public void endTest()
		{
	//		report.endTest(test);
			report.flush();
		}
	}
}


