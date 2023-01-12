package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Energy_Steam;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Energy_SteamTest extends BaseClass {

	@DataProvider(name = "getSteamDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Steam Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_WORKBOOK,Const.STEAM_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getSteamDataEntry",priority=2,description="This is for Steam add asset.",alwaysRun = true)
	public void energySteamAddAsset(String From, String To, String Quantity, String Activity,String FuelType,String Hub,String Facility, String Variable, String Unit) throws InterruptedException {
		
		Const.logger.info("Steam Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Steam Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running energySteamAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energySteamAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_Steam es = new Energy_Steam(driver);
		es.addAsset(Facility, Activity, Variable, FuelType, Unit);
		es.assetSaveCancelButton(Facility, Variable, Activity, FuelType, Hub);		

	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},dataProvider="getSteamDataEntry",priority=3,description="This is for Steam data entry",alwaysRun = true)
	public void energySteamDataEntry(String From, String To, String Quantity, String Activity,String FuelType,String Hub,String Facility, String Variable, String Unit) throws InterruptedException {
		
		Const.logger.info("Steam Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Steam Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running energySteamDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energySteamDataEntry test case.");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_Steam es = new Energy_Steam(driver);

		es.dataEntry(From, To, Quantity, Activity, FuelType, Hub, Facility,  Variable);
		

	}
	
	@DataProvider(name = "getSteamUpdateDataEntry")
	public Object[][] getdataUpdateEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Steam Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.STEAM_UPDATE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"UpdateData"},dataProvider="getSteamUpdateDataEntry",priority=4,description="This is for Steam update data entry",alwaysRun = true)
	public void energySteamUpdateDataEntry(String ExistFrom, String ExistTo,String From,String To, String Quantity, String Activity,String FuelType,String Hub,String Facility, String Variable) throws InterruptedException {
		
		Const.logger.info("Steam Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Steam Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running energySteamUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energySteamUpdateDataEntry test case.");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_Steam es = new Energy_Steam(driver);

		es.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, FuelType, Hub, Facility, Variable);
		

	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getSteamDataEntry",priority=5,description="This is for Steam delete data and asset entry.",alwaysRun = true)
	public void energySteamDeleteDataNAsset(String From, String To, String Quantity, String Activity,String FuelType,String Hub,String Facility,String Variable, String Unit) throws InterruptedException {
		
		Const.logger.info("Steam Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Steam Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running energySteamDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running energySteamDeleteDataNAsset test case.");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Energy_Steam es = new Energy_Steam(driver);
		es.dataDelete(Activity, FuelType, Hub, Facility,  Variable);
		es.assetDelete(Activity, FuelType, Hub, Facility, Unit, Variable);
		

	}
}
