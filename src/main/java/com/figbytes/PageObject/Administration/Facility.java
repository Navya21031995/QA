package com.figbytes.PageObject.Administration;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.figbytes.PageObject.CommonLocators;
import com.figbytes.Test.BaseClass;
import com.figbytes.Utilities.CommonMethods;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Facility {
	
	WebDriver driver;
	JavascriptExecutor executor;
	SoftAssert Assert;
	Actions action;
	private WebDriverWait wait40;
	
		public Facility(WebDriver driver){
			JavascriptExecutor executor = (JavascriptExecutor)BaseClass.driver;

			this.executor = (JavascriptExecutor)BaseClass.driver;
			this.Assert = new SoftAssert();
			this.action = new Actions(driver);
			
		    this.wait40 = new WebDriverWait(driver, 40);

			this.driver=driver;		    
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath=CommonLocators.MEGA_MENU_ADMINISTRATION)
		WebElement adminMenu;
		
		@FindBy(xpath="//ul[@class='col-sm-4 list-unstyled']//a[text()='"+Const.FACILITY_SUB_MENU+"']")
		WebElement facility;
		
		@FindBy(id="btnaddFacilities")
		WebElement addFacility;
		
		@FindBy(id="ddlFacilityType")
		WebElement facilityTypeDropdown;
		
//		@FindBy(xpath="//select[@id='ddlFacilityType']//option[contains(text(),'"+Const.SELECT_HUB+"')]")
//		WebElement selectAdminHub;
		
		@FindBy(id="txtFacilityName")
		WebElement facilityName;
		
		@FindBy(id="ddlCountry")
		WebElement countryDropdown;
		
		@FindBy(id="ddlState")
		WebElement stateDropdown;
		
		@FindBy(id="ddlContinent")
		WebElement regionDropdown;
		
		@FindBy(id="ddlCurrency")
		WebElement currencyDropdown;
		
		@FindBy(id="ddlCredibleYear")
		WebElement credibleYearDropdown;
		
//		@FindBy(xpath="//select[@id='ddlCredibleYear']//option[contains(text(),'"+Const.SELECT_CREDIBLE_DATA_YEAR+"')]")
//		WebElement selectcredibleYear;
		
		@FindBy(id="btnSave")
		WebElement saveButton;
		
		@FindBy(id=CommonLocators.ALERT_POP_UP_MESSAGE)
		WebElement alertMessage;
		
		@FindBy(id= CommonLocators.ALERT_POP_UP_BUTTON)
		WebElement alertPopUpOKButton;
		
		@FindBy(xpath=CommonLocators.ERROR_MESSAGE)
		WebElement errorMessage;
		
		@FindBy(id="btnReset")
		WebElement resetButton;
		
		@FindBy(id="btnCancel")
		WebElement cancelButton;
		
		@FindBy(xpath="//div[@id='GridFacilityData']//table//th[2]//a[@class='k-grid-filter']")
		WebElement facilityFilter;
		
		@FindBy(xpath=CommonLocators.FILTER_TEXT_BOX)
		WebElement facilityFiltertTextBox;
		
		@FindBy(xpath=CommonLocators.SEARCH_FILTER_BUTTON)
		WebElement facilityFilterButton;
		
		@FindBy(xpath="//div[@id='GridFacilityData']//tr[1]/td[2]")
		WebElement expectedFacility;
		
		@FindBy(xpath="//span[@data-toggle='tooltip']")
		WebElement toolTip;
		
//		@FindBy(xpath="//select[@id='ddlFacilityType']//option[contains(text(),'"+Const.SELECT_FACILITY+"')]")
//		WebElement selectAdminFacility;
			
		@FindBy(id="ddlSubordinateTo")
		WebElement subordinateDropdown;
			
//		@FindBy(xpath="//select[@id='ddlFacilityType']//option[contains(text(),'"+Const.SELECT_SITE+"')]")
//		WebElement selectAdminSite;
		
		@FindBy(id="ddlFacilitySiteType")
		WebElement siteTypeDropdown;
		
		@FindBy(xpath="//div[@id='GridFacilityData']//tr[1]/td[2]")
		WebElement expectedSite;
		
		@FindBy(xpath="//div[@id='GridFacilityData']//tr[1]/td//i[@class='fa fa-trash-o fa-button-red btnDelete']")
		WebElement deleteButton;
		
		@FindBy(how=How.XPATH, using ="//div[@id='GridFacilityData']//tr//td[2]")
		List<WebElement> facilityTable;	
		
		//added new 27
		@FindBy(xpath="//select[@id='ddlCredibleYear']//option[contains(text(),'2020')]")
		WebElement date;
		
		public void addHub(String FacilityType,String FacilityName, String Country, String State, String Region, String Currency) throws InterruptedException {
			
			ReportUtils.test.log(LogStatus.INFO, "Running addHub method.");	
			
			CommonMethods.clickOn(adminMenu);			
			CommonMethods.clickOn(facility);
			Thread.sleep(5000);
			CommonMethods.clickOn(addFacility);
			Thread.sleep(5000);
			CommonMethods.select(facilityTypeDropdown, FacilityType);
			CommonMethods.enterText(facilityName, FacilityName);
			CommonMethods.select(countryDropdown, Country);
			Thread.sleep(3000);
			CommonMethods.select(stateDropdown, State);
			Thread.sleep(3000);
			CommonMethods.select(regionDropdown, Region);
			Thread.sleep(3000);
			CommonMethods.select(currencyDropdown, Currency);
			CommonMethods.clickOn(credibleYearDropdown);
	//		CommonMethods.clickOn(selectcredibleYear);
			CommonMethods.clickOn(saveButton);
			//CommonMethods.clickOn(resetButton);
			//CommonMethods.clickOn(alertPopUpOKButton);
			
		}
		

		public void addFacility(String FacilityType,String FacilityName, String Country, String State, String Region, String SubordinateTo, String Currency, String CredibleDataYear) throws InterruptedException {
	
			ReportUtils.test.log(LogStatus.INFO, "Running addFacility method.");	
			
			CommonMethods.clickOn(adminMenu);
			CommonMethods.clickOn(facility);
			Thread.sleep(5000);
			CommonMethods.clickOn(addFacility);
			Thread.sleep(5000);
//			CommonMethods.clickOn(facilityTypeDropdown);
//			Thread.sleep(3000);
//			CommonMethods.clickOn(selectAdminFacility);
			CommonMethods.select(facilityTypeDropdown, FacilityType);
			CommonMethods.enterText(facilityName, FacilityName);
			CommonMethods.select(countryDropdown, Country);
			Thread.sleep(3000);
			CommonMethods.select(stateDropdown,State );
			Thread.sleep(3000);
			CommonMethods.select(regionDropdown, Region);
			CommonMethods.select(subordinateDropdown, SubordinateTo);
			Thread.sleep(3000);
			CommonMethods.select(currencyDropdown, Currency);
			Thread.sleep(3000);
			
			//converted from string to double to int to string
	        Double stringToDouble = new Double(CredibleDataYear);
	        double DoubleYear = stringToDouble.doubleValue();			
			int yearInInteger = (int)DoubleYear;
			String StringCredibleYear = String.valueOf(yearInInteger);
			
			executor.executeScript("arguments[0].scrollIntoView();", credibleYearDropdown);
			CommonMethods.select(credibleYearDropdown, StringCredibleYear);
			executor.executeScript("arguments[0].scrollIntoView();", saveButton); 
			CommonMethods.clickOn(saveButton);
			//CommonMethods.clickOn(resetButton);
			
//			String alertSavedMessage = alertMessage.getText();
//	    	Const.logger.info("Getting successful message:- "  + alertSavedMessage);
//	    	CommonMethods.clickOn(alertPopUpOKButton);
		}
		
		
		public void addSite(String FacilityType, String FacilityName,String SiteType, String Country, String State, String Region, String SubordinateTo, String Currency, String CredibleDataYear) throws InterruptedException {

			ReportUtils.test.log(LogStatus.INFO, "Running addSite method.");	
			
			CommonMethods.clickOn(adminMenu);
			CommonMethods.clickOn(facility);
			Thread.sleep(5000);
			CommonMethods.clickOn(addFacility);
			Thread.sleep(5000);
			CommonMethods.select(facilityTypeDropdown, FacilityType);
			CommonMethods.enterText(facilityName, FacilityName);
			CommonMethods.select(siteTypeDropdown, SiteType);
			CommonMethods.select(countryDropdown, Country);
			Thread.sleep(3000);
			CommonMethods.select(stateDropdown, State);
			Thread.sleep(3000);
			CommonMethods.select(regionDropdown, Region);
			CommonMethods.select(subordinateDropdown, SubordinateTo);
			Thread.sleep(3000);
			CommonMethods.select(currencyDropdown, Currency);
			Thread.sleep(3000);
			executor.executeScript("arguments[0].scrollIntoView();", credibleYearDropdown);
			CommonMethods.select(credibleYearDropdown, CredibleDataYear);
			executor.executeScript("arguments[0].scrollIntoView();", saveButton); 
			CommonMethods.clickOn(saveButton);
			//CommonMethods.clickOn(resetButton);
			
//			String alertSavedMessage = alertMessage.getText();
//	    	Const.logger.info("Getting successful message:- "  + alertSavedMessage);
//	    	CommonMethods.clickOn(alertPopUpOKButton);
		}
		
		
		public void facilitySaveCancelButton() throws InterruptedException {
			
			Thread.sleep(3000);

	
			if (this.alertPopUpOKButton.isDisplayed()){ 
		    	String alertSavedMessage = alertMessage.getText();
		    	Const.logger.info(alertSavedMessage);
				ReportUtils.test.log(LogStatus.PASS, alertSavedMessage);		    	
		        CommonMethods.clickOn(alertPopUpOKButton);
		        
		    }   
			else if(this.errorMessage.isDisplayed()){   
					String error = errorMessage.getText();
					Const.logger.info(error);
					CommonMethods.clickOn(cancelButton);   
					//Const.logger.info("This name hub is already exist.");			         
			     }			     
		}
		
		public void verifyCreatedFacility(String FacilityName) throws InterruptedException {

			ReportUtils.test.log(LogStatus.INFO, "Running verifyCreatedFacility method.");	
			Const.logger.info("Running verifyCreatedFacility method.");
			
			Const.logger.info("Start verifying created facility.");
			ReportUtils.test.log(LogStatus.INFO, "Start verifying created facility.");	
			
			CommonMethods.clickOn(facilityFilter);
			CommonMethods.enterText(facilityFiltertTextBox, FacilityName);
			CommonMethods.clickOn(facilityFilterButton);
			Thread.sleep(5000);
			
			if(!facilityTable.isEmpty()) {
			String actualFacility = FacilityName;
			String expectedFacilityS = expectedFacility.getText().trim();
			
			Assert.assertEquals(actualFacility, expectedFacilityS);
			Const.logger.info("Getting actual data from excel "  + actualFacility);
			Const.logger.info("Getting expected data from web "  + expectedFacilityS);
			ReportUtils.test.log(LogStatus.INFO, "Getting actual data from excel: "  + actualFacility + " & expected data from web: " + expectedFacilityS);	
			
			}

		}
		
		
		public void deleteFacility(String FacilityName) throws InterruptedException {
			
			ReportUtils.test.log(LogStatus.INFO, "Running deleteFacility method.");	
			Const.logger.info("Running deleteFacility method.");
			
			Const.logger.info("Start deleting process of facility: "+FacilityName);
			ReportUtils.test.log(LogStatus.INFO, "Start deleting process of facility: "+FacilityName);	
			
			CommonMethods.clickOn(adminMenu);
			CommonMethods.clickOn(facility);
			
			Thread.sleep(7000);
			CommonMethods.clickOn(facilityFilter);
			CommonMethods.enterText(facilityFiltertTextBox, FacilityName);
			CommonMethods.clickOn(facilityFilterButton);
			Thread.sleep(5000);

			if(!facilityTable.isEmpty()) {			
			CommonMethods.scrollTo(driver, deleteButton);
			Thread.sleep(5000);
			CommonMethods.clickOn(deleteButton);
			Thread.sleep(10000);
			CommonMethods.AlertAccept(driver);
						
			String alertMsg = CommonMethods.getTextFromElement(alertMessage);
			Const.logger.info(alertMsg);
			ReportUtils.test.log(LogStatus.PASS, alertMsg);				
			CommonMethods.clickOn(alertPopUpOKButton);
		}
	}
}
