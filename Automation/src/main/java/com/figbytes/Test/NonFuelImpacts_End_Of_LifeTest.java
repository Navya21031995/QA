package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.NonFuelImpacts_End_Of_Life;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class NonFuelImpacts_End_Of_LifeTest extends BaseClass{
	
	@DataProvider(name = "getEndOfLifeDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from End Of Life Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_NON_FUEL_IMPACTS_WORKBOOK,Const.END_OF_LIFE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getEndOfLifeDataEntry",priority=2,description="This is for End Of Life add asset.",alwaysRun = true)
	public void nonFuelImpactsEndOfLifeAddAsset(String From, String To, String Quantity, String Activity,String Variable,String EndOfLifeType,String ActivityOrUsage,String EmissionSource,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("End Of Life Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "End Of Life Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsEndOfLifeAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsEndOfLifeAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_End_Of_Life nel = new NonFuelImpacts_End_Of_Life(driver);

		nel.addAsset(Facility, Activity, Variable, EndOfLifeType, ActivityOrUsage, EmissionSource, Unit);
		nel.assetSaveCancelButton(Facility, Variable, Activity, EndOfLifeType, ActivityOrUsage, EmissionSource, Hub);
		
	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},dataProvider="getEndOfLifeDataEntry",priority=3,description="This is for End Of Life data entry",alwaysRun = true)
	public void nonFuelImpactsEndOfLifeDataEntry(String From, String To, String Quantity, String Activity,String Variable,String EndOfLifeType,String ActivityOrUsage,String EmissionSource,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("End Of Life Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "End Of Life Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsEndOfLifeDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsEndOfLifeDataEntry test case.");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_End_Of_Life nel = new NonFuelImpacts_End_Of_Life(driver);

		nel.dataEntry(From, To, Quantity, Activity, EndOfLifeType, ActivityOrUsage, EmissionSource, Hub, Facility, Variable);
		
	}
	
	@DataProvider(name = "getEndOfLifeUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from End Of Life Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.END_OF_LIFE_UPDATE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"UpdateData"},dataProvider="getEndOfLifeUpdateDataEntry",priority=4,description="This is for End Of Life update data entry",alwaysRun = true)
	public void nonFuelImpactsEndOfLifeUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String EndOfLifeType,String ActivityOrUsage,String EmissionSource,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("End Of Life Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "End Of Life Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsEndOfLifeUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsEndOfLifeUpdateDataEntry test case.");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_End_Of_Life nel = new NonFuelImpacts_End_Of_Life(driver);

		nel.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, EndOfLifeType, ActivityOrUsage, EmissionSource, Hub, Facility, Variable);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getEndOfLifeDataEntry",priority=5,description="This is for End Of Life delete data and asset entry.",alwaysRun = true)
	public void nonFuelImpactsEndOfLifeDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String EndOfLifeType,String ActivityOrUsage,String EmissionSource,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("End Of Life Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "End Of Life Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsEndOfLifeDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsEndOfLifeDeleteDataNAsset test case.");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_End_Of_Life nel = new NonFuelImpacts_End_Of_Life(driver);
		
		nel.dataDelete(Activity, EndOfLifeType, ActivityOrUsage, EmissionSource, Hub, Facility, Variable);
		nel.assetDelete(Activity, EndOfLifeType, ActivityOrUsage, EmissionSource, Hub, Facility, Variable);
		
		}


}
