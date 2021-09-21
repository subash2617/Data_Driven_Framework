package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	
	public static void main(String[] args) throws IOException {
		
		// to get the file location
		File loc = new File("C:\\Users\\SUBASH\\eclipse-workspace\\SeleniumFrameworks\\Input\\TestData.xlsx");
		
		// Read The File Values
		FileInputStream f = new FileInputStream(loc);
		
		//Workbook type
		Workbook w = new XSSFWorkbook(f);
		
		//To get Sheet
		Sheet s = w.getSheet("Sheet1");
		
		//To get the No of Rows in the Excel Sheet
		System.out.println("The No of Rows in the Excel Sheet: "+s.getPhysicalNumberOfRows());
		
		//To get Row
		Row r = s.getRow(0);
		
		//To get the No of Cells in the Row
		System.out.println("The No of Cells in the Row: "+r.getPhysicalNumberOfCells());
		
		//To get Cell
		Cell c1 = r.getCell(0);
		Cell c2 = r.getCell(1);
		
		//To Print the Value
		System.out.println(c1);
		System.out.println(c2);
	}
}
