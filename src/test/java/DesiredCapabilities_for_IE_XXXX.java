// Code below is copied from https://www.guru99.com/desired-capabilities-selenium.html
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DesiredCapabilities_for_IE_XXXX {
  
 public static void main(String[] args) {
  
WebDriver driver = new InternetExplorerDriver();
 driver.manage().window().maximize();
 driver.get("http://gmail.com");
  
 driver.quit();
 }
  
}

