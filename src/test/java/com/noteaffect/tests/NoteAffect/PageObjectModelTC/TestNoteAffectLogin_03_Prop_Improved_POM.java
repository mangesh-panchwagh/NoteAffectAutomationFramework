package com.noteaffect.tests.NoteAffect.PageObjectModelTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.noteaffect.pages.pageObjectModel.NA.DashBoradPage;
import com.noteaffect.pages.pageObjectModel.NA.LoginPage;
import com.noteaffect.utils.PropertiesReader;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;

import com.noteaffect.base.CommonToAllTests;
import com.noteaffect.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

public class TestNoteAffectLogin_03_Prop_Improved_POM extends CommonToAllTests{

	private static final Logger logger = LogManager.getLogger(TestNoteAffectLogin_03_Prop_Improved_POM.class);
	
	
	@Owner("Mangesh")
	@Description("TC#1-Verify that with invalid email, pass, error message is shown on the noteaffect")
	@Test
	public void test_negative_noteaffect_login() {
		
		logger.info("Starting the Testcases Page Object Model");
		
		// Driver Manager Code - 1 - D
		//WebDriver driver = new ChromeDriver();
		
		// Page Class Code (POM Code) - 2 - L
		LoginPage loginPage = new LoginPage(DriverManager.getDriver());
		String error_msg = loginPage.loginToNoteAffectLoginInvalidCreds(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));
		
		logger.info("Asserting the invalid credentials");
		
