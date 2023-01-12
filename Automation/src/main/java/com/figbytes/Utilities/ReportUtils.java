package com.figbytes.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.internal.Utils;

import com.figbytes.Test.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.view.ScreenshotHtml;

public class ReportUtils implements ITestListener {
	
	ExtentReports extent;
	public static ExtentTest test;
	String s;
	String sep = System.getProperty("file.separator");
	String basePath = System.getProperty("user.dir");
	String date;
	
	
	@Parameters("browserName")
	@Override
	public void onStart(ITestContext st) {
		
		//To make report name dynamically by date/time
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy__hh_mm_ssaa");
		date = df.format(new Date());
		Const.logger.info(date);
		//getting report
		extent = new ExtentReports(Const.Extent_Report_Path+sep+st.getName()+date+".html");
		Const.logger.info(Const.Extent_Report_Path+sep+st.getName()+date+".html");
		extent.loadConfig(new File(basePath+"\\extent-config.xml"));
		
	}
	
	
	@Override
	public void onTestSuccess(ITestResult arg0) {
		
		//test.log(LogStatus.PASS, "Pass-Detail");
		extent.endTest(test);		
	}
	
	@Override
	public void onTestFailure(ITestResult tr) {
		
		
		File file = ((TakesScreenshot)BaseClass.driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(Const.Extent_Report_Path+sep+tr.getMethod().getMethodName()+date+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Throwable t = tr.getThrowable();
		String error = Utils.longStackTrace(t, true);
		test.log(LogStatus.FAIL, "Fail-Detail");
		//To take screenshot and save in report eclipse package folder
		//test.log(LogStatus.INFO, ScreenshotHtml.getSource(basePath+sep+"src"+sep+"main"+sep+"java"+sep+"com"+sep+"figbytes"+sep+"Reports"+sep+tr.getMethod().getMethodName()+date+".png"));		
		test.log(LogStatus.INFO, ScreenshotHtml.getSource(Const.Extent_Report_Path+sep+tr.getMethod().getMethodName()+date+".png"));
		//To create logs and show in report
		test.log(LogStatus.ERROR, error);		
		extent.endTest(test);
	}
	

	@Override
	public void onTestSkipped(ITestResult arg0) {

		test.log(LogStatus.SKIP, "Skip-Detail");
		extent.endTest(test);
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onTestStart(ITestResult tr) {
		//ExtentTest test = extent.startTest("Test Name", "Sample description");
		
		//To give the class name with method name
		// test = extent.startTest(tr.getTestClass().getName()+"---"+tr.getMethod().getMethodName());
		 test = extent.startTest(tr.getMethod().getMethodName());

	}

	@Override
	public void onFinish(ITestContext arg0) {
		extent.endTest(test);
		extent.flush();		
		extent.close();
	}

}
