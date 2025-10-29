package com.noteaffect.pages.pageObjectModel.NA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.noteaffect.base.CommonToAllPages;
import com.noteaffect.utils.WaitHelper;

public class DashBoradPage extends CommonToAllPages{

	WebDriver driver;
	
	public DashBoradPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By presentationsTab = By.xpath("//span[contains(text(),'Presentations')]");
	private By PresenterToolsTab = By.xpath("//button[contains(text(),'Presenter Tools')]");
	private By EventManagement = By.xpath("//span[contains(text(),'Event Management')]");
	private By PollBuilder = By.xpath("//span[contains(text(),'Poll Builder')]");
	private By AdminToolsTab = By.xpath("//button[contains(text(),'Admin Tools')]");
	private By sessionsAndDeptManagementTab = By.xpath("//span[contains(text(),'Sessions & Department Management')]");
	private By siteAdminTab = By.xpath("//span[contains(text(),'Site Admin')]");
	private By mangeUsersTab = By.xpath("//span[contains(text(),'Manage User')]");
	private By importDataTab = By.xpath("//span[contains(text(),'Import Data')]");
	private By downlodAnalyticsTab = By.xpath("//span[contains(text(),'Download Analytics')]");
	private By downloadVideoTab = By.xpath("//span[contains(text(),'Download Video')]");
	private By QnAPermissionTab = By.xpath("//span[contains(text(),'Q&A Permissions')]");
	private By sharePermissionTab = By.xpath("//span[contains(text(),'Share Permissions')]");
	private By analyticReportTab = By.xpath("//span[contains(text(),'Analytic Report')]");
	private By bulkEmailTab = By.xpath("//span[contains(text(),'Bulk Email')]");
	private By downloadBroadcasterTab = By.xpath("//span[contains(text(),'Download Broadcaster')]");
			
	// Page Actions
	public String presentationTabName() {
		WaitHelper.visibilityOfElement(presentationsTab);
		return getText(presentationsTab);
	}
	
	public String PresenterToolsTabName() {
		WaitHelper.waitJVM(30);
		WaitHelper.visibilityOfElement(PresenterToolsTab);
		return getText(PresenterToolsTab);
	}
	
	public String AdminToolsTabName() {
		WaitHelper.waitJVM(30);
		WaitHelper.visibilityOfElement(AdminToolsTab);
		return getText(AdminToolsTab);
	}
	
	public String EventManagementMenuName() {
		WaitHelper.visibilityOfElement(EventManagement);
		return getText(EventManagement);
	}
	
	public String PollBuilderMenuName() {
		WaitHelper.visibilityOfElement(PollBuilder);
		return getText(PollBuilder);
	}
	
	public String sessionsAndDeptManagementTabMenu() {
		WaitHelper.visibilityOfElement(sessionsAndDeptManagementTab);
		return getText(sessionsAndDeptManagementTab);
	}
	
	public String siteAdminTabMenu() {
		WaitHelper.visibilityOfElement(siteAdminTab);
		return getText(siteAdminTab);
	}
	
	public String mangeUsersTabMenu() {
		WaitHelper.visibilityOfElement(mangeUsersTab);
		return getText(mangeUsersTab);
	}
	
	public String importDataTabMenu() {
		WaitHelper.visibilityOfElement(importDataTab);
		return getText(importDataTab);
	}
	
	public String downloadAnalyticsTabMenu() {
		WaitHelper.visibilityOfElement(downlodAnalyticsTab);
		return getText(downlodAnalyticsTab);
	}
	
	public String downloadVideoTabMenu() {
		WaitHelper.visibilityOfElement(downloadVideoTab);
		return getText(downloadVideoTab);
	}
	
	public String QnAPermissionTabMenu() {
		WaitHelper.visibilityOfElement(QnAPermissionTab);
		return getText(QnAPermissionTab);
	}
	
	public String sharePermissionTabMenu() {
		WaitHelper.visibilityOfElement(sharePermissionTab);
		return getText(sharePermissionTab);
	}
	
	public String analyticReportTabMenu() {
		WaitHelper.visibilityOfElement(analyticReportTab);
		return getText(analyticReportTab);
	}
	
	public String bulkEmailTabMenu() {
		WaitHelper.visibilityOfElement(bulkEmailTab);
		return getText(bulkEmailTab);
	}
	
	public String downloadBroadcasterTabMenu() {
		WaitHelper.visibilityOfElement(downloadBroadcasterTab);
		return getText(downloadBroadcasterTab);
	}
	
	public void PresentationsTabClick() {
		WaitHelper.visibilityOfElement(presentationsTab);
		clickElement(presentationsTab);
	}
	
	public void PresenterToolsTabClick() {
		WaitHelper.visibilityOfElement(PresenterToolsTab);
		clickElement(PresenterToolsTab);
	}
    
    public void AdminToolsTabClick() {
    	WaitHelper.visibilityOfElement(AdminToolsTab);
    	clickElement(AdminToolsTab);
	}

//	public String urlValidationForNoteAffect() {
//		openNoteAffectURL();
//		
//		return getURL();
//	}
	
	public String adminurlValidationForNoteAffect() {
		WaitHelper.visibilityOfElement(AdminToolsTab);
		return getURL();
	}
}
