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
}
