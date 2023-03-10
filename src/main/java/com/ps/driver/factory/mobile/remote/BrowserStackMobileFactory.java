package com.ps.driver.factory.mobile.remote;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;

import com.ps.driver.manager.mobile.remote.browserstack.BrowserStackAndroidManager;
import com.ps.driver.manager.mobile.remote.browserstack.BrowserStackIosManager;
import com.ps.enums.MobilePlatformType;

public final class BrowserStackMobileFactory {

	private BrowserStackMobileFactory() {}
	
	private static final Map<MobilePlatformType, Supplier<WebDriver>>
	MAP = new EnumMap<>(MobilePlatformType.class);

	static {
		MAP.put(MobilePlatformType.ANDROID, BrowserStackAndroidManager::getDriver);
		MAP.put(MobilePlatformType.IOS, BrowserStackIosManager::getDriver);
	}

	public static WebDriver getDriver(MobilePlatformType platformType) {
		return MAP.get(platformType).get();
	}

}
