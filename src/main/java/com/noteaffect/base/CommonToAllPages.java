package com.noteaffect.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.noteaffect.utils.PropertiesReader;

import static com.noteaffect.driver.DriverManager.getDriver;

import java.util.List;

public class CommonToAllPages {

	public void openNoteAffectURL() {
		getDriver().get(PropertiesReader.readKey("url"));
		getDriver().manage().window().maximize();
		
	}
	
	public void clickElement(By by) {
		getDriver().findElement(by).click();
		
	}

	public void enterInput(By by, String key) {
		getDriver().findElement(by).sendKeys(key);
	}

	public void enterInput(WebElement by, String key) {
        by.sendKeys(key);
    }
	
	public String getText(By by) {
		return getDriver().findElement(by).getText();
	}

	public String getTitle() {
		return getDriver().getTitle();
	}
	
	public String getURL() {
		return getDriver().getCurrentUrl();
	}
}
