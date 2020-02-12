/* If you don't know from where to download ChromeDriver then simply comment out that statement and run your test, you will get error. Now the error
 * itself give you the URL from where you can download ChromeDriver.
 */
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P {

	public static void main(String[] args) 
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("Location of this project is: " + projectPath + "\n");  // This will print "C:\Selenium - 2019's Prep\SeleniumJavaFramework"

		// System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 78.0.3904.70/chromedriver.exe");
		   System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 2.36/chromedriver.exe"); // If this don't work then use above statement
		// Raghav Pal used Chrome Driver Version 2.9 but it was showing "data:," in Chrome's address bar so he suggested to use version 2.36 which fixed the issue. Also Chrome Driver Version 78.0.3904.70 works as I tried it. As of Nov 9, 2019 this is the latest Chrome Driver. 
		WebDriver driver = new ChromeDriver();   // Use this if u wish to run test on Chrome.
		
		driver.get("https://google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		
		List<WebElement> listOfAllInputTagsOnThePage = driver.findElements(By.xpath("//input"));
		List<WebElement> listOfAllLinkTagsOnThePage = driver.findElements(By.xpath("//a"));
		List<WebElement> listOfAllIMGtagsOnThePage = driver.findElements(By.xpath("//Img"));
		
		int countInputTags = listOfAllInputTagsOnThePage.size(); 
//		int countAtags = driver.findElements(By.xpath("//input")).size();  //This works as well
		int countAtags = listOfAllLinkTagsOnThePage.size(); 
		System.out.println("Total input tags found on this page are: " + countInputTags);
		System.out.println("Total A or Anchor tags found on this page are: " + countAtags);
		System.out.println("Total IMG tags or images found on this page are: " + listOfAllIMGtagsOnThePage.size());
		
		// driver.get("https://google.com/");
		// driver.navigate().to("https://www.indiawest.com/");
		driver.navigate().to("https://www.w3schools.com/");
		
		List<WebElement> listOfAllInputTagsOnThePageW3 = driver.findElements(By.xpath("//input"));
		List<WebElement> listOfAllLinkTagsOnThePageW3 = driver.findElements(By.xpath("//a"));
		List<WebElement> listOfAllIMGtagsOnThePageW3 = driver.findElements(By.xpath("//Img"));
		
		int countInputTagsW3 = listOfAllInputTagsOnThePageW3.size(); 
//		int countAtagsW3 = driver.findElements(By.xpath("//input")).size();  //This works as well
		int countAtagsW3 = listOfAllLinkTagsOnThePageW3.size(); 
		System.out.println("Total input tags found on this page are: " + countInputTagsW3);
		System.out.println("Total A or Anchor tags found on this page are: " + countAtagsW3);
		System.out.println("Total IMG tags or images found on this page are: " + listOfAllIMGtagsOnThePageW3.size());
		
		
		/*System.out.println("\nThe HTML A Tag name at 0th index is: " + listOfAllLinkTagsOnThePage.get(0).getTagName());
		System.out.println("The link text at 0th index is: " + listOfAllLinkTagsOnThePage.get(0).getText());
		System.out.println("The HTML Input Tag name at 0th index is: " + listOfAllInputTagsOnThePage.get(1).getTagName());
		System.out.println("The link text at 0th index is: " + listOfAllLinkTagsOnThePage.get(1).getText());
		// driver.close();
		 * 
		 */
	}
}
