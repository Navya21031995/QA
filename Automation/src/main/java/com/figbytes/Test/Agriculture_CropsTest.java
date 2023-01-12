package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Agriculture_Crops;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Agriculture_CropsTest extends BaseClass {

	@DataProvider(name = "getCropsDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Crops Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_AGRICULTURE_WORKBOOK,Const.CROPS_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getCropsDataEntry",priority=2,description="This is for Crops add asset.",alwaysRun = true)
	public void agricultureCropsAddAsset(String From, String To, String Quantity, String Activity,String Variable,String TypeOfCrops,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Crops Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Crops Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running agricultureCropsAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running agricultureCropsAddAsset test case.");				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Agriculture_Crops ac = new Agriculture_Crops(driver);
		
		ac.addAsset(Facility, Activity, Variable, TypeOfCrops, Unit);
		ac.assetSaveCancelButton(Facility, Variable, Activity, TypeOfCrops, Hub);
	
	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},dataProvider="getCropsDataEntry",priority=3,description="This is for Crops data entry",alwaysRun = true)
	public void agricultureCropsDataEntry(String From, String To, String Quantity, String Activity,String Variable,String TypeOfCrops,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Crops Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Crops Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running agricultureCropsDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running agricultureCropsDataEntry test case.");				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Agriculture_Crops ac = new Agriculture_Crops(driver);
		
		ac.dataEntry(From, To, Quantity, Activity, TypeOfCrops, Hub, Facility, Variable);
	
	}
	
	@DataProvider(name = "getCropsUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Crops Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.CROPS_UPDATE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"UpdateData"},dataProvider="getCropsUpdateDataEntry",priority=4,description="This is for Crops update data entry",alwaysRun = true)
	public void agricultureCropsUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String TypeOfCrops,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("Crops Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Crops Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running agricultureCropsUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running agricultureCropsUpdateDataEntry test case.");				
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Agriculture_Crops ac = new Agriculture_Crops(driver);
		
		ac.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, TypeOfCrops, Hub, Facility, Variable);
		
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getCropsDataEntry",priority=5,description="This is for Crops delete data and asset entry.",alwaysRun = true)
	public void agricultureCropsDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String TypeOfCrops,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Crops Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Crops Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running agricultureCropsDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running agricultureCropsDeleteDataNAsset test case.");				

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Agriculture_Crops ac = new Agriculture_Crops(driver);
		
		ac.dataDelete(Activity, TypeOfCrops, Hub, Facility, Variable);
		ac.assetDelete(Activity, TypeOfCrops, Hub, Facility, Variable);
		
}
}
