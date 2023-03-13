package com.ps.driver.impl.web;

import org.openqa.selenium.WebDriver;

import com.ps.driver.IWebDriver;
import com.ps.driver.entity.WebDriverData;
import com.ps.driver.factory.web.remote.RemoteDriverFactory;

public class RemoteWebDriverImpl implements IWebDriver{

	@Override
	public WebDriver getDriver(WebDriverData driverData) {
		
		return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType(), driverData.getBrowserType());
	}

}
