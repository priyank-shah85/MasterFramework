package com.ps.driver;

import org.openqa.selenium.WebDriver;

import com.ps.config.factory.ConfigFactory;
import com.ps.driver.entity.MobileDriverData;
import com.ps.driver.entity.WebDriverData;
import com.ps.driver.factory.DriverFactory;
import com.ps.enums.MobilePlatformType;

public final class Driver {

	private Driver() {}

	public static void initDriverForWeb() {
		// local web, remote web
		
		WebDriverData driverData = new WebDriverData(ConfigFactory.getConfig().browser()
				, ConfigFactory.getConfig().browserRemoteMode());
		
		WebDriver driver = DriverFactory.getDriverForWeb(ConfigFactory.getConfig().browserRunMode()).getDriver(driverData);
		DriverManager.setDriver(driver);
	}
	
	public static void initDriverForMobile() {
		// local mobile, remote mobile
		
		MobileDriverData driverData = new MobileDriverData(MobilePlatformType.ANDROID
				, ConfigFactory.getConfig().mobileRemoteMode());
		
		WebDriver driver = DriverFactory.getDriverForMobile(ConfigFactory.getConfig().mobileRunMode()).getDriver(driverData);
		DriverManager.setDriver(driver);
	}

	public static void quiteDriver() {
		DriverManager.getDriver().quit();

	}

}
