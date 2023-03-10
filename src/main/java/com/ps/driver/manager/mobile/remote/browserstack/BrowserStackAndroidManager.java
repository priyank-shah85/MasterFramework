package com.ps.driver.manager.mobile.remote.browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.ps.config.factory.BrowserStackConfigFactory;

public final class BrowserStackAndroidManager {
	
	private BrowserStackAndroidManager() {}
	
	public static WebDriver getDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("os_version", "9.0");
		capabilities.setCapability("device", "Google Pixel 3");
		capabilities.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
		capabilities.setCapability("project", "First Java Project");
		capabilities.setCapability("build", "browserstack-build-1");
		capabilities.setCapability("name", "first_test");
		capabilities.setCapability("browserstack.appium_version", "1.22.0");
		return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), capabilities);
	}


}
