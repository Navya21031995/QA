package com.figbytes.Test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Administration.Facility_Bulk_Upload;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Facility_Bulk_UploadTest extends BaseClass {
	
	@Parameters("browserName")
	@Test(groups= {"Bulk Upload"},priority=2,description="This is for bulk upload file.",alwaysRun = true)
	public void bulkUpload() throws InterruptedException {
		
		Const.logger.info("Bulk Upload File " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Bulk Upload File " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running Facility bulkUpload Test Case.");
		ReportUtils.test.log(LogStatus.INFO, "Running Facility bulkUpload test case.");				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Facility_Bulk_Upload fbu = new Facility_Bulk_Upload(driver);
		
		fbu.bulkUpload();
	}

}
