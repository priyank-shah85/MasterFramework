package com.ps.driver;

import org.openqa.selenium.WebDriver;

import com.ps.driver.entity.MobileDriverData;
import com.ps.driver.factory.mobile.local.LocalMobileDriverFactory;

public class LocalMobileDriverImpl implements IMobileDriver{

	@Override
	public WebDriver getDriver(MobileDriverData driverData) {
		
		return LocalMobileDriverFactory.getDriver(driverData.getMobilePlatformType());
	}

}
