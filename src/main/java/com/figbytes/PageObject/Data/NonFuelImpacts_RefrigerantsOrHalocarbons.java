package com.figbytes.PageObject.Data;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.figbytes.PageObject.CommonLocators;
import com.figbytes.Test.BaseClass;
import com.figbytes.Utilities.CommonMethods;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class NonFuelImpacts_RefrigerantsOrHalocarbons {

	
	WebDriver driver;
	JavascriptExecutor executor;
	private WebDriverWait wait40;
	SoftAssert Assert;

		public NonFuelImpacts_RefrigerantsOrHalocarbons(WebDriver driver){
			//JavascriptExecutor executor = (JavascriptExecutor)BaseClass.driver;

			this.executor = (JavascriptExecutor)BaseClass.driver;

		    this.wait40 = new WebDriverWait(driver, 40);
		    this.Assert = new SoftAssert();

			this.driver=driver;		    
			PageFactory.initElements(driver, this);
		}
		

		@FindBy(xpath=CommonLocators.MEGA_MENU_DATA)
		WebElement dataMenu;
		
		@FindBy(xpath="//ul[@class='col-sm-4 list-unstyled']//a[text()='"+Const.REFRIGERANTS_HALOCARBONS_SUB_MENU+"']")
		WebElement RefrigerantsOrHalocarbons;
		
		@FindBy(id=CommonLocators.DATA_ENTRY)
		WebElement DataEntry;
		
		@FindBy(id=CommonLocators.ACTIVITY_DROPDOWN)
		WebElement activityDropdown;
		
		@FindBy(xpath=CommonLocators.CATEGORY_DROPDOWN_1)
		WebElement activityNUsageDropdown;
		
		@FindBy(xpath=CommonLocators.CATEGORY_DROPDOWN_2)
		WebElement emissionSourceDropdown;
		
		@FindBy(id=CommonLocators.HUB_DROPDOWN)
		WebElement hubDropdown;
		
		@FindBy(id=CommonLocators.FACILITY_DROPDOWN)
		WebElement facilityDropdown;
		
		@FindBy(id=CommonLocators.GO_BUTTON)
		WebElement GoButton;
		
		@FindBy(xpath="//div[@id='tblDataAddNonFuel']//tr[1]/td//input[contains(@id,'txtDateFrom_')]")
		WebElement dateFromText;
				
		@FindBy(xpath="//div[@id='tblDataAddNonFuel']//tr[1]/td//input[contains(@id,'txtDateTo_')]")
		WebElement dateToText;
		
		@FindBy(xpath="//div[@id='tblDataAddNonFuel']//tr[1]/td//input[contains(@id,'txtQuantity_')]")
		WebElement quantityText;
		
		@FindBy(xpath="//div[@id='tblDataAddNonFuel']//tr[1]/td//input[contains(@id,'txtNotes_')]")
		WebElement notesText;
		
		@FindBy(xpath="//div[@id='tblDataAddNonFuel']//tr[1]/td//i[contains(@id,'btnSave_')]")
		WebElement saveButton;
		
		@FindBy(id=CommonLocators.ALERT_POP_UP_MESSAGE)
		WebElement alertMessage;
		
		@FindBy(id= CommonLocators.ALERT_POP_UP_BUTTON)
		WebElement alertPopUpOKButton;
		
		@FindBy(xpath="//div[@id='tblDataShowNonFuel']//tr[1]/td//label[@id[contains(.,'lblDateFromEdit')]]")
		WebElement expectedDateFrom;
		
		@FindBy(xpath="//div[@id='tblDataShowNonFuel']//tr[1]/td//label[@id[contains(.,'lblDateToEdit')]]")
		WebElement expectedDateTo;
		
		@FindBy(xpath="//div[@id='tblDataShowNonFuel']//tr[1]/td//label[@id[contains(.,'lblQuantityEdit')]]")
		WebElement expectedQty;
		
		@FindBy(xpath="//div[@id='tblDataShowNonFuel']//tr[1]/td//i[contains(@id,'btnEdit_')]")
		WebElement editButton;
		
		@FindBy(xpath="//div[@id='tblDataShowNonFuel']//tr[1]/td//input[contains(@id,'txtDateFromEdit_')]")
		WebElement editDateFromTextBox;
		
		@FindBy(xpath="//div[@id='tblDataShowNonFuel']//tr[1]/td//input[contains(@id,'txtDateToEdit_')]")
		WebElement editDateToTextBox;
		
		@FindBy(xpath="//div[@id='tblDataShowNonFuel']//tr[1]/td//input[contains(@id,'txtQuantityEdit_')]")
		WebElement editQty;
		
		@FindBy(xpath="//div[@id='tblDataShowNonFuel']//tr[1]/td//input[@id[contains(.,'txtNotesEdit_')]]")
		WebElement editNotesText;
		
		@FindBy(xpath="//div[@id='tblDataShowNonFuel']//tr[1]/td//i[contains(@id,'btnEditSave_')]")
		WebElement editSaveButton;
		
		@FindBy(id=CommonLocators.ADD_ASSET)
		WebElement AddNewAssetButton;
		
		@FindBy(id=CommonLocators.ADD_ASSET_FACILITY_GEAR_ICON)
		WebElement FacilityGearIcon;
		
		@FindBy(xpath=CommonLocators.ADD_ASSET_FACILITY_SEARCH_BOX)
		WebElement SearchBoxFacility;
		
		@FindBy(id=CommonLocators.ADD_ASSET_FACILITY)
		WebElement SelectAssetFacility;
		
		@FindBy(id=CommonLocators.ADD_ASSET_OK_BUTTON)
		WebElement OkButton;
		
		@FindBy(id=CommonLocators.ADD_ASSET_ACTIVITY_DROPDOWN)
		WebElement assetActivityDropdown;
		
		@FindBy(xpath=CommonLocators.ADD_ASSET_VARIABLE_DROPDOWN)
		WebElement variableNameDropdown;
		
		@FindBy(xpath=CommonLocators.ADD_ASSET_SEARCH_VARIABLE)
		WebElement searchVariableName;
			
		@FindBy(how=How.XPATH, using = CommonLocators.ADD_ASSET_VARIABLE_LIST )
		List<WebElement> selectVariable;
		
		@FindBy(id=CommonLocators.ADD_ASSET_DROPDOWN_1)
		WebElement assetActivityUsageDropdown; 

		@FindBy(id=CommonLocators.ADD_ASSET_DROPDOWN_2)
		WebElement assetEmissionSourceDropdown;  

		@FindBy(id=CommonLocators.ADD_ASSET_MEASUREMENT_UNIT)
		WebElement measurementUNit;
		
		@FindBy(id=CommonLocators.ADD_ASSET_SAVE_BUTTON)
		WebElement assetSaveButton;
		
		@FindBy(xpath=CommonLocators.ADD_ASSET_ERROR_MESSAGE)
		WebElement errorMessage;
		
		@FindBy(id=CommonLocators.ADD_ASSET_CANCEL_BUTTON)
		WebElement cancelButton;
		
		@FindBy(id=CommonLocators.ALERT_POP_UP_BUTTON)
		WebElement alertPopUp;
				
		@FindBy(xpath="//div[@id='tblDataShowNonFuel']//tr[1]/td//label[contains(@for,'chkAllArchive_')]")
		WebElement archiveCheckbox;
		
		@FindBy(xpath="//div[@id='tblDataShowNonFuel']//tr[1]/td//label[contains(@for,'chkAllDelete_')]")
		WebElement tableDeleteCheckbox; 
		
		@FindBy(id=CommonLocators.DELETE_ALL_BUTTON)
		WebElement allDataDeleteButton;
		
		@FindBy(xpath=CommonLocators.DELETE_CONFIRMATION_MESSAGE)
		WebElement deleteConfirmationAlertMessage;
		
		@FindBy(xpath=CommonLocators.DELETE_CONFIRM_BUTTON)
		WebElement deleteDataConfirmButton;
		
		@FindBy(xpath=CommonLocators.DELETE_CANCEL_BUTTON)
		WebElement deleteDataCancelButton;
				
		@FindBy(xpath="//div[@id='tblDataShowNonFuel']//table//th[8]//a[@class='k-grid-filter']")
		WebElement variableFilterDataShow;
		
		@FindBy(xpath=CommonLocators.FILTER_TEXT_BOX)
		WebElement filtertTextBox;
		
		@FindBy(xpath=CommonLocators.SEARCH_FILTER_BUTTON)
		WebElement filterButton;
		
		@FindBy(xpath="//div[@id='tblDataAddNonFuel']//tr[1]/td//label[contains(@for,'chkAllDeleteAsset_')]")
		WebElement deleteAssetCheckBox;
		
		@FindBy(id=CommonLocators.ASSET_DELETE_BUTTON)
		WebElement deleteAssetButton;
	
		@FindBy(xpath="//div[@id='tblDataShowNonFuel']//table//th[11]//a[@class='k-grid-filter']")
		WebElement fromDateFilter;
		
		@FindBy(xpath="//div[@id='tblDataShowNonFuel']//table//th[12]//a[@class='k-grid-filter']")
		WebElement toDateFilter;
		
		@FindBy(xpath=CommonLocators.DATE_FILTER_TEXT_BOX)
		WebElement dateFilterTextBox;
		
		@FindBy(xpath="//div[@id='tblDataAddNonFuel']//table//th[5]//a[@class='k-grid-filter']")
		WebElement dataAddEnteredAt;
		
		@FindBy(xpath= "//div[@id='tblDataAddNonFuel']//table//th[8]//a[@class='k-grid-filter']")
		WebElement dataEntryVariableFilter;
		
		@FindBy(xpath="//div[@id='tblDataAddNonFuel']//tr[1]//td//a[@class='clsInputControl']")
		WebElement expectedVariableAsset;
			
		@FindBy(how=How.XPATH, using =  "//div[@id='tblDataAddNonFuel']//tr//td[8]")
		List<WebElement> assetsAddTable;
		
		@FindBy(xpath="//div[@id='tblDataShowNonFuel']//table//th[5]//a[@class='k-grid-filter']")
		WebElement dataShowEnteredAt;
		
		@FindBy(how=How.XPATH, using = "//div[@id='tblDataShowNonFuel']//tr//td[8]" )
		List<WebElement> assetsShowTable;
		
		public void addAsset(String Facility, String Activity, String Variable,String ActivityUsage, String EmissionSource, String Unit) throws InterruptedException{
			Const.logger.info("addAsset method is running.");
			ReportUtils.test.log(LogStatus.INFO, "Running addAsset method.");

			CommonMethods.clickOn(dataMenu);
			CommonMethods.clickOn(RefrigerantsOrHalocarbons);	
			Thread.sleep(5000);
			CommonMethods.clickOn(AddNewAssetButton);			
			Thread.sleep(10000);			
			wait40.until(ExpectedConditions.elementToBeClickable(FacilityGearIcon));
			CommonMethods.clickOn(FacilityGearIcon);						
			Thread.sleep(5000);
			CommonMethods.clickOn(FacilityGearIcon);			
			CommonMethods.enterText(SearchBoxFacility, Facility);			
			CommonMethods.clickOn(SelectAssetFacility);			
			CommonMethods.clickOn(OkButton);
			Thread.sleep(5000);			
			CommonMethods.select(assetActivityDropdown, Activity);
			Thread.sleep(3000);
			CommonMethods.clickOn(variableNameDropdown);			
			CommonMethods.enterText(searchVariableName, Variable);
			Thread.sleep(3000);

			for(WebElement element: selectVariable ) {
				if(element.getText().equals(Variable)) {
					element.click();
				}
			}		
			
			Thread.sleep(5000);
			CommonMethods.select(assetActivityUsageDropdown, ActivityUsage);
			CommonMethods.select(assetEmissionSourceDropdown, EmissionSource);
			Thread.sleep(5000);			
			CommonMethods.select(measurementUNit, Unit);
			Thread.sleep(5000);
			CommonMethods.clickOn(assetSaveButton);
//			CommonMethods.clickOn(cancelButton);
			
		}
		public void assetSaveCancelButton(String Facility, String Variable, String Activity,String ActivityUsage, String EmissionSource, String Hub) throws InterruptedException {
			
			if(this.alertPopUpOKButton.isDisplayed()){ 
		    	String alertSavedMessage = alertMessage.getText();
		    	Const.logger.info(alertSavedMessage);
				ReportUtils.test.log(LogStatus.PASS, alertSavedMessage);		    	
		        CommonMethods.clickOn(alertPopUpOKButton);		        
				Thread.sleep(8000);
				driver.navigate().refresh();
				
				Thread.sleep(8000);
				CommonMethods.clickOn(DataEntry);
				Const.logger.info(" <><>Start verifying of added asset.<><> ");
				ReportUtils.test.log(LogStatus.INFO, "Start verifying of added asset. ");
				Thread.sleep(8000);	
				CommonMethods.select(activityDropdown, Activity);
				CommonMethods.select(activityNUsageDropdown, ActivityUsage);
				CommonMethods.select(emissionSourceDropdown, EmissionSource);
				CommonMethods.select(hubDropdown, Hub);
				CommonMethods.select(facilityDropdown, Facility);				
				CommonMethods.clickOn(GoButton);
				Thread.sleep(5000);
				CommonMethods.clickOn(dataAddEnteredAt);
				Thread.sleep(3000);
				CommonMethods.enterText(filtertTextBox, Facility);
				CommonMethods.clickOn(filterButton);
				Thread.sleep(5000);
				CommonMethods.clickOn(dataEntryVariableFilter);
				Thread.sleep(3000);
				CommonMethods.enterText(filtertTextBox, Variable);
				CommonMethods.clickOn(filterButton);
				Thread.sleep(5000);
				String actualVariable = Variable;
				String expectedVariableS = expectedVariableAsset.getText();
				Assert.assertEquals(actualVariable, expectedVariableS);
				Const.logger.info("Getting actual asset from excel "  + actualVariable);
				Const.logger.info("Getting expected asset from web "  + expectedVariableS);		        
				ReportUtils.test.log(LogStatus.INFO, "Getting actual asset from excel: "  + actualVariable + " & expected asset from web: " + expectedVariableS);
			}  
			else  if(this.errorMessage.isDisplayed()){   
				String error = errorMessage.getText();
				Const.logger.info("Getting error message:- " + error);
				CommonMethods.clickOn(cancelButton);   
				Const.logger.info("This combination is already exist");
		    }  			
		}
		
		
		
		public void dataEntry(String From, String To, String Quantity, String Activity,String ActivityUsage, String EmissionSource, String Hub,String Facility,String Variable) throws InterruptedException{
			Const.logger.info("dataEntry method is running.");	
			ReportUtils.test.log(LogStatus.INFO, "Running dataEntry method.");
			CommonMethods.clickOn(dataMenu);
			CommonMethods.clickOn(RefrigerantsOrHalocarbons);			
			Thread.sleep(8000);
			CommonMethods.clickOn(DataEntry);			
			Thread.sleep(8000);
			CommonMethods.select(activityDropdown, Activity);
			CommonMethods.select(activityNUsageDropdown, ActivityUsage);
			CommonMethods.select(emissionSourceDropdown, EmissionSource);
			CommonMethods.select(hubDropdown, Hub);
			CommonMethods.select(facilityDropdown, Facility);			
			CommonMethods.clickOn(GoButton);
			Thread.sleep(5000);			
			CommonMethods.clickOn(dataAddEnteredAt);
			Thread.sleep(3000);
			CommonMethods.enterText(filtertTextBox, Facility);
			CommonMethods.clickOn(filterButton);
			Thread.sleep(5000);
			CommonMethods.clickOn(dataEntryVariableFilter);
			Thread.sleep(3000);
			CommonMethods.enterText(filtertTextBox, Variable);
			CommonMethods.clickOn(filterButton);
			
			Thread.sleep(5000);				
			if(!assetsAddTable.isEmpty()) {
			executor.executeScript("arguments[0].value='"+From+"'", dateFromText);
			Thread.sleep(3000);
			executor.executeScript("arguments[0].value='"+To+"'", dateToText);
			executor.executeScript("arguments[0].click();", dateToText);
			Thread.sleep(5000);
			CommonMethods.enterText(quantityText, Quantity);	
			CommonMethods.scrollTo(driver, saveButton);			
			Thread.sleep(5000);
			CommonMethods.enterText(notesText, "Automation Testing");
			Thread.sleep(7000);
			CommonMethods.clickOn(saveButton);				
			String alertMsg = CommonMethods.getTextFromElement(alertMessage);
			Const.logger.info(alertMsg);
			ReportUtils.test.log(LogStatus.PASS, alertMsg);
			CommonMethods.clickOn(alertPopUpOKButton);		
			
			Const.logger.info(" <><>Start Verifying entered data.<><> ");
			ReportUtils.test.log(LogStatus.INFO, "Start Verifying entered data.");
			driver.navigate().refresh();
			Thread.sleep(7000);			
			CommonMethods.select(activityDropdown, Activity);
			CommonMethods.select(activityNUsageDropdown, ActivityUsage);
			CommonMethods.select(emissionSourceDropdown, EmissionSource);
			CommonMethods.select(hubDropdown, Hub);
			CommonMethods.select(facilityDropdown, Facility);
			CommonMethods.clickOn(GoButton);			
			Thread.sleep(8000);
			String actualDateFrom = From;
			String actualDateTo = To;
			//Using the Double class constructor and convert in double then in string with comma format and roundoff 2 decimal
	        Double stringToDouble = new Double(Quantity);
	        double Double = stringToDouble.doubleValue();
	        String formattedNumberWithComma = String.format("%,.2f", Double);
			String actualqty = formattedNumberWithComma;			
			String expectedDateFromS = expectedDateFrom.getText();
			String expectedDateToS = expectedDateTo.getText();
			String expectedQtyS = expectedQty.getText();
			
			Assert.assertEquals(actualDateFrom, expectedDateFromS);
			Const.logger.info("Getting actual fromDate from excel "  + actualDateFrom);
			Const.logger.info("Getting expected fromDate from web "  + expectedDateFromS);
			ReportUtils.test.log(LogStatus.INFO, "Getting actual fromDate from excel: "  + actualDateFrom + " & expected fromDate from web: " + expectedDateFromS);
			Assert.assertEquals(actualDateTo, expectedDateToS);
			Const.logger.info("Getting actual toDate from excel "  + actualDateTo);
			Const.logger.info("Getting expected toDate from web "  +  expectedDateToS);
			ReportUtils.test.log(LogStatus.INFO, "Getting actual toDate from excel: "  + actualDateTo + " & expected toDate from web: " + expectedDateToS);
			Assert.assertEquals(actualqty, expectedQtyS);
			Const.logger.info("Getting actual qty from excel "  + actualqty);
			Const.logger.info("Getting expected qty from web "  +  expectedQtyS);
			ReportUtils.test.log(LogStatus.INFO, "Getting actual qty from excel: "  + actualqty + " & expected qty from web: " + expectedQtyS);					

			Const.logger.info("Data Entry is completed for Refrigerants/Halocarbons.");
			ReportUtils.test.log(LogStatus.INFO, "Data Entry is completed for Refrigerants/Halocarbons.");
			}
			else {
				Const.logger.info("Asset does not exist.");
				ReportUtils.test.log(LogStatus.INFO, "Asset does not exist.");
			}				
		}
		
		public void updateNVerifyData(String ExistFrom, String ExistTo,String Quantity,String From, String To, String Activity,String ActivityUsage, String EmissionSource,String Hub,String Facility,String Variable) throws InterruptedException {
			Const.logger.info("updateNVerifyData method is running.");
			ReportUtils.test.log(LogStatus.INFO, "Running updateNVerifyData method.");

			CommonMethods.clickOn(dataMenu);
			CommonMethods.clickOn(RefrigerantsOrHalocarbons);			
			Thread.sleep(8000);
			CommonMethods.select(activityDropdown, Activity);
			CommonMethods.select(activityNUsageDropdown, ActivityUsage);
			CommonMethods.select(emissionSourceDropdown, EmissionSource);
			CommonMethods.select(hubDropdown, Hub);
			CommonMethods.select(facilityDropdown, Facility);			
			CommonMethods.clickOn(GoButton);			
			Thread.sleep(5000);
			CommonMethods.clickOn(dataShowEnteredAt);		
			CommonMethods.enterText(filtertTextBox, Facility);
			CommonMethods.clickOn(filterButton);
			Thread.sleep(5000);
			CommonMethods.clickOn(variableFilterDataShow);
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
			
			if(!assetsShowTable.isEmpty()) {
			CommonMethods.scrollTo(driver, editButton);
			Thread.sleep(8000);
			CommonMethods.clickOn(editButton);
			CommonMethods.scrollTo(driver, editDateFromTextBox);
			Thread.sleep(3000);
			CommonMethods.clear(editDateFromTextBox);
			Thread.sleep(3000);
			CommonMethods.clear(editDateToTextBox);
			Thread.sleep(3000);
			CommonMethods.enterText(editDateFromTextBox, From);
			Thread.sleep(2000);
			CommonMethods.enterText(editDateToTextBox, To);			
			CommonMethods.scrollTo(driver, editQty);
			Thread.sleep(3000);
			CommonMethods.clear(editQty);
			CommonMethods.enterText(editQty, Quantity);
			Thread.sleep(3000);
			CommonMethods.scrollTo(driver, editSaveButton);
			Thread.sleep(3000);
			CommonMethods.clear(editNotesText);
			CommonMethods.enterText(editNotesText, "Test Automation");
			Thread.sleep(3000);
			CommonMethods.clickOn(editSaveButton);				
			String alertMsg = CommonMethods.getTextFromElement(alertMessage);
			Const.logger.info(alertMsg);
			ReportUtils.test.log(LogStatus.PASS, alertMsg);
			CommonMethods.clickOn(alertPopUpOKButton);
			Thread.sleep(5000);

			Const.logger.info(" <><>Start Verifying updated data.<><>");
			ReportUtils.test.log(LogStatus.INFO, "Start verifying updated data.");
			driver.navigate().refresh();
			Thread.sleep(8000);
			CommonMethods.select(activityDropdown, Activity);
			CommonMethods.select(activityNUsageDropdown, ActivityUsage);
			CommonMethods.select(emissionSourceDropdown, EmissionSource);
			CommonMethods.select(hubDropdown, Hub);
			CommonMethods.select(facilityDropdown, Facility);
			CommonMethods.clickOn(GoButton);
			Thread.sleep(5000);			
			String actualDateFrom = From;
			String actualDateTo = To;
	        Double stringToDouble = new Double(Quantity);
	        double Double = stringToDouble.doubleValue();
	        String formattedNumberWithComma = String.format("%,.2f", Double);	    	
			String actualqty = formattedNumberWithComma;			
			String expectedDateFromS = expectedDateFrom.getText();
			String expectedDateToS = expectedDateTo.getText();
			String expectedQtyS = expectedQty.getText();
			
			Assert.assertEquals(actualDateFrom, expectedDateFromS);
			Const.logger.info("Getting actual fromDate from excel "  + actualDateFrom);
			Const.logger.info("Getting expected fromDate from web "  + expectedDateFromS);
			ReportUtils.test.log(LogStatus.INFO, "Getting actual fromDate from excel: "  + actualDateFrom + " & expected fromDate from web: " + expectedDateFromS);
			Assert.assertEquals(actualDateTo, expectedDateToS);
			Const.logger.info("Getting actual toDate from excel "  + actualDateTo);
			Const.logger.info("Getting expected toDate from web "  +  expectedDateToS);
			ReportUtils.test.log(LogStatus.INFO, "Getting actual toDate from excel: "  + actualDateTo + " & expected toDate from web: " + expectedDateToS);
			Assert.assertEquals(actualqty, expectedQtyS);
			Const.logger.info("Getting actual qty from excel "  + actualqty);
			Const.logger.info("Getting expected qty from web "  +  expectedQtyS);
			ReportUtils.test.log(LogStatus.INFO, "Getting actual qty from excel: "  + actualqty + " & expected qty from web: " + expectedQtyS);					
			
			Const.logger.info("Data Entry updation and verification process is completed.");
			ReportUtils.test.log(LogStatus.INFO, "Data Entry updation and verification process is completed.");
			}
			else {
				Const.logger.info("Asset data does not exist.");
				ReportUtils.test.log(LogStatus.INFO, "Asset data does not exist.");
			}
			}


		public void dataDelete(String Activity,String ActivityUsage, String EmissionSource, String Hub, String Facility, String Variable) throws InterruptedException {
			Const.logger.info("dataDelete method is running");
			ReportUtils.test.log(LogStatus.INFO, "Running dataDelete method.");
			
			CommonMethods.clickOn(dataMenu);
			CommonMethods.clickOn(RefrigerantsOrHalocarbons);			
			Thread.sleep(8000);			
			CommonMethods.select(activityDropdown, Activity);
			CommonMethods.select(activityNUsageDropdown, ActivityUsage);
			CommonMethods.select(emissionSourceDropdown, EmissionSource);
			CommonMethods.select(hubDropdown, Hub);
			CommonMethods.select(facilityDropdown, Facility);
			CommonMethods.clickOn(GoButton);			
			Thread.sleep(5000);
			CommonMethods.clickOn(dataShowEnteredAt);
			CommonMethods.enterText(filtertTextBox, Facility);
			CommonMethods.clickOn(filterButton);
			Thread.sleep(5000);
			CommonMethods.clickOn(variableFilterDataShow);
			Thread.sleep(3000);
			CommonMethods.enterText(filtertTextBox, Variable);
			CommonMethods.clickOn(filterButton);	

			Thread.sleep(10000);
			if(!assetsShowTable.isEmpty()) {
			CommonMethods.scrollTo(driver, archiveCheckbox);
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
			Const.logger.info("Data Entry is deleted for Refrigerants/Halocarbons.");
			ReportUtils.test.log(LogStatus.INFO, "Data Entry is deleted for Refrigerants/Halocarbons.");
			}
			else {
				Const.logger.info("Asset data does not exist.");
				ReportUtils.test.log(LogStatus.INFO, "Asset data does not exist.");
			}
		}
		
		public void assetDelete(String Activity,String ActivityUsage, String EmissionSource, String Hub, String Facility, String Variable) throws InterruptedException {
			Const.logger.info("assetDelete method is running");
			ReportUtils.test.log(LogStatus.INFO, "Running assetDelete method.");
			
			CommonMethods.clickOn(dataMenu);
			CommonMethods.clickOn(RefrigerantsOrHalocarbons);			
			Thread.sleep(5000);
			CommonMethods.clickOn(DataEntry);
			Thread.sleep(3000);
			CommonMethods.select(activityDropdown, Activity);
			CommonMethods.select(activityNUsageDropdown, ActivityUsage);
			CommonMethods.select(emissionSourceDropdown, EmissionSource);
			CommonMethods.select(hubDropdown, Hub);
			CommonMethods.select(facilityDropdown, Facility);
			CommonMethods.clickOn(GoButton);			
			Thread.sleep(5000);
			CommonMethods.clickOn(dataAddEnteredAt);
			Thread.sleep(3000);
			CommonMethods.enterText(filtertTextBox, Facility);
			CommonMethods.clickOn(filterButton);
			Thread.sleep(5000);
			CommonMethods.clickOn(dataEntryVariableFilter);
			Thread.sleep(3000);
			CommonMethods.enterText(filtertTextBox, Variable);
			CommonMethods.clickOn(filterButton);
			
			Thread.sleep(5000);				
			if(!assetsAddTable.isEmpty()) {
			CommonMethods.scrollTo(driver, deleteAssetCheckBox);
			Thread.sleep(5000);
			CommonMethods.clickOn(deleteAssetCheckBox);
			CommonMethods.clickOn(deleteAssetButton);
			String confirmAlertMessage = deleteConfirmationAlertMessage.getText();
			Thread.sleep(3000);
			Const.logger.info(confirmAlertMessage);
			ReportUtils.test.log(LogStatus.INFO, confirmAlertMessage);
			CommonMethods.clickOn(deleteDataConfirmButton);
			String alertMsg = CommonMethods.getTextFromElement(alertMessage);
			Const.logger.info(alertMsg);
			ReportUtils.test.log(LogStatus.PASS, alertMsg);
			CommonMethods.clickOn(alertPopUpOKButton);
			Const.logger.info("Asset is deleted succcessfully for Refrigerants/Halocarbons.");
			ReportUtils.test.log(LogStatus.INFO, "Asset is deleted succcessfully for Refrigerants/Halocarbons.");
			}
			else {
				Const.logger.info("Asset does not exist.");
				ReportUtils.test.log(LogStatus.INFO, "Asset does not exist.");
			}
			
		}

}
