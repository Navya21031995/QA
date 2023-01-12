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

public class Transport_Air {

	WebDriver driver;
//	private WebDriverWait wait10;
	private WebDriverWait wait40;
	SoftAssert Assert;
	
		public Transport_Air(WebDriver driver){
			
//		    this.wait10 = new WebDriverWait(driver, 10);
		    this.wait40 = new WebDriverWait(driver, 40);
		    this.Assert = new SoftAssert();
			this.driver=driver;		    
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath=CommonLocators.MEGA_MENU_DATA)
		WebElement dataMenu;
		
		@FindBy(xpath="//ul[@class='col-sm-4 list-unstyled']//a[text()='"+Const.AIR_SUB_MENU+"']")
		WebElement Air;
		
		@FindBy(id=CommonLocators.DATA_ENTRY)
		WebElement DataEntry;
		
		@FindBy(id=CommonLocators.ACTIVITY_DROPDOWN)
		WebElement activityDropdown;
		
		@FindBy(id=CommonLocators.HUB_DROPDOWN)
		WebElement hubDropdown;
		
		@FindBy(id=CommonLocators.FACILITY_DROPDOWN)
		WebElement facilityDropdown;
		
		@FindBy(id=CommonLocators.GO_BUTTON)
		WebElement GoButton;
		
		@FindBy(xpath="//div[@id='tblDataAddAirTransport1']//tr[1]/td//input[contains(@id,'txtDateFrom_')]")
		WebElement dateFromText;
				
		@FindBy(xpath="//div[@id='tblDataAddAirTransport1']//tr[1]/td//input[contains(@id,'txtDateTo_')]")
		WebElement dateToText;
		
		@FindBy(xpath="//div[@id='tblDataAddAirTransport1']//tr[1]/td//input[contains(@id,'txtQuantity_')]")
		WebElement distanceText;
	
		@FindBy(xpath="//div[@id='tblDataAddAirTransport1']//tr[1]/td//input[contains(@id,'txtPassengerNum_')]")
		WebElement passengerNoText;

		@FindBy(xpath="//div[@id='tblDataAddAirTransport1']//tr[1]/td//input[@id[contains(.,'txtNotes')]]")
		WebElement notesText;
		
		@FindBy(xpath="//div[@id='tblDataAddAirTransport1']//tr[1]/td//i[contains(@id,'btnSave_')]")
		WebElement saveButton;
		
		@FindBy(id=CommonLocators.ALERT_POP_UP_MESSAGE)
		WebElement alertMessage;
		
		@FindBy(id= CommonLocators.ALERT_POP_UP_BUTTON)
		WebElement alertPopUpOKButton;
		
		@FindBy(xpath="//div[@id='tblDataShowAirTransport']//tr[1]/td//label[@id[contains(.,'lblDateFromEdit')]]")
		WebElement expectedDateFrom;
		
		@FindBy(xpath="//div[@id='tblDataShowAirTransport']//tr[1]/td//label[@id[contains(.,'lblDateToEdit')]]")
		WebElement expectedDateTo;
		
		@FindBy(xpath="//div[@id='tblDataShowAirTransport']//tr[1]/td//label[@id[contains(.,'lblQuantityEdit')]]")
		WebElement expectedDistance;

		@FindBy(xpath="//div[@id='tblDataShowAirTransport']//tr[1]/td//label[@id[contains(.,'lblPassengerNumEdit_')]]")
		WebElement expectedPassengerNo;
		
		@FindBy(xpath="//div[@id='tblDataShowAirTransport']//tr[1]/td//i[contains(@id,'btnEdit_')]")
		WebElement editButton;
		
		@FindBy(xpath="//div[@id='tblDataShowAirTransport']//tr[1]/td//input[contains(@id,'txtQuantity_')]")
		WebElement editDistance;

		@FindBy(xpath="//div[@id='tblDataShowAirTransport']//tr[1]/td//input[contains(@id,'txtPassengerNum_')]")
		WebElement editPassengerNo;
		
		@FindBy(xpath="//div[@id='tblDataShowAirTransport']//tr[1]/td//input[@id[contains(.,'txtNotes_')]]")
		WebElement editNotesText;
		
		@FindBy(xpath="//div[@id='tblDataShowAirTransport']//tr[1]/td//i[contains(@id,'btnEditSave_')]")
		WebElement editSaveButton;
				
		@FindBy(id="lnkOpenAirTransport")
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
		
