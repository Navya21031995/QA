package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Agriculture_Livestock;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Agriculture_LivestockTest extends BaseClass {
	
	@DataProvider(name = "getLivestockDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Livestock Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_AGRICULTURE_WORKBOOK,Const.LIVESTOCK_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getLivestockDataEntry",priority=2,description="This is for Livestock add asset.",alwaysRun = true)
	public void agricultureLivestockAddAsset(String From, String To, String Quantity, String Activity,String Variable,String LivestockType,String NoOfLivestock,String LiquidSystems,String SolidStorageDrylot,String PastureRangePaddock,String OtherSystems,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Livestock Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Livestock Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
	
		Const.logger.info("Running agricultureLivestockAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running agricultureLivestockAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Agriculture_Livestock al = new Agriculture_Livestock(driver);

		al.addAsset(Facility, Activity, Variable, LivestockType, Unit, NoOfLivestock, LiquidSystems, SolidStorageDrylot, PastureRangePaddock, OtherSystems);
		al.assetSaveCancelButton(Facility, Variable, Activity, LivestockType, Hub);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},dataProvider="getLivestockDataEntry",priority=3,description="This is for Livestock data entry",alwaysRun = true)
	public void agricultureLivestockDataEntry(String From, String To, String Quantity, String Activity,String Variable,String LivestockType,String NoOfLivestock,String LiquidSystems,String SolidStorageDrylot,String PastureRangePaddock,String OtherSystems,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Livestock Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Livestock Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());				
		Const.logger.info("Running agricultureLivestockDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running agricultureLivestockDataEntry test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Agriculture_Livestock al = new Agriculture_Livestock(driver);

		al.dataEntry(From, SolidStorageDrylot, Quantity, Activity, LivestockType, Hub, Facility, Variable);
	}
	
	@DataProvider(name = "getLivestockUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Livestock Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.LIVESTOCK_UPDATE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"UpdateData"},dataProvider="getLivestockUpdateDataEntry",priority=4,description="This is for Livestock update data entry",alwaysRun = true)
	public void agricultureLivestockUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String LivestockType,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("Livestock Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Livestock Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running agricultureLivestockUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running agricultureLivestockUpdateDataEntry test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Agriculture_Livestock al = new Agriculture_Livestock(driver);
	
		al.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, LivestockType, Hub, Facility, Variable);
	
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getLivestockDataEntry",priority=5,description="This is for Livestock delete data and asset entry.",alwaysRun = true)
	public void agricultureLivestockDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String LivestockType,String NoOfLivestock,String LiquidSystems,String SolidStorageDrylot,String PastureRangePaddock,String OtherSystems,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Livestock Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Livestock Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running agricultureLivestockDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running agricultureLivestockDeleteDataNAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Agriculture_Livestock al = new Agriculture_Livestock(driver);
		
		al.dataDelete(Activity, LivestockType, Hub, Facility, Variable);
		al.assetDelete(Activity, LivestockType, Hub, Facility, Variable);
}

}
