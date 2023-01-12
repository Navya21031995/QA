package com.figbytes.PageObject.Administration;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.figbytes.PageObject.CommonLocators;
import com.figbytes.Utilities.CommonMethods;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.ReportUtils;
import com.relevantcodes.extentreports.LogStatus;

public class Facility_Bulk_Upload {
	
	WebDriver driver;
	private WebDriverWait wait10;
	
		public Facility_Bulk_Upload(WebDriver driver){
			
		    this.wait10 = new WebDriverWait(driver, 40);

			this.driver=driver;		    
			PageFactory.initElements(driver, this);
		}
		
		
		String BULK_UPLOAD_URL = "https://qa.figbytes.biz/BulkUpload/BulkUpload.aspx?T=6";
		String File = "testing"; //testingTechnicalError
		String fileName = File+".xlsx";
		String filePath = Const.DOWNLOAD_PATH+"\\"+fileName;
		String exportFileName =  File+"Errors.xls";
		
		@FindBy(xpath=CommonLocators.MEGA_MENU_ADMINISTRATION)
		WebElement adminMenu;
		
		@FindBy(xpath="//ul[@class='col-sm-4 list-unstyled']//a[text()='"+Const.FACILITY_SUB_MENU+"']")
		WebElement facility;
		
		@FindBy(xpath= CommonLocators.BU_FORM_PAGINATION_ITEMS)
		WebElement paginationItems;
		
		@FindBy(xpath= CommonLocators.BULK_UPLOAD_BUTTON)
		WebElement BulkUploadButton;
		
		@FindBy(xpath= CommonLocators.BU_BROWSE_BUTTON)
		WebElement bulkUploadBrowserButton;
		
		@FindBy(xpath= CommonLocators.BU_SUBMIT_BUTTON)
		WebElement bulkUploadSubmitButton;
		
		@FindBy(xpath= CommonLocators.BU_MAPPING)
		WebElement bulkUploadMapping;
		
		@FindBy(how=How.XPATH, using = CommonLocators.BU_MAPPING_LIST)
		List<WebElement> bulkUploadMappingLIst;
		
		@FindBy(xpath= CommonLocators.BU_MAPPING_SUBMIT_BUTTON)
		WebElement BUMappingSubmitButton;
		
		//Mapping dropdown locators
		@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_gvMapping_ctl02_ddlExcelColumn']")
		WebElement facilityCodeDropdown;
		
		@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_gvMapping_ctl02_ddlExcelColumn']//option[contains(text(),'Facility Code (Col: 1)')]")
		WebElement facilityCode;
		
		@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_gvMapping_ctl03_ddlExcelColumn']")
		WebElement facilityOrSiteNameDropdown;
		
		@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_gvMapping_ctl03_ddlExcelColumn']//option[contains(text(),'Facility or Site Name (Col: 2)')]")
		WebElement facilitiesOrSiteName;
		
		@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_gvMapping_ctl04_ddlExcelColumn']")
		WebElement facilityTypeDropdown;
		
		@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_gvMapping_ctl04_ddlExcelColumn']//option[contains(text(),'Facility Type (Col: 3)')]")
		WebElement facilityType;
		
		@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_gvMapping_ctl15_ddlExcelColumn']")
		WebElement siteTypeDropdown;
		
		@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_gvMapping_ctl15_ddlExcelColumn']//option[contains(text(),'Site Type (Col: 14)')]")
		WebElement siteType;
		
		@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_gvMapping_ctl24_ddlExcelColumn']")
		WebElement tag3Dropdown;
		
		@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_gvMapping_ctl24_ddlExcelColumn']//option[contains(text(),'Tag_T3 (Col: 24)')]")
		WebElement tag3;
		
		@FindBy(how=How.XPATH, using = CommonLocators.BU_MAPPING_ROW_LIST )
		List<WebElement> mappingRowsList;
		
		@FindBy(xpath= CommonLocators.BU_HISTORY_PAGE_BUTTON)
		WebElement historyPageButton;
		
