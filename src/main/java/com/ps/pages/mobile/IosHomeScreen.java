package com.ps.pages.mobile;

import org.openqa.selenium.By;

import com.ps.utils.PageActionsHelper;

import io.appium.java_client.AppiumBy;

public class IosHomeScreen {

	private static final By TEXT = AppiumBy.accessibilityId("Text");

	private IosHomeScreen() {}

	public static IosHomeScreen getInstance() {
		return new IosHomeScreen();
	}

	public void clickOnATextLink() {
		PageActionsHelper.waitAndClick(TEXT, TEXT);
	}

}
