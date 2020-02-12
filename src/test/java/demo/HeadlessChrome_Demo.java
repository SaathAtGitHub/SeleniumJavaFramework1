/* I created this file while I watched "Selenium Framework for Beginners 32 | How to use Headless Chrome with Selenium"
 * located at https://www.youtube.com/watch?v=pJtBjvwb86E&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=34
 * 
 * Tip: If you don't know from where to download ChromeDriver then simply comment out that statement and run your test, you will get error. 
 * Now the error itself give you the URL from where you can download ChromeDriver.
 * 
 * TEST RESULT: Pass (I ran this test on February 8, 2020)
 * HEADLESS CHROME BROWSER MEANS YOU WON'T SEE BROWSER GETTING OPENED UP BUT FOLLOWING OUTPUT WILL STILL GET PRINTED ON CONSOLE..
 * Use following code in order to run your test on Chrome in Headless mode:
 * 
 * ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		// options.addArguments("headless");  // This statements works fine as well as I tried it.
		WebDriver driver = new ChromeDriver(options);   // Use this if u wish to run test on Chrome.
 */
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome_Demo {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Location of this project is: " + projectPath + "\n");  
		// Above will print "C:\Selenium - 2019's Prep\SeleniumJavaFramework"
		
		System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 2.36/chromedriver.exe"); // If this don't work then use above statement
		// Raghav Pal used Chrome Driver Version 2.9 but it was showing "data:," in Chrome's address bar so he suggested to use version 2.36 which fixed the issue. Also Chrome Driver Version 78.0.3904.70 works as I tried it. As of Nov 9, 2019 this is the latest Chrome Driver. 
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		// Following arguments copied from https://stackoverflow.com/questions/38335671/where-can-i-find-a-list-of-all-available-chromeoption-arguments
		options.addArguments("start-maximized");
		// options.addArguments("--window-size=1920,1080");  // In this video Raghav showed how to check for the DPI values to use in this statement.
		// options.addArguments("--enable-precise-memory-info");
		options.addArguments("--disable-popup-blocking");
		// options.addArguments("headless");  // This statements works fine as well as I tried it.
		WebDriver driver = new ChromeDriver(options);   // Use this if u wish to run test on Chrome.
		
		driver.get("https://google.com");
		System.out.println("\nHEADLESS CHROME BROWSER MEANS YOU WON'T SEE BROWSER GETTING OPENED UP BUT FOLLOWING OUTPUT WILL STILL GET PRINTED ON CONSOLE..");
		System.out.println("THIS OUTPUT PRINTED IN HEADLESS CHROME MODE: Title of current page is: " + driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.TAB);
		//driver.findElement(By.name("q")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[3]/center/input[1]")).click();;
		// driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);  // I think my Chrome is updated as of February 8, 2020 so getting error on this line.
		
		System.out.println("THIS OUTPUT PRINTED IN HEADLESS CHROME MODE: Test completed successfully..");
		driver.close();
		driver.quit();
	}

}
