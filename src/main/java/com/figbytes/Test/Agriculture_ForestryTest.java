package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Agriculture_Forestry;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Agriculture_ForestryTest extends BaseClass {
	
	@DataProvider(name = "getForestryDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Forestry Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_AGRICULTURE_WORKBOOK,Const.FORESTRY_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getForestryDataEntry",priority=2,description="This is for Forestry add asset.",alwaysRun = true)
	public void agricultureForestryAddAsset(String From, String To, String Quantity, String Activity,String Variable,String Category,String Type,String Age,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Forestry Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Forestry Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
	
		Const.logger.info("Running agricultureForestryAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running agricultureForestryAddAsset test case.");				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Agriculture_Forestry af = new Agriculture_Forestry(driver);
		
		af.addAsset(Facility, Activity, Variable, Category, Type, Age, Unit);
		af.assetSaveCancelButton(Facility, Variable, Activity, Category, Type, Age, Hub);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},dataProvider="getForestryDataEntry",priority=3,description="This is for Forestry data entry",alwaysRun = true)
	public void agricultureForestryDataEntry(String From, String To, String Quantity, String Activity,String Variable,String Category,String Type,String Age,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Forestry Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Forestry Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running agricultureForestryDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running agricultureForestryDataEntry test case.");				

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Agriculture_Forestry af = new Agriculture_Forestry(driver);
		
		af.dataEntry(From, To, Quantity, Activity, Category, Type, Age, Hub, Facility, Variable);
	}
	
	@DataProvider(name = "getForestryUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Forestry Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.FORESTRY_UPDATE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"UpdateData"},dataProvider="getForestryUpdateDataEntry",priority=4,description="This is for Forestry update data entry",alwaysRun = true)
	public void agricultureForestryUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String Category,String Type,String Age,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("Forestry Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Forestry Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running agricultureForestryUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running agricultureForestryUpdateDataEntry test case.");				

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Agriculture_Forestry af = new Agriculture_Forestry(driver);
		
		af.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, Category, Type, Age, Hub, Facility, Variable);
	
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getForestryDataEntry",priority=5,description="This is for Forestry delete data and asset entry.",alwaysRun = true)
	public void agricultureForestryDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String Category,String Type,String Age,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Forestry Delete Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Forestry Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running agricultureForestryDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running agricultureForestryDeleteDataNAsset test case.");				

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Agriculture_Forestry af = new Agriculture_Forestry(driver);
		
		af.dataDelete(Activity, Category, Type, Age, Hub, Facility, Variable);
		af.assetDelete(Activity, Category, Type, Age, Hub, Facility, Variable);
}

}
