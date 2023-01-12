package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Transport_AirTransportByFuel;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Transport_AirTransportByFuelTest extends BaseClass {
	
	@DataProvider(name = "getAirTransportByFuelDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Air Transport By Fuel Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_TRANSPORT_WORKBOOK,Const.AIR_TRANSPORT_BY_FUEL_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getAirTransportByFuelDataEntry",priority=2,description="This is for Air Transport By Fuel add asset.",alwaysRun = true)
	public void airTransportByFuelAddAsset(String From, String To, String Quantity, String Activity,String AircraftType,String FuelSubType,String Variable,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Air Transport By Fuel Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Air Transport By Fuel Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running airTransportByFuelAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running airTransportByFuelAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_AirTransportByFuel tatbf = new Transport_AirTransportByFuel(driver);
		
		tatbf.addAsset(Facility, Activity, Variable, AircraftType, FuelSubType, Unit);
		tatbf.assetSaveCancelButton(Facility, Variable, Activity, AircraftType, FuelSubType, Hub);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},dataProvider="getAirTransportByFuelDataEntry",priority=3,description="This is for Air Transport By Fuel data entry",alwaysRun = true)
	public void airTransportByFuelDataEntry(String From, String To, String Quantity, String Activity,String AircraftType,String FuelSubType,String Variable,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Air Transport By Fuel Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Air Transport By Fuel Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running airTransportByFuelDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running airTransportByFuelDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_AirTransportByFuel tatbf = new Transport_AirTransportByFuel(driver);
		
		tatbf.dataEntry(From, To, Quantity, Activity, AircraftType, FuelSubType, Hub, Facility, Variable);
	}
	
	@DataProvider(name = "getAirTransportByFuelUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Air Transport By Fuel Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.AIR_TRANSPORT_BY_FUEL_UPDATE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"UpdateData"},dataProvider="getAirTransportByFuelUpdateDataEntry",priority=4,description="This is for Air Transport By Fuel update data entry",alwaysRun = true)
	public void airTransportByFuelUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String AircraftType,String FuelSubType,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("Air Transport By Fuel Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Air Transport By Fuel Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running airTransportByFuelUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running airTransportByFuelUpdateDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_AirTransportByFuel tatbf = new Transport_AirTransportByFuel(driver);
		
		tatbf.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, AircraftType, FuelSubType, Hub, Facility, Variable);
	
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getAirTransportByFuelDataEntry",priority=5,description="This is for Air Transport By Fuel delete data and asset entry.",alwaysRun = true)
	public void airTransportByFuelDeleteDataNAsset(String From, String To, String Quantity, String Activity,String AircraftType,String FuelSubType,String Variable,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Air Transport By Fuel Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Air Transport By Fuel Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running airTransportByFuelDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running airTransportByFuelDeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_AirTransportByFuel tatbf = new Transport_AirTransportByFuel(driver);
		
		tatbf.dataDelete(Activity, AircraftType, FuelSubType, Hub, Facility, Variable);
		tatbf.assetDelete(Activity, AircraftType, FuelSubType, Hub, Facility, Variable);
	}

}
