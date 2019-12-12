package com.pluralsight;

import org.openqa.selenium.By;

public class PathPages {
	
	static String url = "https://www.pluralsight.com/product/skill-iq";
	static String title = "Java | Pluralsight";
	

	public void goTo() {
		Browser.driver.manage().window().maximize();
		Browser.goTo(url);
		
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

	public void goToJavaPath() {
//		Browser.driver.findElement(By.cssSelector("body > div.cookie_notification.options > div > a.button.button--secondary.button--tiny.cookie_notification--opt_in")).click();
//		Browser.jse.executeScript("window.scrollBy(0,4000)");
//		Browser.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pathContent\"]/div[55]/a/div/div[2]")));
		Browser.jse.executeScript("arguments[0].click();", Browser.driver.findElement(By.xpath("//div[55]/a/div/div[2]")));
//		Browser.driver.findElement(By.xpath("//div[55]/a/div/div[2]")).click();
	}

}

