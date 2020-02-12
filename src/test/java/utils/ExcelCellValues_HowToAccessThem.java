/* Code in this file is copied from this video "Selenium Framework for Beginners 18 | How to use Excel for getting data in Selenium Java Framework" 
 * located at https://www.youtube.com/watch?v=CV3SOorFydE&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=20
 * 
 * TEST RESULT: It is PASS.
 * This test access "Sheet1" from "data.xlsx", prints following things on Console: 
 * The first and last row number 
 * Prints sheet's name 
 * Particular Cell's data
 */
package utils;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCellValues_HowToAccessThem {
	
	static String projectPath = System.getProperty("user.dir"); //This variable should be written in a Base Class and this class should extend to that Base Class.
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) 
	{
		getRowCount();
		getCellData();
	}

		public static void getRowCount()
		{
			try {
				workbook = new XSSFWorkbook(projectPath + "/excel/data.xlsx");
				sheet = workbook.getSheet("Sheet1");
				System.out.println("First row number of the '" + sheet.getSheetName() + "' sheet is: " + sheet.getFirstRowNum());
				System.out.println("Last row number of the '" + sheet.getSheetName() + "' sheet is: " + sheet.getLastRowNum());
				int rowCount = sheet.getPhysicalNumberOfRows();
				System.out.println("Total number of rows in '" + sheet.getSheetName() + "' sheet are: " + rowCount);
			} catch (IOException exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
		}
		
		public static void getCellData()
		{
			try {
				workbook = new XSSFWorkbook(projectPath + "/excel/data.xlsx");
				sheet = workbook.getSheet("Sheet1");
				String cellData_00 = sheet.getRow(0).getCell(0).getStringCellValue();
				String cellData_01 = sheet.getRow(0).getCell(1).getStringCellValue();
				System.out.println("Value for cell(0,0) is: '" + cellData_00 + "' and the value for cell(0,1) is: '" + cellData_01 + "'");
				
				String cellData_10 = sheet.getRow(1).getCell(0).getStringCellValue();
				double cellData_11 = sheet.getRow(1).getCell(1).getNumericCellValue();
				System.out.println("Value for cell(1,0) is: '" + cellData_10 + "' and the value for cell(1,1) is: '" + cellData_11 + "'");
				
			} catch (IOException exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
		}
		
}
