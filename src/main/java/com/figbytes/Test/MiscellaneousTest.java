package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Miscellaneous;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class MiscellaneousTest extends BaseClass {
	
	@DataProvider(name = "getMiscellaneousDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Miscellaneous Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_WASTE_WORKBOOK,Const.MISCELLANEOUS_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=2,dataProvider="getMiscellaneousDataEntry",description="This is for Miscellaneous add asset.",alwaysRun = true)
	public void miscellaneousAddAsset(String From, String To, String Quantity, String Activity,String Variable,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Miscellaneous Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Miscellaneous Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running miscellaneousAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running miscellaneousAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Miscellaneous misc = new Miscellaneous(driver);
		
		misc.addAsset(Facility, Activity, Variable, Unit);
		misc.assetSaveCancelButton(Facility, Variable, Activity, Hub);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},priority=3,dataProvider="getMiscellaneousDataEntry",description="This is for Miscellaneous data entry",alwaysRun = true)
	public void miscellaneousDataEntry(String From, String To, String Quantity, String Activity,String Variable,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Miscellaneous Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Miscellaneous Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running miscellaneousDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running miscellaneousDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Miscellaneous misc = new Miscellaneous(driver);
		
		misc.dataEntry(From, To, Quantity, Activity, Hub, Facility, Variable);
	}
	
	@DataProvider(name = "getMiscellaneousUpdateDataEntry")
	public Object[][] getdataUpdateEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Miscellaneous Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.MISCELLANEOUS_UPDATE_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=4,dataProvider="getMiscellaneousUpdateDataEntry",description="This is for Miscellaneous update data entry",alwaysRun = true)
	public void miscellaneousUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("Miscellaneous Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Miscellaneous Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running miscellaneousUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running miscellaneousUpdateDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Miscellaneous misc = new Miscellaneous(driver);
		
		misc.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, Hub, Facility, Variable);
		
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},priority=5,dataProvider="getMiscellaneousDataEntry",description="This is for Miscellaneous delete data and asset entry.",alwaysRun = true)
	public void miscellaneousDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Miscellaneous Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Miscellaneous Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running miscellaneousDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running miscellaneousDeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Miscellaneous misc = new Miscellaneous(driver);
		
		misc.dataDelete(Activity, Hub, Facility, Variable);
		misc.assetDelete(Activity, Hub, Facility, Variable);

	}


}