		@FindBy(id=CommonLocators.ADD_ASSET_MEASUREMENT_UNIT)
		WebElement measurementUNit;
			
		@FindBy(id=CommonLocators.ADD_ASSET_SAVE_BUTTON)
		WebElement assetSaveButton;
		
		@FindBy(xpath=CommonLocators.ADD_ASSET_ERROR_MESSAGE)
		WebElement errorMessage;
		
		@FindBy(id=CommonLocators.ADD_ASSET_CANCEL_BUTTON)
		WebElement cancelButton;
				
		@FindBy(xpath="//div[@id='tblDataShowAirTransport']//tr[1]/td//label[contains(@for,'chkAllArchive_')]")
		WebElement archiveCheckbox;
		
		@FindBy(xpath="//div[@id='tblDataShowAirTransport']//tr[1]/td//label[contains(@for,'chkAllDelete_')]")
		WebElement tableDeleteCheckbox;
		
		@FindBy(id=CommonLocators.DELETE_ALL_BUTTON)
		WebElement allDataDeleteButton;
		
		@FindBy(xpath=CommonLocators.DELETE_CONFIRMATION_MESSAGE)
		WebElement deleteConfirmationAlertMessage;
		
		@FindBy(xpath=CommonLocators.DELETE_CONFIRM_BUTTON)
		WebElement deleteDataConfirmButton;
		
		@FindBy(xpath=CommonLocators.DELETE_CANCEL_BUTTON)
		WebElement deleteDataCancelButton;
		
		@FindBy(xpath="//div[@id='tblDataShowAirTransport']//table//th[8]//a[@class='k-grid-filter']")
		WebElement variableFilterDataShow;
		
		@FindBy(xpath=CommonLocators.FILTER_TEXT_BOX)
		WebElement filtertTextBox;
		
		@FindBy(xpath=CommonLocators.SEARCH_FILTER_BUTTON)
		WebElement filterButton;
		
		@FindBy(xpath="//div[@id='tblDataAddAirTransport1']//tr[1]/td//label[contains(@for,'chkAllDeleteAsset_')]")
		WebElement deleteAssetCheckBox;
		
		@FindBy(id=CommonLocators.ASSET_DELETE_BUTTON)
		WebElement deleteAssetButton;

		@FindBy(xpath="//div[@id='tblDataShowAirTransport']//table//th[12]//a[@class='k-grid-filter']")
		WebElement fromDateFilter;
		
		@FindBy(xpath="//div[@id='tblDataShowAirTransport']//table//th[13]//a[@class='k-grid-filter']")
		WebElement toDateFilter;
		
		@FindBy(xpath=CommonLocators.DATE_FILTER_TEXT_BOX)
		WebElement dateFilterTextBox;
		
		@FindBy(xpath="//div[@id='tblDataAddAirTransport1']//table//th[5]//a[@class='k-grid-filter']")
		WebElement dataAddEnteredAt;
		
		@FindBy(xpath="//div[@id='tblDataAddAirTransport1']//table//th[8]//a[@class='k-grid-filter']")
		WebElement dataEntryVariableFilter;
		
		@FindBy(xpath="//div[@id='tblDataAddAirTransport1']//tr[1]//td//a[@class='clsInputControl']")
		WebElement expectedVariableAsset;
			
		@FindBy(how=How.XPATH, using =  "//div[@id='tblDataAddAirTransport1']//tr//td[8]")
		List<WebElement> assetsAddTable;
		
		@FindBy(xpath="//div[@id='tblDataShowAirTransport']//table//th[5]//a[@class='k-grid-filter']")
		WebElement dataShowEnteredAt;
		
		@FindBy(how=How.XPATH, using = "//div[@id='tblDataShowAirTransport']//tr//td[8]" )
		List<WebElement> assetsShowTable;
		
		@FindBy(xpath="//select[@id='ddlActivityBase']//option[contains(text(),'Aviation(By Distance)')]")
		WebElement byDistance;
		
		@FindBy(xpath="//select[@id='ddlActivityBase']//option[contains(text(),'Aviation(By Destination)')]")
		WebElement byDestination;		
		
		@FindBy(xpath="//img[contains(@id,'imgOpenDestinationPopUp_')]")
		WebElement distanceAeroplaneImage;
		
		@FindBy(id="rad2Way")
		WebElement returnRadioButton;
		
		@FindBy(id="rad1Way")
		WebElement oneWayRadioButton;	
		
