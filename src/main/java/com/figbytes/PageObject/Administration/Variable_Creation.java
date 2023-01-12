package com.figbytes.PageObject.Administration;


import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.testng.asserts.SoftAssert;

import com.figbytes.PageObject.CommonLocators;
import com.figbytes.Test.BaseClass;
import com.figbytes.Utilities.CommonMethods;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Variable_Creation {

	WebDriver driver;
	JavascriptExecutor executor;
	SoftAssert Assert;
	Actions action;
	//private WebDriverWait wait40;
	
		public Variable_Creation(WebDriver driver){
			//JavascriptExecutor executor = (JavascriptExecutor)BaseClass.driver;

			this.executor = (JavascriptExecutor)BaseClass.driver;
			this.Assert = new SoftAssert();
			this.action = new Actions(driver);
			
		//    this.wait40 = new WebDriverWait(driver, 40);

			this.driver=driver;		    
			PageFactory.initElements(driver, this);
		}
		

		@FindBy(xpath=CommonLocators.MEGA_MENU_ADMINISTRATION)
		WebElement adminMenu;
		
		@FindBy(xpath="//ul[@class='col-sm-4 list-unstyled']//a[text()='"+Const.VARIABLES_SUB_MENU+"']")
		WebElement variables;
		
		@FindBy(id="btnAddVariable")
		WebElement addVariable;
	
		@FindBy(id="rblCarbonVariable")
		WebElement selectEnvironmental;
		
		@FindBy(id="ddlCarbonType")
		WebElement carbonTypeDropdown;
			
		@FindBy(id="ddlActivity")
		WebElement activityDropdown;
				
		@FindBy(id="txtCarbonVariableName")
		WebElement envVariableName;
		
		@FindBy(id="ddlVariableCategoryCarbon")
		WebElement envCategoryDropdown;
		
		@FindBy(id="ddlCarbonUnitType")
		WebElement envUnitTypeDropdown;
		
		@FindBy(id="ddlCarbonUnit")
		WebElement envUnitDropdown;
		
		@FindBy(id="ddlCarbonDataFrequency")
		WebElement envDataFrequencyDropdown;
		
		@FindBy(xpath="//select[@id='ddlCarbonDataFrequency']//option[contains(text(),'"+Const.SELECT_DATE_WISE+"')]")
		WebElement selectEnvDataFrequency;
		
		@FindBy(id="btnCSSave")
		WebElement saveButton;
		
		@FindBy(id="btnCSReset")
		WebElement resetButton;
		
		@FindBy(id="btnCSCancel")
		WebElement cancelButton;

		@FindBy(id=CommonLocators.ALERT_POP_UP_MESSAGE)
		WebElement alertMessage;
		
		@FindBy(id= CommonLocators.ALERT_POP_UP_BUTTON)
		WebElement alertPopUpOKButton;
		
		@FindBy(xpath=CommonLocators.ERROR_MESSAGE)
		WebElement errorMessage;
		
		@FindBy(xpath="//div[@id='gvVariableData']//table//th[1]//a[@class='k-grid-filter']")
		WebElement variableFilter;
		
		@FindBy(xpath=CommonLocators.FILTER_TEXT_BOX)
		WebElement variableFiltertTextBox;
		
		@FindBy(xpath=CommonLocators.SEARCH_FILTER_BUTTON)
		WebElement variableFilterButton;
		
		@FindBy(xpath="//div[@id='gvVariableData']//tr[1]/td[1]")
		WebElement expectedVariable;
		
		@FindBy(id="rblCustomVariable")
		WebElement selectSocial;
		
		@FindBy(id="rblHandSVariable")
		WebElement selectHealthNSafety;
		
		@FindBy(id="rblOperationalVariable")
		WebElement selectOperational;
		
		@FindBy(id="txtVariableName")
		WebElement variableName;
		
		@FindBy(id="ddlUnitType")
		WebElement unitTypeDropdown;
		
		@FindBy(id="ddlUnit")
		WebElement unitDropdown;
		
		@FindBy(id="ddlVariableCategory")
		WebElement categoryDropdown;
		
		@FindBy(id="ddlFrequency")
		WebElement dataFrequencyDropdown;
		
		@FindBy(xpath="//select[@id='ddlFrequency']//option[contains(text(),'"+Const.SELECT_DATE_WISE+"')]")
		WebElement selectDataFrequency;
		
		@FindBy(xpath="//div[@id='gvVariableData']//tr[1]//td//i[contains(@id,'btnDelete_')]")
		WebElement deleteButton;
		
		@FindBy(how=How.XPATH, using ="//div[@id='gvVariableData']//tr//td[1]")
		List<WebElement> variableTable;			
		
		public void socialVariable(String Variable,String UnitType,String Unit,String Category ) throws InterruptedException {			

			ReportUtils.test.log(LogStatus.INFO, "Running socialVariable method.");	
			Const.logger.info("Running socialVariable method.");
			
			CommonMethods.clickOn(adminMenu);
			CommonMethods.clickOn(variables);
			Thread.sleep(7000);
			CommonMethods.clickOn(addVariable);
			Thread.sleep(5000);
			CommonMethods.clickOn(selectSocial);
			Thread.sleep(2000);
			//executor.executeScript("arguments[0].value='"+Variable+"'", variableName);
			CommonMethods.enterText(variableName, Variable);
			CommonMethods.select(unitTypeDropdown, UnitType);
			Thread.sleep(2000);
			CommonMethods.select(unitDropdown, Unit);
			CommonMethods.select(categoryDropdown, Category);
			CommonMethods.clickOn(dataFrequencyDropdown);
			CommonMethods.clickOn(selectDataFrequency);		
			CommonMethods.clickOn(saveButton);
			Thread.sleep(5000);
//			String alertSavedMessage = alertMessage.getText();
//	    	Const.logger.info("Getting successful message:- "  + alertSavedMessage);
//			CommonMethods.clickOn(alertPopUpOKButton);
		}
		
		public void environmenatalVariable(String Variable, String CarbonType, String Activity,String Category,String UnitType,String Unit) throws InterruptedException {

			ReportUtils.test.log(LogStatus.INFO, "Running environmenatalVariable method.");	
			Const.logger.info("Running environmenatalVariable method.");
			
			CommonMethods.clickOn(adminMenu);
			CommonMethods.clickOn(variables);
			Thread.sleep(7000);
			CommonMethods.clickOn(addVariable);

			Thread.sleep(5000);
			CommonMethods.clickOn(selectEnvironmental);
			CommonMethods.select(carbonTypeDropdown, CarbonType);
			Thread.sleep(2000);
			CommonMethods.select(activityDropdown, Activity);
			Thread.sleep(2000);
			CommonMethods.enterText(envVariableName, Variable);
			CommonMethods.select(envCategoryDropdown, Category);
			CommonMethods.select(envUnitTypeDropdown, UnitType);
			Thread.sleep(2000);
			CommonMethods.select(envUnitDropdown, Unit);
			CommonMethods.clickOn(envDataFrequencyDropdown);
			CommonMethods.clickOn(selectEnvDataFrequency);
			CommonMethods.clickOn(saveButton);

		}
		
		
		public void healthAndSafetyVariable(String Variable,String UnitType,String Unit,String Category ) throws InterruptedException {			
			
			ReportUtils.test.log(LogStatus.INFO, "Running healthAndSafetyVariable method.");
			Const.logger.info("Running healthAndSafetyVariable method.");
			
			CommonMethods.clickOn(adminMenu);
			CommonMethods.clickOn(variables);
			Thread.sleep(7000);
			CommonMethods.clickOn(addVariable);
			Thread.sleep(5000);
			CommonMethods.clickOn(selectHealthNSafety);
			Thread.sleep(2000);
			CommonMethods.enterText(variableName, Variable);
			CommonMethods.select(unitTypeDropdown, UnitType);
			Thread.sleep(2000);
			CommonMethods.select(unitDropdown, Unit);	
			CommonMethods.select(categoryDropdown, Category);
			CommonMethods.clickOn(dataFrequencyDropdown);
			CommonMethods.clickOn(selectDataFrequency);		
			CommonMethods.clickOn(saveButton);
//			Thread.sleep(5000);
//			String alertSavedMessage = alertMessage.getText();
//	    	Const.logger.info("Getting successful message:- "  + alertSavedMessage);
//			CommonMethods.clickOn(alertPopUpOKButton);
		}
		
		public void operationalVariable(String Variable,String UnitType,String Unit,String Category ) throws InterruptedException {			

			ReportUtils.test.log(LogStatus.INFO, "Running operationalVariable method.");
			Const.logger.info("Running operationalVariable method.");
			
			CommonMethods.clickOn(adminMenu);
			CommonMethods.clickOn(variables);
			Thread.sleep(7000);
			CommonMethods.clickOn(addVariable);
			Thread.sleep(5000);
			CommonMethods.clickOn(selectOperational);
			Thread.sleep(2000);
			CommonMethods.enterText(variableName, Variable);
			CommonMethods.select(unitTypeDropdown, UnitType);
			Thread.sleep(2000);
			CommonMethods.select(unitDropdown, Unit);	
			CommonMethods.select(categoryDropdown, Category);
			CommonMethods.clickOn(dataFrequencyDropdown);
			CommonMethods.clickOn(selectDataFrequency);		
			CommonMethods.clickOn(saveButton);

		}
		
		public void variableSaveCancelButton() throws InterruptedException {
			
				if(this.alertPopUpOKButton.isDisplayed()){
			    	 
			    	String alertSavedMessage = alertMessage.getText();
			    	Const.logger.info(alertSavedMessage);
					ReportUtils.test.log(LogStatus.PASS, alertSavedMessage);			    	
			        CommonMethods.clickOn(alertPopUpOKButton);
			    }    
				else if(this.errorMessage.isDisplayed()){   
					String error = errorMessage.getText();
					Const.logger.info(error);
					CommonMethods.clickOn(cancelButton);   
					//Const.logger.info("This name Site is already exist");
			    }  
			
			}
			
		
		public void verifyCreatedVariable(String Variable) throws InterruptedException {

			ReportUtils.test.log(LogStatus.INFO, "Running verifyCreatedVariable method.");
			Const.logger.info("Running verifyCreatedVariable method.");

			Const.logger.info("Start verifying created variable.");
			ReportUtils.test.log(LogStatus.INFO, "Start verifying created variable.");	
			
			CommonMethods.clickOn(adminMenu);
			CommonMethods.clickOn(variables);
			
			Thread.sleep(7000);
			CommonMethods.clickOn(variableFilter);
			Thread.sleep(3000);
			CommonMethods.enterText(variableFiltertTextBox, Variable);
			CommonMethods.clickOn(variableFilterButton);
			Thread.sleep(5000);

			if(!variableTable.isEmpty()) {			
			String actualVariable = Variable;
			String expectedVariableS = expectedVariable.getText();
			Thread.sleep(3000);
			Assert.assertEquals(actualVariable, expectedVariableS);
			Const.logger.info("Getting actual variable from excel "  + actualVariable);
			Const.logger.info("Getting expected variable from web "  + expectedVariableS);
			ReportUtils.test.log(LogStatus.INFO, "Getting actual data from excel: "  + actualVariable + " & expected data from web: " + expectedVariableS);	
			
			}
		}
			
			public void deleteVariable(String Variable) throws InterruptedException {

				ReportUtils.test.log(LogStatus.INFO, "Running deleteVariable method.");
				Const.logger.info("Running deleteVariable method.");
				Const.logger.info("Start deleting process of variable: "+Variable);
				ReportUtils.test.log(LogStatus.INFO, "Start deleting process of variable: "+Variable);	
				
				CommonMethods.clickOn(adminMenu);
				CommonMethods.clickOn(variables);
				
				Thread.sleep(7000);
				CommonMethods.clickOn(variableFilter);
				Thread.sleep(3000);
				CommonMethods.enterText(variableFiltertTextBox, Variable);
				CommonMethods.clickOn(variableFilterButton);
				Thread.sleep(5000);
				
				if(!variableTable.isEmpty()) {							
				CommonMethods.clickOn(deleteButton);
				Thread.sleep(10000);
				//driver.switchTo().alert().accept();
				//Thread.sleep(30000);
				CommonMethods.AlertAccept(driver);
				
				//Const.logger.info("Variable is deleted succcessfully.");
				
				String alertMsg = CommonMethods.getTextFromElement(alertMessage);
				Const.logger.info(alertMsg);
				ReportUtils.test.log(LogStatus.PASS, alertMsg);
				
				CommonMethods.clickOn(alertPopUpOKButton);
				//Const.logger.info("Variable is deleted succcessfully.");
				}
			}
		
		
}
