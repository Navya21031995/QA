package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.Product_And_Services;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Product_And_ServicesTest extends BaseClass {

	@DataProvider(name = "getProductAndServicesDataEntry")
	public Object[][] getdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry data from Product & Services Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_WASTE_WORKBOOK,Const.PRODUCT_AND_SERVICES_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=2,dataProvider="getProductAndServicesDataEntry",description="This is for Product & Services add asset.",alwaysRun = true)
	public void productAndServicesAddAsset(String From, String To, String Quantity, String Activity,String Variable,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Product & Services Add Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Product & Services Add Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running productAndServicesAddAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running productAndServicesAddAsset test case.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Product_And_Services pac = new Product_And_Services(driver);
		
		pac.addAsset(Facility, Activity, Variable, Unit);
		pac.assetSaveCancelButton(Facility, Variable, Activity, Hub);
	}
	
	
	@Parameters("browserName")
	@Test(groups= {"DataEntry"},priority=3,dataProvider="getProductAndServicesDataEntry",description="This is for Product & Services data entry",alwaysRun = true)
	public void productAndServicesDataEntry(String From, String To, String Quantity, String Activity,String Variable,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Product & Services Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Product & Services Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running productAndServicesDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running productAndServicesDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Product_And_Services pac = new Product_And_Services(driver);
		
		pac.dataEntry(From, To, Quantity, Activity, Hub, Facility, Variable);
	}
	
	@DataProvider(name = "getProductAndServicesUpdateDataEntry")
	public Object[][] getdataUpdateEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading data entry to update the data from Product & Services Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_UPDATE_WORKBOOK,Const.PRODUCT_AND_SERVICES_UPDATE_SHEET);
		return data;
	}

	
	@Parameters("browserName")
	@Test(groups= {"UpdateData"},priority=4,dataProvider="getProductAndServicesUpdateDataEntry",description="This is for Product & Services update data entry",alwaysRun = true)
	public void productAndServicesUpdateDataEntry(String ExistFrom, String ExistTo,String From, String To, String Quantity, String Activity,String Hub,String Facility,String Variable) throws InterruptedException {
		
		Const.logger.info("Product & Services Update Data Entry " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Product & Services Update Data Entry " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running productAndServicesUpdateDataEntry test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running productAndServicesUpdateDataEntry test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Product_And_Services pac = new Product_And_Services(driver);
		
		pac.updateNVerifyData(ExistFrom, ExistTo, Quantity, From, To, Activity, Hub, Facility, Variable);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},priority=5,dataProvider="getProductAndServicesDataEntry",description="This is for Product & Services delete data and asset entry.",alwaysRun = true)
	public void productAndServicesDeleteDataNAsset(String From, String To, String Quantity, String Activity,String Variable,String Hub,String Facility, String Unit) throws InterruptedException {
		
		Const.logger.info("Product & Services Delete Data Entry and Asset " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Product & Services Delete Data Entry and Asset " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		
		Const.logger.info("Running productAndServicesDeleteDataNAsset test cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running productAndServicesDeleteDataNAsset test case.");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Product_And_Services pac = new Product_And_Services(driver);
		
		pac.dataDelete(Activity, Hub, Facility, Variable);
		pac.assetDelete(Activity, Hub, Facility, Variable);

	}

	
}