		@FindBy(id="txtDateFromDestination")
		WebElement dateOfTravelTextBox;
		
		@FindBy(id="txtDateToDestination")
		WebElement dateOfReturnTextBox;
		
		@FindBy(id="ddlFromCountry")
		WebElement fromCountryDropdown;
		
		@FindBy(xpath="//select[contains(@id,'ddlToCountry_')]")
		WebElement toCountryDropdown;	
		
		@FindBy(id="ddlFromAirport")
		WebElement fromAirportDropdown;
		
		@FindBy(xpath="//select[contains(@id,'ddlToAirport_1')]")
		WebElement toAirportDropdown;
		
		@FindBy(id="ddlUnitsDestination")
		WebElement destinationUnit;
		
		@FindBy(id="btnSaveAirPort")
		WebElement saveButtonAirFlights;
		
		public void addAsset(String Facility, String Activity, String Variable, String Unit ) throws InterruptedException{
			Const.logger.info("addAsset method is running.");
			ReportUtils.test.log(LogStatus.INFO, "Running addAsset method.");

			CommonMethods.clickOn(dataMenu);
			CommonMethods.clickOn(Air);			
			Thread.sleep(5000);
			CommonMethods.clickOn(AddNewAssetButton);			
			Thread.sleep(3000);			
			wait40.until(ExpectedConditions.elementToBeClickable(FacilityGearIcon));
			CommonMethods.clickOn(FacilityGearIcon);
			Thread.sleep(5000);
			CommonMethods.clickOn(FacilityGearIcon);			
			Thread.sleep(5000);
			CommonMethods.enterText(SearchBoxFacility, Facility);			
			Thread.sleep(3000);
			CommonMethods.clickOn(SelectAssetFacility);
			CommonMethods.clickOn(OkButton);
			CommonMethods.select(assetActivityDropdown, Activity);
			Thread.sleep(5000);
			CommonMethods.clickOn(variableNameDropdown);
			CommonMethods.enterText(searchVariableName, Variable);
			Thread.sleep(3000);

			for(WebElement element: selectVariable ) {
				if(element.getText().equals(Variable)) {
					element.click();
				}
			}			
			
			CommonMethods.select(measurementUNit, Unit);
			CommonMethods.clickOn(assetSaveButton);
//			CommonMethods.clickOn(alertPopUp);
//			CommonMethods.clickOn(cancelButton);
			
		}
		
