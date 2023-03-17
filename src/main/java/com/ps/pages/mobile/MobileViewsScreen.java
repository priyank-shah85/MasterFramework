package com.ps.pages.mobile;

import org.openqa.selenium.By;

import com.ps.pages.mobile.enums.ViewScreenMenuItemType;
import com.ps.utils.PageActionsHelper;

import io.appium.java_client.AppiumBy;

public class MobileViewsScreen {
	
	private static final String VIEW_SCREEN_ELEMENT = "%s";
	
	public void clickOnViewScreenElement(ViewScreenMenuItemType element) {
		By accessibilityid = AppiumBy.accessibilityId(String.format(VIEW_SCREEN_ELEMENT, element.getName()));
		PageActionsHelper.scrollForMobile(accessibilityid);
		PageActionsHelper.waitAndClick(accessibilityid);
	}

}
