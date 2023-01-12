package com.figbytes.Utilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

	public static void sleep(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static WebDriverWait explicitWaitByVisibilityOfElement(WebDriver driver, int seconds, WebElement el) {
		Const.logger.info("Wait Time is ON");
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(el));
		return wait;
	}

	public static WebDriverWait explicitWaitByVisibilityOfAllElement(WebDriver driver, int seconds, List<WebElement> el) {
		Const.logger.info("Wait Time is ON");
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOfAllElements((el)));
		return wait;
	}
}
