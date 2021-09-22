package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LibGlobal {

	public static WebDriver driver;
	public static void getDriver() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUBASH\\eclipse-workspace\\SeleniumFrameworks\\driver\\msedgedriver.exe");
		driver = new EdgeDriver();
	}
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	
	public static void quitBrowser() {
		driver.quit();
	}
	
	public static String getData(int row, int cell) throws IOException {
		File loc = new File("C:\\Users\\SUBASH\\eclipse-workspace\\SeleniumFrameworks\\Input\\TestData.xlsx");
		FileInputStream f = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(row);		
		Cell c = r.getCell(cell);
	
		String value = null;
		//CellType 1-->String, 0-->Number
		int cellType = c.getCellType();
		if (cellType == 1) {
			value = c.getStringCellValue();
		} else if (cellType == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd/MM/YYYY");
				value = sim.format(dateCellValue);
			}else {
				double numericCellValue = c.getNumericCellValue();
				long l = (long) numericCellValue;
				value = String.valueOf(l);
			}
		}
		return value;
	}
}
