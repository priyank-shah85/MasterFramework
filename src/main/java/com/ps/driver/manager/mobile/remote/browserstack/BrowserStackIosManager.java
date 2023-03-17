package com.ps.driver.manager.mobile.remote.browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.ps.config.factory.BrowserStackConfigFactory;

import io.appium.java_client.ios.IOSDriver;

public final class BrowserStackIosManager {
	
	private BrowserStackIosManager() {}
	
	public static WebDriver getDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserstack.user", "priyankshah_QJNBcw");
		capabilities.setCapability("browserstack.key", "1DEuaekM5pW21Yw8LCyL");
		capabilities.setCapability("deviceName", "iPhone 14 Pro Max");
		capabilities.setCapability("os_version", "16");
		capabilities.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");
		capabilities.setCapability("project", "First Java Project");
		capabilities.setCapability("build", "browserstack-build-1");
		capabilities.setCapability("name", "first_test");
		capabilities.setCapability("browserstack.appium_version", "1.22.0");
		return new IOSDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), capabilities);
	}

}
