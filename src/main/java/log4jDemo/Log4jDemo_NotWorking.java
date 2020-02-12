/* I've created this file by by following steps explained in this video: "Setup Log4J logging in Selenium Java with example" 
 * located at https://www.youtube.com/watch?v=RS4obMRAfh8
 * 
 * Will update this later.. TEST RESULT (Test ran on December 16, 2019):
 * This test throws error on "final static Logger log = Logger.getLogger("SimpleLog");" and I didn't spent much time to fix it.
*/
 package log4jDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger.*;
import org.apache.logging.log4j.Marker;


public class Log4jDemo_NotWorking {

	final static Logger log = Logger.getLogger("SimpleLog");
			
//	final static Logger log = Logger.
	
	WebDriver driver;
	
	@BeforeMethod
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 2.36/chromedriver.exe"); // If this don't work then use above statement
		driver = new ChromeDriver();   
	}
	
	@Test(enabled=true)
	public void log4jTest()
	{
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);  // Hitting ENTER key using SendKeys
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("TestNG_Demo > Test completed successfully");
		driver.close();
	}

}
