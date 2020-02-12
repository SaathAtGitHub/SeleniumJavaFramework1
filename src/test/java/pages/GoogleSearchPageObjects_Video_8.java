/* I created this file while watching this video: Watching “Selenium Framework for Beginners 8 | How to implement POM in Selenium Java” located 
at https://www.youtube.com/watch?v=tnWig6KfQ9w&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=9 
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPageObjects_Video_8 
{
	WebDriver driver = null;
	
	By textbox_search = By.name("q");
	By button_search = By.name("btnK");
	
	public GoogleSearchPageObjects_Video_8(WebDriver driver) // Creating constructor to initialize driver
	{
		this.driver = driver;
	}
	
	public void setTextInSearchBox(String text)
	{
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	public void clickSearchBox()
	{
		driver.findElement(button_search).sendKeys(Keys.ENTER); // Used sendKeys because the button remains hidden,in that case hitting ENTER with sendKeys will work.
	}
	
}
