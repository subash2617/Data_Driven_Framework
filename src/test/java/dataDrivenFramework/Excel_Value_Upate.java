package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Value_Upate {

	
	public static void main(String[] args) throws IOException {
		
		// to get the file location
		File loc = new File("C:\\Users\\SUBASH\\eclipse-workspace\\SeleniumFrameworks\\Input\\TestData.xlsx");
		
		// Read The File Values
		FileInputStream f = new FileInputStream(loc);
		
		//Workbook type
		Workbook w = new XSSFWorkbook(f);
		
		//To get Sheet
		Sheet s = w.getSheet("Sheet1");
		
		//To get Row
		Row r = s.getRow(0);
		
		//To get Cell
		Cell c1 = r.getCell(0);
		Cell c2 = r.getCell(1);
		c1.setCellValue("Framework");
		
		//To save The File
		FileOutputStream fo = new FileOutputStream(loc);
		w.write(fo);

		//To Print The Update Cell Value
		System.out.println(c1);
		System.out.println(c2);
		
	}
}
