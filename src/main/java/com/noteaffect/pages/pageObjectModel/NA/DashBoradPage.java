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
	private By presentationsAndDeptManagementTab = By.xpath("//span[contains(text(),'Sessions & Department Management')]");
	private By siteAdminTab = By.xpath("//span[contains(text(),'Site Admin')]");
	private By mangeUsersTab = By.xpath("//span[contains(text(),'Manage User')]");
	private By importDataTab = By.xpath("//span[contains(text(),'Import Data')]");
	private By downlodAnalyticsTab = By.xpath("//span[contains(text(),'Download Analytics')]");
	private By downlodVideoTab = By.xpath("//span[contains(text(),'Download Video')]");
			
	// Page Actions
	public String presentationTabName() {
		WaitHelper.visibilityOfElement(presentationsTab);
		return getText(presentationsTab);
	}
	
	public String PresenterToolsTabName() {
		WaitHelper.visibilityOfElement(PresenterToolsTab);
		return getText(PresenterToolsTab);
	}
	
	public String AdminToolsTabName() {
		WaitHelper.visibilityOfElement(AdminToolsTab);
		return getText(AdminToolsTab);
	}
	
	public void PresentationsTabClick() {
		clickElement(presentationsTab);
	}
	
	public void PresenterToolsTabClick() {
		clickElement(PresenterToolsTab);
	}
    
    public void AdminToolsTabClick() {
    	clickElement(AdminToolsTab);
	}

//	public String urlValidationForNoteAffect() {
//		openNoteAffectURL();
//		
//		return getURL();
//	}
	
	public String adminurlValidationForNoteAffect() {
		return getURL();
	}
}
