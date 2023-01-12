package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.NonFuelImpacts_Fertilizers_Use;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class NonFuelImpacts_Fertilizers_UseTest extends BaseClass {
	
	
	@DataProvider(name = "getFertilizersUseDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Fertilizers Use Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_NON_FUEL_IMPACTS_WORKBOOK,Const.FERTILIZERS_USE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getFertilizersUseDataEntry",priority=2,description="This is for Fertilizers Use add asset.",alwaysRun = true)
	public void nonFuelImpactsFertilizersUseAddAsset(String From, String To, String Quantity, String Activity,String Variable,String ActivityOrUsage,String FertilizerType,String EmissionSource,String FertilizerPercentage,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Fertilizers Use Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Fertilizers Use Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsFertilizersUseAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsFertilizersUseAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_Fertilizers_Use nfu = new NonFuelImpacts_Fertilizers_Use(driver);

		nfu.addAsset(Facility, Activity, Variable, ActivityOrUsage, FertilizerType, EmissionSource, Unit, FertilizerPercentage);
		nfu.assetSaveCancelButton(Facility, Variable, Activity, ActivityOrUsage, FertilizerType, EmissionSource, Hub);
	
	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},dataProvider="getFertilizersUseDataEntry",priority=3,description="This is for Fertilizers Use data entry",alwaysRun = true)
	public void nonFuelImpactsFertilizersUseDataEntry(String From, String To, String Quantity, String Activity,String Variable,String ActivityOrUsage,String FertilizerType,String EmissionSource,String FertilizerPercentage,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Fertilizers Use Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Fertilizers Use Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsFertilizersUseDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsFertilizersUseDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_Fertilizers_Use nfu = new NonFuelImpacts_Fertilizers_Use(driver);

		nfu.dataEntry(From, To, Quantity, Activity, ActivityOrUsage, FertilizerType, EmissionSource, Hub, Facility, Variable);
	
	}
	
	@DataProvider(name = "getFertilizersUseUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Fertilizers Use Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.FERTILIZERS_USE_UPDATE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"UpdateData"},dataProvider="getFertilizersUseUpdateDataEntry",priority=4,description="This is for Fertilizers Use Update data entry",alwaysRun = true)
	public void nonFuelImpactsFertilizersUseUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String ActivityOrUsage,String FertilizerType,String EmissionSource,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("Fertilizers Use Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Fertilizers Use Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsFertilizersUseUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsFertilizersUseUpdateDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_Fertilizers_Use nfu = new NonFuelImpacts_Fertilizers_Use(driver);

		nfu.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, ActivityOrUsage, FertilizerType, EmissionSource, Hub, Facility, Variable);
		
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getFertilizersUseDataEntry",priority=5,description="This is for Fertilizers Use delete data and asset entry.",alwaysRun = true)
	public void nonFuelImpactsFertilizersUseDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String ActivityOrUsage,String FertilizerType,String EmissionSource,String FertilizerPercentage,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Fertilizers Use Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Fertilizers Use Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsFertilizersUseDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsFertilizersUseDeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_Fertilizers_Use nfu = new NonFuelImpacts_Fertilizers_Use(driver);
		
		nfu.dataDelete(Activity, ActivityOrUsage, FertilizerType, EmissionSource, Hub, Facility, Variable);
		nfu.assetDelete(Activity, ActivityOrUsage, FertilizerType, EmissionSource, Hub, Facility, Variable);
		
	}


}
