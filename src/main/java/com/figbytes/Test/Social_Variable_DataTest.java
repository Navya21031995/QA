package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Social_Variable_Data;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Social_Variable_DataTest extends BaseClass {
	
	@DataProvider(name = "getSocialVariableDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Social Variable Data Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_SOCIAL_OPERATIONAL_WORKBOOK,Const.SOCIAL_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=2,dataProvider="getSocialVariableDataEntry",description="This is for Social Variabl data entry",alwaysRun = true)
	public void socialVariableAddData(String From, String To, String Quantity, String variableCategory,String variableName,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Social Variabl Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Social Variabl Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running socialVariableAddData test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running socialVariableAddData test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Social_Variable_Data svd = new Social_Variable_Data(driver);
		
		svd.addVariableData(variableCategory, variableName, Facility, Quantity, From, To, Unit);
		svd.variableDataSaveCancelButton(Facility, variableName, From, To, Quantity);
	
	}
	
	@DataProvider(name = "getSocialVariableUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Social Variable Data Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.SOCIAL_UPDATE_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"UpdateData"},priority=3,dataProvider="getSocialVariableUpdateDataEntry",description="This is for Social Variabl update data entry",alwaysRun = true)
	public void socialVariableDataUpdate(String ExistFrom, String ExistTo,String From, String To, String Quantity,String Facility,String VariableName) throws InterruptedException {
		
		Const.logger.info("Social Variabl Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Social Variabl Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running socialVariableDataUpdate test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running socialVariableDataUpdate test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Social_Variable_Data svd = new Social_Variable_Data(driver);
	
		svd.updateNVerifyVariableData(ExistFrom, ExistTo, From, To, Quantity, Facility, VariableName);
	
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},priority=4,dataProvider="getSocialVariableDataEntry",description="This is for Social Variable delete data.",alwaysRun = true)
	public void socialVariableDataDelete(String From, String To, String Quantity, String variableCategory,String variableName,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Social Variable Delete Data " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Social Variable Delete Data " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running socialVariableDataDelete test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running socialVariableDataDelete test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Social_Variable_Data svd = new Social_Variable_Data(driver);
		
		svd.variableDataDelete(Facility, variableName);
	}


}
