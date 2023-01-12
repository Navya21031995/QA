package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.NonFuelImpacts_VOCs;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class NonFuelImpacts_VOCsTest extends BaseClass{
	
	@DataProvider(name = "getVOCsDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from VOCs Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_NON_FUEL_IMPACTS_WORKBOOK,Const.VOCS_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getVOCsDataEntry",priority=2,description="This is for VOCs add asset.",alwaysRun = true)
	public void nonFuelImpactsVOCsAddAsset(String From, String To, String Quantity, String Activity,String Variable,String DensityOrGallon,String VOC,String Toluene,String Xylene,String Formaldehyde,String MEK,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("VOCs Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "VOCs Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsVOCsAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsVOCsAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_VOCs nvc = new NonFuelImpacts_VOCs(driver);

		nvc.addAsset(Facility, Activity, Variable, Activity, Facility, DensityOrGallon, Unit, VOC, Toluene, Xylene, Formaldehyde, MEK);
		nvc.assetSaveCancelButton(Facility, Variable, Activity, Hub);
		
	}
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},dataProvider="getVOCsDataEntry",priority=3,description="This is for VOCs data entry",alwaysRun = true)
	public void nonFuelImpactsVOCsDataEntry(String From, String To, String Quantity, String Activity,String Variable,String DensityOrGallon,String VOC,String Toluene,String Xylene,String Formaldehyde,String MEK,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("VOCs Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "VOCs Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsVOCsDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsVOCsDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_VOCs nvc = new NonFuelImpacts_VOCs(driver);

		nvc.dataEntry(From, To, Quantity, Activity, Hub, Facility, Variable);
		
	}
	
	@DataProvider(name = "getVOCsUpdateDataEntry")
	public Object[][] getUpdatedataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from VOCs Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.VOCS_UPDATE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"UpdateData"},dataProvider="getVOCsUpdateDataEntry",priority=4,description="This is for VOCs update data entry",alwaysRun = true)
	public void nonFuelImpactsVOCsUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("VOCs Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "VOCs Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsVOCsUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsVOCsUpdateDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_VOCs nvc = new NonFuelImpacts_VOCs(driver);

		nvc.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, Hub, Facility, Variable);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getVOCsDataEntry",priority=5,description="This is for VOCs delete data and asset entry.",alwaysRun = true)
	public void nonFuelImpactsVOCsDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String DensityOrGallon,String VOC,String Toluene,String Xylene,String Formaldehyde,String MEK,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("VOCs Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "VOCs Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running nonFuelImpactsVOCsDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running nonFuelImpactsVOCsDeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		NonFuelImpacts_VOCs nvc = new NonFuelImpacts_VOCs(driver);
	
		nvc.dataDelete(Activity, Hub, Facility, Variable);
		nvc.assetDelete(Activity, Hub, Facility, Variable);
		
	}
	
	
}


