package com.ps.driver;

import org.openqa.selenium.WebDriver;

import com.ps.driver.entity.WebDriverData;

public interface IWebDriver {
	
	WebDriver getDriver(WebDriverData driverData);

}
