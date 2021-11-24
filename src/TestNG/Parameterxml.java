package TestNG;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterxml {
	@Test(dataProvider = "getData")
	public void formfill(String Name, String Company) {
		System.out.println(Name + " " + Company );

	}
	
		@DataProvider
		public void getData() throws Throwable {
			File f = new File("/Users/Mithun/Documents/JAVA/DemoExcel.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook workbook = WorkbookFactory.create(f);
			Sheet sheet = workbook.getSheetAt(0);

			System.out.println("Row and Column Values from Selected ExcelSheet:\n");

			for (int i = 0; i <= sheet.getLastRowNum(); i++) {

				Row row = sheet.getRow(i);

				for (int j = 0; j < row.getLastCellNum(); j++) {

					Cell cell = row.getCell(j);

					System.out.print(" || " + cell);

				}
				System.out.println("");
			}
			System.out.println("");

			fis.close();
			System.out.println("Reading Completed");
			
			
	}
		
	}


