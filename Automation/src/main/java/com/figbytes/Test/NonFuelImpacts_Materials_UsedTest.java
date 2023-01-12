package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.NonFuelImpacts_Materials_Used;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class NonFuelImpacts_Materials_UsedTest extends BaseClass {
	
	@DataProvider(name = "getMaterialsUsedDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Materials Used Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_NON_FUEL_IMPACTS_WORKBOOK,Const.MATERIALS_USED_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getMaterialsUsedDataEntry",priority=2,description="This is for Materials Used add asset.",alwaysRun = true)
	public void nonFuelImpactsMaterialsUsedAddAsset(String From, String To, String Quantity, String Activity,String Variable,String MaterialType,String ActivityOrUsage,String EmissionSource,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Materials Used Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Materials Used Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsMaterialsUsedAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsMaterialsUsedAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_Materials_Used nmu = new NonFuelImpacts_Materials_Used(driver);

		nmu.addAsset(Facility, Activity, Variable, MaterialType, ActivityOrUsage, EmissionSource, Unit);
		nmu.assetSaveCancelButton(Facility, Variable, Activity, MaterialType, ActivityOrUsage, EmissionSource, Hub);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},dataProvider="getMaterialsUsedDataEntry",priority=3,description="This is for Materials Used data entry",alwaysRun = true)
	public void nonFuelImpactsMaterialsUsedDataEntry(String From, String To, String Quantity, String Activity,String Variable,String MaterialType,String ActivityOrUsage,String EmissionSource,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Materials Used Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Materials Used Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsMaterialsUsedDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsMaterialsUsedDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_Materials_Used nmu = new NonFuelImpacts_Materials_Used(driver);

		nmu.dataEntry(From, To, Quantity, Activity, MaterialType, ActivityOrUsage, EmissionSource, Hub, Facility, Variable);
	}
	
	@DataProvider(name = "getMaterialsUsedUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update data from Materials Used Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.MATERIALS_USED_UPDATE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"UpdateData"},dataProvider="getMaterialsUsedUpdateDataEntry",priority=4,description="This is for Materials Used update data entry",alwaysRun = true)
	public void nonFuelImpactsMaterialsUsedUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String MaterialType,String ActivityOrUsage,String EmissionSource,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("Materials Used Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Materials Used Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
	
		Const.logger.info("Running nonFuelImpactsMaterialsUsedUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsMaterialsUsedUpdateDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_Materials_Used nmu = new NonFuelImpacts_Materials_Used(driver);
	
		nmu.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, MaterialType, ActivityOrUsage, EmissionSource, Hub, Facility, Variable);
	
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getMaterialsUsedDataEntry",priority=5,description="This is for Materials Used delete data and asset entry.",alwaysRun = true)
	public void nonFuelImpactsMaterialsUsedDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String MaterialType,String ActivityOrUsage,String EmissionSource,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Materials Used Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Materials Used Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsMaterialsUsedDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsMaterialsUsedDeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_Materials_Used nmu = new NonFuelImpacts_Materials_Used(driver);
		
		nmu.dataDelete(Activity, MaterialType, ActivityOrUsage, EmissionSource, Hub, Facility, Variable);
		nmu.assetDelete(Activity, MaterialType, ActivityOrUsage, EmissionSource, Hub, Facility, Variable);
}


}
