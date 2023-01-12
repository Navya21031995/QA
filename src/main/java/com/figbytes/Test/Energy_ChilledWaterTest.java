package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Energy_ChilledWater;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Energy_ChilledWaterTest extends BaseClass{
	
	@DataProvider(name = "getChilledWaterDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data from Chilled Water Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_WORKBOOK,Const.CHILLED_WATER_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getChilledWaterDataEntry",priority=2,description="This is for Chilled Water add asset data.",alwaysRun = true)
	public void energyChilledWaterAddAsset(String From, String To, String Quantity, String Activity,String FuelType,String Hub,String Facility, String Variable, String Unit) throws InterruptedException {
		
		Const.logger.info("Chilled Water Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Chilled Water Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
	
		Const.logger.info("Running energyChilledWaterAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energyChilledWaterAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_ChilledWater ecw = new Energy_ChilledWater(driver);
		
		ecw.addAsset(Facility, Activity, Variable, FuelType, Unit);
		ecw.assetSaveCancelButton(Facility, Variable, Activity, FuelType, Hub);				

	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},dataProvider="getChilledWaterDataEntry",priority=3,description="This is for Chilled Water data entry",alwaysRun = true)
	public void energyChilledWaterDataEntry(String From, String To, String Quantity, String Activity,String FuelType,String Hub,String Facility, String Variable, String Unit) throws InterruptedException {
		
		Const.logger.info("Chilled Water Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Chilled Water Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running energyChilledWaterDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energyChilledWaterDataEntry test case.");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_ChilledWater ecw = new Energy_ChilledWater(driver);

		ecw.dataEntry(From, To, Quantity, Activity, FuelType, Hub, Facility, Variable);
				

	}
	
	@DataProvider(name = "getChilledWaterUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Chilled Water Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.CHILLED_WATER_UPDATE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"UpdateData"},dataProvider="getChilledWaterUpdateDataEntry",priority=4,description="This is for Chilled Water update data entry",alwaysRun = true)
	public void energyChilledWaterUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String FuelType,String Hub,String Facility, String Variable) throws InterruptedException {
		
		Const.logger.info("Chilled Water Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Chilled Water Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running energyChilledWaterUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energyChilledWaterUpdateDataEntry test case.");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_ChilledWater ecw = new Energy_ChilledWater(driver);

		ecw.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, FuelType, Hub, Facility, Variable);
				

	}
	
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getChilledWaterDataEntry",priority=5,description="This is for Chilled Water delete data and asset entry.",alwaysRun = true)
	public void energyChilledWaterDeleteDataNAsset(String From, String To, String Quantity, String Activity,String FuelType,String Hub,String Facility, String Variable, String Unit) throws InterruptedException {
		
		Const.logger.info("Chilled Water Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Chilled Water Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running energyChilledWaterDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energyChilledWaterDeleteDataNAsset test case.");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_ChilledWater ecw = new Energy_ChilledWater(driver);
		
		ecw.dataDelete(Activity, FuelType, Hub, Facility, Variable);
		ecw.assetDelete(Activity, FuelType, Hub, Facility, Variable);
				

	}

}
