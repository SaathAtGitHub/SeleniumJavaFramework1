/* Created this file while watching this video: “Selenium Framework for Beginners 17 | What is Properties File | How to use” 
 * located at https://www.youtube.com/watch?v=1GeVbi1uj_8&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=19
 * 
 * TEST RESULT: 
 * This test is PASS as it successfully read data (key, values) from "config.properties" file located in "config" folder. This
 * test is combination of how to use .properties file with TestNG.
 * 
 * WHEN THIS VID IS OVER rename this file to PropertiesFile_Demo
 * 
 *  * Refer "2019 - How to code at work (Selenium) - 2019’s Prep" Google Docs file for detailed note taken while I watched this video.
 * This Google Docs file is located in Google Drive > QA > Selenium > At Work (Use these files at work). 
 */
package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile_Demo {

	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir"); //This variable should be written in a Base Class and this class should extend to that Base Class.  
	static String browser = prop.getProperty("browser");

	public static void main(String[] args) {
		getProperties(); 
		setProperties();
		setProperties();
	}

	public static void getProperties() // Function to read data from PROPERTIES file
	{
		try
		{
			InputStream input = new FileInputStream( projectPath + "/src/test/java/config/config.properties" ); // To read from .properties file
			prop.load(input);
			System.out.println("Print this file name here using env variable..");
			System.out.println("Browser name accessed from .properties file, is: " + browser);
			System.out.println("Checking if value of 'browser' is accessed: " + browser);
			PropertiesFile_CrossBrowserTestingUsingPropertiesFile.browserName = browser; // Assigning a property value to a variable located in a diff class.
			System.out.println("Checking if value of 'browserName' is accessed: " + PropertiesFile_CrossBrowserTestingUsingPropertiesFile.browserName);
		} catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

	public static void setProperties() // Function to write data in the PROPERTIES file 
	{
		try {
			OutputStream output = new FileOutputStream( projectPath + "/src/test/java/config/config.properties" );
			prop.setProperty("browser", "Chrome"); // Defining the key, value of the property you wish to store. This won't store the key, value to the .PROPERTIES file.
			prop.store(output, "TESTING IF THIS COMMENT IS PRINTED IN THE .PROPERTIES FILE: Storing Browser's value as 'Chrome'");
			// System.out.println("Property browser's value is replaced");
		} catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

}
