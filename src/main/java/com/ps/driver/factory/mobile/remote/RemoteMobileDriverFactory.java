package com.ps.driver.factory.mobile.remote;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;

import com.ps.enums.MobilePlatformType;
import com.ps.enums.MobileRemoteModeType;

public final class RemoteMobileDriverFactory {

	private RemoteMobileDriverFactory() {}

	private static final Map<MobileRemoteModeType, Function<MobilePlatformType, WebDriver>> MAP =
			new EnumMap<>(MobileRemoteModeType.class);
	
	static {
		MAP.put(MobileRemoteModeType.BROWSER_STACK, BrowserStackMobileFactory::getDriver);
		MAP.put(MobileRemoteModeType.SAUCE_LABS, SauceLabsMobileFactory::getDriver);
	}

	public static WebDriver getDriver(MobileRemoteModeType mobileRemoteModeType, MobilePlatformType platformType) {

		return MAP.get(mobileRemoteModeType).apply(platformType);
	}

}
