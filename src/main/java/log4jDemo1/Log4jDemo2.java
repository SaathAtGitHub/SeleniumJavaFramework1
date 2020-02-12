/* I created this XML file while I watched "Log4j Tutorial- Selenium WebDriver- Java" video located at https://www.youtube.com/watch?v=_1hIb2cujZE
 * As he said @ 59:13, I configured this class / file in such a way that only ERRORS will be logged. 
 * 
 * TEST RESULT: 
 * Output of this test should print all types of log and it does print DEBUG and ERROR type log once each. While in above video @ 1:03:17,
 * in his log two DEBUG and two ERROR get printed and mine both get printed only once. Not sure why.
 * Package of this file is configured in Log4j2.xml so the log should be printed in prints.log file located in "logs" folder BUT it didn't. I too
 * didn't spend time to find the reason as I need to learn logging. 
 * 
 *  * Refer "2019 - How to code at work (Selenium) - 2019’s Prep" Google Docs file for detailed note taken while I watched this video.
 * This Google Docs file is located in Google Drive > QA > Selenium > At Work (Use these files at work). 
 */
package log4jDemo1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo2 {
	
	private static Logger log;
	static int x = 4;

	public static void main(String[] args) {
		
		log = LogManager.getLogger(Log4jDemo2.class.getName());
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
