package com.ps.driver.impl.mobile;

import org.openqa.selenium.WebDriver;

import com.ps.driver.IMobileDriver;
import com.ps.driver.entity.MobileDriverData;
import com.ps.driver.factory.mobile.remote.RemoteMobileDriverFactory;

public class RemoteMobileDriverImpl implements IMobileDriver{

	@Override
	public WebDriver getDriver(MobileDriverData driverData) {
		
		return RemoteMobileDriverFactory.getDriver(driverData.getMobileRemoteModeType(), driverData.getMobilePlatformType());
	}

}
