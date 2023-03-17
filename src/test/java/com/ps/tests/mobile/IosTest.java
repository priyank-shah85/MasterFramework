package com.ps.tests.mobile;

import org.junit.jupiter.api.Test;

import com.ps.pages.mobile.IosHomeScreen;
import com.ps.tests.mobile.base.IosSetUp;

public class IosTest extends IosSetUp{
	
	@Test
	public void testLoginIos() {
		
		IosHomeScreen.getInstance().clickOnATextLink();
		
	}

}