		@FindBy(xpath= CommonLocators.BU_HISTORY_PAGE_FILE_NAME )
		WebElement fileNameHistoryPage;
		
		@FindBy(xpath= CommonLocators.BU_STATUS )
		WebElement Status;
		
		@FindBy(xpath= CommonLocators.BU_HISTORY_PAGE_OVERVIEW)
		WebElement overviewHistoryPage;
	
		@FindBy(xpath= CommonLocators.BU_OVERVIEW_TOTAL_RECORDS)
		WebElement totalRecords;
		
		@FindBy(xpath= CommonLocators.BU_OVERVIEW_SAVE_RECORDS)
		WebElement saveRecords;
		
		@FindBy(xpath= CommonLocators.BU_OVERVIEW_DUPLICATE_RECORDS)
		WebElement duplicateRecords;
		
		@FindBy(xpath= CommonLocators.BU_OVERVIEW_NOT_UPLOADED_RECORDS)
		WebElement notUploadedRecords;
		
		@FindBy(xpath= CommonLocators.BU_OVERVIEW_LOCKED_RECORDS)
		WebElement lockedRecords;
		
		@FindBy(xpath= CommonLocators.BU_OVERVIEW_CLOSE_BUTTON )
		WebElement closeButton;
		
		@FindBy(xpath= CommonLocators.BU_FILE_DELETE_BUTTON)
		WebElement uploadedFileDeleteButton;
		
		@FindBy(xpath= CommonLocators.BU_EXPORT_FILE_BUTTON)
		WebElement exportFileButton;
		
		@FindBy(xpath= CommonLocators.BU_GO_TO_FORM_BUTTON)
		WebElement goToFormButton;
		
		@FindBy(xpath= CommonLocators.BU_FORM_HISTORY_BUTTON)
		WebElement bulkUploadHistoryButton;
		
