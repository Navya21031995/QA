package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Administration.Facility;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class FacilityTest extends BaseClass{
	
	@DataProvider(name = "getHubName")
	public Object[][] getHubdataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading hub data entry from Hub Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_WORKBOOK,Const.HUB_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getHubName",priority=2,description="This is for Hub creation",alwaysRun = true)
	public void hubCreation(String FacilityType,String FacilityName, String Country, String State, String Region, String Currency) throws InterruptedException {
		
		Const.logger.info("Hub Creation " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Hub Creation " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running hubCreation Test Case.");
		ReportUtils.test.log(LogStatus.INFO, "Running hubCreation test case.");				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ReportUtils.test.log(LogStatus.INFO, "Creating a new Hub: " + FacilityName);	
		
		Facility hc = new Facility(driver);	
		hc.addHub(FacilityType,FacilityName,Country,State,Region,Currency);
		hc.facilitySaveCancelButton();
		hc.verifyCreatedFacility(FacilityName);

	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getHubName",priority=4,description="This is for delete Hub.",alwaysRun = true)
	public void deleteHub(String FacilityType,String FacilityName, String Country, String State, String Region, String Currency) throws InterruptedException {
		
		Const.logger.info("Delete Hub " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Delete Hub " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running deleteHub Test Case.");
		ReportUtils.test.log(LogStatus.INFO, "Running deleteHub test cases.");				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ReportUtils.test.log(LogStatus.INFO, "Deleting Hub : " + FacilityName);
		
		Facility hc = new Facility(driver);	
		
		hc.deleteFacility(FacilityName);

	}
	
	
	@DataProvider(name = "getFacilityName")
	public Object[][] getFacilitydataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading facility data entry from Facility Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_WORKBOOK,Const.FACILITY_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getFacilityName",priority=3,dependsOnMethods="hubCreation",description="This is for facility creation",alwaysRun = true)
	public void facilityCreation(String FacilityType,String FacilityName, String Country, String State, String Region, String SubordinateTo, String Currency, String CredibleDataYear) throws InterruptedException {
		
		Const.logger.info("Facility Creation " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Facility Creation " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running facilityCreation Test Case");
		ReportUtils.test.log(LogStatus.INFO, "Running facilityCreation test case.");				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ReportUtils.test.log(LogStatus.INFO, "Creating a new Facility: " + FacilityName);	
		
		Facility fc = new Facility(driver);		
		fc.addFacility(FacilityType,FacilityName,Country,State,Region,SubordinateTo,Currency,CredibleDataYear);
		fc.facilitySaveCancelButton();
		fc.verifyCreatedFacility(FacilityName);
	
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getFacilityName",priority=3,description="This is for delete facility.",alwaysRun = true)
	public void deleteFacility(String FacilityType,String FacilityName, String Country, String State, String Region, String SubordinateTo, String Currency, String CredibleDataYear) throws InterruptedException {
		
		Const.logger.info("Delete Facility " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Delete Facility " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running deleteFacility Test Case");
		ReportUtils.test.log(LogStatus.INFO, "Running deleteFacility test cases.");				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ReportUtils.test.log(LogStatus.INFO, "Deleting Facility : " + FacilityName);
		
		Facility fc = new Facility(driver);		
		
		fc.deleteFacility(FacilityName);
	
	}
	
	@DataProvider(name = "getSiteName")
	public Object[][] getSiteDataEntry() throws FileNotFoundException{
		
		Const.logger.info("Reading site data entry from Site Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_WORKBOOK,Const.SITE_SHEET);
		return data;
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},dataProvider="getSiteName",priority=4,dependsOnMethods="facilityCreation",description="This is for site creation",alwaysRun = true)
	public void siteCreation(String FacilityType, String FacilityName,String SiteType, String Country, String State, String Region, String SubordinateTo, String Currency, String CredibleDataYear) throws InterruptedException {
		
		Const.logger.info("Site Creation " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		ReportUtils.test.log(LogStatus.INFO, "Site Creation " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running siteCreation Test Cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running siteCreation test case.");						
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ReportUtils.test.log(LogStatus.INFO, "Creating a new Site: " + FacilityName);	
		
		Facility sc = new Facility(driver);		
		sc.addSite(FacilityType,FacilityName,SiteType,Country,State,Region,SubordinateTo,Currency,CredibleDataYear);
		sc.facilitySaveCancelButton();
		sc.verifyCreatedFacility(FacilityName);
	}
	
	@Parameters("browserName")
	@Test(groups= {"DeleteData"},dataProvider="getSiteName",priority=2,description="This is for delete site.",alwaysRun = true)
	public void deleteSite(String FacilityType, String FacilityName,String SiteType, String Country, String State, String Region, String SubordinateTo, String Currency, String CredibleDataYear) throws InterruptedException {
		
		Const.logger.info("Delete Site " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		ReportUtils.test.log(LogStatus.INFO, "Delete Site " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running deleteSite Test Cases.");
		ReportUtils.test.log(LogStatus.INFO, "Running deleteSite test cases.");				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ReportUtils.test.log(LogStatus.INFO, "Deleting Site : " + FacilityName);
		
		Facility sc = new Facility(driver);		
		
		sc.deleteFacility(FacilityName);
	}

}
