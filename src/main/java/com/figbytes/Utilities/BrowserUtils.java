package com.figbytes.Utilities;


import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserUtils {
	
	WebDriver driver ;
	public static WebDriver invokeBrowser(WebDriver driver, String browser){		
		
			switch(browser){
			case"Chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				/*System.setProperty(Const.CHROME_DRIVER, Const.CHROME_DRIVER_PATH);
				ChromeOptions options = new ChromeOptions();
				//options.addArguments("--incognito");
//				options.addArguments("--headless");
//				options.addArguments("--window-size=1920,1080");
				options.addArguments( "--disable-gpu", "--disable-extensions", "--no-sandbox", "--incognito");
//				options.addArguments("--headless", "--window-size=1920,1080", "--disable-gpu", "--disable-extensions", "--no-sandbox", "--incognito");
				DesiredCapabilities capabilities = new DesiredCapabilities();
				//for http 504 error
				//capabilities.setCapability("openDeviceTimeout", 10);

				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				options.merge(capabilities);
				//unhandled alert exception
				capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
				driver=new ChromeDriver(options); */
				driver.manage().window().maximize();
				break;
			case"Firefox":
				Const.logger.info("Running test case on firefox");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				break;
			case"MicrosoftEdge":
				Const.logger.info("Running test case on IE");
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				break;
				
			default:
				Const.logger.info("Sorry we can't found the browser");
			}		
		return driver;
	}

}
