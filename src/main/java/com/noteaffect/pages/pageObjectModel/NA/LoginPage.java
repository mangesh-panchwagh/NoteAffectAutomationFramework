package com.noteaffect.pages.pageObjectModel.NA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.noteaffect.base.CommonToAllPages;
import com.noteaffect.utils.WaitHelper;
import static com.noteaffect.driver.DriverManager.getDriver;

import java.util.Arrays;
import java.util.List;

public class LoginPage extends CommonToAllPages {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Step 1 - Page Locators
	private By username = By.id("Email");
	private By password = By.id("Password");
	private By signButton = By.xpath("//button[text()='Log in']");
	private By error_message = By.xpath("//li[text()='Invalid login credentials.']");
	private By blankUserNameErrorMessage = By.xpath("//span[contains(text(),'The Email field is required.')]");
	private By blankPasswordErrorMessage = By.xpath("//span[contains(text(),'The Password field is required.')]");
	private By loginErrorMessage = By.xpath("//li[contains(text(),'Invalid login credentials.')]");

	public String loginToNoteAffectLoginInvalidCreds(String user, String pwd) {
		openNoteAffectURL();
		enterInput(username,user);
		enterInput(password,pwd);
		clickElement(signButton);
		
		WaitHelper.checkVisibility(getDriver(),error_message);
		return getText(error_message);
	}
	
	public void loginToNoteAffectLoginValidCreds(String user, String pwd) {
		openNoteAffectURL();
		enterInput(username,user);
		enterInput(password,pwd);
		clickElement(signButton);
		
		// Wait - Thread sleep
		WaitHelper.waitJVM(5000);
	}
	
	
	public String pageTitleValidatinForNoteAffect() {
		openNoteAffectURL();
		return getTitle();
	}

	public String urlValidationForNoteAffect(){
		openNoteAffectURL();
		return getURL();
	}

	public String validateErrorMessage() {
		openNoteAffectURL();
		return getText(loginErrorMessage);
	}
	
	
	public String loginToNoteAffectBlankUserNameValidPassword(String user, String pwd) {
		openNoteAffectURL();
		enterInput(username,user);
		enterInput(password,pwd);
		clickElement(signButton);
		
		WaitHelper.checkVisibility(getDriver(),blankUserNameErrorMessage);
		return getText(blankUserNameErrorMessage);
	}
	
	public String loginToNoteAffectValidUserNameBlankPassword(String user, String pwd) {
		openNoteAffectURL();
		enterInput(username,user);
		enterInput(password,pwd);
		clickElement(signButton);
		
		WaitHelper.checkVisibility(getDriver(),blankPasswordErrorMessage);
		return getText(blankPasswordErrorMessage);
	}
 
	public List<String> loginToNoteAffectBlankUserNameBlankPassword(String user, String pwd) {
		openNoteAffectURL();
		enterInput(username,user);
		enterInput(password,pwd);
		clickElement(signButton);

		String blankUsername = blankUserNameErrorMessageGetText();
		String blankPassword = blankPasswordErrorMessageGetText();
		
		return Arrays.asList(blankUsername, blankPassword);
	}
	
	public String blankUserNameErrorMessageGetText() {
		return getText(blankUserNameErrorMessage);
	}
	public String blankPasswordErrorMessageGetText() {
		return getText(blankPasswordErrorMessage);
	}
	
}
