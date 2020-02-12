/* I created this file while watching this video: Watching “Selenium Framework for Beginners 8 | How to implement POM in Selenium Java” located 
at https://www.youtube.com/watch?v=tnWig6KfQ9w&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=9 
 */
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPageObjects_Video_8;  // Importing the class where I've assigned loctors to all the page objects and methods to work on them, are defined.

public class GoogleSearchPageObjects_Test_Video_8 
{

	public static void main(String[] args) 
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("Location of this project is: " + projectPath + "\n");  // This will print "C:\Selenium - 2019's Prep\SeleniumJavaFramework"

		googleSearchTest();
	}
	
	
	public static void googleSearchTest()
	{
		WebDriver driver = null;
		//String textToSearch = "Automation Step by step";
		
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		
		GoogleSearchPageObjects_Video_8 searchPageObj = new GoogleSearchPageObjects_Video_8(driver);
		
		searchPageObj.setTextInSearchBox("Automation Step by step");
		searchPageObj.clickSearchBox();
		
		System.out.println("Test completed successfully..");
	}
	
}
