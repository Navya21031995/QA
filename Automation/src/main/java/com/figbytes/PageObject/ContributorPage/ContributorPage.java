package com.figbytes.PageObject.ContributorPage;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.figbytes.PageObject.CommonLocators;
import com.figbytes.PageObject.LoginPage;
import com.figbytes.Utilities.CommonMethods;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class ContributorPage {
	
	WebDriver driver;
	private WebDriverWait wait10;
	public ContributorPage(WebDriver driver){	
		    this.wait10 = new WebDriverWait(driver, 40);
			this.driver=driver;		    
			PageFactory.initElements(driver, this);
		}

		@FindBy(id="ddlFacility")
		public WebElement newfacility;		
		@FindBy(id="ddlVariableCategory")
		public WebElement categoryselection;
		@FindBy(xpath="//tbody[@role='rowgroup']/tr")
		public WebElement variablelist;
		@FindBy(xpath="//tbody[@role='rowgroup']/tr")
		public List<WebElement> data_list;
		@FindBy(xpath="//i[contains(@class,'clsEdit')]")
		public List<WebElement> edit_icon;
		@FindBy(xpath="//i[contains(@class,'clsdelete')]")
		public List<WebElement> delete_icon;
		// date field selection
		@FindBy(xpath=CommonLocators.CONTRIBUTOR_FROM_DATE)
		public WebElement fromdate;
		@FindBy(xpath=CommonLocators.CONTRIBUTOR_TO_DATE)
		public WebElement todate;
		@FindBy(id="ddlHalfyearly_128439-81909")
		public WebElement halfyearly_fromdate;
		@FindBy(id="ddlHalfyearlyYear_128439-81909")
		public WebElement halfyearly_todate;
		@FindBy(xpath=CommonLocators.CONTRIBUTOR_QUANTITY)
		public WebElement quantity;
		@FindBy(xpath=CommonLocators.CONTRIBUTOR_SAVE_BUTTON)
		public WebElement save_button;
		@FindBy(xpath="//div[@class='jconfirm-holder']//div[@role='dialog']")
		public WebElement attachment_dialog;
		@FindBy(xpath="//button[@class='btn btn-primary' and contains(text(),'OK')]")
		public WebElement ok_button_attachment_dialog;
		@FindBy(id=CommonLocators.ALERT_POP_UP_BUTTON)
		public WebElement ok_button_alert;
		@FindBy(id=CommonLocators.ALERT_POP_UP_MESSAGE)
		public WebElement alert_message;		
		@FindBy(xpath="//div[@class='dragetext menu-wrapper']//a[contains(text(),'Entered Data')]")
		public WebElement entereddata_button;
		@FindBy(xpath="//div[@class='dragetext menu-wrapper']//a[contains(text(),'Data Entry')]")
		public WebElement dataentry_button;
		@FindBy(xpath="//label[contains(@id,'lblQuantity')]")
		public List<WebElement> entereddata_quantity;	
		@FindBy(xpath=CommonLocators.MEGA_MENU_ADMINISTRATION)
		WebElement adminMenu;
		@FindBy(xpath=CommonLocators.DATA_APPROVAL_BUTTON)
		public WebElement dataaproval;
		@FindBy(id=CommonLocators.SELECTALL_CHECKBOX)
		private WebElement selectall_checkbox ;
		@FindBy(id="txtComments")
		private WebElement comment;		
		@FindBy(xpath=CommonLocators.APPROVE_BUTTON)
		private WebElement Approve;
		@FindBy(xpath=CommonLocators.REJECT_BUTTON)
		private WebElement Reject;
		@FindBy(id=CommonLocators.OK_BUTTON)
		private WebElement ok;	
		@FindBy(xpath=CommonLocators.PENDING_FILTER_BUTTON)
		public WebElement pendingfilter;
		@FindBy(xpath=CommonLocators.FILTER_ICON)
		public WebElement filtericon;
		@FindBy(xpath=CommonLocators.FILTER_TEXT_BOX)
		public WebElement filtertextbox;
		@FindBy(xpath=CommonLocators.SEARCH_FILTER_BUTTON)
		public WebElement filterbutton;	
		@FindBy(xpath="//div[@id='gvEnteredDataList']//a[text()='Energy']")
		private WebElement Energyclk;
		
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
		@FindBy(xpath="//th[@data-field='EntryQuantity']//a[@class='k-grid-filter']")
		WebElement qty_filtericon;
		@FindBy(xpath="//th[@data-field='ReportingDateFrom']//a[@class='k-grid-filter']")
		WebElement fromdate_filtericon;
		@FindBy(xpath="//th[@data-field='ReportingDateTo']//a[@class='k-grid-filter']")
		WebElement todate_filtericon;
		@FindBy(xpath="//input[@class='k-textbox']")
		WebElement filter_textarea;
		@FindBy(xpath="//input[@class='k-input']")
		WebElement datefilter_textarea;
		@FindBy(xpath="//button[contains(text(),'Filter')]")
		WebElement submit_filter;
		@FindBy(xpath="(//td[contains(text(),'Contributor')]/preceding-sibling::td)[27]")
		WebElement current_status;
		
		@FindBy(xpath="//a[contains(text(),'Status')]")
		WebElement qty_col_header;
		
		@FindBy(xpath="//i[contains(@class,'clsList')]")
		WebElement unit_listicon;

		@FindBy(xpath="//select[contains(@id,'ddlChangedUnit')]")
		WebElement unit_dropdownlist;
		
		@FindBy(xpath=CommonLocators.CONTRIBUTOR_QTY_TEXTBOX)
		WebElement qty_txtbox_contributor;
		
		@FindBy(xpath=CommonLocators.CONTRIBUTOR_UPDATE_BUTTON)
		WebElement contributor_update_button;
		
		@FindBy(xpath=CommonLocators.CONTRIBUTOR_UNIT_DROPDOWN)
		WebElement contributor_unit_dropdown;
		
		@FindBy(xpath=CommonLocators.DELETE_CONFIRMATION_MESSAGE)
		WebElement delete_confirm_msg;
		
		@FindBy(xpath=CommonLocators.DELETE_CONFIRM_BUTTON)
		WebElement delete_confirm_button;
			
		String unit = "gal (UK)";
		int index = 2;
		String from_date="02/10/2022";
		String to_date="02/10/2022";
		final static String qty = createRandowmQty();
		String update_qty="20";
		static String category_selected ;

		public final static String createRandowmQty() {
			Random random = new Random();   
            final int no = random.nextInt(100);   
			final String  quantity = Integer.toString(no);
			return quantity;		
		}
		
		
		public void Verify_contributor_login(String userId, String pwd) throws InterruptedException {
			CommonMethods.enterText(usernameTextBox, userId);
			CommonMethods.JavascriptClickOn(driver,nextButton);
			CommonMethods.enterText(passTextBox, pwd);
			CommonMethods.JavascriptClickOn(driver,validateAndLoginButton);
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
		
		public void verifyStatusApproved() throws InterruptedException {		
			CommonMethods.clickOn(entereddata_button);
			CommonMethods.waitFor(100);
			CommonMethods.explicitWaitByVisibilityOfElement(driver, variablelist);
			Select category_entereddata=new Select(categoryselection);
			category_entereddata.selectByIndex(index);	
			CommonMethods.explicitWaitByVisibilityOfElement(driver, variablelist);
			CommonMethods.clickOn(fromdate_filtericon);
			CommonMethods.enterText(datefilter_textarea, from_date);
			CommonMethods.waitFor(1000);
			CommonMethods.clickOn(submit_filter);
			CommonMethods.waitFor(1000);
			CommonMethods.explicitWaitByVisibilityOfElement(driver, variablelist);
			CommonMethods.waitFor(1000);
			CommonMethods.clickOn(qty_filtericon);
			CommonMethods.enterText(filter_textarea, qty);
			CommonMethods.waitFor(100);
			CommonMethods.JavascriptClickOn(driver,submit_filter);
			CommonMethods.waitFor(2000);
			CommonMethods.explicitWaitByVisibilityOfElement(driver, variablelist);
			CommonMethods.waitFor(2000);
			
			for(int val=0;val<=data_list.size();val++) 
			 {
				String[] curr_qty=entereddata_quantity.get(val).getText().split("\\.");
				System.out.println(curr_qty[0]);
				Assert.assertTrue(curr_qty[0].equalsIgnoreCase(qty));	
				CommonMethods.scrollTo(driver, delete_icon.get(val));
				CommonMethods.waitFor(200);
				try {
				if(current_status.getText().equalsIgnoreCase("Approved"))
				{
					Const.logger.info("Current Status of Data Entry : " + current_status.getText());	
					ReportUtils.test.log(LogStatus.PASS, "Data Approved successfully");
					Const.logger.info("Data Approval Successfully");	
				}	else {
					Const.logger.info("Current Status of Data Entry : " + current_status.getText());	
					ReportUtils.test.log(LogStatus.FAIL, "Data Approval failure");
					Const.logger.info("Data Approval failed");	
				}
			 
			 }catch(Exception e){
				 e.printStackTrace();
			 }
		 }
		}

		public void verifyStatusRejected() throws InterruptedException {
	try {
			CommonMethods.clickOn(entereddata_button);
			CommonMethods.waitFor(100);
			CommonMethods.explicitWaitByVisibilityOfElement(driver, variablelist);
			Select category_entereddata=new Select(categoryselection);
			category_entereddata.selectByIndex(index);	
			CommonMethods.explicitWaitByVisibilityOfElement(driver, variablelist);
			CommonMethods.clickOn(fromdate_filtericon);
			CommonMethods.enterText(datefilter_textarea, from_date);
			CommonMethods.waitFor(1000);
			CommonMethods.clickOn(submit_filter);
			CommonMethods.waitFor(1000);
			CommonMethods.explicitWaitByVisibilityOfElement(driver, variablelist);
			CommonMethods.waitFor(1000);			
			CommonMethods.clickOn(qty_filtericon);
			CommonMethods.waitFor(1000);			
			CommonMethods.enterText(filter_textarea, qty);
			CommonMethods.waitFor(1000);
			CommonMethods.JavascriptClickOn(driver,submit_filter);
			CommonMethods.waitFor(2000);
			CommonMethods.explicitWaitByVisibilityOfElement(driver, variablelist);
			CommonMethods.waitFor(2000);
			for(int val=0;val<=data_list.size();val++) 
			 {
				String[] curr_qty=entereddata_quantity.get(val).getText().split("\\.");
				System.out.println(curr_qty[0]);
				Assert.assertTrue(curr_qty[0].equalsIgnoreCase(qty));	
				if(current_status.getText().equalsIgnoreCase("Rejected"))
				{
					Const.logger.info("Current Status : " + current_status.getText());	
					ReportUtils.test.log(LogStatus.PASS, "Verified Rejection Status");
					Const.logger.info("Data Rejection verified successfully");	
				}	else {
					Const.logger.info("Current Status : " + current_status.getText());	
					ReportUtils.test.log(LogStatus.FAIL, "Data rejection failure");
					Const.logger.info("Data rejection failed");	
				}
			 }
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}

		
		public void EditDataEntry() throws InterruptedException {
			CommonMethods.clickOn(entereddata_button);
			CommonMethods.waitFor(100);
			CommonMethods.explicitWaitByVisibilityOfElement(driver, variablelist);
			Select category_entereddata=new Select(categoryselection);
			category_entereddata.selectByIndex(index);	
			CommonMethods.explicitWaitByVisibilityOfElement(driver, variablelist);
			for(int val=0;val<=data_list.size();val++) 
			 {
				String[] curr_qty=entereddata_quantity.get(val).getText().split("\\.");
				System.out.println(curr_qty[0]);
				Assert.assertTrue(curr_qty[0].equalsIgnoreCase(qty));	
				CommonMethods.scrollTo(driver,edit_icon.get(val));
				CommonMethods.JavascriptClickOn(driver,edit_icon.get(val));
				CommonMethods.select(contributor_unit_dropdown,"L");
				CommonMethods.explicitWaitByVisibilityOfElement(driver, contributor_update_button);
				qty_txtbox_contributor.clear();
				CommonMethods.enterText(qty_txtbox_contributor, update_qty);	
				CommonMethods.waitFor(500);
				CommonMethods.JavascriptClickOn(driver,contributor_update_button);
				CommonMethods.waitFor(500);
				if(attachment_dialog.isDisplayed())
					CommonMethods.JavascriptClickOn(driver,ok_button_attachment_dialog);
				CommonMethods.waitFor(500);
					if(ok_button_alert.isDisplayed()) 
					{
						if(alert_message.getText().contains("Data updated successfully"))
							CommonMethods.clickOn(ok_button_alert);
					   else 
					   {
						   Const.logger.info(" Edit Data Entry Failure ");
							ReportUtils.test.log(LogStatus.FAIL,"Editing Process is Failed");	   
					   }
				}
					Const.logger.info("Edit - Data Update is successfully done");
					ReportUtils.test.log(LogStatus.INFO, "Edited data is stored successfully");
			 }	
		}
	
		public void deleteDataEntry() throws InterruptedException {
			CommonMethods.clickOn(entereddata_button);
			CommonMethods.waitFor(100);
			CommonMethods.explicitWaitByVisibilityOfElement(driver, variablelist);
			Select category_entereddata=new Select(categoryselection);
			category_entereddata.selectByIndex(index);	
			CommonMethods.explicitWaitByVisibilityOfElement(driver, variablelist);
			for(int val=0;val<=data_list.size();val++) 
			 {
				String[] curr_qty=entereddata_quantity.get(val).getText().split("\\.");
				System.out.println(curr_qty[0]);
				Assert.assertTrue(curr_qty[0].equalsIgnoreCase(qty));	
				CommonMethods.scrollTo(driver,delete_icon.get(val));
				CommonMethods.JavascriptClickOn(driver,delete_icon.get(val));
				CommonMethods.waitFor(100);
				CommonMethods.explicitWaitByVisibilityOfElement(driver, delete_confirm_button);
				if(delete_confirm_msg.isDisplayed())
				{
					CommonMethods.clickOn(delete_confirm_button);	
					Assert.assertTrue(ok_button_alert.isDisplayed(),"Alert Message for Delete operation is not displayed");
					if(ok_button_alert.isDisplayed())
					{
						if(alert_message.getText().contains("Data deleted successfully"))
						{
							Const.logger.info("Records deleted successfully ");
							CommonMethods.clickOn(ok_button_alert);
							Const.logger.info(" Delete operation is successful");
							ReportUtils.test.log(LogStatus.INFO, "Deleted Entered data successfully");

					    }		
				   }	
			 }else {
					Const.logger.info(" Alert message is not displayed on clicking delete button ");
					ReportUtils.test.log(LogStatus.FAIL, "Delete Operation Failed");

			     }break;
		 }
				 		
	}
	
		
		public void DataEntry() throws InterruptedException {
			CommonMethods.clickOn(dataentry_button);
			CommonMethods.explicitWaitByVisibilityOfElement(driver, variablelist);
			newfacility.click();
			Select facility=new Select(newfacility);
			facility.selectByIndex(0);
			CommonMethods.waitFor(500);
			Select category=new Select(categoryselection);
			category.selectByIndex(index);
			 category_selected=category.getFirstSelectedOption().getText();
			Const.logger.info("Selected a category from the list :"+ category_selected);
			ReportUtils.test.log(LogStatus.INFO, "Category Selected:- " + category_selected);	
			CommonMethods.explicitWaitByVisibilityOfElement(driver, variablelist);
			CommonMethods.waitFor(100);
			if(fromdate.isDisplayed()) 
			{
				fromdate.sendKeys(from_date);
				if(todate.isDisplayed())
					todate.sendKeys(to_date);
			}
			CommonMethods.enterText(quantity, qty);
			CommonMethods.waitFor(1000);
			CommonMethods.JavascriptClickOn(driver, unit_listicon);
			CommonMethods.waitFor(1000);
			CommonMethods.select(unit_dropdownlist, unit);
			CommonMethods.waitFor(1000);
			CommonMethods.scrollTo(driver,save_button);
			CommonMethods.waitFor(1000);
			CommonMethods.JavascriptClickOn(driver,save_button);
			CommonMethods.waitFor(100);
			if(attachment_dialog.isDisplayed())
			CommonMethods.clickOn(ok_button_attachment_dialog);
			CommonMethods.waitFor(100);
			if(ok_button_alert.isDisplayed()) 
			{
				if(alert_message.getText().contains("Success")) {
				Const.logger.info("Data is saved successfully ");
				CommonMethods.clickOn(ok_button_alert);
				CommonMethods.waitFor(100);
				CommonMethods.clickOn(entereddata_button);
				wait10.until(ExpectedConditions.visibilityOf(variablelist));
				Select category_entereddata=new Select(categoryselection);
				category_entereddata.selectByIndex(index);	
				for(int val=0;val<=data_list.size();val++) 
					 {
						String[] curr_qty=entereddata_quantity.get(val).getText().split("\\.");
						System.out.println(curr_qty[0]);
						Assert.assertTrue(curr_qty[0].equalsIgnoreCase(qty));
						Const.logger.info(" Entered Data stored successfully ");
						ReportUtils.test.log(LogStatus.INFO, "Entered data is verified successfully");
						break;
					 } 
				
				}
				else if(alert_message.getText().contains("Duplicate record.")) {
					Const.logger.info(" Duplicate Records ");
					ReportUtils.test.log(LogStatus.INFO, "Starting Contribuor Application.");
					CommonMethods.clickOn(ok_button_alert);
				}							
			}			
		}
			
			
	}

		
		

