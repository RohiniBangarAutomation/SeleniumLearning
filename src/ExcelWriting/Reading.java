package ExcelWriting;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Reading {

	public static void main(String[] args) throws Throwable {

		File f = new File("/Users/Mithun/Documents/JAVA/MyExcel.xlsx");
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
