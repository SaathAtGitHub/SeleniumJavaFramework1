/* Code in this file is copied from this video "Selenium Framework for Beginners 18 | How to use Excel for getting data in Selenium Java Framework" 
 * located at https://www.youtube.com/watch?v=CV3SOorFydE&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=20
 * 
 * TEST RESULT: It is PASS.
 * This test access "Sheet1" from "data.xlsx", prints following things on Console: 
 * Prints total number of rows in the Excel sheet using this method: sheet.getPhysicalNumberOfRows()
 * There are 2 different methods to print Numeric and String cell data as explaind below:
 * Prints numeric cell value using this method: sheet.getRow(rawNum).getCell(colNum).getNumericCellValue();
 * Prints String cell value using this method: sheet.getRow(rawNum).getCell(colNum).getStringCellValue();
 */
package utils;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils_Original {

	String projectPath = System.getProperty("user.dir"); //This variable should be written in a Base Class and this class should extend to that Base Class.
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils_Original(String excelPath, String sheetName)
	{
		try{
			workbook = new XSSFWorkbook(projectPath + "/excel/data.xlsx");
//			workbook = new XSSFWorkbook("C:\\Selenium - 2019's Prep\\SeleniumJavaFramework\\excel\\data.xlsx");
			
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception exp) {
			System.out.println("From ExcelUtils constructor: " + exp.getMessage());
			System.out.println("From ExcelUtils constructor: " + exp.getCause());
			exp.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
		// getRowCount();
		getCellDataString(0, 0);
		getCellDataNumber(1, 1);
	}

	public static void getColCount()
	{
		try {
			int colCount = sheet.getRow(0).getPhysicalNumberOfCells();  // Get total number of columns from the sheet
			System.out.println("Total number of rows in '" + sheet.getSheetName() + "' sheet are: " + colCount);
		} /*catch (Exception exp) {
			System.out.println("From getRowCount function: " + exp.getMessage());
			System.out.println("From getRowCount function: " + exp.getCause());
			exp.printStackTrace();
		}*/finally{
			System.out.println("Finally block of getRowCount function..");
		}
		
	}
	
	public static void getRowCount()
	{
		try {
			System.out.println("First row number of the '" + sheet.getSheetName() + "' sheet is: " + sheet.getFirstRowNum());
			System.out.println("Last row number of the '" + sheet.getSheetName() + "' sheet is: " + sheet.getLastRowNum());
			int rowCount = sheet.getPhysicalNumberOfRows();  // Get total number of rows from the sheet
			System.out.println("Total number of rows in '" + sheet.getSheetName() + "' sheet are: " + rowCount);
		} /*catch (Exception exp) {
			System.out.println("From getRowCount function: " + exp.getMessage());
			System.out.println("From getRowCount function: " + exp.getCause());
			exp.printStackTrace();
		}*/finally{
			System.out.println("Finally block of getRowCount function..");
		}
		
	}

	public static void getCellDataString(int rawNum, int colNum)
	{
		try {
			String cellData_00 = sheet.getRow(rawNum).getCell(colNum).getStringCellValue();
			String cellData_01 = sheet.getRow(rawNum).getCell(colNum).getStringCellValue();
			System.out.println("Value for cell(0,0) is: '" + cellData_00 + "' and the value for cell(0,1) is: '" + cellData_01 + "'");
			//				
			//				String cellData_10 = sheet.getRow(1).getCell(0).getStringCellValue();
			//				double cellData_11 = sheet.getRow(1).getCell(1).getNumericCellValue();
			//				System.out.println("Value for for cell(1,1) is: '" + cellData_11 + "'");

		} /*catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}*/
		finally{
			System.out.println("Finally block of getCellDataString function..");
		}
	}

	public static void getCellDataNumber(int rawNum, int colNum)
	{
		try {
			//				String cellData_00 = sheet.getRow(0).getCell(0).getStringCellValue();
			//				String cellData_01 = sheet.getRow(0).getCell(1).getStringCellValue();
			//				System.out.println("Value for cell(0,0) is: '" + cellData_00 + "' and the value for cell(0,1) is: '" + cellData_01 + "'");
			//				
			//				String cellData_10 = sheet.getRow(1).getCell(0).getStringCellValue();
			double cellData_11 = sheet.getRow(rawNum).getCell(colNum).getNumericCellValue();
			System.out.println("Value for for cell(1,1) is: '" + cellData_11 + "'");

		} /*catch (IOException exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}*/ finally{
			System.out.println("Finally block of getCellDataNumber function..");
		}
	}
}
