package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Operational_Variable_Data;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Operational_Variable_DataTest extends BaseClass {

	@DataProvider(name = "getOperationalVariableDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Operational Variable Data Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_SOCIAL_OPERATIONAL_WORKBOOK,Const.OPERATIONAL_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=2,dataProvider="getOperationalVariableDataEntry",description="This is for Operational Variabl data entry",alwaysRun = true)
	public void operationalVariableAddData(String From, String To, String Quantity, String variableCategory,String variableName,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Operational Variabl Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Operational Variabl Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running operationalVariableAddData test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running operationalVariableAddData test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Operational_Variable_Data ovd = new Operational_Variable_Data(driver);
		
		ovd.addVariableData(variableCategory, variableName, Facility, Quantity, From, To, Unit);
		ovd.variableDataSaveCancelButton(Facility, variableName, From, To, Quantity);
	
	}
	
	@DataProvider(name = "getOperationalVariableUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Operational Variable Data Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.OPERATIONAL_UPDATE_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"UpdateData"},priority=3,dataProvider="getOperationalVariableUpdateDataEntry",description="This is for Operational Variabl update data entry",alwaysRun = true)
	public void operationalVariableDataUpdate(String ExistFrom, String ExistTo,String From, String To, String Quantity,String Facility,String VariableName) throws InterruptedException {
		
		Const.logger.info("Operational Variabl Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Operational Variabl Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running operationalVariableDataUpdate test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running operationalVariableDataUpdate test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Operational_Variable_Data ovd = new Operational_Variable_Data(driver);
		
		ovd.updateNVerifyVariableData(ExistFrom, ExistTo, From, To, Quantity, Facility, VariableName);
		
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},priority=4,dataProvider="getOperationalVariableDataEntry",description="This is for Operational Variable delete data.",alwaysRun = true)
	public void operationalVariableDataDelete(String From, String To, String Quantity, String variableCategory,String variableName,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Operational Variable Delete Data " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Operational Variable Delete Data " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running operationalVariableDataDelete test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running operationalVariableDataDelete test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Operational_Variable_Data ovd = new Operational_Variable_Data(driver);
		
		ovd.variableDataDelete(Facility, variableName);

	}

	
}
