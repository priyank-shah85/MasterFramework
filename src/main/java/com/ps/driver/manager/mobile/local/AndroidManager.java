package com.ps.driver.manager.mobile.local;

import org.openqa.selenium.WebDriver;

import com.ps.config.factory.ConfigFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public final class AndroidManager {
	
	private AndroidManager() {}
	
	public static WebDriver getDriver() {
		UiAutomator2Options options = new UiAutomator2Options();
	    options.setApp(System.getProperty("user.dir") + "/android-app.apk");
	    return new AndroidDriver(ConfigFactory.getConfig().localAppiumServerURL(), options);
		
		/*DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		capabilities.setCapability(MobileCapabilityType.UDID, "192.168.29.57:5555");
		capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/android-app.apk");
		
		capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/android-app.apk");
		return new AndroidDriver(ConfigFactory.getConfig().localAppiumServerURL(), capabilities);*/
	}

}
