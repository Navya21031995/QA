package com.figbytes.PageObject;

import com.figbytes.Utilities.Const;

public class CommonLocators {
	
	//Menu locators
	public static final String MEGA_MENU_VISUALIZE ="//li[@class='dropdown']//a[@class='dropdown-toggle'][text()='"+Const.VISUALIZE_MENU+"']";
	public static final String MEGA_MENU_DATA ="//li[@class='dropdown']//a[@class='dropdown-toggle'][text()='"+Const.DATA_MENU+"']";
	public static final String MEGA_MENU_ADMINISTRATION ="//li[@class='dropdown']//a[@class='dropdown-toggle'][text()='"+Const.ADMINISTRATION_MENU+"']";
	public static final String MEGA_MENU_MASTER ="//li[@class='dropdown']//a[@class='dropdown-toggle'][text()='"+Const.MASTER_MENU+"']";
	//Alert pop-up locator
	public static final String ALERT_POP_UP_MESSAGE = "dialog-content-inner";
	public static final String ALERT_POP_UP_BUTTON = "dialog-button";
	public static final String ERROR_MESSAGE = "//span[@class='help-block errormsg']";

	
	// Data Section
	public static final String DATA_APPROVAL_BUTTON = "//a[text()='Data Approval(Admin)']";
	public static final String PENDING_FILTER_BUTTON ="//select[@id='ddlDisplayType']";
	public static final String APPROVE_BUTTON ="//button[text()='Approve']";
	public static final String REJECT_BUTTON ="//button[text()='Reject']";
	public static final String OK_BUTTON ="dialog-button";
	
	public static final String SELECTALL_CHECKBOX ="checkAll";
	


	
	//Administration Common Locators
	public static final String FILTER_ICON = "//a[contains(@class,'k-grid-filter')]";
	public static final String FILTER_TEXT_BOX = "//div[@class='k-animation-container'][contains(@style,'display: block')]//input[@class='k-textbox'][1]";
	public static final String SEARCH_FILTER_BUTTON = "//div[@class='k-animation-container'][contains(@style,'display: block')]//button[text()='"+Const.ADMIN_FILTER_BUTTON+"']";
	//Bulk Upload Locators
	public static final String BULK_UPLOAD_BUTTON = "//a[contains(@id,'_aBulkUpload')][@data-original-title='Bulk Upload']";
	public static final String DOWNLOAD_SAMPLE_FILE_BUTTON = "//i[@class='fa fa-download'][@data-original-title='Download Sample file.']";
	public static final String DOWNLOAD_GRID_FILE_BUTTON = "//a[@id='aDownloadData']";
	public static final String BU_SUBMIT_BUTTON = "//input[contains(@id,'_btnUpload')][@value='Upload']";
	public static final String BU_BROWSE_BUTTON = "//button[contains(text(),'Browse')]";	
	public static final String BU_MAPPING = "//table[contains(@class,'tablecss customScroll')]";	
	public static final String BU_MAPPING_SUBMIT_BUTTON = "//div[contains(@class,'col-md-10')]//input[@type='submit'][@value='Submit']";		
	public static final String BU_MAPPING_LIST = "//table[contains(@class,'tablecss customScroll')]//tr";	
	public static final String BU_MAPPING_ROW_LIST = "//div[@id='container']//tr";	
	public static final String BU_HISTORY_PAGE_BUTTON = "//a[contains(@id,'_lnkHistory')]//i[@data-original-title='History Page']";	
	public static final String BU_HISTORY_PAGE_FILE_NAME = "//table[contains(@id,'_gvIssueData')]//tr[2]//td[1]";	
	public static final String BU_STATUS = "//table[contains(@id,'_gvIssueData')]//tr[2]//td[6]";	
	public static final String BU_HISTORY_PAGE_OVERVIEW = "//table[contains(@id,'_gvIssueData')]//tr[2]//td[8]";	
	public static final String BU_OVERVIEW_TOTAL_RECORDS = "//span[contains(@id,'_lblTotalRecords')]";	
	public static final String BU_OVERVIEW_SAVE_RECORDS = "//span[contains(@id,'_lblSavedRecords')]";	
	public static final String BU_OVERVIEW_DUPLICATE_RECORDS = "//span[contains(@id,'_lblDuplicateRecords')]";	
	public static final String BU_OVERVIEW_NOT_UPLOADED_RECORDS = "//span[contains(@id,'_lblNotUploadedRecords')]";	
	public static final String BU_OVERVIEW_LOCKED_RECORDS = "//span[contains(@id,'_lblLockedRecords')]";	
	public static final String BU_OVERVIEW_CLOSE_BUTTON = "//button[@class='btn btn-primary'][contains(text(),'Close')]";	
	public static final String BU_FILE_DELETE_BUTTON = "//table[contains(@id,'_gvIssueData')]//tr[2]//a[contains(@id,'_lnkbtnDelete')]";	
	public static final String BU_EXPORT_FILE_BUTTON = "//table[contains(@id,'_gvIssueData')]//tr[2]//a[contains(@id,'_lnkbtnExport')]";	
	public static final String BU_GO_TO_FORM_BUTTON = "//a[contains(@id,'_lnkBack')]";	
	public static final String BU_FORM_HISTORY_BUTTON = "//a[contains(@id,'_aBulkUploadHistory')]";	
	public static final String BU_FORM_PAGINATION_ITEMS = "//span[contains(text(),' items')]";	

