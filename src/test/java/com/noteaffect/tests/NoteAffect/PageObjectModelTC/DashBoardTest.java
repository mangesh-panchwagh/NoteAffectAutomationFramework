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
		System.out.println("adminLoginURL : " + adminLoginURL);
		assertThat(adminLoginURL).isNotBlank().isNotNull().isNotEmpty();
	    logger.info("Done the Test case Admin Login Verification with URL");
	    Assert.assertEquals(adminLoginURL,PropertiesReader.readKey("adminURLValidation"));
		
	}
	
	@Owner("Mangesh")
	@Description("TC#3-Verify All Admin related tabs are present.")
	@Test
	public void verifyAllTabsPresent() {
		
		logger.info("Starting the Testcases verify all TabsPresent");
		
		LoginPage loginPage = new LoginPage(DriverManager.getDriver());
		loginPage.loginToNoteAffectLoginValidCreds(PropertiesReader.readKey("username"), PropertiesReader.readKey("password"));
		
		DashBoradPage dashBoradPage = new DashBoradPage(DriverManager.getDriver());
		String ExpectedpresentationTabName = dashBoradPage.presentationTabName();
		String ExpectedpresenterToolsTabName = dashBoradPage.PresenterToolsTabName();
		String ExpectedadminToolsTabName = dashBoradPage.AdminToolsTabName();
		
		System.out.println("ExpectedpresentationTabName : " + ExpectedpresentationTabName);
		System.out.println("ExpectedpresenterToolsTabName : " + ExpectedpresenterToolsTabName);
		System.out.println("ExpectedadminToolsTabName : " + ExpectedadminToolsTabName);
		
		assertTrue(PropertiesReader.readKey("expected_tab_name").equals(ExpectedpresentationTabName), "Mismtch presentationTab Name");
		assertTrue(PropertiesReader.readKey("presenterToolsTab").equals(ExpectedpresenterToolsTabName), "Mismtch presenterToolsTab Name");
		assertTrue(PropertiesReader.readKey("adminToolsTab").equals(ExpectedadminToolsTabName), "Mismtch adminToolsTab Name");
		
	}
	
	@Owner("Mangesh")
	@Description("TC#4-Verify All Presenter Tools Tabs are present.")
	@Test
	public void verifyPresenterToolsSubTabsPresent() {
		
		logger.info("Starting the Testcases Presenter Tools Sub Tabs Present.");
		
		LoginPage loginPage = new LoginPage(DriverManager.getDriver());
		loginPage.loginToNoteAffectLoginValidCreds(PropertiesReader.readKey("username"), PropertiesReader.readKey("password"));
		
		DashBoradPage dashBoradPage = new DashBoradPage(DriverManager.getDriver());
		
		dashBoradPage.PresenterToolsTabClick();
		
		String ExpectedpresenterToolsTabName = dashBoradPage.PresenterToolsTabName();
		String ExpectedEventManagementTabName = dashBoradPage.EventManagementMenuName();
		String ExpectedPollBuilderTabName = dashBoradPage.PollBuilderMenuName();
		
		System.out.println("ExpectedpresenterToolsTabName : " + ExpectedpresenterToolsTabName);
		System.out.println("ExpectedEventManagementTabName : " + ExpectedEventManagementTabName);
		System.out.println("ExpectedPollBuilderTabName : " + ExpectedPollBuilderTabName);
		
		assertTrue(PropertiesReader.readKey("presenterToolsTab").equals(ExpectedpresenterToolsTabName), "Mismtach presenterToolsTab Name");
		assertTrue(PropertiesReader.readKey("eventManagementTab").equals(ExpectedEventManagementTabName),"Mismatch Event Management Tab Name");
		assertTrue(PropertiesReader.readKey("pollBuilderTab").equals(ExpectedPollBuilderTabName),"Mismatch Poll builder Tab Name");
	}
	
	@Owner("Mangesh")
	@Description("TC#5-Verify All Admin Tools Tabs are present.")
	@Test
	public void verifyAdminToolsSubTabsPresent() {
		
		logger.info("Starting the Testcases Admin Tools Sub Tabs Present.");
		LoginPage loginPage = new LoginPage(DriverManager.getDriver());
		loginPage.loginToNoteAffectLoginValidCreds(PropertiesReader.readKey("username"), PropertiesReader.readKey("password"));
		
		DashBoradPage dashBoradPage = new DashBoradPage(DriverManager.getDriver());

		dashBoradPage.AdminToolsTabClick();
		
		String ExpectedadminToolsTabName = dashBoradPage.AdminToolsTabName();
		String ExpectedsessionsAndDeptManagementTabname = dashBoradPage.sessionsAndDeptManagementTabMenu();
		String ExpectedsiteAdminTabname = dashBoradPage.siteAdminTabMenu();
		String ExpectedmangeUsersTabname = dashBoradPage.mangeUsersTabMenu();
		
		String ExpectedimportDataTabname = dashBoradPage.importDataTabMenu();
		String ExpecteddownloadAnalyticsTabname = dashBoradPage.downloadAnalyticsTabMenu();
		String ExpecteddownloadVideoTabname = dashBoradPage.downloadVideoTabMenu();
		String ExpectedQnAPermissionTabname = dashBoradPage.QnAPermissionTabMenu();
		
		String ExpectedisharePermissionTabname = dashBoradPage.sharePermissionTabMenu();
		String ExpectedanalyticReportTabname = dashBoradPage.analyticReportTabMenu();
		String ExpectedbulkEmailTabname= dashBoradPage.bulkEmailTabMenu();
		String ExpecteddownloadBroadcasterTabname = dashBoradPage.downloadBroadcasterTabMenu();
		
		System.out.println("ExpectedadminToolsTabName : " + ExpectedadminToolsTabName);
		System.out.println("ExpectedsessionsAndDeptManagementTabname : " + ExpectedsessionsAndDeptManagementTabname);
		System.out.println("ExpectedsiteAdminTabMenuTabname : " + ExpectedsiteAdminTabname);
		System.out.println("ExpectedmangeUsersTabname : " + ExpectedmangeUsersTabname);
		
		System.out.println("ExpectedimportDataTabname : " + ExpectedimportDataTabname);
		System.out.println("ExpecteddownloadAnalyticsTabname : " + ExpecteddownloadAnalyticsTabname);
		System.out.println("ExpecteddownloadVideoTabname : " + ExpecteddownloadVideoTabname);
		System.out.println("ExpectedQnAPermissionTabname : " + ExpectedQnAPermissionTabname);
		
		System.out.println("ExpectedisharePermissionTabname : " + ExpectedisharePermissionTabname);
		System.out.println("ExpectedanalyticReportTabname : " + ExpectedanalyticReportTabname);
		System.out.println("ExpectedbulkEmailTabname : " + ExpectedbulkEmailTabname);
		System.out.println("ExpecteddownloadBroadcasterTabname : " + ExpecteddownloadBroadcasterTabname);
		
		
		assertTrue(PropertiesReader.readKey("adminToolsTab").equals(ExpectedadminToolsTabName), "Mismtch adminToolsTab Name");
		assertTrue(PropertiesReader.readKey("sessionsAndDeptManagementTab").equals(ExpectedsessionsAndDeptManagementTabname), "Mismtch sessionsAndDeptManagementTab Name");
		assertTrue(PropertiesReader.readKey("siteAdminTab").equals(ExpectedsiteAdminTabname), "Mismtch ExpectedsiteAdminTabMenuTab Name");
		assertTrue(PropertiesReader.readKey("mangeUsersTab").equals(ExpectedmangeUsersTabname), "Mismtch ExpectedsiteAdminTabMenuTab Name");
		
		assertTrue(PropertiesReader.readKey("importDataTab").equals(ExpectedimportDataTabname), "Mismtch ExpectedimportDataTabname Name");
		assertTrue(PropertiesReader.readKey("downloadAnalyticsTabMenu").equals(ExpecteddownloadAnalyticsTabname), "Mismtch ExpecteddownloadAnalyticsTabname Name");
		assertTrue(PropertiesReader.readKey("downloadVideoTabMenu").equals(ExpecteddownloadVideoTabname), "Mismtch ExpecteddownloadVideoTabname Name");
		assertTrue(PropertiesReader.readKey("QnAPermissionTabMenu").equals(ExpectedQnAPermissionTabname), "Mismtch ExpectedQnAPermissionTabname Name");
		
		assertTrue(PropertiesReader.readKey("sharePermissionTabMenu").equals(ExpectedisharePermissionTabname), "Mismtch ExpectedisharePermissionTab Name");
		assertTrue(PropertiesReader.readKey("analyticReportTabMenu").equals(ExpectedanalyticReportTabname), "Mismtch ExpectedanalyticReportTab Name");
		assertTrue(PropertiesReader.readKey("bulkEmailTabMenu").equals(ExpectedbulkEmailTabname), "Mismtch ExpectedbulkEmailTab Name");
		assertTrue(PropertiesReader.readKey("downloadBroadcasterTabMenu").equals(ExpecteddownloadBroadcasterTabname), "Mismtch ExpecteddownloadBroadcasterTab Name");
		
		
	}
	
	
	
	
}
