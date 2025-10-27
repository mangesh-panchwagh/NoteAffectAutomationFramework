package com.noteaffect.tests.NoteAffect.PageObjectModelTC;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.noteaffect.base.CommonToAllTests;
import com.noteaffect.driver.DriverManager;
import com.noteaffect.pages.pageObjectModel.NA.DashBoradPage;
import com.noteaffect.pages.pageObjectModel.NA.LoginPage;
import com.noteaffect.utils.PropertiesReader;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;

public class DashBoardTest extends CommonToAllTests {
	
	private static final Logger logger = LogManager.getLogger(TestNoteAffectLogin_03_Prop_Improved_POM.class);
	
	@Owner("Mangesh")
	@Description("TC#1-Verify Admin Login with shows Admin Tools Tab is present on UI")
	@Test
	public void verifyAdminLogin() {
		
		logger.info("Starting the Testcases Verify Admin Login.");
		
		LoginPage loginPage = new LoginPage(DriverManager.getDriver());
		loginPage.loginToNoteAffectLoginValidCreds(PropertiesReader.readKey("username"), PropertiesReader.readKey("password"));
		
		DashBoradPage dashBoradPage = new DashBoradPage(DriverManager.getDriver());
		String adminToolsTabName = dashBoradPage.AdminToolsTabName();
		//System.out.println("adminToolsTabName : " + adminToolsTabName);
		assertThat(adminToolsTabName).isNotBlank().isNotNull().isNotEmpty();
	    logger.info("Done the Test case Admin Login Verification");
	    Assert.assertEquals(adminToolsTabName,PropertiesReader.readKey("adminToolsTab"));
	}
	
	@Owner("Mangesh")
	@Description("TC#2-Verify Admin Login shows correct URL.")
	@Test
	public void verifyAdminLoginURL() {
		
		logger.info("Starting the Testcases Verify Admin Login.");
		
		LoginPage loginPage = new LoginPage(DriverManager.getDriver());
		loginPage.loginToNoteAffectLoginValidCreds(PropertiesReader.readKey("username"), PropertiesReader.readKey("password"));
		
		DashBoradPage dashBoradPage = new DashBoradPage(DriverManager.getDriver());
		String adminLoginURL = dashBoradPage.adminurlValidationForNoteAffect();
		//System.out.println("adminLoginURL : " + adminLoginURL);
		assertThat(adminLoginURL).isNotBlank().isNotNull().isNotEmpty();
	    logger.info("Done the Test case Admin Login Verification with URL");
	    Assert.assertEquals(adminLoginURL,PropertiesReader.readKey("adminURLValidation"));
		
	}
	
	@Owner("Mangesh")
	@Description("TC#3-Verify All Admin relate tabs are present.")
	@Test
	public void verifyllTabsPresent() {
		
		LoginPage loginPage = new LoginPage(DriverManager.getDriver());
		loginPage.loginToNoteAffectLoginValidCreds(PropertiesReader.readKey("username"), PropertiesReader.readKey("password"));
		
		DashBoradPage dashBoradPage = new DashBoradPage(DriverManager.getDriver());
		String ExpectedpresentationTabName = dashBoradPage.presentationTabName();
		String ExpectedpresenterToolsTabName = dashBoradPage.PresenterToolsTabName();
		String ExpectedadminToolsTabName = dashBoradPage.AdminToolsTabName();
		
		assertTrue(PropertiesReader.readKey("expected_tab_name").equals(ExpectedpresentationTabName), "Mismtch presentationTab Name");
		assertTrue(PropertiesReader.readKey("presenterToolsTab").equals(ExpectedpresenterToolsTabName), "Mismtch presenterToolsTab Name");
		assertTrue(PropertiesReader.readKey("adminToolsTab").equals(ExpectedadminToolsTabName), "Mismtch adminToolsTab Name");
		
	}
	
	
	
	
	
	
	
}
