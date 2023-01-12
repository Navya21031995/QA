package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.NonFuelImpacts_RefrigerantsOrHalocarbons;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class NonFuelImpacts_RefrigerantsOrHalocarbonsTest extends BaseClass {

	
	@DataProvider(name = "getRefrigerantsOrHalocarbonsDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Refrigerants/Halocarbons Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_NON_FUEL_IMPACTS_WORKBOOK,Const.REFRIGERANTS_HALOCARBONS_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getRefrigerantsOrHalocarbonsDataEntry",priority=2,description="This is for Refrigerants/Halocarbons add asset.",alwaysRun = true)
	public void nonFuelImpactsRefrigerantsOrHalocarbonsAddAsset(String From, String To, String Quantity, String Activity,String Variable,String ActivityOrUsage,String EmissionSource,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Refrigerants/Halocarbons Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Refrigerants/Halocarbons Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsRefrigerantsOrHalocarbonsAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsRefrigerantsOrHalocarbonsAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_RefrigerantsOrHalocarbons nrh = new NonFuelImpacts_RefrigerantsOrHalocarbons(driver);

		nrh.addAsset(Facility, Activity, Variable, ActivityOrUsage, EmissionSource, Unit);
		nrh.assetSaveCancelButton(Facility, Variable, Activity, ActivityOrUsage, EmissionSource, Hub);
	
	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},dataProvider="getRefrigerantsOrHalocarbonsDataEntry",priority=3,description="This is for Refrigerants/Halocarbons data entry",alwaysRun = true)
	public void nonFuelImpactsRefrigerantsOrHalocarbonsDataEntry(String From, String To, String Quantity, String Activity,String Variable,String ActivityOrUsage,String EmissionSource,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Refrigerants/Halocarbons Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Refrigerants/Halocarbons Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsRefrigerantsOrHalocarbonsDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsRefrigerantsOrHalocarbonsDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_RefrigerantsOrHalocarbons nrh = new NonFuelImpacts_RefrigerantsOrHalocarbons(driver);

		nrh.dataEntry(From, To, Quantity, Activity, ActivityOrUsage, EmissionSource, Hub, Facility, Variable);
	
	}
	
	@DataProvider(name = "getRefrigerantsOrHalocarbonsUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Refrigerants/Halocarbons Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.REFRIGERANTS_HALOCARBONS_UPDATE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"UpdateData"},dataProvider="getRefrigerantsOrHalocarbonsUpdateDataEntry",priority=4,description="This is for Refrigerants/Halocarbons update data entry",alwaysRun = true)
	public void nonFuelImpactsRefrigerantsOrHalocarbonsUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String ActivityOrUsage,String EmissionSource,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("Refrigerants/Halocarbons Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Refrigerants/Halocarbons Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsRefrigerantsOrHalocarbonsUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsRefrigerantsOrHalocarbonsUpdateDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_RefrigerantsOrHalocarbons nrh = new NonFuelImpacts_RefrigerantsOrHalocarbons(driver);

		nrh.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, ActivityOrUsage, EmissionSource, Hub, Facility, Variable);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getRefrigerantsOrHalocarbonsDataEntry",priority=5,description="This is for Refrigerants/Halocarbons delete data and asset entry.",alwaysRun = true)
	public void nonFuelImpactsRefrigerantsOrHalocarbonsDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String ActivityOrUsage,String EmissionSource,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Refrigerants/Halocarbons Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Refrigerants/Halocarbons Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsRefrigerantsOrHalocarbonsDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsRefrigerantsOrHalocarbonsDeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_RefrigerantsOrHalocarbons nrh = new NonFuelImpacts_RefrigerantsOrHalocarbons(driver);
		
		nrh.dataDelete(Activity, ActivityOrUsage, EmissionSource, Hub, Facility, Variable);
		nrh.assetDelete(Activity, ActivityOrUsage, EmissionSource, Hub, Facility, Variable);
		
	}

}
