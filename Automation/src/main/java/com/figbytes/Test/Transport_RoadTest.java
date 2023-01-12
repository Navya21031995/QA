package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Transport_Road;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Transport_RoadTest extends BaseClass {

	@DataProvider(name = "getRoadDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Road Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_TRANSPORT_WORKBOOK,Const.ROAD_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=2,dataProvider="getRoadDataEntry",description="This is for Road add asset.",alwaysRun = true)
	public void transportRoadAddAsset(String From, String To, String Quantity, String Activity,String Variable,String MobileSource, String MobileType,String FuelSubType,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Road Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Road Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running transportRoadAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportRoadAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_Road tr = new Transport_Road(driver);

		tr.addAsset(Facility, Activity, Variable, MobileSource, MobileType, Unit, FuelSubType);
		tr.assetSaveCancelButton(Facility, Hub, Variable, Activity, MobileSource, MobileType, FuelSubType);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},priority=3,dataProvider="getRoadDataEntry",description="This is for Road data entry",alwaysRun = true)
	public void transportRoadDataEntry(String From, String To, String Quantity, String Activity,String Variable,String MobileSource, String MobileType,String FuelSubType,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Road Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Road Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running transportRoadDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportRoadDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_Road tr = new Transport_Road(driver);

		tr.dataEntry(From, To, Quantity, Activity, MobileSource, MobileType, FuelSubType, Hub, Facility, Variable);
	}
	
	@DataProvider(name = "getRoadUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Road Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.ROAD_UPDATE_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"UpdateData"},priority=4,dataProvider="getRoadUpdateDataEntry",description="This is for Road update data entry",alwaysRun = true)
	public void transportRoadUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String MobileSource, String MobileType,String FuelSubType,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("Road Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Road Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running transportRoadUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportRoadUpdateDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_Road tr = new Transport_Road(driver);

		tr.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, MobileSource, MobileType, FuelSubType, Hub, Facility, Variable);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},priority=5,dataProvider="getRoadDataEntry",description="This is for Road delete data and asset entry.",alwaysRun = true)
	public void transportRoadDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String MobileSource, String MobileType,String FuelSubType,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Road Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Road Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running transportRoadDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportRoadDeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_Road tr = new Transport_Road(driver);
		
		tr.dataDelete(Activity, MobileSource, MobileType, FuelSubType, Hub, Facility, Variable);
		tr.assetDelete(Activity, MobileSource, MobileType, FuelSubType, Hub, Facility, Variable);
	}

}
