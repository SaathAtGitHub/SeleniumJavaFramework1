/* Code in this file is copied from this video "Selenium Framework for Beginners 19 | Selenium TestNG How to get data from Excel using DataProvider" 
 * located at https://www.youtube.com/watch?v=02ANy2pu_ZA&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=21
 * 
 * A Data Provider returns an array of objects.
 * 
 * TEST RESULT: It is GETTING ERROR for which I didn't spent time to debug.
 * 
 * THIS TEST IS FOR WHAT:
 * As the title of this video says, this test uses TestNG to get data from Excel using @DataProvider annotation.
 * 
 * FROM WHERE THIS TEST GETS TEST DATA:
 * This test gets test data from "Sheet1" of "data.xlsx", this file is located in "excel" folder which is located in this project's root.
 */
package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	@Test(dataProvider = "test1data")
	public void test1(String username, String password)
	{
		System.out.println(username + " | " + password);
	}
	
	@DataProvider(name = "test1data")
	public Object[][] getData()
	{
		Object data[][] = testData(System.getProperty("user.dir") + "\\excel\\data.xlsx", "Sheet1");
		return data;
	}

	public Object[][] testData(String excelPath, String sheetName)
	{
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		
		for(int i=0; i<rowCount; i++)
		{
			for(int j=0; j<colCount; j++)
			{
				String cellData = ExcelUtils.getCellDataString(i, j);
				// System.out.println("Printing from testData(): " + cellData);
				System.out.println(cellData + " | ");
				data[i-1][j] = cellData;
			}
		}
		return data;
	}

}
