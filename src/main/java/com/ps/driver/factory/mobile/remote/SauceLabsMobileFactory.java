package com.ps.driver.factory.mobile.remote;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;

import com.ps.driver.manager.mobile.remote.saucelabs.SauceLabsAndroidManager;
import com.ps.driver.manager.mobile.remote.saucelabs.SauceLabsIosManager;
import com.ps.enums.MobilePlatformType;

public final class SauceLabsMobileFactory {

	private SauceLabsMobileFactory() {}
	
	private static final Map<MobilePlatformType, Supplier<WebDriver>>
	MAP = new EnumMap<>(MobilePlatformType.class);

	static {
		MAP.put(MobilePlatformType.ANDROID, SauceLabsAndroidManager::getDriver);
		MAP.put(MobilePlatformType.IOS, SauceLabsIosManager::getDriver);
	}

	public static WebDriver getDriver(MobilePlatformType platformType) {
		return MAP.get(platformType).get();
	}

}
