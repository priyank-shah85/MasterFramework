package com.ps.driver.manager.mobile.remote.saucelabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.ps.config.factory.SauceLabsConfigFactory;

public final class SauceLabsIosManager {
	
	private SauceLabsIosManager() {}
	
	public static WebDriver getDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("platformName", "Android");
	    capabilities.setCapability("appium:platformVersion", "11");
	    capabilities.setCapability("appium:deviceName", "Samsung.*Galaxy.*");
	    capabilities.setCapability("appium:orientation", "portrait");
	    capabilities.setCapability("appium:app", "storage:filename=<file-name>");
	    DesiredCapabilities sauceOptions = new DesiredCapabilities();
	    sauceOptions.setCapability("username", SauceLabsConfigFactory.getConfig().username());
	    sauceOptions.setCapability("accessKey", SauceLabsConfigFactory.getConfig().key());
	    capabilities.setCapability("sauce:options", sauceOptions);
		return new RemoteWebDriver(SauceLabsConfigFactory.getConfig().sauceLabsURL(), capabilities);
	}

}
