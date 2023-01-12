package com.figbytes.PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.figbytes.Utilities.CommonMethods;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;


public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtUserName")
	WebElement username;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtPass")
	WebElement pass;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnLogin")
	WebElement loginButton;
	
	@FindBy(id="ctl00_lblLoggedInAs")
	WebElement LoggedInAs;
	
	@FindBy(id="ctl00_lblUserName")
	WebElement usernameLog;
	
	@FindBy(id="ctl00_lnkLogout")
	WebElement logoutButton;	
	
	//For new login view
	@FindBy(id="txtusername")
	WebElement usernameTextBox;
	
	@FindBy(id="validateUser")
	WebElement nextButton;
	
	@FindBy(id="ddlOrg")
	WebElement selectOrganizationDropdown;
	
	@FindBy(xpath="//select[@id='ddlOrg']//option[contains(text(),'QA 2')]")
	WebElement organizationSelect;
	
	@FindBy(id="selectOrg")
	WebElement organizationSelectNextButton;
	
	@FindBy(id="txtuserpassword")
	WebElement passTextBox;
	
	@FindBy(id="btnLogin1")
	WebElement validateAndLoginButton;
	
	public void Verify_the_Login_page_functionality(String userId, String pwd) throws InterruptedException {
		CommonMethods.enterText(usernameTextBox, userId);
		CommonMethods.waitFor(1000);
		CommonMethods.clickOn(nextButton);
		Select org = new Select(selectOrganizationDropdown);
		org.selectByIndex(1);
		CommonMethods.clickOn(organizationSelectNextButton);
		CommonMethods.enterText(passTextBox, pwd);
		CommonMethods.clickOn(validateAndLoginButton);
		ReportUtils.test.log(LogStatus.INFO, "Click on login button.");	
		boolean verifyLoginWindow = this.LoggedInAs.isDisplayed();
		Const.logger.info("Login Window display:- " +verifyLoginWindow);
		ReportUtils.test.log(LogStatus.INFO, "Login Window display:- " +verifyLoginWindow);	
		Const.logger.info("Login Test is Completed.");
	}
	
	public void logOut() throws InterruptedException {
		CommonMethods.explicitWaitByVisibilityOfElement(driver,usernameLog);
		CommonMethods.JavascriptClickOn(driver,usernameLog);
		CommonMethods.explicitWaitByVisibilityOfElement(driver,logoutButton);
		CommonMethods.JavascriptClickOn(driver,logoutButton);
		ReportUtils.test.log(LogStatus.INFO, "Click on logout button.");
		Const.logger.info("Log out from current user successfully.");		
		
	}
}