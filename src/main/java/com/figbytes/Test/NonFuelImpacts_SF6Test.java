package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.NonFuelImpacts_SF6;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class NonFuelImpacts_SF6Test extends BaseClass{
	
	@DataProvider(name = "getSF6DataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from SF6 Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_NON_FUEL_IMPACTS_WORKBOOK,Const.SF6_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getSF6DataEntry",priority=2,description="This is for SF6 add asset.",alwaysRun = true)
	public void nonFuelImpactsSF6AddAsset(String From, String To, String Quantity, String Activity,String Variable,String ActivityOrUsage,String EmissionSource,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("SF6 Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "SF6 Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsSF6AddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsSF6AddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_SF6 nsf = new NonFuelImpacts_SF6(driver);

		nsf.addAsset(Facility, Activity, Variable, ActivityOrUsage, EmissionSource, Unit);
		nsf.assetSaveCancelButton(Facility, Variable, Activity, ActivityOrUsage, EmissionSource, Hub);
		
	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},dataProvider="getSF6DataEntry",priority=3,description="This is for SF6 data entry",alwaysRun = true)
	public void nonFuelImpactsSF6DataEntry(String From, String To, String Quantity, String Activity,String Variable,String ActivityOrUsage,String EmissionSource,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("SF6 Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "SF6 Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsSF6DataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsSF6DataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_SF6 nsf = new NonFuelImpacts_SF6(driver);

		nsf.dataEntry(From, To, Quantity, Activity, ActivityOrUsage, EmissionSource, Hub, Facility, Variable);
		
	}
	
	@DataProvider(name = "getSF6UpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from SF6 Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.SF6_UPDATE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"UpdateData"},dataProvider="getSF6UpdateDataEntry",priority=4,description="This is for SF6 update data entry",alwaysRun = true)
	public void nonFuelImpactsSF6UpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String ActivityOrUsage,String EmissionSource,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("SF6 update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "SF6 update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsSF6UpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsSF6UpdateDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_SF6 nsf = new NonFuelImpacts_SF6(driver);

		nsf.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, ActivityOrUsage, EmissionSource, Hub, Facility, Variable);	
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getSF6DataEntry",priority=5,description="This is for SF6 delete data and asset entry.",alwaysRun = true)
	public void nonFuelImpactsSF6DeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String ActivityOrUsage,String EmissionSource,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("SF6 Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "SF6 Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsSF6DeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsSF6DeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_SF6 nsf = new NonFuelImpacts_SF6(driver);
		
		nsf.dataDelete(Activity, ActivityOrUsage, EmissionSource, Hub, Facility, Variable);
		nsf.assetDelete(Activity, ActivityOrUsage, EmissionSource, Hub, Facility, Variable);
	
	}


}
