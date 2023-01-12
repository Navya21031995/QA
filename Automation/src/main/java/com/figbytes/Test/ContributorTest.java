package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.LoginPage;
import com.figbytes.PageObject.ContributorPage.ContributorPage;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class ContributorTest extends BaseClass{
	
	@DataProvider(name = "getData")
	public Object[][] getdata() throws FileNotFoundException{
		Const.logger.info("Reading login credentials from Login Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_WORKBOOK,Const.CONTRIBUTOR_LOGIN_SHEET);
		return data;
	}
	
	@Parameters("browserName")
	@Test(groups= {"CreateData","DataEntry","UpdateData", "DeleteData","Download Sample and Grid File","Bulk Upload"},priority=1,dataProvider="getData",description="Valid Contributor login scenerio with valid username and password.",alwaysRun = true)
	public void loginTest(String un, String pw) throws InterruptedException {
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
	@Test(groups= {"CreateData"},priority=3,description="This is for delete data entry",alwaysRun = true)
		public void contributorDeleteDataEntry() throws InterruptedException {
		Const.logger.info("contributor Test " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		Const.logger.info("Running contributor delete data entered test cases.");
		ContributorPage cp = new ContributorPage(driver);	
		ReportUtils.test.log(LogStatus.INFO, "Starting Delete Data Entered in Contributor App.");
		cp.deleteDataEntry();
		ReportUtils.test.log(LogStatus.PASS, "Deleted Entered Data Successfully in Contributor App");
	}
	
	
	
	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=4,description="This is for Contributor data entry",alwaysRun = true)
		public void contributorAddDataProcess() throws InterruptedException {
		Const.logger.info("contributor Test " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		Const.logger.info("Running contributor data entry test cases.");
		ContributorPage cp = new ContributorPage(driver);	
		ReportUtils.test.log(LogStatus.INFO, "Starting Data Entry in Contributor App.");
		cp.DataEntry();
		ReportUtils.test.log(LogStatus.PASS, "Data Entered Successfully in Contributor App");
	}
	
	@Parameters("browserName")
	@Test(groups= {"CreateData"},priority=5,description="This is for Contributor edit data entry",alwaysRun = true)
		public void contributorEditDataEntry() throws InterruptedException {
		Const.logger.info("contributor Test " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		Const.logger.info("Running  edit data entry test cases.");
		ContributorPage cp = new ContributorPage(driver);	
		ReportUtils.test.log(LogStatus.INFO, "Starting the Edit process for entered data in Contributor Application.");
		cp.EditDataEntry();
		ReportUtils.test.log(LogStatus.PASS, "Edited Data Successfully.");
	}
	
	@Parameters("browserName")
	@Test(priority=6,description="This is for Contributor logout",alwaysRun = true)
		public void contributorLogOut() throws InterruptedException {
		Const.logger.info("contributor loggedout Test " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		Const.logger.info("Running contributor logout test cases.");
		ContributorPage cp = new ContributorPage(driver);	
		cp.logOut();
		ReportUtils.test.log(LogStatus.PASS, "Application logged out Successfully.");
	}
	
	
	/*@Test(groups= {"CreateData","DataEntry","UpdateData", "DeleteData","Download Sample and Grid File","Bulk Upload"},priority=10,description="This is for logout test case.",alwaysRun = true)
	public void logoutTest() throws InterruptedException {
		Const.logger.info("Logout Test " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		Const.logger.info("Running logoutTest test cases.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		LoginPage lp = new LoginPage(driver);
		
		ReportUtils.test.log(LogStatus.INFO, "Application logged-out process is starting.");
		lp.logOut();
		ReportUtils.test.log(LogStatus.PASS, "Application logged-out successfully.");
	}*/
	
}