	//Right Icon Locators
	public static final String ADD_ASSET = "assetBtn";
	public static final String DATA_ENTRY = "btnEnteredData";

	//Unique locators for Add Asset(Measurement Unit,General Tab,variable dropdown, ef list, etc) 
	public static final String ADD_ASSET_GENERAL_TAB = "//li[@class='clsGTab clsTab active']";
	public static final String ADD_ASSET_FACILITY_GEAR_ICON = "ShowFacility";
	public static final String ADD_ASSET_FACILITY_SEARCH_BOX = "//input[@id='txtFacilitySearch']";
	public static final String ADD_ASSET_FACILITY = "UlFacilityList";
	public static final String ADD_ASSET_OK_BUTTON = "btnFacilityTreeOk";
	public static final String ADD_ASSET_ACTIVITY_DROPDOWN = "ddlActivities";
	public static final String ADD_ASSET_FUEL_SUB_TYPE_DROPDOWN = "ddlGrids"; 
	public static final String ADD_ASSET_VARIABLE_DROPDOWN = "//button[@class='multiselect dropdown-toggle btn btn-default']";
	public static final String ADD_ASSET_SEARCH_VARIABLE = "//input[@class='form-control multiselect-search'][@placeholder='Search']";
	public static final String ADD_ASSET_VARIABLE_LIST = "//ul//li//a//label";
	public static final String ADD_ASSET_MEASUREMENT_UNIT = "ddlUnits";
	public static final String ADD_ASSET_EF_FROM_LIST_BUTTON = "EFBtn";
	public static final String ADD_ASSET_SELECT_EF = "//div[@class='k-grid-content']//tr[1]//input[contains(@id,'radSelect_')]";
	public static final String ADD_ASSET_SAVE_BUTTON = "btnSaveAsset";
	public static final String ADD_ASSET_CANCEL_BUTTON = "btnCancelAsset";
	public static final String ADD_ASSET_ERROR_MESSAGE = "//span[contains(text(),'"+Const.ASSET_ERROR_MESSAGE+"')]";
	public static final String ADD_ASSET_DROPDOWN_1 = "ddldropdown1";
	public static final String ADD_ASSET_DROPDOWN_2 = "ddldropdown2";
	public static final String ADD_ASSET_DROPDOWN_3 = "ddldropdown3";

	//Data Entry Filter Common Locators
	public static final String ACTIVITY_DROPDOWN = "ddlActivityBase";
	public static final String FUEL_TYPE_DROPDOWN = "//select[contains(@id,'ddlFilter_')]";
	public static final String HUB_DROPDOWN = "ddlHub";
	public static final String FACILITY_DROPDOWN = "ddlFacility";
	public static final String SITE_DROPDOWN = "ddlSiteFilter";
	public static final String GO_BUTTON = "btnGo";
	public static final String CATEGORY_DROPDOWN_1 = "//select[contains(@id,'ddlFilter_')][1]";
	public static final String CATEGORY_DROPDOWN_2 = "//select[contains(@id,'ddlFilter_')][2]";
	public static final String CATEGORY_DROPDOWN_3 = "//select[contains(@id,'ddlFilter_')][3]";
	public static final String CATEGORY_DROPDOWN_4 = "//select[contains(@id,'ddlFilter_')][4]";

	//Delete data common locators
	public static final String DELETE_CONFIRMATION_MESSAGE = "//div[contains(@id,'jconfirm-box')]";
	public static final String DELETE_CONFIRM_BUTTON = "//div[@class='jconfirm-buttons']//button[contains(text(),'Confirm')]";
	public static final String DELETE_CANCEL_BUTTON = "//div[@class='jconfirm-buttons']//button[contains(text(),'Cancel')]";
	public static final String ASSET_DELETE_BUTTON = "btnDeleteAllAsset";
	
