package com.figbytes.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.LoginPage;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReadExcelsUtility;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPageTest extends BaseClass{
	
	
	@DataProvider(name = "getData")
	public Object[][] getdata() throws FileNotFoundException{
		Const.logger.info("Reading login credentials from Login Sheet.");
		String[][] data = ReadExcelsUtility.ReadExcel(Const.EXCEL_WORKBOOK,Const.LOGIN_SHEET);
		return data;
	}
	
	
	
	@Parameters("browserName")
	@Test(groups= {"CreateData","DataEntry","UpdateData", "DeleteData","Download Sample and Grid File","Bulk Upload"},priority=1,dataProvider="getData",description="Valid login scenerio with valid username and password.",alwaysRun = true)
	public void loginTest(String un, String pw) throws InterruptedException {
		Const.logger.info("Login Test " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		Const.logger.info("Running loginTest test cases.");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		LoginPage lp = new LoginPage(driver);	
		ReportUtils.test.log(LogStatus.INFO, "Starting Application.");
		lp.Verify_the_Login_page_functionality(un, pw);
		ReportUtils.test.log(LogStatus.PASS, "Application logged-in Successfully.");
	
	}
	
	@Test(groups= {"CreateData","DataEntry","UpdateData", "DeleteData","Download Sample and Grid File","Bulk Upload"},priority=10,description="This is for logout test case.",alwaysRun = true)
	public void logoutTest() throws InterruptedException {
		Const.logger.info("Logout Test " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		Const.logger.info("Running logoutTest test cases.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		LoginPage lp = new LoginPage(driver);	
		ReportUtils.test.log(LogStatus.INFO, "Application logged-out process is starting.");
		lp.logOut();
		ReportUtils.test.log(LogStatus.PASS, "Application logged-out successfully.");
	}
	
}
