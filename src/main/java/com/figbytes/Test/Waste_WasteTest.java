package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Waste_Waste;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Waste_WasteTest extends BaseClass {
	
	@DataProvider(name = "getWasteDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Waste Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_WASTE_WORKBOOK,Const.WASTE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getWasteDataEntry",priority=2,description="This is for Waste add asset",alwaysRun = true)
	public void wasteAddAsset(String From, String To, String Quantity, String Activity,String Variable,String Category, String Type,String SubType, String DisposalMethod,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Waste Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Waste Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running wasteAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running wasteAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Waste_Waste ww = new Waste_Waste(driver);
		ww.addAsset(Facility, Activity, Variable, Category, Type, SubType, DisposalMethod, Unit);
		ww.assetSaveCancelButton(Facility, Variable, Activity, Category, Type, SubType, DisposalMethod, Hub);

	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},dataProvider="getWasteDataEntry",priority=3,description="This is for Waste data entry",alwaysRun = true)
	public void wasteDataEntry(String From, String To, String Quantity, String Activity,String Variable,String Category, String Type,String SubType, String DisposalMethod,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Waste Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Waste Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running wasteDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running wasteDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Waste_Waste ww = new Waste_Waste(driver);
		ww.dataEntry(From, To, Quantity, Activity, Category, Type, SubType, DisposalMethod, Hub, Facility, Variable);

	}
	
	@DataProvider(name = "getWasteUpdateDataEntry")
	public Object[][] getdataUpdateEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Waste Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.WASTE_UPDATE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"UpdateData"},dataProvider="getWasteUpdateDataEntry",priority=4,description="This is for Waste update data entry",alwaysRun = true)
	public void wasteUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String Category, String Type,String SubType, String DisposalMethod,String Hub,String Facility, String Variable) throws InterruptedException {
		
		Const.logger.info("Waste update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Waste update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running wasteUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running wasteUpdateDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Waste_Waste ww = new Waste_Waste(driver);

		ww.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, Category, Type, SubType, DisposalMethod, Hub, Facility, Variable);
		
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getWasteDataEntry",priority=5,description="This is for Waste delete data and asset entry.",alwaysRun = true)
	public void wasteDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String Category, String Type,String SubType, String DisposalMethod,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Waste Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Waste Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		

		Const.logger.info("Running wasteDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running wasteDeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Waste_Waste ww = new Waste_Waste(driver);
		ww.dataDelete(Activity, Category, Type, SubType, DisposalMethod, Hub, Facility, Variable);
		ww.assetDelete(Activity, Category, Type, SubType, DisposalMethod, Hub, Facility, Variable);
	
	}

}
