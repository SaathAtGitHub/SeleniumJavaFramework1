/* I created this file by referring this video: "#Selenium#Propertiesfile#AutomationFramework What is a Properties File in Selenium Automation" 
 * at https://www.youtube.com/watch?v=R9hQYq96IL8&list=PLokXAdgX8Uh6yK_w9yUdc7H0lYXKmUzzw&index=2&t=771s
 */
package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage {

	WebDriver driver;
	File file;
	FileInputStream fip;
	Properties prop;
	
	public void initConfig()
	{
		file = new File(System.getProperty("user.dir") + "/config.properties");
		
		try {
			fip = new FileInputStream(file);
			prop = new Properties(); 
			prop.load(fip); // Load the property file
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException exception occurred in 'initConfig' method and the error message is: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace(); // I tried keep "e.printStackTrace()" in this in System.out.println() but getting red underline error. May be we can't have "e.printStackTrace()" within System.out.println() statement. 
		}
	}
	
	public String ReadProperty(String key) // To read data from the Property file
	{
		System.out.println("Property "+ key + "'s value, from 'config.properties' file is being read using 'ReadProperty' method and it's value is: " + prop.getProperty(key));
		return prop.getProperty(key);
	}
	
	@BeforeMethod
	public void setup()
	{
		initConfig();
		// System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 78.0.3904.70/chromedriver.exe");
		   System.setProperty("webdriver.chrome.driver", ReadProperty("PathOfChromeDriverExe")); // If this Chrome Driver Version 2.36 don't work then use above statement
		// Raghav Pal used Chrome Driver Version 2.9 but it was showing "data:," in Chrome's address bar so he suggested to use version 2.36 which fixed the issue. Also Chrome Driver Version 78.0.3904.70 works as I tried it. As of Nov 9, 2019 this is the latest Chrome Driver. 
		driver = new ChromeDriver();   // Use this if u wish to run test on Chrome.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(ReadProperty("ApplicationURL"));
	}
	
	@Test
	public void TestRadioButton()
	{
		System.out.println("To confirm we are on the right page, I would print title here and it is: " + driver.getTitle());
		driver.findElement(By.xpath(ReadProperty("InputForms"))).click();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);  // Waiting here to see the click occur.
		driver.findElement(By.xpath(ReadProperty("RadioButtonsDemo"))).click();
	}
	
	@AfterMethod
	public void quitApp()
	{
		 driver.quit();
	}
}
