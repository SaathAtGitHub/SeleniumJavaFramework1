/* I created this file while watching this video and : “Selenium Framework for Beginners 7 | What is Page Object Model (POM) | How to create POM in Selenium” 
 * located at https://www.youtube.com/watch?v=-0F-YBAQdGE&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=8 
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage 
{

	private static WebElement element = null; //Declare WebElement variable here so that way you won't have to declare in methods and you can use it simply by referring it's name.  
	// Raghav declared above variable as private so it is accessible to this class only as he said @ 8:40.
	
	public static WebElement textbox_search(WebDriver driver)
	{
		element = driver.findElement(By.name("q"));
		return element;
	}

	public static WebElement button_search(WebDriver driver)
	{
		element = driver.findElement(By.name("btnK"));
		return element;
	}
		

}
