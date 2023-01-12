package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Water_Consumption;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Water_ConsumptionTest extends BaseClass{
	
	@DataProvider(name = "getConsumptionDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Water Consumption Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_WASTE_WORKBOOK,Const.CONSUMPTION_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=2,dataProvider="getConsumptionDataEntry",description="This is for Water Consumption add asset.",alwaysRun = true)
	public void waterConsumptionAddAsset(String From, String To, String Quantity, String Activity,String Variable,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Water Consumption Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Water Consumption Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running waterConsumptionAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running waterConsumptionAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Water_Consumption wc = new Water_Consumption(driver);
		
		wc.addAsset(Facility, Activity, Variable, Unit);
		wc.assetSaveCancelButton(Facility, Variable, Activity, Hub);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},priority=3,dataProvider="getConsumptionDataEntry",description="This is for Water Consumption data entry",alwaysRun = true)
	public void waterConsumptionDataEntry(String From, String To, String Quantity, String Activity,String Variable,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Water Consumption Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Water Consumption Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running waterConsumptionDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running waterConsumptionDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Water_Consumption wc = new Water_Consumption(driver);
		
		wc.dataEntry(From, To, Quantity, Activity, Hub, Facility, Variable);
	}
	
	@DataProvider(name = "getConsumptionUpdateDataEntry")
	public Object[][] getdataUpdateEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Water Consumption Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.CONSUMPTION_UPDATE_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"UpdateData"},priority=4,dataProvider="getConsumptionUpdateDataEntry",description="This is for Water Consumption update data entry",alwaysRun = true)
	public void waterConsumptionUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("Water Consumption Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Water Consumption Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running waterConsumptionUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running waterConsumptionUpdateDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Water_Consumption wc = new Water_Consumption(driver);
		
		wc.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, Hub, Facility, Variable);
		
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},priority=5,dataProvider="getConsumptionDataEntry",description="This is for Water Consumption delete data and asset entry.",alwaysRun = true)
	public void waterConsumptionDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Water Consumption Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Water Consumption Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running waterConsumptionDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running waterConsumptionDeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Water_Consumption wc = new Water_Consumption(driver);
		
		wc.dataDelete(Activity, Hub, Facility, Variable);
		wc.assetDelete(Activity, Hub, Facility, Variable);

	}

}
