package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Energy_Heat;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Energy_HeatTest extends BaseClass {

	@DataProvider(name = "getHeatDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Heat Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_WORKBOOK,Const.HEAT_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getHeatDataEntry",priority=2,description="This is for Heat add asset.",alwaysRun = true)
	public void energyHeatAddAsset(String From, String To, String Quantity, String Activity,String FuelType,String Hub,String Facility, String Variable, String Unit) throws InterruptedException {
		
		Const.logger.info("Heat Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Heat Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running energyHeatAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energyHeatAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_Heat eh = new Energy_Heat(driver);
		eh.addAsset(Facility, Activity, Variable, FuelType, Unit);
		eh.assetSaveCancelButton(Facility, Variable, Activity, FuelType, Hub);		

	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},dataProvider="getHeatDataEntry",priority=3,description="This is for Heat data entry",alwaysRun = true)
	public void energyHeatDataEntry(String From, String To, String Quantity, String Activity,String FuelType,String Hub,String Facility, String Variable, String Unit) throws InterruptedException {
		
		Const.logger.info("Heat Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Heat Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running energyHeatDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energyHeatDataEntry test case.");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_Heat eh = new Energy_Heat(driver);
		eh.dataEntry(From, To, Quantity, Activity, FuelType, Hub, Facility, Variable);
		
	}
	
	@DataProvider(name = "getHeatUpdateDataEntry")
	public Object[][] getdataUpdateEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Heat Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.HEAT_UPDATE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"UpdateData"},dataProvider="getHeatUpdateDataEntry",priority=4,description="This is for Heat update data entry",alwaysRun = true)
	public void energyHeatUpdateDataEntry(String ExistFrom,String ExistTo,String From, String To, String Quantity, String Activity,String FuelType,String Hub,String Facility, String Variable) throws InterruptedException {
		
		Const.logger.info("Heat Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Heat Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running energyHeatUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energyHeatUpdateDataEntry test case.");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_Heat eh = new Energy_Heat(driver);

		eh.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, FuelType, Hub, Facility, Variable);
		

	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getHeatDataEntry",priority=5,description="This is for Heat delete data and asset entry.",alwaysRun = true)
	public void energyHeatDeleteDataNAsset(String From, String To, String Quantity, String Activity,String FuelType,String Hub,String Facility, String Variable, String Unit) throws InterruptedException {
		
		Const.logger.info("Heat Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Heat Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running energyHeatDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energyHeatDeleteDataNAsset test case.");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_Heat eh = new Energy_Heat(driver);
		eh.dataDelete(Activity, FuelType, Hub, Facility, Variable);
		eh.assetDelete(Activity, FuelType, Hub, Facility, Variable);
}
}