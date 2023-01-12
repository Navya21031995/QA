package com.figbytes.Utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Const {
	//Created logger instance that we can maintain the logs into html file
	public static final Logger logger = LogManager.getLogger();
	public static final String BASE_PATH = System.getProperty("user.dir");
	public static final String URL ="https://qa.figbytes.biz/";
	
	public static final String CHROME_DRIVER = "webdriver.chrome.driver";
	public static final String CHROME_DRIVER_PATH = BASE_PATH+"\\Drivers\\chromedriver.exe";
	public static final String FIREFOX_DRIVER = "webdriver.gecko.driver";
	public static final String FIREFOX_DRIVER_PATH = BASE_PATH+"\\Drivers\\geckodriver.exe";
	public static final String EDGE_DRIVER = "webdriver.edge.driver";
	public static final String EDGE_DRIVER_PATH = BASE_PATH+"\\Drivers\\msedgedriver.exe";
	public static final String EXCEL_PATH = BASE_PATH+ "\\Excels\\TestData.xlsx";
		
	//Extent report path
	public static final String Extent_Report_Path = BASE_PATH +"\\Reports";
	//Download path
	public static final String DOWNLOAD_PATH = "C:\\Users\\Admin\\Downloads";
	
	//Initialize for email :
	public static final String SEND_FROM = "abc@gmail.com";
	public static final String EMAIL_PASS = "123";
	public static final String SEND_TO = "chaudhary.vaishalichaudhary@gmail.com";
	
	//Initialize main menus
	public static final String VISUALIZE_MENU = "Visualize";
	public static final String DATA_MENU = "Data";	
	public static final String ADMINISTRATION_MENU = "Administration";
	public static final String MASTER_MENU = "Master";

	//Initialize sub-menus
	public static final String WASTE_SUB_MENU = "Waste";
	public static final String WASTE_WATER_SUB_MENU = "Waste Water";
	public static final String CHILLED_WATER_SUB_MENU = "Chilled Water";
	public static final String CO_GENERATION_SUB_MENU = "Co-Generation";
	public static final String ELECTRICITY_SUB_MENU = "Electricity";
	public static final String HEAT_SUB_MENU = "Heat";
	public static final String STEAM_SUB_MENU = "Steam";
	public static final String ROAD_SUB_MENU = "Road";
	public static final String AIR_SUB_MENU = "Air";
	public static final String PUBLIC_SUB_MENU = "Public";
	public static final String AIR_TRANSPORT_BY_FUEL_SUB_MENU = "Air Transport(By Fuel)";
	public static final String AIR_FREIGHT_SUB_MENU = "Air Freight";
	public static final String RAIL_SUB_MENU = "Rail";
	public static final String WATERBORNE_SUB_MENU = "Waterborne";
	public static final String CONSUMPTION_SUB_MENU = "Consumption";
	public static final String PRODUCT_AND_SERVICES_SUB_MENU = "Product & Services";
	public static final String MISCELLANEOUS_SUB_MENU = "Miscellaneous";
	public static final String SOCIAL_SUB_MENU = "Variable Data";
	public static final String OPERATIONAL_SUB_MENU = "Variable Data";
	public static final String LIVESTOCK_SUB_MENU = "Livestock";
	public static final String FORESTRY_SUB_MENU = "Forestry";
	public static final String CROPS_SUB_MENU = "Crops";
	public static final String LAND_USE_SUB_MENU = "Land Use";
	public static final String MATERIALS_USED_SUB_MENU = "Materials Used";
	public static final String REFRIGERANTS_HALOCARBONS_SUB_MENU = "Refrigerants/Halocarbons";
	public static final String FERTILIZERS_USE_SUB_MENU = "Fertilizers Use";
	public static final String SF6_SUB_MENU = "SF6";
	public static final String END_OF_LIFE_SUB_MENU = "End of Life";
	public static final String VOCS_SUB_MENU = "VOCs";
	public static final String CARBON_DASHBOARD_SUB_MENU = "Carbon Dashboard";


	
	//Initialize admin sub-menu
	public static final String FACILITY_SUB_MENU = "Facility";
	public static final String VARIABLES_SUB_MENU = "Variables";
	
	//Initialize hub,facility,variable creation 
//	public static final String SELECT_HUB = "New Hub";
//	public static final String SELECT_FACILITY = "New Facilities";
//	public static final String SELECT_SITE = " New Site";
//	public static final String SELECT_SITE_TYPE = "Auto Site";
//	public static final String SELECT_CREDIBLE_DATA_YEAR = "2022";
	public static final String ADMIN_FILTER_BUTTON ="Filter";
	public static final String SELECT_DATE_WISE = "Date Wise";	
	
	public static final String ASSET_ERROR_MESSAGE = "This combination already exists.";
	
	//Initialize Excel sheets
	public static final String EXCEL_WORKBOOK = "EnergyDataEntry.xlsx";
	public static final String EXCEL_WASTE_WORKBOOK = "WasteTestData.xlsx";
	public static final String EXCEL_TRANSPORT_WORKBOOK = "Transport.xlsx";
	public static final String EXCEL_VARIABLES_WORKBOOK = "VariablesTestData.xlsx";
	public static final String EXCEL_SOCIAL_OPERATIONAL_WORKBOOK = "SocialOperationalTestData.xlsx";
	public static final String EXCEL_AGRICULTURE_WORKBOOK= "Agriculture.xlsx";
	public static final String EXCEL_NON_FUEL_IMPACTS_WORKBOOK = "NonFuelImpacts.xlsx";
	public static final String EXCEL_UPDATE_WORKBOOK = "UpdateDataEntry.xlsx";


	public static final String LOGIN_SHEET = "loginPage";
	public static final String CONTRIBUTOR_LOGIN_SHEET = "contributorloginPage";
	public static final String HUB_SHEET = "Hub";
	public static final String FACILITY_SHEET = "Facility";
	public static final String SITE_SHEET = "Site";
	public static final String SOCIAL_SHEET = "SocialVariableData";
	public static final String OPERATIONAL_SHEET = "OperatioanlVariableData";
	public static final String WASTE_SHEET = "waste";
	public static final String WASTE_WATER_SHEET = "wasteWater";
	public static final String CHILLED_WATER_SHEET = "chilledWater";
	public static final String COGENERATION_SHEET = "coGeneration";
	public static final String ELECTRICITY_SHEET = "electricity";
	public static final String HEAT_SHEET = "heat";
	public static final String STEAM_SHEET = "steam";
	public static final String ROAD_SHEET = "Road";
	public static final String AIR_SHEET = "Air";
	public static final String PUBLIC_SHEET = "Public";
	public static final String RAIL_SHEET = "Rail";
	public static final String WATERBORNE_SHEET = "Waterborne";
	public static final String AIR_FREIGHT_SHEET = "Air Freight";
	public static final String AIR_TRANSPORT_BY_FUEL_SHEET = "Air Transport By Fuel";	
	public static final String CONSUMPTION_SHEET = "Consumption";
	public static final String PRODUCT_AND_SERVICES_SHEET ="Product and Services";
	public static final String MISCELLANEOUS_SHEET = "Miscellaneous";
	public static final String LIVESTOCK_SHEET = "Livestock";
	public static final String FORESTRY_SHEET = "Forestry";
	public static final String CROPS_SHEET = "Crops";
	public static final String LAND_USE_SHEET = "Land Use";
	public static final String MATERIALS_USED_SHEET = "Materials Used";
	public static final String REFRIGERANTS_HALOCARBONS_SHEET = "Refrigerants Or Halocarbons";
	public static final String FERTILIZERS_USE_SHEET = "Fertilizers Use";
	public static final String SF6_SHEET = "SF6";
	public static final String END_OF_LIFE_SHEET = "End of Life";
	public static final String VOCS_SHEET = "VOCs";
	
	//data update sheet
	public static final String ELECTRICITY_UPDATE_SHEET = "electricity";
	public static final String CHILLED_WATER_UPDATE_SHEET = "chilledWater";
	public static final String COGENERATION_UPDATE_SHEET = "coGeneration";
	public static final String HEAT_UPDATE_SHEET = "heat";
	public static final String STEAM_UPDATE_SHEET = "steam";
	public static final String WASTE_UPDATE_SHEET = "waste";
	public static final String WASTE_WATER_UPDATE_SHEET = "wasteWater";
	public static final String CONSUMPTION_UPDATE_SHEET = "Consumption";
	public static final String PRODUCT_AND_SERVICES_UPDATE_SHEET ="Product and Services";
	public static final String MISCELLANEOUS_UPDATE_SHEET = "Miscellaneous";
	public static final String SOCIAL_UPDATE_SHEET = "SocialVariableData";
	public static final String OPERATIONAL_UPDATE_SHEET = "OperatioanlVariableData";
	public static final String ROAD_UPDATE_SHEET = "Road";
	public static final String AIR_UPDATE_SHEET = "Air";
	public static final String PUBLIC_UPDATE_SHEET = "Public";
	public static final String RAIL_UPDATE_SHEET = "Rail";
	public static final String WATERBORNE_UPDATE_SHEET = "Waterborne";
	public static final String AIR_FREIGHT_UPDATE_SHEET = "Air Freight";
	public static final String AIR_TRANSPORT_BY_FUEL_UPDATE_SHEET = "Air Transport By Fuel";
	public static final String LIVESTOCK_UPDATE_SHEET = "Livestock";
	public static final String FORESTRY_UPDATE_SHEET = "Forestry";
	public static final String CROPS_UPDATE_SHEET = "Crops";
	public static final String LAND_USE_UPDATE_SHEET = "Land Use";
	public static final String MATERIALS_USED_UPDATE_SHEET = "Materials Used";
	public static final String REFRIGERANTS_HALOCARBONS_UPDATE_SHEET = "Refrigerants Or Halocarbons";
	public static final String FERTILIZERS_USE_UPDATE_SHEET = "Fertilizers Use";
	public static final String SF6_UPDATE_SHEET = "SF6";
	public static final String END_OF_LIFE_UPDATE_SHEET = "End of Life";
	public static final String VOCS_UPDATE_SHEET = "VOCs";
	

	//Variable Sheets
	public static final String ALL_VARIABLES_SHEET = "Variables";
	public static final String SOCIAL_VARIABLE_SHEET = "SocialVariable";
	public static final String HEALTHY_AND_SAFETY_VARIABLE_SHEET = "HealthNSafetyVariable";
	public static final String OPERATIONAL_VARIABLE_SHEET = "OperationalVariable";
	//Environment variable sheets
	public static final String WATERBORNE_VARIABLE_SHEET = "Waterborne";
	public static final String AIR_VARIABLE_SHEET = "Air";
	public static final String AIR_BY_FUEL_VARIABLE_SHEET = "Air By Fuel";
	public static final String RAIL_VARIABLE_SHEET = "Rail";
	public static final String PUBLIC_VARIABLE_SHEET = "Public";
	public static final String ROAD_VARIABLE_SHEET = "Road";
	public static final String WASTE_VARIABLE_SHEET = "Waste";
	public static final String WASTE_WATER_VARIABLE_SHEET = "Waste Water";
	public static final String CONSUMPTION_VARIABLE_SHEET = "Consumption";
	public static final String STEAM_VARIABLE_SHEET = "Steam";
	public static final String HEAT_VARIABLE_SHEET = "Heat";
	public static final String COGENERATION_VARIABLE_SHEET = "CoGeneration";
	public static final String PRODUCT_AND_SERVICES_VARIABLE_SHEET = "Product and Services";
	public static final String MISCELLANEOUS_VARIABLE_SHEET = "Miscellaneous";
	public static final String CHILLED_WATER_VARIABLE_SHEET = "Chilled Water";
	public static final String ELECTRICITY_VARIABLE_SHEET = "Electricity";
	public static final String LIVESTOCK_VARIABLE_SHEET = "Livestock";
	public static final String FORESTRY_VARIABLE_SHEET = "Forestry";
	public static final String CROPS_VARIABLE_SHEET = "Crops";
	public static final String LAND_USE_VARIABLE_SHEET = "Land Use";
	public static final String MATERIALS_USED_VARIABLE_SHEET = "Materials Used";
	public static final String REFRIGERANTS_HALOCARBONS_VARIABLE_SHEET = "Refrigerants Or Halocarbons";
	public static final String FERTILIZERS_USE_VARIABLE_SHEET = "Fertilizers Use";
	public static final String SF6_VARIABLE_SHEET = "SF6";
	public static final String END_OF_LIFE_VARIABLE_SHEET = "End of Life";
	public static final String VOCS_VARIABLE_SHEET = "VOCs";



	
	
}
