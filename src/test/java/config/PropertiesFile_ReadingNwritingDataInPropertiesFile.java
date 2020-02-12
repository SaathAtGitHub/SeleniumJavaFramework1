/* Created this file while watching this video: “Selenium Framework for Beginners 17 | What is Properties File | How to use” 
 * located at https://www.youtube.com/watch?v=1GeVbi1uj_8&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=19
 * 
 * TEST RESULT: 
 * This test is PASS as it successfully read data (key, values) from "config.properties" file located in "config" folder.
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

public class PropertiesFile_ReadingNwritingDataInPropertiesFile {

	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");
	static String browser = prop.getProperty("browser");

	public static void main(String[] args) {
		getProperties(); 
		setProperties();
		getProperties(); 
	}

	public static void getProperties() // Function to read data from PROPERTIES file
	{
		try
		{
			InputStream input = new FileInputStream( projectPath + "/src/test/java/config/config.properties" ); // To read from .properties file
			prop.load(input);
			// System.out.println("Browser name accessed from .properties file, is: " + browser); 
			// I'm not getting browser's value in above statement but if I replace "browser" with "prop.getProperty("browser")" [as I did in the following satement] then I get the value = WEIRD.
			System.out.println("Browser name accessed from .properties file, is: " + browser);
		} catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

	private static void setProperties() // Function to write data in the PROPERTIES file 
	{
		try {
			OutputStream output = new FileOutputStream( projectPath + "/src/test/java/config/config.properties" );
			prop.setProperty("browser", "Chrome"); // Defining the key, value of the property you wish to store. This won't store the key, value to the .PROPERTIES file.
			prop.setProperty("result", "PASS");
			prop.setProperty("Key1", "Prop1");
			prop.setProperty("Key2", "Prop2");
			prop.setProperty("Key3", "Prop3");
			prop.setProperty("Key44", "Prop44");
			prop.store(output, "COMMENT: Storing Browser's value as 'Chrome'"); // Removing this statement will delete everything from the "config.properties" file
			// System.out.println("Property browser's value is replaced");
		} catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

}
