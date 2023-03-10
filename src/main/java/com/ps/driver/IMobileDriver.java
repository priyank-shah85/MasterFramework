package com.ps.driver;

import org.openqa.selenium.WebDriver;

import com.ps.driver.entity.MobileDriverData;

public interface IMobileDriver {
	
	WebDriver getDriver(MobileDriverData driverData);

}
