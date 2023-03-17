package com.ps.pages.mobile;

import org.openqa.selenium.By;

import com.ps.utils.PageActionsHelper;

import io.appium.java_client.AppiumBy;

public class MobileHomeScreen {
	
	private static final By VIEWS_ANDROID = AppiumBy.accessibilityId("Views");
	private static final By VIEWS_IOS = AppiumBy.xpath("//*[@name='Views']");
	
	private MobileHomeScreen() {}
	
	public static MobileHomeScreen getMobileHomePage() {
		return new MobileHomeScreen();
	}
	
	public MobileViewsScreen navigateToViewsScreen() {
		PageActionsHelper.waitAndClick(VIEWS_ANDROID, VIEWS_IOS);
		return new MobileViewsScreen();
	}

}
