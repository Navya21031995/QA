package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.figbytes.PageObject.LoginPage;
import com.figbytes.PageObject.Administration.Administration_Data_Process;
import com.figbytes.PageObject.ContributorPage.ContributorPage;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Administration_DataRejection_Test  extends BaseClass{
	

	@DataProvider(name = "getData")
	public Object[][] getdata() throws FileNotFoundException{
		Const.logger.info("Reading login credentials from Login Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_WORKBOOK,Const.CONTRIBUTOR_LOGIN_SHEET);
		return data;
	}
	
	@Parameters("browserName")
	@Test(groups= {"CreateData","DataEntry","UpdateData", "DeleteData","Download Sample and Grid File","Bulk Upload"},priority=1,dataProvider="getData",description="Valid Contributor login scenerio with valid username and password.",alwaysRun = true)
	public void loginContributorTest(String un, String pw) throws InterruptedException {
		Const.logger.info("Login Test " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		Const.logger.info("Running loginTest test cases.");
		ContributorPage cp = new ContributorPage(driver);	
		ReportUtils.test.log(LogStatus.INFO, "Starting Contributor Application.");
		cp.Verify_contributor_login(un, pw);
		ReportUtils.test.log(LogStatus.PASS, "Contributor App logged-in Successfully.");
	}
	
	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=2,description="This is for Contributor data entry",alwaysRun = true)
		public void contributorDataProcess() throws InterruptedException {
		Const.logger.info("contributor Test " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		Const.logger.info("Running contributor data entry test cases.");
		ContributorPage cp = new ContributorPage(driver);	
		ReportUtils.test.log(LogStatus.INFO, "Starting Data Entry in Contributor App.");
		cp.DataEntry();
		ReportUtils.test.log(LogStatus.PASS, "Data Entered Successfully in Contributor App");
	}
	
	@Parameters("browserName")
	@Test(priority=3,description="This is for Contributor logout",alwaysRun = true)
		public void contributorLogOut() throws InterruptedException {
		Const.logger.info("contributor loggedout Test " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		Const.logger.info("Running contributor logout test cases.");
		ContributorPage cp = new ContributorPage(driver);	
		cp.logOut();
		ReportUtils.test.log(LogStatus.PASS, "Application logged out Successfully.");
	}
	
	@DataProvider(name = "getAdmindata")
	public Object[][] getAdmindata() throws FileNotFoundException{
		Const.logger.info("Reading login credentials from Login Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_WORKBOOK,Const.LOGIN_SHEET);
		return data;
	}
	
	
	
	@Parameters("browserName")
	@Test(groups= {"CreateData","DataEntry","UpdateData", "DeleteData","Download Sample and Grid File","Bulk Upload"},priority=4,dataProvider="getAdmindata",description="Valid login scenerio with valid username and password.",alwaysRun = true)
	public void loginTest(String un, String pw) throws InterruptedException {
		Const.logger.info("Login Test " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		Const.logger.info("Running loginTest test cases.");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		LoginPage lp = new LoginPage(driver);	
		ReportUtils.test.log(LogStatus.INFO, "Starting Application.");
		lp.Verify_the_Login_page_functionality(un, pw);
		ReportUtils.test.log(LogStatus.PASS, "Application logged-in Successfully.");
	
	}
	
	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=5,description="This is for data approval from Admin screen",alwaysRun = true)
		public void contributor() throws InterruptedException {
		Const.logger.info("Data Approval : Administration Test " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		Const.logger.info("Running data approval test cases.");
		Thread.sleep(2000);
		Administration_Data_Process admin_data = new Administration_Data_Process(driver);
		admin_data.Admin_DataRejection();
		ReportUtils.test.log(LogStatus.INFO, "Data Approved successfully from Admin Page.");
		ReportUtils.test.log(LogStatus.PASS, "Data Approved successfully from Admin Page.");
	}

	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=6,description="This is for logout test case.",alwaysRun = true)
	public void AdminlogoutTest() throws InterruptedException {
		Const.logger.info("Logout Test " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		Const.logger.info("Running logoutTest test cases.");
		Thread.sleep(2000);
		Administration_Data_Process admin_data = new Administration_Data_Process(driver);
		admin_data.logOut();
		ReportUtils.test.log(LogStatus.PASS, "Application logged-out successfully.");
	}
	
	@Parameters("browserName")
	@Test(groups= {"CreateData","DataEntry","UpdateData", "DeleteData","Download Sample and Grid File","Bulk Upload"},priority=7,dataProvider="getData",description="Valid Contributor login scenerio with valid username and password.",alwaysRun = true)
	public void ReloginContributorTest(String un, String pw) throws InterruptedException {
		Const.logger.info("Login Test " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		Const.logger.info("Running loginTest test cases.");
		ContributorPage cp = new ContributorPage(driver);	
		ReportUtils.test.log(LogStatus.INFO, "Starting Contributor Application.");
		cp.Verify_contributor_login(un, pw);
		ReportUtils.test.log(LogStatus.PASS, "Contributor App logged-in Successfully.");
	}
	
	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=8,description="verifying the status",alwaysRun = true)
	public void verifyStatusValue() throws InterruptedException {
		Const.logger.info("verifying status Test " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		Const.logger.info("status verification test cases.");
		ContributorPage cp = new ContributorPage(driver);	
		ReportUtils.test.log(LogStatus.INFO, "Starting Contributor Application.");
		cp.verifyStatusRejected();
		ReportUtils.test.log(LogStatus.PASS, "Contributor App logged-in Successfully.");
	}
	
	@Parameters("browserName")
	@Test(priority=9,description="This is for Contributor logout",alwaysRun = true)
		public void contributorReLogOut() throws InterruptedException {
		Const.logger.info("contributor loggedout Test " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		Const.logger.info("Running contributor logout test cases.");
		ContributorPage cp = new ContributorPage(driver);	
		cp.logOut();
		ReportUtils.test.log(LogStatus.PASS, "Application logged out Successfully.");
	}
}