package com.figbytes.Test;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.figbytes.Utilities.BrowserUtils;
import com.figbytes.Utilities.CommonMethods;
import com.figbytes.Utilities.Const;
import com.figbytes.Utilities.EmailUtils;
import com.figbytes.Utilities.ReadProperties;

public class BaseClass {

	 public static WebDriver driver;
		
		public static Map<String,String> env;
				
		@Parameters("browserName")
		@BeforeSuite(alwaysRun = true)
		public void beforeSuite(String browser){
						
			
			//Calling browser from environment file
			Const.logger.info("<><><><><> Before suite<><><><><>");
		//	env = ReadProperties.getEnvVar("Environment.properties");
		//	Const.logger.info(env.get("URL"));
	
			Const.logger.info("Opening the Browser");

			//driver = BrowserUtils.invokeBrowser(driver, env.get("browser"), env.get("os"));
			driver = BrowserUtils.invokeBrowser(driver, browser);
			Const.logger.info("Driver is running :-  " + driver);
			Const.logger.info("Browser is running :-  " + browser);

			//driver.manage().window().maximize();
			
			//Deleting all the cookies
			driver.manage().deleteAllCookies();
			
			//Specifiying pageLoadTimeout and Implicit wait
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//launching the URL
			//CommonMethods.openUrl(driver, env.get("URL"));
			CommonMethods.openUrl(driver, Const.URL);

			
		}
				
		@AfterSuite(alwaysRun = true)
		public void afterSuite() throws InterruptedException{
			
//			//logging out
//			LoginPage lp1 = new LoginPage(driver);
//			lp1.logOut();
//			
					
			Const.logger.info(" \n  Closing the Browser  \n");
			Thread.sleep(10000);
			driver.quit();
			
			
			
			Thread.sleep(50000);
			Const.logger.info(" \n   Report sending by email  \n");
	//		EmailUtils email = new EmailUtils();
			EmailUtils.sendHTMLReportByGMail(Const.SEND_FROM, Const.EMAIL_PASS, Const.SEND_TO, "test mail Subject", "test body");
			Const.logger.info(" \n  Email sent to clients  \n");
		}
		
		
//		@AfterSuite(alwaysRun = true)
//		public void sendEmail() {
//			Const.logger.info(" \n   Report sending by email  \n");
//			EmailUtils email = new EmailUtils();
//			email.sendHTMLReportByGMail(Const.SEND_FROM, Const.EMAIL_PASS, Const.SEND_TO, "test mail Subject", "test body");
//			Const.logger.info(" \n  Email sent to clients  \n");
//		}
	}

