package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Transport_Public;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Transport_PublicTest extends BaseClass {
	
	@DataProvider(name = "getPublicDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Public Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_TRANSPORT_WORKBOOK,Const.PUBLIC_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=2,dataProvider="getPublicDataEntry",description="This is for Public add asset.",alwaysRun = true)
	public void transportPublicAddAsset(String From, String To, String Quantity, String Activity,String Variable,String MobileSource, String MobileType,String MobileSubType,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Public Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Public Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running transportPublicAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportPublicAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_Public tp = new Transport_Public(driver);
		
		tp.addAsset(Facility, Activity, Variable, MobileSource, MobileType, MobileSubType, Unit);
		tp.assetSaveCancelButton(Facility, Variable, Activity, MobileSource, MobileSubType, Hub);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},priority=3,dataProvider="getPublicDataEntry",description="This is for Public data entry",alwaysRun = true)
	public void transportPublicDataEntry(String From, String To, String Quantity, String Activity,String Variable,String MobileSource, String MobileType,String MobileSubType,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Public Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Public Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running transportPublicDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportPublicDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_Public tp = new Transport_Public(driver);
		
		tp.dataEntry(From, To, Quantity, Activity, MobileSource, MobileSubType, Hub, Facility, Variable);
	}
	
	@DataProvider(name = "getPublicUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Public Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.PUBLIC_UPDATE_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"UpdateData"},priority=4,dataProvider="getPublicUpdateDataEntry",description="This is for Public update data entry",alwaysRun = true)
	public void transportPublicUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String MobileSource, String MobileType,String MobileSubType,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("Public Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Public Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running transportPublicUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportPublicUpdateDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_Public tp = new Transport_Public(driver);
		
		tp.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, MobileSource, MobileSubType, Hub, Facility, Variable);
	
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},priority=5,dataProvider="getPublicDataEntry",description="This is for Public delete data and asset entry.",alwaysRun = true)
	public void transportPublicDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String MobileSource, String MobileType,String MobileSubType,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Public Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Public Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running transportPublicDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportPublicDeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_Public tp = new Transport_Public(driver);
		
		tp.dataDelete(Activity, MobileSource, MobileSubType, Hub, Facility, Variable);
		tp.assetDelete(Activity, MobileSource, MobileSubType, Hub, Facility, Variable);
	}

}
