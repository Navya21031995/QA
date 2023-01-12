package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Transport_Air;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Transport_AirTest extends BaseClass {
	
	@DataProvider(name = "getAirDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Air Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_TRANSPORT_WORKBOOK,Const.AIR_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=2,dataProvider="getAirDataEntry",description="This is for Air data entry",alwaysRun = true)
	public void transportAirDataEntryNUpdate(String From, String To, String Distance, String Activity,String Variable,String Hub,String Facility,String Passengers, String Unit,String dateOfTravel,String dateOfReturn,String fromCountry,String fromAirport,String toCountry,String toAirport,String unitDestination) throws InterruptedException {
		
		Const.logger.info("Air Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Air Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running transportAirDataEntryNUpdate test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportAirDataEntryNUpdate test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_Air ta = new Transport_Air(driver);
		ta.addAsset(Facility, Activity, Variable, Unit);
		ta.assetSaveCancelButton(Facility, Variable, Activity, Hub);
		ta.dataEntry(From, To, Distance, Activity, Hub, Facility, Variable, dateOfTravel, dateOfReturn, fromCountry, fromAirport, toCountry, toAirport, unitDestination, Passengers);
		ta.updateNVerifyData(From, To, Distance, Passengers, Activity, Hub, Facility, Variable);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},priority=5,dataProvider="getAirDataEntry",description="This is for Air delete data and asset entry.",alwaysRun = true)
	public void transportAirDeleteDataNAsset(String From, String To, String Distance, String Activity,String Variable,String Hub,String Facility,String Passengers, String Unit,String dateOfTravel,String dateOfReturn,String fromCountry,String fromAirport,String toCountry,String toAirport,String unitDestination) throws InterruptedException {
		
		Const.logger.info("Air Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Air Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running transportAirDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running transportAirDeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Transport_Air ta = new Transport_Air(driver);
		
		ta.dataDelete(Activity, Hub, Facility, Variable);
		ta.assetDelete(Activity, Hub, Facility, Variable);

	}

}
