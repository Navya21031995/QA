package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Administration.Variable_Creation;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Variable_CreationTest extends BaseClass {

	
	@DataProvider(name = "getSocialVariableName")
	public Object[][] getSocialDataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry for Social from Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_VARIABLES_WORKBOOK,Const.SOCIAL_VARIABLE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=2,dataProvider="getSocialVariableName",description="This is for variable creation",alwaysRun = true)
	public void socialVariableCreation(String Variable,String UnitType,String Unit,String Category) throws InterruptedException {
		
		Const.logger.info("Social Variable Creation " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		ReportUtils.test.log(LogStatus.INFO, "Social Variable Creation " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running socialVariableCreation test case.");
		ReportUtils.test.log(LogStatus.INFO, "Running socialVariableCreation test case.");		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ReportUtils.test.log(LogStatus.INFO, "Adding new social variable: " + Variable);
		
		Variable_Creation vc = new Variable_Creation(driver);	
		vc.socialVariable(Variable, UnitType, Unit, Category);
		vc.variableSaveCancelButton();
		vc.verifyCreatedVariable(Variable);
		
	
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},priority=2,dataProvider="getSocialVariableName",description="This is for delete variable.",alwaysRun = true)
	public void deleteSocialVariable(String Variable,String UnitType,String Unit,String Category) throws InterruptedException {
		
		Const.logger.info("Delete Social Variable " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		ReportUtils.test.log(LogStatus.INFO, "Delete Social Variable " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running deleteSocialVariable test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running deleteSocialVariable test cases.");				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ReportUtils.test.log(LogStatus.INFO, "Deleting social variable: " + Variable);
		
		Variable_Creation vc = new Variable_Creation(driver);	
		
		vc.deleteVariable(Variable);
	
	}
	
	
	@DataProvider(name = "getOperationalVariableName")
	public Object[][] getOperationalDataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry for Operational from Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_VARIABLES_WORKBOOK,Const.OPERATIONAL_VARIABLE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=3,dataProvider="getOperationalVariableName",description="This is for variable creation",alwaysRun = true)
	public void operationalVariableCreation(String Variable,String UnitType,String Unit,String Category) throws InterruptedException {
		
		Const.logger.info("Operational Variable Creation " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Operational Variable Creation " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running operationalVariableCreation test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running operationalVariableCreation test case.");				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ReportUtils.test.log(LogStatus.INFO, "Adding new operational variable: " + Variable);
		
		Variable_Creation vc = new Variable_Creation(driver);		
		vc.operationalVariable(Variable, UnitType, Unit, Category);
		vc.variableSaveCancelButton();
		vc.verifyCreatedVariable(Variable);
	
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},priority=3,dataProvider="getOperationalVariableName",description="This is for delete variable.",alwaysRun = true)
	public void deleteOperationalVariable(String Variable,String UnitType,String Unit,String Category) throws InterruptedException {
		
		Const.logger.info("Delete Operational Variable " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Delete Operational Variable " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running deleteOperationalVariable test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running deleteOperationalVariable test cases.");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ReportUtils.test.log(LogStatus.INFO, "Deleting operational variable: " + Variable);
		
		Variable_Creation vc = new Variable_Creation(driver);		
		
		vc.deleteVariable(Variable);

	}	
	
	@DataProvider(name = "getEnvVariableName")
	public Object[][] getEnvDataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry for Environmental from Variable Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_VARIABLES_WORKBOOK,Const.ALL_VARIABLES_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=4,dataProvider="getEnvVariableName",description="This is for variable creation",alwaysRun = true)
	public void environmantalVariableCreation(String Variable, String CarbonType, String Activity,String Category,String UnitType,String Unit) throws InterruptedException {
		
		Const.logger.info("Environmental Variable Creation " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		ReportUtils.test.log(LogStatus.INFO, "Environmental Variable Creation " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running environmantalVariableCreation test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running environmantalVariableCreation test case.");		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ReportUtils.test.log(LogStatus.INFO, "Adding new environment variable: " + Variable);
		
		Variable_Creation vc = new Variable_Creation(driver);		
		vc.environmenatalVariable(Variable,CarbonType,Activity,Category,UnitType,Unit);
		vc.variableSaveCancelButton();
		vc.verifyCreatedVariable(Variable);
		
		
	
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},priority=4,dataProvider="getEnvVariableName",description="This is for delete variable.",alwaysRun = true)
	public void deleteEnvironmantalVariable(String Variable, String CarbonType, String Activity,String Category,String UnitType,String Unit) throws InterruptedException {
		
		Const.logger.info("Delete Environmental Variable " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		ReportUtils.test.log(LogStatus.INFO, "Delete Environmental Variable " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running deleteEnvironmantalVariable test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running deleteEnvironmantalVariable test cases.");		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		ReportUtils.test.log(LogStatus.INFO, "Deleting environment variable: " + Variable);
		Variable_Creation vc = new Variable_Creation(driver);		

		vc.deleteVariable(Variable);
	
	}
	
	@DataProvider(name = "getHealthNSafetyVariableName")
	public Object[][] getHealthNSafetyDataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry for Health and Safety from Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_VARIABLES_WORKBOOK,Const.HEALTHY_AND_SAFETY_VARIABLE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=5,dataProvider="getHealthNSafetyVariableName",description="This is for variable creation",alwaysRun = true)
	public void healthAndSafetyVariableCreation(String Variable,String UnitType,String Unit,String Category) throws InterruptedException {
		
		Const.logger.info("Health and Safety Variable Creation " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Health and Safety Variable Creation " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running healthAndSafetyVariableCreation test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running healthAndSafetyVariableCreation test case.");		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ReportUtils.test.log(LogStatus.INFO, "Adding new Health and Safety variable: " + Variable);
		
		Variable_Creation vc = new Variable_Creation(driver);		
		vc.healthAndSafetyVariable(Variable, UnitType, Unit, Category);
		vc.variableSaveCancelButton();
		vc.verifyCreatedVariable(Variable);
		
	
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},priority=5,dataProvider="getHealthNSafetyVariableName",description="This is for delete variable.",alwaysRun = true)
	public void deleteHealthAndSafetyVariable(String Variable,String UnitType,String Unit,String Category) throws InterruptedException {
		
		Const.logger.info("Delete Health and Safety Variable " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Delete Health and Safety Variable " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running deleteHealthAndSafetyVariable test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running deleteHealthAndSafetyVariable test cases.");		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ReportUtils.test.log(LogStatus.INFO, "Deleting Health and Safety variable: " + Variable);
		
		Variable_Creation vc = new Variable_Creation(driver);		
		
		vc.deleteVariable(Variable);
	
	}
	
}