		public void bulkUpload() throws InterruptedException {
			
			ReportUtils.test.log(LogStatus.INFO, "Running Facility bulkUpload method.");	
			Const.logger.info("Running Facility bulkUpload method.");
			
			CommonMethods.clickOn(adminMenu);			
			CommonMethods.clickOn(facility);
			Thread.sleep(5000);
			String items = paginationItems.getText();			
			List<String> list = new ArrayList<>(Arrays.asList(items.split("\\s",6)));
			//Const.logger.info("list: "+list);
			String getDataBeforeBulkUpload = list.get(4);
			Const.logger.info("Numbers of Facility data on page before bulk upload : " +getDataBeforeBulkUpload);
			ReportUtils.test.log(LogStatus.INFO, "Numbers of Facility data on page before bulk upload : " +getDataBeforeBulkUpload);
			
			try {
				if(this.BulkUploadButton.isDisplayed()) {
					CommonMethods.clickOn(BulkUploadButton);	
					Thread.sleep(5000);
					if(driver.getCurrentUrl().contains(BULK_UPLOAD_URL)) {
						ReportUtils.test.log(LogStatus.INFO, "Facility Bulk Upload Page exist");
						Const.logger.info("Facility Bulk Upload Page exist");
						CommonMethods.clickOn(bulkUploadBrowserButton);
						Thread.sleep(5000);
						
						// file path passed as parameter to StringSelection
					    StringSelection str = new StringSelection(filePath);
						// copying File path to Clipboard
					    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
						//Creating robot class object
						Robot rb = new Robot();
						// press Contol+V for pasting
					     rb.keyPress(KeyEvent.VK_CONTROL);
					     rb.keyPress(KeyEvent.VK_V);
					     Thread.sleep(3000);
					    // release Contol+V for pasting
					    rb.keyRelease(KeyEvent.VK_CONTROL);
					    rb.keyRelease(KeyEvent.VK_V);	
					    Thread.sleep(3000);
					    // for pressing and releasing Enter
					    rb.keyPress(KeyEvent.VK_ENTER);
					    rb.keyRelease(KeyEvent.VK_ENTER);
					    wait10.until(ExpectedConditions.visibilityOf(bulkUploadSubmitButton));
					  //  Thread.sleep(10000);
					    CommonMethods.clickOn(bulkUploadSubmitButton);
					    Thread.sleep(8000);
					    if(this.bulkUploadMapping.isDisplayed()) {
					    	CommonMethods.clickOn(BUMappingSubmitButton);
					    	Thread.sleep(5000);
					    	 if(this.bulkUploadMapping.isDisplayed()) {
					             ReportUtils.test.log(LogStatus.INFO,"Bulk upload mapping table is visible");
					             Const.logger.info("Bulk upload mapping table is visible");					    		 
					    		 this.gridMapping();
					    		 Thread.sleep(5000);
					    	 }else {
					                ReportUtils.test.log(LogStatus.INFO,"Bulk upload mapping table is not visible");
					                Const.logger.info("Bulk upload mapping table is not visible");		
					    	 }					    	 
					    	CommonMethods.AlertAccept(driver);
					    	Thread.sleep(8000);
					    	if(wait10.until(ExpectedConditions.alertIsPresent())==null) {
			                ReportUtils.test.log(LogStatus.INFO,"Alert was not present");
			                Const.logger.info("Alert was not present");					    	
					    	}else {
				                ReportUtils.test.log(LogStatus.INFO,"Alert was present");
				                Const.logger.info("Alert was present");	
						    	CommonMethods.AlertAccept(driver);
						    	Thread.sleep(5000);
//						    	this.bulkUploadError();
//						    	Thread.sleep(5000);
					    	}
					    	//newlines
					    	if(!bulkUploadMappingLIst.isEmpty()) {
					    		ReportUtils.test.log(LogStatus.INFO,"Technical error occurred.Please check sheet 'OR' contact to the administrator");
					    		Const.logger.info("Technical error occurred.Please check sheet 'OR' contact to the administrator");
					    		//what will do if technical error occured
					    	}else {
						    	this.bulkUploadError();
						    	Thread.sleep(5000);					    		
					    	}
					    	
					    	CommonMethods.clickOn(historyPageButton);
					    	Thread.sleep(5000);
					    	
							String historyPageFileName = fileNameHistoryPage.getText();
							if(fileName.equals(historyPageFileName)) {
				                ReportUtils.test.log(LogStatus.INFO,"File is uploaded successfully with status: " + Status.getText());
				                Const.logger.info("File is uploaded successfully with status: " + Status.getText());
				                if(Status.getText().equals("Completed")) {
				                	//added new for pagination
				                    CommonMethods.clickOn(overviewHistoryPage);
				                    String SaveRecords = saveRecords.getText();
				                	CommonMethods.clickOn(closeButton);
				                	
				                	CommonMethods.clickOn(goToFormButton);
				                	Thread.sleep(5000);
				        			String itemsAfterBulkUpload = paginationItems.getText();			
				        			List<String> listAfterBulkUpload = new ArrayList<>(Arrays.asList(itemsAfterBulkUpload.split("\\s",6)));
				        			//Const.logger.info("list: "+list);
				        			String getDataAfterBulkUpload = listAfterBulkUpload.get(4);
				        			Const.logger.info("Numbers of Facility data on page after bulk upload : " +getDataAfterBulkUpload);
				        			ReportUtils.test.log(LogStatus.INFO, "Numbers of Facility data on page after bulk upload : " +getDataAfterBulkUpload);
				        			
				                    Integer getDataBeforeBulkUploadInt = Integer.valueOf(getDataBeforeBulkUpload);
				                    Integer SaveRecordsInt = Integer.valueOf(SaveRecords);
				        			int beforeAndSavedRecordsData = getDataBeforeBulkUploadInt + SaveRecordsInt;
				                    String beforeAndSavedRecordsDataStr = String.valueOf(beforeAndSavedRecordsData);

				        			if(beforeAndSavedRecordsDataStr.equals(getDataAfterBulkUpload)) {
						                ReportUtils.test.log(LogStatus.INFO,"Facility data is matching, Sum of 'Before bulk upload data' and 'Saved records' : "+beforeAndSavedRecordsDataStr+" and After bulk upload: "+getDataAfterBulkUpload);
						                Const.logger.info("Facility data is matching, Sum of 'Before bulk upload data' and 'Saved records' : "+getDataBeforeBulkUpload+" and After bulk upload: "+getDataAfterBulkUpload);					        				
				        			}else {
						                ReportUtils.test.log(LogStatus.INFO,"Facility data not matched");
						                Const.logger.info("Facility data not matched");	
				        			}
				        			
				        			Thread.sleep(2000);
				        			CommonMethods.clickOn(bulkUploadHistoryButton);
				        			Thread.sleep(5000);
				                	this.historyPageOverview();	
				                	CommonMethods.clickOn(closeButton);
				                	//Export and validate file(n check error)
				                	this.exportFile();
				                	Thread.sleep(5000);
					                //Delete uploaded file from history page
					                CommonMethods.clickOn(uploadedFileDeleteButton);
					                Thread.sleep(2000);
					                CommonMethods.AlertAccept(driver);
					                Thread.sleep(5000);
					                ReportUtils.test.log(LogStatus.INFO,"Uploaded file: "+ fileName + " deleted successfully from the history page");
					                Const.logger.info("Uploaded file: "+ fileName + " deleted successfully from the history page");	
				                }else {
				                	//In case of Pending or Validating status
					                ReportUtils.test.log(LogStatus.INFO,"File uploaded status is : " + Status.getText());
					                Const.logger.info("File uploaded status is : " + Status.getText());		
					                //Delete uploaded file from history page
					                CommonMethods.clickOn(uploadedFileDeleteButton);
					                Thread.sleep(2000);
					                CommonMethods.AlertAccept(driver);
					                Thread.sleep(5000);
					                ReportUtils.test.log(LogStatus.INFO,"Uploaded file: "+ fileName + " deleted successfully from the history page");
					                Const.logger.info("Uploaded file: "+ fileName + " deleted successfully from the history page");					                
				                }
							}else {
				                ReportUtils.test.log(LogStatus.INFO,"Uploaded file is not matching with available file");
				                Const.logger.info("Uploaded file is not matching with available file");								
							}
							
							
					    	// Pending for Error and verify data status in history
					    }else {
			                ReportUtils.test.log(LogStatus.INFO,"Bulk upload mapping is not avilable");
			                Const.logger.info("Bulk upload mapping is not avilable");						    	
					    }					    
					}else {
		                ReportUtils.test.log(LogStatus.FAIL,"Selected web page: " + BULK_UPLOAD_URL + " does not exist");
		                Const.logger.info("Selected web page: " + BULK_UPLOAD_URL + " does not exist");						
					}
				}else {
		            ReportUtils.test.log(LogStatus.FAIL,"Facility Bulk Upload Button is not available");
		            Const.logger.info("Facility Bulk Upload Button is not available");					
				}
			}
			catch(Exception e){
				ReportUtils.test.log(LogStatus.FAIL,"Error in test");
	            Const.logger.info("Error in test " + e.toString());
			}
		
		}
		//upload blank sheet (will give technical error)
		//Upload multiple sheet in one go(like we will put file in folder with 10/50/500 records and put
		//the sheet name in one excel then pull all these excels using excxel sheet name
		public void bulkUploadError() {
			
			if(!mappingRowsList.isEmpty()) {	
	            ReportUtils.test.log(LogStatus.ERROR,"Bulk upload error exist");
	            Const.logger.info("Bulk upload error exist");				
			}
			else {
	            ReportUtils.test.log(LogStatus.INFO,"Bulk upload file uploaded successfully");
	            Const.logger.info("Bulk upload file uploaded successfully");					
			}			
		}
		
