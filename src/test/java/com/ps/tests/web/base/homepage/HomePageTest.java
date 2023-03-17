package com.ps.tests.web.base.homepage;

import org.junit.jupiter.api.Test;

import com.ps.pages.web.AdminPage;
import com.ps.pages.web.LoginPage;
import com.ps.pages.web.validator.HomePageValidator;
import com.ps.tests.web.base.WebBase;

public class HomePageTest extends WebBase{

	@Test
	void testHomePageComponents() throws InterruptedException {
		new LoginPage().loginToApplication("Admin", "admin123");
		
		Thread.sleep(3000);

		HomePageValidator homepage = new AdminPage()
				.getHomePageValidator();

		HomePageAssert.assertThat(homepage)
			.logoSourceTextContains("/web/images/orangehrm-logo.png?1672659722816")
			.isTimesheetsLinkPresent()
			.headerNameEquals("Dashboard")
			.assertAll();
	}

}
