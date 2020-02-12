/* I've created this file by by following steps explained @ 9:02, in this video: "Selenium Framework for Beginners 14 | What is Log4j | How to add Log4j in java project" 
 * located at https://www.youtube.com/watch?v=rbuR9Q_55h4&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=16
 * 
 * TEST RESULT (Test ran on December 8, 2019):
 * This file is linked with log4j2.properties. This test prints the log on Console window but for some reason, fails to print log in
 * LogForLog4jDemoDotJava.log or MyLog.log files. I didn't dig to know why so need to google out the reason.
 */
 package log4jDemo;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.message.LoggerNameAwareMessage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;


public class Log4jDemo {
	
//    protected static final Logger parentLogger = LogManager.getLogger();
	// protected static final Logger logger = LogManager.getLogger(Log4jDemo.class);
	private static Logger logger = LogManager.getLogger(Log4jDemo_NotWorking.class);

	public static void main(String[] args) {
		
		System.out.println("\n==== Hello World...! ====\n");
		
		logger.trace("This is a trace message.");
		logger.info("This is information message.");
		logger.error("This is an error message.");
		logger.warn("This is a warning message.");
		logger.fatal("This is a fatal message.");
		
		System.out.println("\n ==== Completed ====");
	}

}
