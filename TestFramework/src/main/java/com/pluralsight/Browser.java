package com.pluralsight;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

	static WebDriver driver = new ChromeDriver();
	static JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	static WebDriverWait wait = new WebDriverWait(driver, 10);
	
	
	public static void goTo(String url) {
		driver.get(url);
		
	}

	public static String title() {
		return driver.getTitle();
	}

	public static void close() {
		driver.close();
		
	}
	
}