	//Energy Add/Edit date from, date to, data quantity, notes, save button, alert message ,alert pop-up locators
	public static final String DATE_FROM_TEXT_BOX = "//div[@id='tblDataAdd']//tr[1]/td//input[contains(@id,'txtDateFrom_')]";
	public static final String DATE_TO_TEXT_BOX = "//div[@id='tblDataAdd']//tr[1]/td//input[contains(@id,'txtDateTo_')]";
	public static final String QUANTITY_TEXT_BOX = "//div[@id='tblDataAdd']//tr[1]/td//input[contains(@id,'txtQuantity_')]";
	public static final String NOTES_TEXT_BOX = "//div[@id='tblDataAdd']//tr[1]/td//input[@id[contains(.,'txtNotes')]]";
	public static final String SAVE_BUTTON = "//div[@id='tblDataAdd']//tr[1]/td//i[contains(@id,'btnSave_')]";
	public static final String ASSET_DELETE_CHECKBOX = "//div[@id='tblDataAdd']//tr[1]/td//label[contains(@for,'chkAllDeleteAsset_')]";
	public static final String ENTERED_DATE_FROM = "//div[@id='tblDataShow']//tr[1]/td//label[@id[contains(.,'lblDateFromEdit')]]";
	public static final String ENTERED_DATE_TO = "//div[@id='tblDataShow']//tr[1]/td//label[@id[contains(.,'lblDateToEdit')]]";
	public static final String ENTERED_QUANTITY = "//div[@id='tblDataShow']//tr[1]/td//label[@id[contains(.,'lblQuantityEdit')]]";
	public static final String EDIT_BUTTON = "//div[@id='tblDataShow']//tr[1]/td//i[contains(@id,'btnEdit_')]";
	public static final String EDIT_QUANTITY_TEXT_BOX = "//div[@id='tblDataShow']//tr[1]/td//input[contains(@id,'txtQuantityEdit_')]";
	public static final String EDIT_NOTES_TEXT_BOX = "//div[@id='tblDataShow']//tr[1]/td//input[@id[contains(.,'txtNotesEdit_')]]";
	public static final String EDIT_SAVE_BUTTON = "//div[@id='tblDataShow']//tr[1]/td//i[contains(@id,'btnEditSave_')]";
	public static final String ARCHIVE_CHECKBOX = "//div[@id='tblDataShow']//tr[1]/td//label[contains(@for,'chkAllArchive_')]";
	public static final String SHOW_DATA_DELETE_CHECKBOX = "//div[@id='tblDataShow']//tr[1]/td//label[contains(@for,'chkAllDelete_')]";
	public static final String DELETE_ALL_BUTTON = "btnDeleteAll";
	public static final String DATA_ENTRY_VARIABLE_FILTER = "//div[@id='tblDataAdd']//table//th[8]//a[@class='k-grid-filter']";
	public static final String DATA_SHOW_VARIABLE_FILTER = "//div[@id='tblDataShow']//table//th[7]//a[@class='k-grid-filter']";
	public static final String DATE_FROM_FILTER = "//div[@id='tblDataShow']//table//th[10]//a[@class='k-grid-filter']";
	public static final String DATE_TO_FILTER = "//div[@id='tblDataShow']//table//th[11]//a[@class='k-grid-filter']";
	public static final String DATE_FILTER_TEXT_BOX= "//div[@class='k-animation-container'][contains(@style,'display: block')]//form//input[@class='k-input' and @data-bind='value:filters[0].value']";
	//DO NOT REMOVE DATA FROM THIS LOCATOR
	public static final String DATA_ADD_ENTERED_AT = "//div[@id='tblDataAdd']//table//th[4]//a[@class='k-grid-filter']";
	public static final String EXPECTED_ASSET_VARIABLE = "//div[@id='tblDataAdd']//tr[1]//td//a[@class='clsInputControl']";
	public static final String DATA_ADD_TABLE = "//div[@id='tblDataAdd']//tr//td[8]";
	public static final String DATA_SHOW_TABLE ="//div[@id='tblDataShow']//tr//td[8]" ;
	public static final String DATA_SHOW_ENTERED_AT = "//div[@id='tblDataShow']//table//th[4]//a[@class='k-grid-filter']";	

