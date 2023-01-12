package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Transport_AirFreight;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Transport_AirFreightTest extends BaseClass {
	
	@DataProvider(name = "getAirFreightDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Air Freight Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_TRANSPORT_WORKBOOK,Const.AIR_FREIGHT_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=2,dataProvider="getAirFreightDataEntry",description="This is for Air Freight add asset.",alwaysRun = true)
	public void transportAirFreightAddAsset(String From, String To, String Quantity, String Activity,String Variable,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Air Freight Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Air Freight Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running transportAirFreightAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportAirFreightAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_AirFreight taf = new Transport_AirFreight(driver);
		
		taf.addAsset(Facility, Activity, Variable, Unit);
		taf.assetSaveCancelButton(Facility, Variable, Activity, Hub);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},priority=3,dataProvider="getAirFreightDataEntry",description="This is for Air Freight data entry",alwaysRun = true)
	public void transportAirFreightDataEntry(String From, String To, String Quantity, String Activity,String Variable,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Air Freight Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Air Freight Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running transportAirFreightDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportAirFreightDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_AirFreight taf = new Transport_AirFreight(driver);
		
		taf.dataEntry(From, To, Quantity, Activity, Hub, Facility, Variable);
	}
	
	@DataProvider(name = "getAirFreightUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Air Freight Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.AIR_FREIGHT_UPDATE_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"UpdateData"},priority=4,dataProvider="getAirFreightUpdateDataEntry",description="This is for Air Freight update data entry",alwaysRun = true)
	public void transportAirFreightUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("Air Freight Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Air Freight Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running transportAirFreightUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportAirFreightUpdateDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_AirFreight taf = new Transport_AirFreight(driver);
		
		taf.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, Hub, Facility, Variable);
	
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},priority=5,dataProvider="getAirFreightDataEntry",description="This is for Air Freight delete data and asset entry.",alwaysRun = true)
	public void transportAirFreightDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Air Freight Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Air Freight Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running transportAirFreightDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportAirFreightDeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_AirFreight taf = new Transport_AirFreight(driver);
		
		taf.dataDelete(Activity, Hub, Facility, Variable);
		taf.assetDelete(Activity, Hub, Facility, Variable);

	}

}
