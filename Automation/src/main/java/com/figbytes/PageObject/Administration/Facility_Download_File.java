package com.figbytes.PageObject.Administration;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.figbytes.PageObject.CommonLocators;
import com.figbytes.Utilities.CommonMethods;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Facility_Download_File {
	
	WebDriver driver;
	
		public Facility_Download_File(WebDriver driver){

			this.driver=driver;		    
			PageFactory.initElements(driver, this);
		}
		
		String BULK_UPLOAD_URL = "https://figbytes.biz/BulkUpload/BulkUpload.aspx?T=6";
		String sampleFileName = "FacilitySampleData.xlsx";
		String gridFileName = "FacilityData.xlsx";
		
		@FindBy(xpath=CommonLocators.MEGA_MENU_ADMINISTRATION)
		WebElement adminMenu;
		
		@FindBy(xpath="//ul[@class='col-sm-4 list-unstyled']//a[text()='"+Const.FACILITY_SUB_MENU+"']")
		WebElement facility;
		
		@FindBy(xpath= CommonLocators.BULK_UPLOAD_BUTTON)
		WebElement BulkUploadButton;
		
		@FindBy(xpath= CommonLocators.DOWNLOAD_SAMPLE_FILE_BUTTON)
		WebElement DownloadSampleFileButton;		
		
		@FindBy(xpath = CommonLocators.DOWNLOAD_GRID_FILE_BUTTON)
		WebElement DownloadGridFileButton;
		
		public void sampleFileDownload() throws InterruptedException {
			
			ReportUtils.test.log(LogStatus.INFO, "Running Facility sampleFileDownload method.");	
			Const.logger.info("Running Facility sampleFileDownload method.");
			
			CommonMethods.clickOn(adminMenu);			
			CommonMethods.clickOn(facility);
			Thread.sleep(5000);
			try {
			if(this.BulkUploadButton.isDisplayed()) {
				ReportUtils.test.log(LogStatus.INFO, "Facility Bulk Upload button available");
				Const.logger.info("Facility Bulk Upload button available");				
				CommonMethods.clickOn(BulkUploadButton);	
				Thread.sleep(5000);
				if(driver.getCurrentUrl().contains(BULK_UPLOAD_URL)) {				
					ReportUtils.test.log(LogStatus.INFO, "Facility Bulk Upload Page exist");
					Const.logger.info("Facility Bulk Upload Page exist");
					CommonMethods.clickOn(DownloadSampleFileButton);
					Thread.sleep(8000);
					File fileLocation = new File (Const.DOWNLOAD_PATH);
					File[] totalFiles = fileLocation.listFiles();
					for(File file : totalFiles) {
						if(file.getName().equals(sampleFileName)) {
							ReportUtils.test.log(LogStatus.PASS, "Facility Sample File downloaded successfully : "+ file.getName());
							Const.logger.info("Facility Sample File downloaded successfully : "+ file.getName()); 							
							Thread.sleep(5000);						
					        file.delete();
			                ReportUtils.test.log(LogStatus.PASS,"File deleted successfully: "+ file.getName());
			                Const.logger.info("File deleted successfully: "+ file.getName());					        
							break;
								} 
							}
					} else {
		                ReportUtils.test.log(LogStatus.FAIL,"Facility Bulk Upload Page load failed");
		                Const.logger.info("Facility Bulk Upload Page load failed");			
					}
		 		} else {
		            ReportUtils.test.log(LogStatus.FAIL,"Facility Bulk Upload Button is not available");
		            Const.logger.info("Facility Bulk Upload Button is not available");
		 		}
				}
				catch(Exception e){
					ReportUtils.test.log(LogStatus.FAIL,"Error in test");
		            Const.logger.info("Error in test " + e.toString());
				}			
				}
		
		public void gridFileDownload() throws InterruptedException {
			
			ReportUtils.test.log(LogStatus.INFO, "Running Facility gridFileDownload method.");	
			Const.logger.info("Running Facility gridFileDownload method.");
			
			CommonMethods.clickOn(adminMenu);			
			CommonMethods.clickOn(facility);
			Thread.sleep(5000);
			
			if(this.DownloadGridFileButton.isDisplayed()) {
				ReportUtils.test.log(LogStatus.INFO, "Facility Download Data button available");
				Const.logger.info("Facility Download Data button available");					
				CommonMethods.clickOn(DownloadGridFileButton);	
				Thread.sleep(10000);
				File fileLocation = new File (Const.DOWNLOAD_PATH);
				File[] totalFiles = fileLocation.listFiles();
				for(File file : totalFiles) {
					if(file.getName().equals(gridFileName)) {
						ReportUtils.test.log(LogStatus.PASS, "Facility Grid File downloaded successfully : "+ file.getName());
						Const.logger.info("Facility Grid File downloaded successfully : "+ file.getName()); 							
						Thread.sleep(5000);						
				        file.delete();
		                ReportUtils.test.log(LogStatus.PASS,"File deleted successfully: "+ file.getName());
		                Const.logger.info("File deleted successfully: "+ file.getName());					        
						break;
							}
						}
				
			}
		}

}
