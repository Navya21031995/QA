package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Transport_Waterborne;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Transport_WaterborneTest extends BaseClass {
	
	@DataProvider(name = "getWaterborneDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Waterborne Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_TRANSPORT_WORKBOOK,Const.WATERBORNE_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=2,dataProvider="getWaterborneDataEntry",description="This is for Waterborne add asset.",alwaysRun = true)
	public void transportWaterborneAddAsset(String From, String To, String Quantity, String Activity,String Variable,String MobileSource, String MobileType,String FuelSubType,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Waterborne Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Waterborne Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running transportWaterborneAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportWaterborneAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_Waterborne tw = new Transport_Waterborne(driver);
		
		tw.addAsset(Facility, Activity, Variable, MobileSource, MobileType, Unit, FuelSubType);
		tw.assetSaveCancelButton(Facility, Variable, Activity, MobileSource, MobileType, FuelSubType, Hub);

	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},priority=3,dataProvider="getWaterborneDataEntry",description="This is for Waterborne data entry",alwaysRun = true)
	public void transportWaterborneDataEntry(String From, String To, String Quantity, String Activity,String Variable,String MobileSource, String MobileType,String FuelSubType,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Waterborne Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Waterborne Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running transportWaterborneDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportWaterborneDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_Waterborne tw = new Transport_Waterborne(driver);
		
		tw.dataEntry(From, To, Quantity, Activity, MobileSource, MobileType, FuelSubType, Hub, Facility, Variable);

	}
	
	@DataProvider(name = "getWaterborneUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Waterborne Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.WATERBORNE_UPDATE_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"UpdateData"},priority=4,dataProvider="getWaterborneUpdateDataEntry",description="This is for Waterborne update data entry",alwaysRun = true)
	public void transportWaterborneUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String MobileSource, String MobileType,String FuelSubType,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("Waterborne Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Waterborne Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running transportWaterborneUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportWaterborneUpdateDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_Waterborne tw = new Transport_Waterborne(driver);
		
		tw.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, MobileSource, MobileType, FuelSubType, Hub, Facility, Variable);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},priority=5,dataProvider="getWaterborneDataEntry",description="This is for Waterborne delete data and asset entry.",alwaysRun = true)
	public void transportWaterborneDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String MobileSource, String MobileType,String FuelSubType,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Waterborne Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Waterborne Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running transportWaterborneDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportWaterborneDeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_Waterborne tw = new Transport_Waterborne(driver);
		tw.dataDelete(Activity, MobileSource, MobileType, FuelSubType, Hub, Facility, Variable);
		tw.assetDelete(Activity, MobileSource, MobileType, FuelSubType, Hub, Facility, Variable);
	
	}

}
