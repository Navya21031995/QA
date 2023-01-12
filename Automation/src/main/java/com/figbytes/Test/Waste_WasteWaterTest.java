package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Waste_WasteWater;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Waste_WasteWaterTest extends BaseClass{

	@DataProvider(name = "getWasteWaterDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Waste Water Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_WASTE_WORKBOOK,Const.WASTE_WATER_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getWasteWaterDataEntry",priority=2,description="This is for Waste Water add asset.",alwaysRun = true)
	public void wasteWaterAddAsset(String From, String To, String Quantity, String Activity,String Variable,String Industry, String Type,String SubType, String Treatment,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Waste Water Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Waste Water Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running wasteWaterAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running wasteWaterAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Waste_WasteWater www = new Waste_WasteWater(driver);

		www.addAsset(Facility, Activity, Variable, Industry, Type, SubType, Treatment, Unit);
		www.assetSaveCancelButton(Facility, Variable, Activity, Industry, Type, SubType, Treatment, Hub);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},dataProvider="getWasteWaterDataEntry",priority=3,description="This is for Waste Water data entry",alwaysRun = true)
	public void wasteWaterDataEntry(String From, String To, String Quantity, String Activity,String Variable,String Industry, String Type,String SubType, String Treatment,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Waste Water Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Waste Water Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running wasteWaterDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running wasteWaterDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Waste_WasteWater www = new Waste_WasteWater(driver);

		www.dataEntry(From, To, Quantity, Activity, Industry, Type, SubType, Treatment, Hub, Facility, Variable);
	}
	
	@DataProvider(name = "getWasteWaterUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Waste Water Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.WASTE_WATER_UPDATE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"UpdateData"},dataProvider="getWasteWaterUpdateDataEntry",priority=4,description="This is for Waste Water update data entry",alwaysRun = true)
	public void wasteWaterUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String Industry, String Type,String SubType, String Treatment,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("Waste Water Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Waste Water Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running wasteWaterUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running wasteWaterUpdateDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Waste_WasteWater www = new Waste_WasteWater(driver);

		www.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, Industry, Type, SubType, Treatment, Hub, Facility, Variable);
		
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getWasteWaterDataEntry",priority=5,description="This is for Waste Water delete data and asset entry.",alwaysRun = true)
	public void wasteWaterDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String Industry, String Type,String SubType, String Treatment,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Waste Water Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Waste Water Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running wasteWaterDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running wasteWaterDeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Waste_WasteWater www = new Waste_WasteWater(driver);
		www.dataDelete( Activity, Industry, Type, SubType, Treatment, Hub, Facility, Variable);
		www.assetDelete(Activity, Industry, Type, SubType, Treatment, Hub, Facility, Variable);
	}

	
}
