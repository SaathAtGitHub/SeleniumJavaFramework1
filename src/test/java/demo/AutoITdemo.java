/* I created this file while I watched "Selenium Framework for Beginners 33 | What is AutoIT | How to use AutoIT with Selenium"
 * located at https://www.youtube.com/watch?v=3nPFjfpDwGU&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=35
 * 
 * Tip: If you don't know from where to download ChromeDriver then simply comment out that statement and run your test, you will get error. 
 * Now the error itself give you the URL from where you can download ChromeDriver.
 * 
 * TEST RESULT: Fail (I ran this test on February 10, 2020)
 * To get more info about what is failing, refer my notes for this video, that I wrote in Google Docs file named as 
 * "2019 - How to code at work (using Selenium and TestNG) - 2019’s Prep - 2".
 * 
 * Only following statement uses AutoIT in whole of this script:
 * Runtime.getRuntime().exec("C:\\FileUploadScript.exe");
 */
package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITdemo {
	
	public static void main(String[] args) throws IOException {
		testForAutoIT();
	}

	public static void testForAutoIT() throws IOException 
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("Location of this project is: " + projectPath + "\n");  
		// Above will print "C:\Selenium - 2019's Prep\SeleniumJavaFramework"
		
		System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 2.36/chromedriver.exe"); // If this don't work then use above statement
		// Raghav Pal used Chrome Driver Version 2.9 but it was showing "data:," in Chrome's address bar so he suggested to use version 2.36 which fixed the issue. Also Chrome Driver Version 78.0.3904.70 works as I tried it. As of Nov 9, 2019 this is the latest Chrome Driver.
		
		WebDriver driver = new ChromeDriver();   // Use this if u wish to run test on Chrome.
		driver.get("http://www.tinyupload.com/");
		driver.findElement(By.name("uploaded_file")).click();
		
		// Runtime.getRuntime().exec("C:/Selenium/workspace_EclipseVersion_4.10/SeleniumJavaFramework/src/test/java/AutoIT Scripts/FileUploadScript.exe");
		// Runtime.getRuntime().exec("C:/Selenium/workspace_EclipseVersion_4.10/SeleniumJavaFramework/src/test/java/AutoIT Scripts");
		Runtime.getRuntime().exec("C:/FileUploadScript.exe"); // Only this statement uses AutoIT in whole of this script.
		// U will get the EXE (used in above statement) when you compile AutoIT Script which is FileUploadScript.au3, located at location specified in above statement.
	}
}
