package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Energy_Electricity;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Energy_ElectricityTest extends BaseClass{

	@DataProvider(name = "getElectricityDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data from Electricity Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_WORKBOOK,Const.ELECTRICITY_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=2,dataProvider="getElectricityDataEntry",description="This is for Electricity add asset data.",alwaysRun = true)
	public void energyElectricityAddAsset(String From, String To, String Quantity, String Activity,String Hub,String Facility,String Variable, String Unit) throws InterruptedException {
		
		Const.logger.info("Electricity Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Electricity Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running energyElectricityAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energyElectricityAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_Electricity ee = new Energy_Electricity(driver);
		
		ee.addAsset(Facility, Activity, Variable, Unit);
		ee.assetSaveCancelButton(Facility, Variable, Activity, Hub);
		
	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},priority=3,dataProvider="getElectricityDataEntry",description="This is for Electricity data entry",alwaysRun = true)
	public void energyElectricityDataEntry(String From, String To, String Quantity, String Activity,String Hub,String Facility,String Variable, String Unit) throws InterruptedException {
		
		Const.logger.info("Electricity Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Electricity Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running energyElectricityDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energyElectricityDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_Electricity ee = new Energy_Electricity(driver);

		ee.dataEntry(From, To, Quantity, Activity, Hub, Facility, Variable);

	}
	
	@DataProvider(name = "getElectricityUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Electricity Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.ELECTRICITY_UPDATE_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"UpdateData"},priority=4,dataProvider="getElectricityUpdateDataEntry",description="This is for Electricity update data entry",alwaysRun = true)
	public void energyElectricityUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("Electricity Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Electricity Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running energyElectricityUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energyElectricityUpdateDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_Electricity ee = new Energy_Electricity(driver);
		
		ee.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, Hub, Facility, Variable);

	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},priority=5,dataProvider="getElectricityDataEntry",description="This is for Electricity delete data and asset entry.",alwaysRun = true)
	public void energyElectricityDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Hub,String Facility,String Variable, String Unit) throws InterruptedException {
		
		Const.logger.info("Electricity Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Electricity Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running energyElectricityDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energyElectricityDeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_Electricity ee = new Energy_Electricity(driver);
		
		ee.dataDelete(Activity, Hub, Facility, Variable);
		ee.assetDelete(Activity, Hub, Facility, Variable);
		

	}
	
}
