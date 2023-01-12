package com.figbytes.PageObject.Data;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.figbytes.PageObject.CommonLocators;
import com.figbytes.Utilities.CommonMethods;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Social_Variable_Data {
	
	WebDriver driver;
//	private WebDriverWait wait10;
	private WebDriverWait wait40;
	SoftAssert Assert;
	
		public Social_Variable_Data(WebDriver driver){
			
//		    this.wait10 = new WebDriverWait(driver, 10);
		    this.wait40 = new WebDriverWait(driver, 40);
		    this.Assert = new SoftAssert();
			this.driver=driver;		    
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath=CommonLocators.MEGA_MENU_DATA)
		WebElement dataMenu;
		
		@FindBy(xpath="//div[@class='row'][2]//ul[@class='col-sm-4 list-unstyled'][1]//a[text()='"+Const.SOCIAL_SUB_MENU+"']")
		WebElement socialVariableData;
		
		@FindBy(id="btnAddData")
		WebElement addVariableData;
		
		@FindBy(id="ddlVariableCategory")
		WebElement variableCategoryDropdown;
		
		@FindBy(id="ddlVariableName")
		WebElement variableNameDropdown;
		
		@FindBy(id=CommonLocators.ADD_ASSET_FACILITY_GEAR_ICON)
		WebElement FacilityGearIcon;
		
		@FindBy(xpath=CommonLocators.ADD_ASSET_FACILITY_SEARCH_BOX)
		WebElement SearchBoxFacility;
		
		@FindBy(id=CommonLocators.ADD_ASSET_FACILITY)
		WebElement SelectAssetFacility;
		
		@FindBy(id=CommonLocators.ADD_ASSET_OK_BUTTON)
		WebElement OkButton;
		
		@FindBy(id="txtQuantity")
		WebElement quantityTextBox;
		
		@FindBy(id="txtFromDate")
		WebElement dateFromTextBox;
		
		@FindBy(id="txtToDate")
		WebElement dateToTextBox;
		
		@FindBy(id="ddlUnitName")
		WebElement unitDropdown;
		
		@FindBy(id="btnSave")
		WebElement variableDataSaveButton;
		
		@FindBy(xpath=CommonLocators.ADD_ASSET_ERROR_MESSAGE)
		WebElement errorMessage;
	
		@FindBy(id="btnCancel")
		WebElement variableDataCancelButton;
		
		@FindBy(xpath="//div[@id='gvEnteredDataList']//table//th[7]//a[@class='k-grid-filter']")
		WebElement dataAddEnteredAt;
		
		@FindBy(xpath=" //div[@id='gvEnteredDataList']//table//th[13]//a[@class='k-grid-filter']")
		WebElement fromDateFilter;
		
		@FindBy(xpath=" //div[@id='gvEnteredDataList']//table//th[14]//a[@class='k-grid-filter']")
		WebElement toDateFilter;
		
		@FindBy(xpath=CommonLocators.DATE_FILTER_TEXT_BOX)
		WebElement dateFilterTextBox;
		
		@FindBy(xpath="//div[@id='gvEnteredDataList']//table//th[10]//a[@class='k-grid-filter']")
		WebElement variableFiletr;
		
		@FindBy(xpath=CommonLocators.FILTER_TEXT_BOX)
		WebElement filtertTextBox;
		
		@FindBy(xpath=CommonLocators.SEARCH_FILTER_BUTTON)
		WebElement filterButton;
		
		@FindBy(xpath="//div[@id='gvEnteredDataList']//tr[1]//td//label[contains(@id,'lblVariableName')]")
		WebElement expectedVariableData;
		
		@FindBy(xpath="//div[@id='gvEnteredDataList']//tr[1]/td[13]")
		WebElement expectedDateFrom;
		
		@FindBy(xpath="//div[@id='gvEnteredDataList']//tr[1]/td[14]")
		WebElement expectedDateTo;
		
		@FindBy(xpath="//div[@id='gvEnteredDataList']//tr[1]/td[15]")
		WebElement expectedQty;
		
		@FindBy(how=How.XPATH, using = "//div[@id='gvEnteredDataList']//tr//td[10]" )
		List<WebElement> variableShowTable;
		
		@FindBy(xpath="//div[@id='gvEnteredDataList']//tr[1]/td//i[contains(@onclick,'return EditVariableData')]")
		WebElement editButton;
		
		@FindBy(id="txtQuantity")
		WebElement editQty;
		
		@FindBy(id="txtFromDate")
		WebElement editDateFrom;
		
		@FindBy(id="txtToDate")
		WebElement editDateTo;
		
		@FindBy(id="btnUpdate")
		WebElement editUpdateButton;
		
		@FindBy(xpath="//div[@id='gvEnteredDataList']//tr[1]/td//label[contains(@for,'chkAllDelete_')]")
		WebElement tableDeleteCheckbox; 
		
		@FindBy(id=CommonLocators.DELETE_ALL_BUTTON)
		WebElement allDataDeleteButton;
		
		@FindBy(xpath=CommonLocators.DELETE_CONFIRMATION_MESSAGE)
		WebElement deleteConfirmationAlertMessage;
		
		@FindBy(xpath=CommonLocators.DELETE_CONFIRM_BUTTON)
		WebElement deleteDataConfirmButton;
		
		@FindBy(xpath=CommonLocators.DELETE_CANCEL_BUTTON)
		WebElement deleteDataCancelButton;
		
		@FindBy(id=CommonLocators.ALERT_POP_UP_MESSAGE)
		WebElement alertMessage;
		
		@FindBy(id= CommonLocators.ALERT_POP_UP_BUTTON)
		WebElement alertPopUpOKButton;
		
		
		public void addVariableData(String Category,String Variable, String Facility, String Quantity,String From, String To,  String Unit) throws InterruptedException{
			Const.logger.info("addVariableData method is running.");
			ReportUtils.test.log(LogStatus.INFO, "Running addVariableData method.");

			CommonMethods.clickOn(dataMenu);
			CommonMethods.clickOn(socialVariableData);	
			Thread.sleep(5000);
			CommonMethods.clickOn(addVariableData);			
			Thread.sleep(10000);			
			CommonMethods.select(variableCategoryDropdown, Category);
			Thread.sleep(2000);
			CommonMethods.select(variableNameDropdown, Variable);
			Thread.sleep(5000);
			wait40.until(ExpectedConditions.elementToBeClickable(FacilityGearIcon));
			CommonMethods.clickOn(FacilityGearIcon);						
			Thread.sleep(5000);
			CommonMethods.clickOn(FacilityGearIcon);			
			CommonMethods.enterText(SearchBoxFacility, Facility);			
			CommonMethods.clickOn(SelectAssetFacility);			
			CommonMethods.clickOn(OkButton);
			Thread.sleep(5000);			
			CommonMethods.enterText(quantityTextBox, Quantity);
			CommonMethods.enterText(dateFromTextBox, From);
			CommonMethods.enterText(dateToTextBox, To);
			CommonMethods.select(unitDropdown, Unit);
			Thread.sleep(8000);
			CommonMethods.clickOn(variableDataSaveButton);
			Thread.sleep(3000);
			CommonMethods.clickOn(variableDataSaveButton);
		}
		
		public void variableDataSaveCancelButton(String Facility, String Variable,String From,String To,String Quantity) throws InterruptedException {
			
			if(this.alertPopUpOKButton.isDisplayed()){ 
		    	String alertSavedMessage = alertMessage.getText();
		    	Const.logger.info(alertSavedMessage);		    	
				ReportUtils.test.log(LogStatus.PASS, alertSavedMessage);		    	
		        CommonMethods.clickOn(alertPopUpOKButton);	        			
				Thread.sleep(8000);
				driver.navigate().refresh();
				
				Const.logger.info("Start verifying of added variable data.");
				ReportUtils.test.log(LogStatus.INFO, "Start verifying of added variable data.");		    					
				Thread.sleep(8000);
				CommonMethods.clickOn(dataAddEnteredAt);
				Thread.sleep(3000);
				CommonMethods.enterText(filtertTextBox, Facility);
				CommonMethods.clickOn(filterButton);
				Thread.sleep(5000);
				CommonMethods.clickOn(variableFiletr);
				Thread.sleep(3000);
				CommonMethods.enterText(filtertTextBox, Variable);
				CommonMethods.clickOn(filterButton);
				Thread.sleep(5000);
				CommonMethods.clickOn(fromDateFilter);
				Thread.sleep(3000);
				CommonMethods.enterText(dateFilterTextBox, From);
				CommonMethods.clickOn(filterButton);
				Thread.sleep(5000);
				CommonMethods.clickOn(toDateFilter);
				Thread.sleep(3000);
				CommonMethods.enterText(dateFilterTextBox, To);
				CommonMethods.clickOn(filterButton);
				Thread.sleep(5000);				
				String actualVariable = Variable;
				String expectedVariableS = expectedVariableData.getText();
				Assert.assertEquals(actualVariable, expectedVariableS);
				Const.logger.info("Getting actual variable from excel "  + actualVariable);
				Const.logger.info("Getting expected variable from web "  + expectedVariableS);
				ReportUtils.test.log(LogStatus.INFO, "Getting actual variable from excel: "  + actualVariable + " & expected variable from web: " + expectedVariableS);	
				Double stringToDouble = new Double(Quantity);
		        double Double = stringToDouble.doubleValue();
		        String formattedNumberWithComma = String.format("%,.2f", Double);	    	
				String actualQuantity = formattedNumberWithComma;
				String expectedQuantityS = expectedQty.getText();
				Assert.assertEquals(actualQuantity, expectedQuantityS);
				Const.logger.info("Getting actual quantity from excel "  + actualQuantity);
				Const.logger.info("Getting expected quantity from web "  + expectedQuantityS);
				ReportUtils.test.log(LogStatus.INFO, "Getting actual quantity from excel: "  + actualQuantity + " & expected quantity from web: " + expectedQuantityS);	
				String actualDateFrom = From;
				String expectedDateFromS = expectedDateFrom.getText();
				Assert.assertEquals(actualDateFrom, expectedDateFromS);
				Const.logger.info("Getting actual dateFrom from excel "  + actualDateFrom);
				Const.logger.info("Getting expected dateFrom from web "  + expectedDateFromS);
				ReportUtils.test.log(LogStatus.INFO, "Getting actual dateFrom from excel: "  + actualDateFrom + " & expected dateFrom from web: " + expectedDateFromS);	
				String actualDateTo = To;
				String expectedDateToS = expectedDateTo.getText();
				Assert.assertEquals(actualDateTo, expectedDateToS);
				Const.logger.info("Getting actual dateTo from excel "  + actualDateTo);
				Const.logger.info("Getting expected dateTo from web "  + expectedDateToS);    
				ReportUtils.test.log(LogStatus.INFO, "Getting actual dateTo from excel: "  + actualDateTo + " & expected dateTo from web: " + expectedDateToS);	
			}
			else  if(this.errorMessage.isDisplayed()){   
				String error = errorMessage.getText();
				Const.logger.info("Getting error message:- " + error);
				CommonMethods.clickOn(variableDataCancelButton);   
				Const.logger.info("This combination is already exist");
		    }  			
		}
		
		
		public void updateNVerifyVariableData(String ExistFrom, String ExistTo,String From, String To, String Quantity,String Facility,String Variable) throws InterruptedException {
			Const.logger.info("updateNVerifyVariableData method is running.");
			ReportUtils.test.log(LogStatus.INFO, "Running updateNVerifyVariableData method.");

			CommonMethods.clickOn(dataMenu);
			CommonMethods.clickOn(socialVariableData);	
			Thread.sleep(5000);			
			CommonMethods.clickOn(dataAddEnteredAt);
			Thread.sleep(3000);
			CommonMethods.enterText(filtertTextBox, Facility);
			CommonMethods.clickOn(filterButton);
			Thread.sleep(5000);
			CommonMethods.clickOn(variableFiletr);
			Thread.sleep(3000);
			CommonMethods.enterText(filtertTextBox, Variable);
			CommonMethods.clickOn(filterButton);
			Thread.sleep(5000);
			CommonMethods.scrollTo(driver, fromDateFilter);
			Thread.sleep(5000);			
			CommonMethods.clickOn(fromDateFilter);
			CommonMethods.enterText(dateFilterTextBox, ExistFrom );
			CommonMethods.clickOn(filterButton);
			Thread.sleep(5000);
			CommonMethods.scrollTo(driver, toDateFilter);
			Thread.sleep(5000);			
			CommonMethods.clickOn(toDateFilter);
			CommonMethods.enterText(dateFilterTextBox, ExistTo);
			CommonMethods.clickOn(filterButton);
			Thread.sleep(5000);
			
			if(!variableShowTable.isEmpty()) {
			CommonMethods.scrollTo(driver, editButton);
			Thread.sleep(8000);
			CommonMethods.clickOn(editButton);
			Thread.sleep(3000);
			CommonMethods.clear(editQty);
			CommonMethods.enterText(editQty, Quantity);
			Thread.sleep(3000);
			CommonMethods.clear(editDateFrom);
			Thread.sleep(3000);
			CommonMethods.clear(editDateTo);
			Thread.sleep(3000);
			CommonMethods.enterText(editDateFrom, From);
			Thread.sleep(2000);
			CommonMethods.enterText(editDateTo, To);
			Thread.sleep(3000);
			CommonMethods.clickOn(editUpdateButton);
			Thread.sleep(3000);
			CommonMethods.clickOn(editUpdateButton);			
			String alertMsg = CommonMethods.getTextFromElement(alertMessage);
			Const.logger.info(alertMsg);
			ReportUtils.test.log(LogStatus.PASS, alertMsg);													
			CommonMethods.clickOn(alertPopUpOKButton);
			Thread.sleep(5000);

			Const.logger.info(" <><>Start Verifying updated data.<><>");
			ReportUtils.test.log(LogStatus.INFO, "Start Verifying updated data.");										
			driver.navigate().refresh();
			Thread.sleep(8000);
			CommonMethods.clickOn(dataAddEnteredAt);
			Thread.sleep(3000);
			CommonMethods.enterText(filtertTextBox, Facility);
			CommonMethods.clickOn(filterButton);
			Thread.sleep(5000);
			CommonMethods.clickOn(variableFiletr);
			Thread.sleep(3000);
			CommonMethods.enterText(filtertTextBox, Variable);
			CommonMethods.clickOn(filterButton);
			Thread.sleep(5000);
			CommonMethods.clickOn(fromDateFilter);
			Thread.sleep(3000);
			CommonMethods.enterText(dateFilterTextBox, From);
			CommonMethods.clickOn(filterButton);
			Thread.sleep(5000);
			CommonMethods.clickOn(toDateFilter);
			Thread.sleep(3000);
			CommonMethods.enterText(dateFilterTextBox, To);
			CommonMethods.clickOn(filterButton);
			Thread.sleep(5000);			
			String actualVariable = Variable;
			String expectedVariableS = expectedVariableData.getText();
			Assert.assertEquals(actualVariable, expectedVariableS);
			Const.logger.info("Getting actual variable from excel "  + actualVariable);
			Const.logger.info("Getting expected variable from web "  + expectedVariableS);
			ReportUtils.test.log(LogStatus.INFO, "Getting actual variable from excel: "  + actualVariable + " & expected variable from web: " + expectedVariableS);	
			Double stringToDouble = new Double(Quantity);
	        double Double = stringToDouble.doubleValue();
	        String formattedNumberWithComma = String.format("%,.2f", Double);	    	
			String actualQuantity = formattedNumberWithComma;
			String expectedQuantityS = expectedQty.getText();
			Assert.assertEquals(actualQuantity, expectedQuantityS);
			Const.logger.info("Getting actual quantity from excel "  + actualQuantity);
			Const.logger.info("Getting expected quantity from web "  + expectedQuantityS);
			ReportUtils.test.log(LogStatus.INFO, "Getting actual quantity from excel: "  + actualQuantity + " & expected quantity from web: " + expectedQuantityS);	
			String actualDateFrom = From;
			String expectedDateFromS = expectedDateFrom.getText();
			Assert.assertEquals(actualDateFrom, expectedDateFromS);
			Const.logger.info("Getting actual dateFrom from excel "  + actualDateFrom);
			Const.logger.info("Getting expected dateFrom from web "  + expectedDateFromS);
			ReportUtils.test.log(LogStatus.INFO, "Getting actual dateFrom from excel: "  + actualDateFrom + " & expected dateFrom from web: " + expectedDateFromS);	
			String actualDateTo = To;
			String expectedDateToS = expectedDateTo.getText();
			Assert.assertEquals(actualDateTo, expectedDateToS);
			Const.logger.info("Getting actual dateTo from excel "  + actualDateTo);
			Const.logger.info("Getting expected dateTo from web "  + expectedDateToS);
			ReportUtils.test.log(LogStatus.INFO, "Getting actual dateTo from excel: "  + actualDateTo + " & expected dateTo from web: " + expectedDateToS);	
			}
			else {
				Const.logger.info("Variable data does not exist.");
				ReportUtils.test.log(LogStatus.INFO, "Variable data does not exist.");							
			}
			}
		
		public void variableDataDelete(String Facility, String Variable) throws InterruptedException {
			Const.logger.info("variableDataDelete method is running");
			ReportUtils.test.log(LogStatus.INFO, "Running variableDataDelete method.");

			CommonMethods.clickOn(dataMenu);
			CommonMethods.clickOn(socialVariableData);	
			Thread.sleep(5000);			
			CommonMethods.clickOn(dataAddEnteredAt);
			Thread.sleep(3000);
			CommonMethods.enterText(filtertTextBox, Facility);
			CommonMethods.clickOn(filterButton);
			Thread.sleep(5000);
			CommonMethods.clickOn(variableFiletr);
			Thread.sleep(3000);
			CommonMethods.enterText(filtertTextBox, Variable);
			CommonMethods.clickOn(filterButton);
			
			if(!variableShowTable.isEmpty()) {
			CommonMethods.scrollTo(driver, editButton);
			Thread.sleep(5000);
			CommonMethods.clickOn(tableDeleteCheckbox);
			CommonMethods.clickOn(allDataDeleteButton);
			String confirmAlertMessage = deleteConfirmationAlertMessage.getText();
			Const.logger.info(confirmAlertMessage);	
			ReportUtils.test.log(LogStatus.INFO, confirmAlertMessage);			
			CommonMethods.clickOn(deleteDataConfirmButton);
			String alertMsg = CommonMethods.getTextFromElement(alertMessage);
			Const.logger.info(alertMsg);
			ReportUtils.test.log(LogStatus.PASS, alertMsg);			
			CommonMethods.clickOn(alertPopUpOKButton);
			Const.logger.info("Variable Data is deleted for Social Variable Data.");
			ReportUtils.test.log(LogStatus.INFO, "Variable Data is deleted for Social Variable Data.");			
			}
			else {
				Const.logger.info("Variable data does not exist.");
				ReportUtils.test.log(LogStatus.INFO, "Variable data does not exist.");				
			}
		}
}
