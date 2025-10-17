package com.noteaffect.utils;

import static com.noteaffect.driver.DriverManager.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

	public static void waitJVM(int time) {
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			throw new RuntimeException();
		}
		
	}
	
	public static void checkVisibility(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	 public static WebElement visibilityOfElement(By elementLocation) {
	        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
	    }
	

}
