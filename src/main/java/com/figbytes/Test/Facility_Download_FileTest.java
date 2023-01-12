package com.figbytes.Test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.figbytes.PageObject.Administration.Facility_Download_File;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Facility_Download_FileTest extends BaseClass{

	@Parameters("browserName")
	@Test(groups= {"Download Sample and Grid File"},priority=2,description="This is for download sample and grid file.",alwaysRun = true)
	public void downloadSampleAndGridFile() throws InterruptedException {
		
		Const.logger.info("Download Sample and Grid File " + getClass().getSimpleName() + " with Thread Id:- " + Thread.currentThread().getId());
		ReportUtils.test.log(LogStatus.INFO, "Download Sample and Grid File " + getClass().getSimpleName()	+ " with Thread Id:- " + Thread.currentThread().getId());		
		Const.logger.info("Running Facility downloadSampleAndGridFile Test Case.");
		ReportUtils.test.log(LogStatus.INFO, "Running Facility downloadSampleAndGridFile test case.");				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Facility_Download_File fdf = new Facility_Download_File(driver);
		fdf.sampleFileDownload();
		fdf.gridFileDownload();
	}

}
