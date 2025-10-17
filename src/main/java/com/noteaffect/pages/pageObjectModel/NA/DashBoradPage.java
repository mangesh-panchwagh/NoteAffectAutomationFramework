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
	
	// Page Actions
	public String presentationTabName() {
		WaitHelper.visibilityOfElement(presentationsTab);
		return getText(presentationsTab);
	}
	
	
	
}
