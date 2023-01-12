package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Transport_Rail;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Transport_RailTest extends BaseClass {
	
	@DataProvider(name = "getRailDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Rail Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_TRANSPORT_WORKBOOK,Const.RAIL_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=2,dataProvider="getRailDataEntry",description="This is for Rail add asset.",alwaysRun = true)
	public void transportRailAddAsset(String From, String To, String Quantity, String Activity,String Variable,String MobileSource, String MobileType,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Rail Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Rail Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running transportRailAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportRailAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_Rail tr = new Transport_Rail(driver);
		
		tr.addAsset(Facility, Activity, Variable, MobileSource, MobileType, Unit);
		tr.assetSaveCancelButton(Facility, Variable, Activity, MobileSource, MobileType, Hub);
}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},priority=3,dataProvider="getRailDataEntry",description="This is for Rail data entry",alwaysRun = true)
	public void transportRailDataEntry(String From, String To, String Quantity, String Activity,String Variable,String MobileSource, String MobileType,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Rail Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Rail Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running transportRailDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportRailDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_Rail tr = new Transport_Rail(driver);
		
		tr.dataEntry(From, To, Quantity, Activity, MobileSource, MobileType, Hub, Facility, Variable);
}
	
	@DataProvider(name = "getRailUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Rail Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.RAIL_UPDATE_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"UpdateData"},priority=4,dataProvider="getRailUpdateDataEntry",description="This is for Rail update data entry",alwaysRun = true)
	public void transportRailUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String MobileSource, String MobileType,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("Rail Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Rail Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running transportRailUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportRailUpdateDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_Rail tr = new Transport_Rail(driver);
		
		tr.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, MobileSource, MobileType, Hub, Facility, Variable);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},priority=5,dataProvider="getRailDataEntry",description="This is for Rail delete data and asset entry.",alwaysRun = true)
	public void transportRailDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String MobileSource, String MobileType,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Rail Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Rail Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running transportRailDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportRailDeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_Rail tr = new Transport_Rail(driver);
		
		tr.dataDelete(Activity, MobileSource, MobileType, Hub, Facility, Variable);
		tr.assetDelete(Activity, MobileSource, MobileType, Hub, Facility, Variable);
	}


}
