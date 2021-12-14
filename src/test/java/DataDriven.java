import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\DataDrivenFramework\\Excel\\Book1.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fs);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(1);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
	}}
