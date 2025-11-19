package com.noteaffect.pages.pageObjectModel.NA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.noteaffect.base.CommonToAllPages;

public class RegisterPage extends CommonToAllPages {

	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Step 1 - Page Locators
	private By registerLinkClick = By.linkText("Register as a new user?");
	private By firsName = By.id("FirstName");
	private By lastName = By.id("LastName");
	private By email = By.id("Email");
	private By password = By.id("Password");
	private By confirmPassword = By.id("ConfirmPassword");
	private By registerButton = By.xpath("//button[text()='Register']");
	private By firstNameValidationErrorMessage = By.xpath("//span[text()='The First name field is required.']");
	private By lastNameValidationErrorMessage = By.xpath("//span[text()='The Last name field is required.']");
	private By emailValidationErrorMessage = By.xpath("//span[text()='The Email field is required.']");
	private By InvalidEmailValidationErrorMessage = By.xpath("//span[text()='The Email field is not a valid e-mail address.']");
	private By passwordValidationErrorMessage = By.xpath("//span[text()='The Password field is required.']");
	private By confirmPasswordValidationErrorMessage = By.xpath("//span[text()='The password and confirmation password do not match.']");
	private By backToLoginLink = By.xpath("//a[text()='Back to login']");
	private By privacyPolicy = By.xpath("//a[@data-target='#privacy-modal']");
	private By closeprivacyPolicy = By.xpath("//button[@class='close']");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
