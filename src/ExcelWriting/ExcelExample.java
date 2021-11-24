package ExcelWriting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExample {

	public static void main(String[] args) throws Throwable {
		XSSFWorkbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("DemoExcel");
		Row row;
		Cell cell;
		row = sheet.createRow(0);
		cell = row.createCell(0);
		cell.setCellValue("Name");
		cell = row.createCell(1);
		cell.setCellValue("Company");

		row = sheet.createRow(1);
		cell = row.createCell(0);
		cell.setCellValue("Pooja");
		cell = row.createCell(1);
		cell.setCellValue("TCS");

		row = sheet.createRow(2);
		cell = row.createCell(0);
		cell.setCellValue("Geeta");
		cell = row.createCell(1);
		cell.setCellValue("Accenture");

		row = sheet.createRow(3);
		cell = row.createCell(0);
		cell.setCellValue("Raj");
		cell = row.createCell(1);
		cell.setCellValue("Wipro");

		row = sheet.createRow(4);
		cell = row.createCell(0);
		cell.setCellValue("Ram");
		cell = row.createCell(1);
		cell.setCellValue("Cognizant");

		row = sheet.createRow(5);
		cell = row.createCell(0);
		cell.setCellValue("Rohini");
		cell = row.createCell(1);
		cell.setCellValue("Majesco");

		File f = new File("/Users/Mithun/Documents/JAVA/DemoExcel.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		workbook.write(fos);

		fos.close();

		System.out.println("File created");

	}

}
