package com.figbytes.Test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Data.ChilledWater_DownloadFile_BulkUpload;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class ChilledWater_DownloadFile_BulkUploadTest extends BaseClass{
	
/*	@Parameters("browserName")
	@Test(groups= {"Download Sample and Grid File"},priority=2,description="This is for download sample and grid file.",alwaysRun = true)
	public void downloadSampleAndGridFile() throws InterruptedException {
		
		Const.logger.info("Download Sample and Grid File " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Download Sample and Grid File " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running Chilled Water downloadSampleAndGridFile Test Case.");
		ReportUtils.test.log(LogStatus.INFO, "Running Chilled Water downloadSampleAndGridFile test case.");				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		ChilledWater_DownloadFile_BulkUpload cdb = new ChilledWater_DownloadFile_BulkUpload(driver);
		cdb.sampleFileDownload();
		//cdb.gridFileDownload();
	}
*/
	@Parameters("browserName")
	@Test(groups= {"Bulk Upload"},priority=3,description="This is for bulk upload file.",alwaysRun = true)
	public void bulkUpload() throws InterruptedException {
		Const.logger.info("Bulk Upload File " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Bulk Upload File " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running Chilled Water bulkUpload Test Case.");
		ReportUtils.test.log(LogStatus.INFO, "Running Chilled Water bulkUpload test case.");				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		ChilledWater_DownloadFile_BulkUpload cdb = new ChilledWater_DownloadFile_BulkUpload(driver);
		
		cdb.bulkUpload();
	}

}