		// Assertions - 3 - V
		assertThat(error_msg).isNotEmpty().isNotNull().isNotBlank();
		Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));
		
		//driver.quit();

	}
	
	@Owner("Mangesh")
	@Description("TC#2-Verify that valid creds dashboard page is loaded")
	@Test
	public void testLoginPositiveNoteAffect() {
		
		logger.info("Starting the Testcases Page Object Model");
		
		LoginPage loginPage = new LoginPage(DriverManager.getDriver());
		loginPage.loginToNoteAffectLoginValidCreds(PropertiesReader.readKey("username"), PropertiesReader.readKey("password"));
		
		DashBoradPage dashBoradPage = new DashBoradPage(DriverManager.getDriver());
		String presentationTabName = dashBoradPage.presentationTabName();
		
		assertThat(presentationTabName).isNotBlank().isNotNull().isNotEmpty();
	    logger.info("Done the Test cases");
	    Assert.assertEquals(presentationTabName,PropertiesReader.readKey("expected_tab_name"));
	}
	
	@Owner("Mangesh")
	@Description("TC#3-Verify that valid page title is opened")
	@Test
	public void testPageTitleValidation() {
		
		logger.info("Starting of Test case for Page Title validation");
		
		LoginPage loginPage = new LoginPage(DriverManager.getDriver());
		String loginpageTitle = loginPage.pageTitleValidatinForNoteAffect();

		assertThat(loginpageTitle).isNotBlank().isNotNull().isNotEmpty();
		logger.info("Title verification is done");
		Assert.assertEquals(loginpageTitle, PropertiesReader.readKey("pageTitle"));	
	}
	
	@Owner("Mangesh")
	@Description("TC#4-Verify that valid URL is opened")
	@Test
	public void testURLValidation() {
		
		logger.info("Starting of Test case for URL validation");
		
		LoginPage loginPage = new LoginPage(DriverManager.getDriver());
		String loginpageURL = loginPage.urlValidationForNoteAffect();
		System.out.println("loginpageURL" + loginpageURL);
		assertThat(loginpageURL).isNotBlank().isNotNull().isNotEmpty();
		logger.info("URL verification is done");
		Assert.assertEquals(loginpageURL, PropertiesReader.readKey("urlValidation"));	
		
	}
	
	@Owner("Mangesh")
	@Description("TC#5-Verify that valid creds dashboard page is loaded")
	@Test
	public void validUserNameValidPasswordTest() {
		
		logger.info("Starting of Test case for valid UserName ValidPassword");
		
		LoginPage loginPage = new LoginPage(DriverManager.getDriver());
		loginPage.loginToNoteAffectLoginValidCreds(PropertiesReader.readKey("username"), PropertiesReader.readKey("password"));
		
		DashBoradPage dashBoradPage = new DashBoradPage(DriverManager.getDriver());
		String presentationTabName = dashBoradPage.presentationTabName();
		
		assertThat(presentationTabName).isNotBlank().isNotNull().isNotEmpty();
	    logger.info("Done the Test case valid UserName ValidPassword Test");
	    Assert.assertEquals(presentationTabName,PropertiesReader.readKey("expected_tab_name"));
		
		
	}
	
	@Owner("Mangesh")
	@Description("TC#6-Verify that with valid username and invalid password correct error message is displayed")
	@Test
	public void validUserNameInValidPasswordTest() {
		logger.info("Starting of Test case for valid UserName InValidPassword");
		LoginPage loginPage = new LoginPage(DriverManager.getDriver());
		String error_message = loginPage.loginToNoteAffectLoginInvalidCreds(PropertiesReader.readKey("username"), PropertiesReader.readKey("invalid_password"));
		
		assertThat(error_message).isNotBlank().isNotNull().isNotEmpty();
		logger.info("Done the Test case valid UserName InValidPassword Test");
		Assert.assertEquals(error_message,PropertiesReader.readKey("loginErrorMessage"));
	}
	
	@Owner("Mangesh")
	@Description("TC7#-Verify that with Invalid username and valid password correct error message is displayed")
	@Test
	public void InvalidUserNameValidPasswordTest() {
		logger.info("Starting of Test case for Invalid UserName Valid dPassword");
		LoginPage loginPage = new LoginPage(DriverManager.getDriver());
		String error_message = loginPage.loginToNoteAffectLoginInvalidCreds(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("password"));
		
		assertThat(error_message).isNotBlank().isNotNull().isNotEmpty();
		logger.info("Done the Test case Invalid UserName valid Password Test");
		Assert.assertEquals(error_message,PropertiesReader.readKey("loginErrorMessage"));
	}
	
	@Owner("Mangesh")
	@Description("TC8#-Verify that with Invalid username and In valid password correct error message is displayed")
	@Test
	public void InvalidUserNameInValidPasswordTest() {
		logger.info("Starting of Test case for Invalid UserName InValid dPassword");
		LoginPage loginPage = new LoginPage(DriverManager.getDriver());
		String error_message = loginPage.loginToNoteAffectLoginInvalidCreds(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));
		
		assertThat(error_message).isNotBlank().isNotNull().isNotEmpty();
		logger.info("Done the Test case Invalid UserName In valid Password Test");
		Assert.assertEquals(error_message,PropertiesReader.readKey("loginErrorMessage"));
	}
	
	
	@Owner("Mangesh")
	@Description("TC9#-Verify that with blank username and In valid password correct error message is displayed")
	@Test
	public void BlankUsernameValidPasswordTest() {
		
		logger.info("Starting of Test case for Blank UserName Valid dPassword");
		LoginPage loginPage = new LoginPage(DriverManager.getDriver());
		String error_message = loginPage.loginToNoteAffectBlankUserNameValidPassword(PropertiesReader.readKey("blank_username"), PropertiesReader.readKey("password"));

		assertThat(error_message).isNotBlank().isNotNull().isNotEmpty();
		logger.info("Done the Test case Blank UserName valid Password Test");
		Assert.assertEquals(error_message,PropertiesReader.readKey("blankUserNameErrorMessage"));
	}
	
	@Owner("Mangesh")
	@Description("TC10#-Verify that with valid username and In blank password correct error message is displayed")
	@Test
	public void validUserNameBlankPasswordTest() {
		
		logger.info("Starting of Test case for valid UserName Blank dPassword");
		LoginPage loginPage = new LoginPage(DriverManager.getDriver());
		String error_message = loginPage.loginToNoteAffectValidUserNameBlankPassword(PropertiesReader.readKey("username"), PropertiesReader.readKey("blank_password"));
		System.out.println("error_message : " + error_message);
		assertThat(error_message).isNotBlank().isNotNull().isNotEmpty();
		logger.info("Done the Test case Valid UserName Blank Password Test");
	}
	
	@Owner("Mangesh")
	@Description("TC11#-Verify that with blank username and In blank password correct error message is displayed")
	@Test
	public void BlankUsernameBlankpasswordTest() {
		
		logger.info("Starting of Test case for blank UserName Blank dPassword");
		LoginPage loginPage = new LoginPage(DriverManager.getDriver());
		List<String> error_message1 = loginPage.loginToNoteAffectBlankUserNameBlankPassword(PropertiesReader.readKey("blank_username"), PropertiesReader.readKey("blank_password"));
		
		
//		System.out.println("error_message 1 : " + error_message1.get(0));
		assertThat(error_message1.get(0)).isNotBlank().isNotNull().isNotEmpty();
		
//		System.out.println("error_message 2 : " + error_message1.get(1));
		assertThat(error_message1.get(1)).isNotBlank().isNotNull().isNotEmpty();
		
		
		logger.info("Done the Test case Blank UserName Blank Password Test");	
	}
	
	
}