			public void assetSaveCancelButton( String Facility,String Variable,String Activity,String Hub) throws InterruptedException {
				
				if (this.alertPopUpOKButton.isDisplayed()){ 
			    	String alertSavedMessage = alertMessage.getText();
			    	Const.logger.info(alertSavedMessage);
					ReportUtils.test.log(LogStatus.PASS, alertSavedMessage);		    	
			        CommonMethods.clickOn(alertPopUpOKButton);			        
					driver.navigate().refresh();

					Thread.sleep(8000);
					CommonMethods.clickOn(DataEntry);
					Const.logger.info(" <><>Start verifying of added asset.<><> ");
					ReportUtils.test.log(LogStatus.INFO, "Start verifying of added asset. ");
					Thread.sleep(8000);	
					CommonMethods.select(activityDropdown, Activity);				
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
				else if(this.errorMessage.isDisplayed()){   
					String error = errorMessage.getText();
					Const.logger.info(error);
					CommonMethods.clickOn(cancelButton);   
					Const.logger.info("This combination is already exist");
			     }   				
			}
		
			public void dataEntry(String From, String To, String Distance, String Activity,String Hub,String Facility, String Variable, String dateOfTravel,String dateOfReturn,String fromCountry,String fromAirport,String toCountry,String toAirport,String unitDestination,String Passengers) throws InterruptedException{

				Const.logger.info("dataEntry method is running.");
				ReportUtils.test.log(LogStatus.INFO, "Running dataEntry method.");				
				CommonMethods.clickOn(dataMenu);
				CommonMethods.clickOn(Air);			
				Thread.sleep(8000);
				CommonMethods.clickOn(DataEntry);			
				Thread.sleep(8000);					
				String activity = Activity;
				CommonMethods.clickOn(activityDropdown);
				String distance = byDistance.getText();
				//String destination = byDestination.getText();
				
				if(activity.equals(distance)) {					
				CommonMethods.select(activityDropdown, Activity);	
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
				CommonMethods.enterText(dateFromText, From);
				CommonMethods.enterText(dateToText, To);
				CommonMethods.enterText(distanceText, Distance);
				CommonMethods.enterText(passengerNoText, Passengers);
				CommonMethods.scrollTo(driver, saveButton);			
				Thread.sleep(7000);
				CommonMethods.enterText(notesText, "Automation Testing");
				Thread.sleep(5000);
				CommonMethods.clickOn(saveButton);						
				String alertMsg = CommonMethods.getTextFromElement(alertMessage);
				Const.logger.info(alertMsg);
				ReportUtils.test.log(LogStatus.PASS, alertMsg);
				CommonMethods.clickOn(alertPopUpOKButton);
				
				Const.logger.info("<><> Start Verifying entered data. <><>");
				ReportUtils.test.log(LogStatus.INFO, "Start Verifying entered data.");
				driver.navigate().refresh();
				Thread.sleep(8000);
				CommonMethods.select(activityDropdown, Activity);
				CommonMethods.select(hubDropdown, Hub);
				CommonMethods.select(facilityDropdown, Facility);
				CommonMethods.clickOn(GoButton);
				Thread.sleep(8000);				
				String actualDateFrom = From;
				String actualDateTo = To;
				String actualPassengers = Passengers;
		        Double stringToDouble = new Double(Distance);
		        double Double = stringToDouble.doubleValue();
		        String formattedNumberWithComma = String.format("%,.2f", Double);
				String actualdistance = formattedNumberWithComma;				
				String expectedDateFromS = expectedDateFrom.getText();
				String expectedDateToS = expectedDateTo.getText();
				String expectedDistanceS = expectedDistance.getText();
				String expectedPassengersS = expectedPassengerNo.getText();
				
				Assert.assertEquals(actualDateFrom, expectedDateFromS);
				Const.logger.info("Getting actual fromDate from excel "  + actualDateFrom);
				Const.logger.info("Getting expected fromDate from web "  + expectedDateFromS);
				ReportUtils.test.log(LogStatus.INFO, "Getting actual fromDate from excel: "  + actualDateFrom + " & expected fromDate from web: " + expectedDateFromS);
				Assert.assertEquals(actualDateTo, expectedDateToS);
				Const.logger.info("Getting actual toDate from excel "  + actualDateTo);
				Const.logger.info("Getting expected toDate from web "  +  expectedDateToS);
				ReportUtils.test.log(LogStatus.INFO, "Getting actual toDate from excel: "  + actualDateTo + " & expected toDate from web: " + expectedDateToS);
				Assert.assertEquals(actualdistance, expectedDistanceS);
				Const.logger.info("Getting actual quantity from excel "  + actualdistance);
				Const.logger.info("Getting expected quantity from web "  +  expectedDistanceS);
				ReportUtils.test.log(LogStatus.INFO, "Getting actual distance from excel: "  + actualdistance + " & expected distance from web: " + expectedDistanceS);								
				Assert.assertEquals(actualPassengers, expectedPassengersS);
				Const.logger.info("Getting actual passengers from excel "  + actualPassengers);
				Const.logger.info("Getting expected passengers from web "  +  expectedPassengersS);
				ReportUtils.test.log(LogStatus.INFO, "Getting actual passengers from excel: "  + actualPassengers + " & expected passengers from web: " + expectedPassengersS);					
				
				Const.logger.info("Data Entry is completed for Air.");	
				ReportUtils.test.log(LogStatus.INFO, "Data Entry is completed for Air.");

					}
				else {
					Const.logger.info("Asset does not exist.");
					ReportUtils.test.log(LogStatus.INFO, "Asset does not exist.");
					}
				}
		else {
					CommonMethods.select(activityDropdown, Activity);	
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
					CommonMethods.enterText(dateFromText, From);
					CommonMethods.enterText(dateToText, To);					
					CommonMethods.scrollTo(driver, distanceAeroplaneImage);
					CommonMethods.clickOn(distanceAeroplaneImage);
					Thread.sleep(3000);
					CommonMethods.clickOn(distanceAeroplaneImage);
					Thread.sleep(2000);
					CommonMethods.clickOn(returnRadioButton);
					CommonMethods.enterText(dateOfTravelTextBox, dateOfTravel);
					CommonMethods.enterText(dateOfReturnTextBox, dateOfReturn);
					CommonMethods.select(fromCountryDropdown, fromCountry);
					Thread.sleep(2000);
					CommonMethods.select(fromAirportDropdown, fromAirport);
					Thread.sleep(2000);
					CommonMethods.select(toCountryDropdown, toCountry);
					Thread.sleep(2000);
					CommonMethods.select(toAirportDropdown, toAirport);
					Thread.sleep(2000);
					CommonMethods.select(destinationUnit, unitDestination);
					CommonMethods.clickOn(saveButtonAirFlights);
					Thread.sleep(5000);					
					CommonMethods.enterText(passengerNoText, Passengers);
					CommonMethods.scrollTo(driver, saveButton);			
					Thread.sleep(7000);
					CommonMethods.enterText(notesText, "Automation Testing");
					Thread.sleep(5000);
					CommonMethods.clickOn(saveButton);						
					String alertMsg = CommonMethods.getTextFromElement(alertMessage);
					Const.logger.info(alertMsg);
					ReportUtils.test.log(LogStatus.PASS, alertMsg);
					CommonMethods.clickOn(alertPopUpOKButton);
				
					Const.logger.info("<><> Start Verifying entered data. <><>");
					ReportUtils.test.log(LogStatus.INFO, "Start verifying entered data.");
					driver.navigate().refresh();
					Thread.sleep(8000);
					CommonMethods.select(activityDropdown, Activity);
					CommonMethods.select(hubDropdown, Hub);
					CommonMethods.select(facilityDropdown, Facility);
					CommonMethods.clickOn(GoButton);
					Thread.sleep(8000);					
					String actualDateFrom = From;
					String actualDateTo = To;
					String actualPassengers = Passengers;					
					String expectedDateFromS = expectedDateFrom.getText();
					String expectedDateToS = expectedDateTo.getText();
					String expectedPassengersS = expectedPassengerNo.getText();
					
					Assert.assertEquals(actualDateFrom, expectedDateFromS);
					Const.logger.info("Getting actual fromDate from excel "  + actualDateFrom);
					Const.logger.info("Getting expected fromDate from web "  + expectedDateFromS);
					ReportUtils.test.log(LogStatus.INFO, "Getting actual fromDate from excel: "  + actualDateFrom + " & expected fromDate from web: " + expectedDateFromS);
					Assert.assertEquals(actualDateTo, expectedDateToS);
					Const.logger.info("Getting actual toDate from excel "  + actualDateTo);
					Const.logger.info("Getting expected toDate from web "  +  expectedDateToS);
					ReportUtils.test.log(LogStatus.INFO, "Getting actual toDate from excel: "  + actualDateTo + " & expected toDate from web: " + expectedDateToS);
					Assert.assertEquals(actualPassengers, expectedPassengersS);
					Const.logger.info("Getting actual passengers from excel "  + actualPassengers);
					Const.logger.info("Getting expected passengers from web "  +  expectedPassengersS);
					ReportUtils.test.log(LogStatus.INFO, "Getting actual passengers from excel: "  + actualPassengers + " & expected passengers from web: " + expectedPassengersS);					
					
					Const.logger.info("Data Entry is completed for Air.");	
					ReportUtils.test.log(LogStatus.INFO, "Data Entry is completed for Air.");
					
					}
				else {
						Const.logger.info("Asset does not exist.");
						ReportUtils.test.log(LogStatus.INFO, "Asset does not exist.");
					}					
				}			
			} 
		
		public void updateNVerifyData(String From, String To, String Distance,String Passengers, String Activity,String Hub,String Facility, String Variable) throws InterruptedException {
			
			Const.logger.info("updateNVerifyData method is running.");
			ReportUtils.test.log(LogStatus.INFO, "Running updateNVerifyData method.");

			String activity = Activity;
			CommonMethods.clickOn(activityDropdown);
			String distance = byDistance.getText();
			//String destination = byDestination.getText();
			
			if(activity.equals(distance)) {				
			CommonMethods.select(activityDropdown, Activity);	
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
			
			if(!assetsShowTable.isEmpty()) {
			CommonMethods.scrollTo(driver, editButton);
			Thread.sleep(8000);
			CommonMethods.clickOn(editButton);
			CommonMethods.scrollTo(driver, editDistance);
			Thread.sleep(3000);
			CommonMethods.clear(editDistance);
			CommonMethods.enterText(editDistance, Distance);
			Thread.sleep(3000);
			CommonMethods.clear(editPassengerNo);;
			CommonMethods.enterText(editPassengerNo, Passengers);
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
			
			Const.logger.info("<><> Start Verifying updated data. <><>");
			ReportUtils.test.log(LogStatus.INFO, "Start verifying updated data.");
			driver.navigate().refresh();
			Thread.sleep(8000);
			CommonMethods.select(activityDropdown, Activity);
			CommonMethods.select(hubDropdown, Hub);
			CommonMethods.select(facilityDropdown, Facility);
			CommonMethods.clickOn(GoButton);
			Thread.sleep(5000);			
			String actualDateFrom = From;
			String actualDateTo = To;
			String actualPassengers = Passengers;
	        Double stringToDouble = new Double(Distance);
	        double Double = stringToDouble.doubleValue();
	        String formattedNumberWithComma = String.format("%,.2f", Double);	    	
			String actualdistance = formattedNumberWithComma;			
			String expectedDateFromS = expectedDateFrom.getText();
			String expectedDateToS = expectedDateTo.getText();
			String expectedDistanceS = expectedDistance.getText();
			String expectedPassengersS = expectedPassengerNo.getText();
			
			Assert.assertEquals(actualDateFrom, expectedDateFromS);
			Const.logger.info("Getting actual fromDate from excel "  + actualDateFrom);
			Const.logger.info("Getting expected fromDate from web "  + expectedDateFromS);
			ReportUtils.test.log(LogStatus.INFO, "Getting actual fromDate from excel: "  + actualDateFrom + " & expected fromDate from web: " + expectedDateFromS);
			Assert.assertEquals(actualDateTo, expectedDateToS);
			Const.logger.info("Getting actual toDate from excel "  + actualDateTo);
			Const.logger.info("Getting expected toDate from web "  +  expectedDateToS);
			ReportUtils.test.log(LogStatus.INFO, "Getting actual toDate from excel: "  + actualDateTo + " & expected toDate from web: " + expectedDateToS);
			Assert.assertEquals(actualdistance, expectedDistanceS);
			Const.logger.info("Getting actual distance from excel "  + actualdistance);
			Const.logger.info("Getting expected distance from web "  +  expectedDistanceS);
			ReportUtils.test.log(LogStatus.INFO, "Getting actual distance from excel: "  + actualdistance + " & expected distance from web: " + expectedDistanceS);					
			Assert.assertEquals(actualPassengers, expectedPassengersS);
			Const.logger.info("Getting actual passengers from excel "  + actualPassengers);
			Const.logger.info("Getting expected passengers from web "  +  expectedPassengersS);
			ReportUtils.test.log(LogStatus.INFO, "Getting actual passengers from excel: "  + actualPassengers + " & expected passengers from web: " + expectedPassengersS);					
			
			Const.logger.info("Data Entry updation and verification process is completed.");
			ReportUtils.test.log(LogStatus.INFO, "Data Entry updation and verification process is completed.");
			}
			else {
				Const.logger.info("Asset data does not exist.");
				ReportUtils.test.log(LogStatus.INFO, "Asset data does not exist.");
				}
			}
			else {				
				CommonMethods.select(activityDropdown, Activity);	
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
				
				//to update for date is pending because having some issue with module
				//HAVE TO UPDATE SCRIPT FOR DESTINATION ENTRY VERIFICATION AFTER ISSUE REOLVED FOR AIR
				if(!assetsShowTable.isEmpty()) {
				CommonMethods.scrollTo(driver, editButton);
				Thread.sleep(8000);
				CommonMethods.clickOn(editButton);
				CommonMethods.scrollTo(driver, editDistance);
				Thread.sleep(3000);
				CommonMethods.clear(editDistance);
				CommonMethods.enterText(editDistance, Distance);
				Thread.sleep(3000);
				CommonMethods.clear(editPassengerNo);;
				CommonMethods.enterText(editPassengerNo, Passengers);
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
				
				Const.logger.info("<><> Start Verifying updated data. <><>");
				ReportUtils.test.log(LogStatus.INFO, "Start verifying updated data.");
				driver.navigate().refresh();
				Thread.sleep(8000);
				CommonMethods.select(activityDropdown, Activity);
				CommonMethods.select(hubDropdown, Hub);
				CommonMethods.select(facilityDropdown, Facility);
				CommonMethods.clickOn(GoButton);
				Thread.sleep(5000);				
				String actualDateFrom = From;
				String actualDateTo = To;
				String actualPassengers = Passengers;
		        Double stringToDouble = new Double(Distance);
		        double Double = stringToDouble.doubleValue();
		        String formattedNumberWithComma = String.format("%,.2f", Double);		    	
				String actualdistance = formattedNumberWithComma;				
				String expectedDateFromS = expectedDateFrom.getText();
				String expectedDateToS = expectedDateTo.getText();
				String expectedDistanceS = expectedDistance.getText();
				String expectedPassengersS = expectedPassengerNo.getText();
				
				Assert.assertEquals(actualDateFrom, expectedDateFromS);
				Const.logger.info("Getting actual fromDate from excel "  + actualDateFrom);
				Const.logger.info("Getting expected fromDate from web "  + expectedDateFromS);
				ReportUtils.test.log(LogStatus.INFO, "Getting actual fromDate from excel: "  + actualDateFrom + " & expected fromDate from web: " + expectedDateFromS);
				Assert.assertEquals(actualDateTo, expectedDateToS);
				Const.logger.info("Getting actual toDate from excel "  + actualDateTo);
				Const.logger.info("Getting expected toDate from web "  +  expectedDateToS);
				ReportUtils.test.log(LogStatus.INFO, "Getting actual toDate from excel: "  + actualDateTo + " & expected toDate from web: " + expectedDateToS);
				Assert.assertEquals(actualdistance, expectedDistanceS);
				Const.logger.info("Getting actual distance from excel "  + actualdistance);
				Const.logger.info("Getting expected distance from web "  +  expectedDistanceS);
				ReportUtils.test.log(LogStatus.INFO, "Getting actual distance from excel: "  + actualdistance + " & expected distance from web: " + expectedDistanceS);					
				Assert.assertEquals(actualPassengers, expectedPassengersS);
				Const.logger.info("Getting actual passengers from excel "  + actualPassengers);
				Const.logger.info("Getting expected passengers from web "  +  expectedPassengersS);
				ReportUtils.test.log(LogStatus.INFO, "Getting actual passengers from excel: "  + actualPassengers + " & expected passengers from web: " + expectedPassengersS);					
				
				Const.logger.info("Data Entry updation and verification process is completed.");
				ReportUtils.test.log(LogStatus.INFO, "Data Entry updation and verification process is completed.");
					}	
				}
			}
		
		
		public void dataDelete(String Activity, String Hub, String Facility, String Variable) throws InterruptedException {
			Const.logger.info("dataDelete method is running");
			ReportUtils.test.log(LogStatus.INFO, "Running dataDelete method.");
			
			CommonMethods.clickOn(dataMenu);
			CommonMethods.clickOn(Air);			
			Thread.sleep(5000);
			CommonMethods.select(activityDropdown, Activity);
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
			Const.logger.info("Data Entry is deleted for Air.");
			ReportUtils.test.log(LogStatus.INFO, "Data Entry is deleted for Air.");
			}
			else {
				Const.logger.info("Asset data does not exist.");
				ReportUtils.test.log(LogStatus.INFO, "Asset data does not exist.");
			}
		}
				
		
		public void assetDelete(String Activity,String Hub, String Facility, String Variable) throws InterruptedException {
			Const.logger.info("assetDelete method is running");
			ReportUtils.test.log(LogStatus.INFO, "Running assetDelete method.");
			
			CommonMethods.clickOn(dataMenu);
			CommonMethods.clickOn(Air);			
			Thread.sleep(5000);
			CommonMethods.clickOn(DataEntry);
			Thread.sleep(3000);
			CommonMethods.select(activityDropdown, Activity);
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
			Thread.sleep(3000);
			String confirmAlertMessage = deleteConfirmationAlertMessage.getText();
			Const.logger.info(confirmAlertMessage);
			ReportUtils.test.log(LogStatus.INFO, confirmAlertMessage);
			CommonMethods.clickOn(deleteDataConfirmButton);
			String alertMsg = CommonMethods.getTextFromElement(alertMessage);
			Const.logger.info(alertMsg);
			ReportUtils.test.log(LogStatus.PASS, alertMsg);
			CommonMethods.clickOn(alertPopUpOKButton);
			Const.logger.info("Asset is deleted succcessfully for Air.");
			ReportUtils.test.log(LogStatus.INFO, "Asset is deleted succcessfully for Air.");
			}
			else {
				Const.logger.info("Asset does not exist.");
				ReportUtils.test.log(LogStatus.INFO, "Asset does not exist.");
			}
			
		}
		
}
