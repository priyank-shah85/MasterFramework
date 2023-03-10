package com.ps.driver.manager.web.remote.browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.ps.config.factory.BrowserStackConfigFactory;

public final class BrowserStackChromeManager {

	private BrowserStackChromeManager() {}

	public static WebDriver getDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browser", "chrome");
		capabilities.setCapability("browser_version", "latest");
		capabilities.setCapability("os", "Windows");
		capabilities.setCapability("os_version", "10");
		return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), capabilities);
	}

}
