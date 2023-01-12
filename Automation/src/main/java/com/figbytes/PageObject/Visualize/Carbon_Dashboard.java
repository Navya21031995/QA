package com.figbytes.PageObject.Visualize;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.figbytes.PageObject.CommonLocators;
import com.figbytes.Test.BaseClass;
import com.figbytes.Utilities.Const;

public class Carbon_Dashboard {
	
	WebDriver driver;
	JavascriptExecutor executor;
	private WebDriverWait wait40;
	SoftAssert Assert;

		public Carbon_Dashboard(WebDriver driver){
			//JavascriptExecutor executor = (JavascriptExecutor)BaseClass.driver;

			this.executor = (JavascriptExecutor)BaseClass.driver;

		    this.wait40 = new WebDriverWait(driver, 40);
		    this.Assert = new SoftAssert();

			this.driver=driver;		    
			PageFactory.initElements(driver, this);
		}
		

		@FindBy(xpath=CommonLocators.MEGA_MENU_VISUALIZE)
		WebElement visualizeMenu;
		
		@FindBy(xpath="//ul[@class='col-sm-4 list-unstyled']//a[text()='"+Const.CARBON_DASHBOARD_SUB_MENU+"']")
		WebElement CarbonDashboard;
		
		

}