	//Transport add/edit date from,date to,data quantity,notes,save button
	public static final String TRANSPORT_DATE_FROM_TEXT_BOX = "//div[@id='tblDataAddTranport']//tr[1]/td//input[contains(@id,'txtDateFrom_')]";
	public static final String TRANSPORT_DATE_TO_TEXT_BOX = "//div[@id='tblDataAddTranport']//tr[1]/td//input[contains(@id,'txtDateTo_')]";
	public static final String TRANSPORT_QUANTITY_TEXT_BOX = "//div[@id='tblDataAddTranport']//tr[1]/td//input[contains(@id,'txtQuantity_')]";
	public static final String TRANSPORT_NOTES_TEXT_BOX = "//div[@id='tblDataAddTranport']//tr[1]/td//input[@id[contains(.,'txtNotes')]]";
	public static final String TRANSPORT_SAVE_BUTTON= "//div[@id='tblDataAddTranport']//tr[1]/td//i[contains(@id,'btnSave_')]";
	public static final String TRANSPORT_ASSET_DELETE_CHECKBOX = "//div[@id='tblDataAddTranport']//tr[1]/td//label[contains(@for,'chkAllDeleteAsset_')]";
	public static final String TRANSPORT_DATA_ADD_ENTERED_AT = "//div[@id='tblDataAddTranport']//table//th[5]//a[@class='k-grid-filter']";
	public static final String TRANSPORT_DATA_ENTRY_VARIABLE_FILTER = "//div[@id='tblDataAddTranport']//table//th[7]//a[@class='k-grid-filter']";
	public static final String TRANSPORT_EXPECTED_ASSET_VARIABLE = "//div[@id='tblDataAddTranport']//tr[1]//td//a[@class='clsInputControl']";
	public static final String TRANSPORT_DATA_ADD_TABLE = "//div[@id='tblDataAddTranport']//tr//td[7]";
	public static final String TRANSPORT_ENTERED_DATE_FROM = "//div[@id='tblDataShowTransport']//tr[1]/td//label[@id[contains(.,'lblDateFromEdit')]]";
	public static final String TRANSPORT_ENTERED_DATE_TO = "//div[@id='tblDataShowTransport']//tr[1]/td//label[@id[contains(.,'lblDateToEdit')]]";
	public static final String TRANSPORT_ENTERED_QUANTITY = "//div[@id='tblDataShowTransport']//tr[1]/td//label[@id[contains(.,'lblQuantityEdit')]]";
	public static final String TRANSPORT_EDIT_BUTTON = "//div[@id='tblDataShowTransport']//tr[1]/td//i[contains(@id,'btnEdit_')]";
	public static final String TRANSPORT_EDIT_QUANTITY_TEXT_BOX = " //div[@id='tblDataShowTransport']//tr[1]/td//input[contains(@id,'txtQuantityEdit_')]";
	public static final String TRANSPORT_EDIT_NOTES_TEXT_BOX = "//div[@id='tblDataShowTransport']//tr[1]/td//input[@id[contains(.,'txtNotesEdit_')]]";
	public static final String TRANSPORT_EDIT_SAVE_BUTTON = "//div[@id='tblDataShowTransport']//tr[1]/td//i[contains(@id,'btnEditSave_')]";
	public static final String TRANSPORT_ARCHIVE_CHECKBOX = "//div[@id='tblDataShowTransport']//tr[1]/td//label[contains(@for,'chkAllArchive_')]";
	public static final String TRANSPORT_SHOW_DATA_DELETE_CHECKBOX = "//div[@id='tblDataShowTransport']//tr[1]/td//label[contains(@for,'chkAllDelete_')]";
	public static final String TRANSPORT_DATA_SHOW_VARIABLE_FILTER = "//div[@id='tblDataShowTransport']//table//th[7]//a[@class='k-grid-filter']";
	public static final String TRANSPORT_DATE_FROM_FILTER = "//div[@id='tblDataShowTransport']//table//th[11]//a[@class='k-grid-filter']";
	public static final String TRANSPORT_DATE_TO_FILTER = "//div[@id='tblDataShowTransport']//table//th[12]//a[@class='k-grid-filter']";
	public static final String TRANSPORT_DATA_SHOW_TABLE ="//div[@id='tblDataShowTransport']//tr//td[7]" ;
	public static final String TRANSPORT_DATA_SHOW_ENTERED_AT = "//div[@id='tblDataShowTransport']//table//th[5]//a[@class='k-grid-filter']";	

	//Navya
	public static final String TABLE_TO_BE_DISPLAYED = "//div[@class='tableGrid table-responsive']";	
	
	//Contributor App
	public static final String CONTRIBUTOR_TO_DATE = "//input[contains(@id,'txtDateTo_')]";	
	public static final String CONTRIBUTOR_FROM_DATE = "//input[contains(@id,'txtDateFrom_')]";	
	public static final String CONTRIBUTOR_QUANTITY = "//input[contains(@id,'txtQuantity')]";	
	public static final String CONTRIBUTOR_SAVE_BUTTON = "//*[contains(@id,'btnSubmit')]";	


	public static final String CONTRIBUTOR_UPDATE_BUTTON = "//div[@id='dvData']//*[@id='btnUpdate']";	
	public static final String CONTRIBUTOR_UNIT_DROPDOWN = "//select[@id='ddlUnitName']";	
	public static final String CONTRIBUTOR_QTY_TEXTBOX = "//input[@id='txtQuantity']";	


	

	
}
