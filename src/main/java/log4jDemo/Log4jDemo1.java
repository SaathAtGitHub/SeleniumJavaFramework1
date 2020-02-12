/* I created this XML file while I watched "Log4j Tutorial- Selenium WebDriver- Java" video located at https://www.youtube.com/watch?v=_1hIb2cujZE
 * As he said @ 59:09, I configured this class / file in such a way that ALL ACTIVITIES will be logged.
 * 
 * TEST RESULT: 
 * Output of this test should NOT print all types of log but it does print all type log once each. While in above video somewhere around @ 1:03:17,
 * in his log only ERROR logs are getting printed while in my case, both DEBUG and ERROR get printed. Not sure why. 
 * 
 *  * Refer "2019 - How to code at work (Selenium) - 2019’s Prep" Google Docs file for detailed note taken while I watched this video.
 * This Google Docs file is located in Google Drive > QA > Selenium > At Work (Use these files at work). 
 */
package log4jDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo1 {
	
	private static Logger log;
	static int x = 4;

	public static void main(String[] args) {
		
		log = LogManager.getLogger(Log4jDemo1.class.getName());
		log.debug("\nExecution started..");
		
		if(5<x)
		{
			log.debug("\nCondition successful");
		}
		else
		{
			log.error("\nCondition failed");
		}
	}
}
