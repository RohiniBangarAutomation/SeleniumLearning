package ExcelWriting;

	import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class excel {

		public static void main(String[] args) throws Throwable {

			XSSFWorkbook workbook = new XSSFWorkbook();

			Sheet sheet = workbook.createSheet("MyFile");
			for (int i = 0; i < 10; i++) {
				Row row = sheet.createRow(i);
				for (int j = 0; j < 10; j++) {
					Cell cell = row.createCell(j);
					 //cell.setCellValue("Hello");
					cell.setCellValue((int) (Math.random() * 100));
				}
			}

			File f = new File("/Users/Mithun/Documents/JAVA/MyExcel.xlsx");
			FileOutputStream fos = new FileOutputStream(f);
			workbook.write(fos);
			fos.close();
			System.out.println("File created");

		}

	}



