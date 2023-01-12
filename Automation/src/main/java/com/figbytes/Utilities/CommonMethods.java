package com.figbytes.Utilities;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;


public class CommonMethods {
	
	public static void openUrl(WebDriver driver, String URL){
		driver.get(URL);
		Const.logger.info("Navigating to "+URL);
	}
	
	public static void AlertDismiss(WebDriver driver){
		Alert alert = driver.switchTo().alert();
		Const.logger.info(alert.getText());
		ReportUtils.test.log(LogStatus.INFO, alert.getText());				
		alert.dismiss();
	}
	
	public static void AlertAccept(WebDriver driver) throws InterruptedException{
		
		Const.logger.info(driver.switchTo().alert().getText());	
		ReportUtils.test.log(LogStatus.INFO, driver.switchTo().alert().getText());						
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(10000);
		
	}
	
	public static void validateDataInAlert(WebDriver driver) throws InterruptedException{
		Const.logger.info("Validating data in alert pop up");
		String alert_data = driver.switchTo().alert().getText();
		if(alert_data.contains("Records not uploaded: 0")) {
			Const.logger.info("No Records uploaded");
			ReportUtils.test.log(LogStatus.INFO, "no records uploaded");
		}		
	}
	
	
	public static void clickOn(WebElement e) {
		try {
		Const.logger.info("Clicked on element:- "+e);
		ReportUtils.test.log(LogStatus.INFO, "Clicked on:- "+e);		
		Thread.sleep(1000);
		e.click();
		Thread.sleep(2000);
		}catch(Exception E){
			
		}
	}
	
	public static void JavascriptClickOn(WebDriver driver,WebElement e) {
		try {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", e);
		Const.logger.info("Clicked on element:- "+e);
		ReportUtils.test.log(LogStatus.INFO, "Clicked on:- "+e);		
		waitFor(1000);
		}catch(Exception E){
			
		}
	}
	
	public static void enterText(WebElement e,String value) throws InterruptedException{
		e.sendKeys(value.trim());
		waitFor(1000);
		Const.logger.info("Text entered:- "+value.trim());
		ReportUtils.test.log(LogStatus.INFO, "Text entered:- "+value.trim());			
		
	}
	
	
	public static String getTextFromElement(WebElement e){
		return e.getText();
	}
	
	public static void verifyTitle(WebDriver d,String expectedTitle){
		String actualtitle = d.getTitle();
		Assert.assertEquals(expectedTitle, actualtitle);
	}
	
	public static void clear(WebElement e){
		Const.logger.info("Cleared text:- " +e);
		ReportUtils.test.log(LogStatus.INFO, "Cleared text:- " +e);					
		e.clear();
	}
	
	public static void dragElement(WebDriver driver,WebElement e){
		Actions drag = new Actions(driver);
		drag.clickAndHold(e).moveByOffset(100, 100).build().perform();
	}
	
	public static void dragAndDropOn(WebDriver d,WebElement draggable , WebElement droppable){
		Actions dragNDrop = new Actions(d);
		dragNDrop.dragAndDrop(draggable, droppable).build().perform();
	}
	
	
	public static void switchToIFrame(WebDriver d,WebElement e){
		d.switchTo().frame(e);
	}
	
	public static void Resizable(WebDriver d,WebElement e){
		Actions resize = new Actions(d);
		resize.moveToElement(e).clickAndHold().moveByOffset(100, 100).release().build().perform();
	}
	
	public static void Selectable(WebDriver d,List<WebElement> li){
		Actions select = new Actions(d);
		select.keyDown(Keys.CONTROL).perform();
		
		for (WebElement webElement : li) {
			select.moveToElement(webElement).click().perform();
		}
		
		select.keyUp(Keys.CONTROL).perform();
	}
	
	
	public static void scrollTo(WebDriver d, WebElement e) throws InterruptedException {
        ((JavascriptExecutor) d).executeScript(
                "arguments[0].scrollIntoView(true);", e);
        waitFor(1000);
		Const.logger.info("Scrolled to element:- " +e);
		ReportUtils.test.log(LogStatus.INFO, "Scrolled to element:- " +e);					
    }
	
	public static void fileUpload(WebElement e, String pathOfFile){
		e.sendKeys(pathOfFile);
	}
	
	public static void select(WebElement e, String value) {
		Select s = new Select(e);	
		s.selectByVisibleText(value.trim());
		Const.logger.info("Select an element:- "+value.trim());
		ReportUtils.test.log(LogStatus.INFO, "Select an element:- "+value.trim());					
		
	}
	
	public static void explicitWaitByVisibilityOfElement(WebDriver driver, WebElement el) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(el));
	} 
	
	
	public static void waitFor(int seconds) throws InterruptedException {
		Thread.sleep(seconds);
	} 
}
