package com.ps.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ps.driver.DriverManager;

public class PageActionsHelper {
	
	private PageActionsHelper() {}
	
	public static void waitAndClick(By by) {
		new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(by));
		DriverManager.getDriver().findElement(by).click();
	}
	
	public static void waitAndSendKeys(By by, String value) {
		new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(by));
		DriverManager.getDriver().findElement(by).sendKeys(value);
	}
	
	public static String waitAndgetText(By by) {
		new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(by));
		return DriverManager.getDriver().findElement(by).getText();
	}

}
