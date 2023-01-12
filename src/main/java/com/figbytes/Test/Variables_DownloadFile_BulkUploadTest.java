package com.figbytes.Test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Administration.Facility_Bulk_Upload;
import com.figbytes.PageObject.Administration.Variables_DownloadFile_BulkUpload;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Variables_DownloadFile_BulkUploadTest extends BaseClass {
	
	@Parameters("browserName")
	@Test(groups= {"Download Sample and Grid File"},priority=2,description="This is for download sample and grid file.",alwaysRun = true)
	public void downloadSampleAndGridFile() throws InterruptedException {
		
		Const.logger.info("Download Sample and Grid File " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Download Sample and Grid File " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running Variables downloadSampleAndGridFile Test Case.");
		ReportUtils.test.log(LogStatus.INFO, "Running Variables downloadSampleAndGridFile test case.");				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Variables_DownloadFile_BulkUpload vsg = new Variables_DownloadFile_BulkUpload(driver);
		vsg.sampleFileDownload();
		vsg.gridFileDownload();
	}
	

	@Parameters("browserName")
	@Test(groups= {"Bulk Upload"},priority=3,description="This is for bulk upload file.",alwaysRun = true)
	public void bulkUpload() throws InterruptedException {
		
		Const.logger.info("Bulk Upload File " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Bulk Upload File " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running Variables bulkUpload Test Case.");
		ReportUtils.test.log(LogStatus.INFO, "Running Variables bulkUpload test case.");				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Variables_DownloadFile_BulkUpload vbu = new Variables_DownloadFile_BulkUpload(driver);
		
		vbu.bulkUpload();
	}
}