		public void historyPageOverview() throws InterruptedException {
			
            CommonMethods.clickOn(overviewHistoryPage);
            
            String TotalRecords = totalRecords.getText();
            String SaveRecords = saveRecords.getText();
            Integer SaveRecordsInt = Integer.valueOf(SaveRecords);
            String DuplicateRecords = duplicateRecords.getText();
            Integer DuplicateRecordsInt = Integer.valueOf(DuplicateRecords);           
            String NotUploadedRecords = notUploadedRecords.getText();
            Integer NotUploadedRecordsInt = Integer.valueOf(NotUploadedRecords);            
            String LockedRecords = lockedRecords.getText();
            Integer LockedRecordsInt = Integer.valueOf(LockedRecords);            
            int AllRecordsSum = SaveRecordsInt + DuplicateRecordsInt + NotUploadedRecordsInt + LockedRecordsInt;
            
            ReportUtils.test.log(LogStatus.INFO,"Overview display records :- " +"\n" + "1. Total records : " +TotalRecords+ "\n" + "2. Save records : " +SaveRecordsInt+ "\n" 
            		+ "3. Duplicate records : " +DuplicateRecordsInt+ "\n" + "4. Not Uploaded records : " +NotUploadedRecordsInt+ "\n" 
            		+ "5. Locked records : " +LockedRecordsInt);
            Const.logger.info("Overview display records :- " +"\n" + "1. Total records : " +TotalRecords+ "\n" + "2. Save records : " +SaveRecordsInt+ "\n" 
            		+ "3. Duplicate records : " +DuplicateRecordsInt+ "\n" + "4. Not Uploaded records : " +NotUploadedRecordsInt+ "\n" 
            		+ "5. Locked records : " +LockedRecordsInt);                
            
            ReportUtils.test.log(LogStatus.INFO,"All records :" +AllRecordsSum);
            Const.logger.info("All records :" +AllRecordsSum);	
            
            String AllRecordsSumStr = String.valueOf(AllRecordsSum);
            Thread.sleep(5000);
            if(TotalRecords.equals(AllRecordsSumStr)) {
		            ReportUtils.test.log(LogStatus.INFO,"Overview display records are correct.");
		            Const.logger.info("Overview display records are correct.");	
                }else {
		            ReportUtils.test.log(LogStatus.INFO,"Overview display records are incorrect.");
		            Const.logger.info("Overview display records are incorrect.");					                	
                }	
		}
		
