package com.figbytes.PageObject.Administration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.figbytes.PageObject.CommonLocators;
import com.figbytes.Utilities.CommonMethods;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Administration_Data_Process {
	
	WebDriver driver;
	public WebDriverWait wait10;
	public Administration_Data_Process(WebDriver driver){	
		    this.wait10 = new WebDriverWait(driver, 40);
			this.driver=driver;		    
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="ctl00_lblUserName")
	WebElement usernameLog;	
	@FindBy(id="ctl00_lnkLogout")
	WebElement logoutButton;
	@FindBy(xpath=CommonLocators.MEGA_MENU_ADMINISTRATION)
	WebElement adminMenu;
	@FindBy(xpath=CommonLocators.DATA_APPROVAL_BUTTON)
	public WebElement dataaproval;
	@FindBy(id=CommonLocators.SELECTALL_CHECKBOX)
	public WebElement selectall_checkbox ;
	@FindBy(id="txtComments")
	public WebElement comment;	
	@FindBy(xpath=CommonLocators.APPROVE_BUTTON)
	public WebElement Approve;
	@FindBy(xpath=CommonLocators.REJECT_BUTTON)
	public WebElement Reject;
	@FindBy(id=CommonLocators.ALERT_POP_UP_MESSAGE)
	public WebElement alert_popup_message;	
	@FindBy(id=CommonLocators.OK_BUTTON)
	public WebElement ok;	
	@FindBy(xpath=CommonLocators.PENDING_FILTER_BUTTON)
	public WebElement pendingfilter;
	@FindBy(xpath=CommonLocators.FILTER_ICON)
	public WebElement filtericon;
	@FindBy(xpath=CommonLocators.FILTER_TEXT_BOX)
	public WebElement filtertextbox;
	@FindBy(xpath=CommonLocators.SEARCH_FILTER_BUTTON)
	public WebElement filterbutton;	
	@FindBy(xpath="//div[@id='gvEnteredDataList']//a[text()='Rail']")
	public WebElement Railclk;
	@FindBy(xpath="//div[@id='gvEnteredDataList']")
	public WebElement entereddatalist_dataapproval;
	@FindBy(xpath="//textarea[@id='txtComments']")
	public WebElement comments_txtarea;
	
	
	
	public void Admin_DataApproval() throws InterruptedException {
		try {
				CommonMethods.clickOn(adminMenu);			
				CommonMethods.waitFor(100);
				CommonMethods.clickOn(dataaproval);
				CommonMethods.explicitWaitByVisibilityOfElement(driver, entereddatalist_dataapproval);
				CommonMethods.JavascriptClickOn(driver, filtericon);
				CommonMethods.enterText(filtertextbox, "Rail");
				CommonMethods.JavascriptClickOn(driver, filterbutton);	
				CommonMethods.waitFor(1000);
				if(Railclk.isDisplayed())
				CommonMethods.JavascriptClickOn(driver,Railclk);	
				CommonMethods.waitFor(2000);
				CommonMethods.select(pendingfilter,"Pending");
				CommonMethods.waitFor(1000);
				CommonMethods.JavascriptClickOn(driver,selectall_checkbox);
				CommonMethods.waitFor(1000);
				CommonMethods.enterText(comments_txtarea, "To Approve");
				CommonMethods.waitFor(2000);
				CommonMethods.JavascriptClickOn(driver,Approve);
				CommonMethods.waitFor(1000);
				if (alert_popup_message.getText().contains("Data approval process is going on")) 
				{
					CommonMethods.JavascriptClickOn(driver,ok);
					ReportUtils.test.log(LogStatus.INFO,"Data approval process is going on");
		            Const.logger.info("Data approval process is going on");		
				}else if(alert_popup_message.getText().contains("error"))
				{
					ReportUtils.test.log(LogStatus.FAIL,"Technical Error");
		            Const.logger.info("Data approval process failed");
					CommonMethods.JavascriptClickOn(driver,ok);		
				}else
				{
					ReportUtils.test.log(LogStatus.FAIL," Admin Approval process failed");
		            Const.logger.info("Data approval process failed");		
				}
				}catch(Exception e){
					ReportUtils.test.log(LogStatus.FAIL,"Error in data approval test");
		            Const.logger.info("Error in data approval test");
				}
				
	}
	
	public void Admin_DataRejection() throws InterruptedException {
		try {
				CommonMethods.clickOn(adminMenu);			
				CommonMethods.waitFor(100);
				CommonMethods.clickOn(dataaproval);
				CommonMethods.explicitWaitByVisibilityOfElement(driver, entereddatalist_dataapproval);
				CommonMethods.JavascriptClickOn(driver, filtericon);
				CommonMethods.enterText(filtertextbox, "Rail");
				CommonMethods.JavascriptClickOn(driver, filterbutton);	
				CommonMethods.waitFor(1000);
				if(Railclk.isDisplayed())
				CommonMethods.JavascriptClickOn(driver,Railclk);	
				CommonMethods.waitFor(2000);
				CommonMethods.select(pendingfilter,"Pending");
				CommonMethods.waitFor(1000);
				CommonMethods.JavascriptClickOn(driver,selectall_checkbox);
				CommonMethods.waitFor(1000);
				CommonMethods.enterText(comments_txtarea, "To Reject");
				CommonMethods.waitFor(2000);
				CommonMethods.JavascriptClickOn(driver,Reject);
				CommonMethods.waitFor(1000);
				if (alert_popup_message.getText().contains("Data rejection process is going on")) 
				{
					CommonMethods.JavascriptClickOn(driver,ok);
					ReportUtils.test.log(LogStatus.INFO,"Data rejection process is going on");
		            Const.logger.info("Data rejection process is going on");		
				}else if(alert_popup_message.getText().contains("error"))
				{
					ReportUtils.test.log(LogStatus.FAIL,"Technical Error");
		            Const.logger.info("Data rejection process failed");
					CommonMethods.JavascriptClickOn(driver,ok);		
				}else
				{
					ReportUtils.test.log(LogStatus.FAIL," Admin rejection process failed");
		            Const.logger.info("Data rejection process failed");		
				} }
				catch(Exception e)
				{
					ReportUtils.test.log(LogStatus.FAIL,"Error in data rejection test");
		            Const.logger.info("Error in data rejection test");
				}			
	}
	
	public void logOut() throws InterruptedException {
		CommonMethods.explicitWaitByVisibilityOfElement(driver,usernameLog);
		CommonMethods.JavascriptClickOn(driver,usernameLog);
		CommonMethods.waitFor(100);
		CommonMethods.explicitWaitByVisibilityOfElement(driver,logoutButton);
		CommonMethods.JavascriptClickOn(driver,logoutButton);
		CommonMethods.waitFor(100);
		ReportUtils.test.log(LogStatus.INFO, "Click on logout button.");
		Const.logger.info("Log out from current user successfully.");		
		
	}


}
