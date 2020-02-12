/* Code in this file is copied from this video "Selenium Framework for Beginners 18 | How to use Excel for getting data in Selenium Java Framework" 
 * located at https://www.youtube.com/watch?v=CV3SOorFydE&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=20
 * 
 * TEST RESULT: It is PASS.
 */
package utils;
import utils.ExcelUtils;

public class ExcelUtilsDemo {
	
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir"); //This variable should be written in a Base Class and this class should extend to that Base Class.
		ExcelUtils excel = new ExcelUtils(projectPath + "\\excel\\data.xlsx", "Sheet1");

		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
	}

}