		public void exportFile() throws InterruptedException {
			
		try {
			CommonMethods.clickOn(exportFileButton);
			Thread.sleep(20000);
			File fileLocation = new File (Const.DOWNLOAD_PATH);
			File[] totalFiles = fileLocation.listFiles();
			for(File file : totalFiles) {
				if(file.getName().equals(exportFileName)) {
					ReportUtils.test.log(LogStatus.PASS, "Exported File downloaded successfully : "+ file.getName());
					Const.logger.info("Exported File downloaded successfully : "+ file.getName()); 							
					Thread.sleep(5000);						
			        file.delete();
	                ReportUtils.test.log(LogStatus.PASS,"File deleted successfully "+ file.getName());
	                Const.logger.info("File deleted successfully "+ file.getName());					        
					break;
						}}
			}catch(Exception e) {
                ReportUtils.test.log(LogStatus.INFO,"Error in export file "+ e.toString());
                Const.logger.info("Error in export file "+ e.toString());
			}
		}
		
			public void gridMapping() throws InterruptedException {
				
		   		 //Mapping the grid
		   		 CommonMethods.clickOn(facilityCodeDropdown);
		   		 CommonMethods.clickOn(facilityCode);
		   		 CommonMethods.clickOn(facilityOrSiteNameDropdown);
		   		 CommonMethods.clickOn(facilitiesOrSiteName);
		   		 CommonMethods.clickOn(facilityTypeDropdown);
		   		 CommonMethods.clickOn(facilityType);
		   		 CommonMethods.scrollTo(driver, siteTypeDropdown);
		   		 CommonMethods.clickOn(siteTypeDropdown);
		   		 CommonMethods.clickOn(siteType);
		   		 CommonMethods.scrollTo(driver, tag3Dropdown);
		   		 CommonMethods.clickOn(tag3Dropdown);
		   		 CommonMethods.clickOn(tag3);
		   		 Thread.sleep(3000);					    		 
		   		 CommonMethods.clickOn(BUMappingSubmitButton);
	   		 
			}
}
