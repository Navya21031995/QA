package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Agriculture_Land_Use;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Agriculture_Land_UseTest extends BaseClass{
	
	@DataProvider(name = "getLandUseDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Land Use Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_AGRICULTURE_WORKBOOK,Const.LAND_USE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getLandUseDataEntry",priority=2,description="This is for Land Use add asset.",alwaysRun = true)
	public void agricultureLandUseAddAsset(String From, String To, String Quantity, String Activity,String Variable,String ExistingUse,String ChangeTo,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Land Use Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Land Use Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running agricultureLandUseAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running agricultureLandUseAddAsset test case.");				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Agriculture_Land_Use alu = new Agriculture_Land_Use(driver);

		alu.addAsset(Facility, Activity, Variable, ExistingUse, ChangeTo, Unit);
		alu.assetSaveCancelButton(Facility, Variable, Activity, ExistingUse, ChangeTo, Hub);
		
	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},dataProvider="getLandUseDataEntry",priority=3,description="This is for Land Use data entry",alwaysRun = true)
	public void agricultureLandUseDataEntry(String From, String To, String Quantity, String Activity,String Variable,String ExistingUse,String ChangeTo,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Land Use Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Land Use Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running agricultureLandUseDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running agricultureLandUseDataEntry test case.");				

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Agriculture_Land_Use alu = new Agriculture_Land_Use(driver);

		alu.dataEntry(From, To, Quantity, Activity, ExistingUse, ChangeTo, Hub, Facility, Variable);
	
	}
	
	@DataProvider(name = "getLandUseUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Land Use Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.LAND_USE_UPDATE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"UpdateData"},dataProvider="getLandUseUpdateDataEntry",priority=4,description="This is for Land Use update data entry",alwaysRun = true)
	public void agricultureLandUseUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String ExistingUse,String ChangeTo,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("Land Use Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Land Use Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running agricultureLandUseUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running agricultureLandUseUpdateDataEntry test case.");				

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Agriculture_Land_Use alu = new Agriculture_Land_Use(driver);
	
		alu.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, ExistingUse, ChangeTo, Hub, Facility, Variable);
		
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getLandUseDataEntry",priority=5,description="This is for Land Use delete data and asset entry.",alwaysRun = true)
	public void agricultureLandUseDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String ExistingUse,String ChangeTo,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Land Use Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Land Use Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running agricultureLandUseDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running agricultureLandUseDeleteDataNAsset test case.");				

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Agriculture_Land_Use alu = new Agriculture_Land_Use(driver);
		
		alu.dataDelete(Activity, ExistingUse, ChangeTo, Hub, Facility, Variable);
		alu.assetDelete(Activity, ExistingUse, ChangeTo, Hub, Facility, Variable);
}
	
	

}
