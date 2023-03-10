package com.ps.driver.manager.mobile.remote.browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.ps.config.factory.BrowserStackConfigFactory;

public final class BrowserStackIosManager {
	
	private BrowserStackIosManager() {}
	
	public static WebDriver getDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("os_version", "15");
		capabilities.setCapability("device", "iPhone 11");
		capabilities.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");
		capabilities.setCapability("project", "First Java Project");
		capabilities.setCapability("build", "browserstack-build-1");
		capabilities.setCapability("name", "first_test");
		capabilities.setCapability("browserstack.appium_version", "1.22.0");
		return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), capabilities);
	}

}
