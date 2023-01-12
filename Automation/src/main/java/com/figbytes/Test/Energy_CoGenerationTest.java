package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Energy_CoGeneration;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Energy_CoGenerationTest extends BaseClass {
	
	@DataProvider(name = "getCoGenerationDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Co-Generation Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_WORKBOOK,Const.COGENERATION_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getCoGenerationDataEntry",priority=2,description="This is for Co-Generation add asset data.",alwaysRun = true)
	public void energyCoGenerationAddAsset(String From, String To, String Quantity, String Activity,String FuelType,String Hub,String Facility, String Variable, String Unit) throws InterruptedException {
		
		Const.logger.info("Co-Generation Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Co-Generation Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running energyCoGenerationAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energyCoGenerationAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_CoGeneration ecg = new Energy_CoGeneration(driver);
		ecg.addAsset(Facility, Activity, Variable, FuelType, Unit);
		ecg.assetSaveCancelButton(Facility, Variable, Activity, FuelType, Hub);
		

	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},dataProvider="getCoGenerationDataEntry",priority=3,description="This is for Co-Generation data entry",alwaysRun = true)
	public void energyCoGenerationDataEntry(String From, String To, String Quantity, String Activity,String FuelType,String Hub,String Facility, String Variable, String Unit) throws InterruptedException {
		
		Const.logger.info("Co-Generation Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Co-Generation Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running energyCoGenerationDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energyCoGenerationDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_CoGeneration ecg = new Energy_CoGeneration(driver);

		ecg.dataEntry(From, To, Quantity, Activity, FuelType, Hub, Facility, Variable);
		

	}
	
	@DataProvider(name = "getCoGenerationUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Co-Generation Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.COGENERATION_UPDATE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"UpdateData"},dataProvider="getCoGenerationUpdateDataEntry",priority=4,description="This is for Co-Generation update data entry",alwaysRun = true)
	public void energyCoGenerationUpdateDataEntry(String ExistFrom, String ExistTo, String From, String To,String Quantity, String Activity,String FuelType,String Hub,String Facility, String Variable) throws InterruptedException {
		
		Const.logger.info("Co-Generation Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Co-Generation Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running energyCoGenerationUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energyCoGenerationUpdateDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_CoGeneration ecg = new Energy_CoGeneration(driver);

		ecg.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, FuelType, Hub, Facility, Variable);
		
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getCoGenerationDataEntry",priority=5,description="This is for Co-Generation delete data and asset entry.",alwaysRun = true)
	public void energyCoGenerationDeleteDataNAsset(String From, String To, String Quantity, String Activity,String FuelType,String Hub,String Facility, String Variable, String Unit) throws InterruptedException {
		
		Const.logger.info("Co-Generation Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Co-Generation Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
	
		Const.logger.info("Running energyCoGenerationDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energyCoGenerationDeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_CoGeneration ecg = new Energy_CoGeneration(driver);
		ecg.dataDelete(Activity, FuelType, Hub, Facility, Variable);
		ecg.assetDelete(Activity, FuelType, Hub, Facility, Variable);
		

	}

}
