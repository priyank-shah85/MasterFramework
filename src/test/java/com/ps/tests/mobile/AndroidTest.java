package com.ps.tests.mobile;

import static com.ps.pages.mobile.enums.ViewScreenMenuItemType.WEB_VIEW;

import org.junit.jupiter.api.Test;

import com.ps.pages.mobile.MobileHomeScreen;
import com.ps.tests.mobile.base.AndroidSetUp;

public class AndroidTest extends AndroidSetUp{
	
	@Test
	public void testLoginAndroid() {
		MobileHomeScreen.getMobileHomePage()
			.navigateToViewsScreen()
			.clickOnViewScreenElement(WEB_VIEW);
	}

}