package com.ps.tests.mobile;

import static com.ps.pages.mobile.enums.ViewScreenMenuItemType.WEB_VIEW;

import com.ps.annotations.AndroidTest;
import com.ps.annotations.IosTest;
import com.ps.pages.mobile.IosHomeScreen;
import com.ps.pages.mobile.MobileHomeScreen;
import com.ps.tests.mobile.base.MobileSetUp;

class MobileTest extends MobileSetUp{
	
	@AndroidTest
	void testLoginAndroid() {
		MobileHomeScreen.getMobileHomePage()
			.navigateToViewsScreen()
			.clickOnViewScreenElement(WEB_VIEW);
	}
	
	@IosTest
	public void testLoginIos() {
		
		IosHomeScreen.getInstance().clickOnATextLink();
		
	}

}
