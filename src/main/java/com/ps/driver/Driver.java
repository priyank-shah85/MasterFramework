package com.ps.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;

import com.ps.driver.entity.MobileDriverData;
import com.ps.driver.entity.WebDriverData;
import com.ps.driver.factory.DriverFactory;
import com.ps.enums.MobilePlatformType;

import static com.ps.config.factory.ConfigFactory.getConfig;

public final class Driver {

	private Driver() {}

	public static void initDriverForWeb() {
		// local web, remote web
		
		if(Objects.isNull(DriverManager.getDriver())) {
			WebDriverData driverData = new WebDriverData(getConfig().browser()
					, getConfig().browserRemoteMode());
			
			WebDriver driver = DriverFactory.getDriverForWeb(getConfig().browserRunMode()).getDriver(driverData);
			DriverManager.setDriver(driver);
			loadUrl();
		}
	}
	
	public static void loadUrl() {
		DriverManager.getDriver().get(getConfig().webUrl());
	}
	
	public static void initDriverForMobile() {
		// local mobile, remote mobile
		
		if(Objects.isNull(DriverManager.getDriver())) {
			MobileDriverData driverData = new MobileDriverData(MobilePlatformType.ANDROID
					, getConfig().mobileRemoteMode());
			
			WebDriver driver = DriverFactory.getDriverForMobile(getConfig().mobileRunMode()).getDriver(driverData);
			DriverManager.setDriver(driver);
		}
	}

	public static void quiteDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}

	}

}
