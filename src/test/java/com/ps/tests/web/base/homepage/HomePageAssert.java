package com.ps.tests.web.base.homepage;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.SoftAssertions;

import com.ps.pages.web.validator.HomePageValidator;

public class HomePageAssert extends AbstractAssert<HomePageAssert, HomePageValidator> {

	private final SoftAssertions softAssertions;

	private HomePageAssert(HomePageValidator homePageValidator) {
		super(homePageValidator, HomePageAssert.class);
		softAssertions = new SoftAssertions();
	}

	public static HomePageAssert assertThat(HomePageValidator homePageValidator) {
		return new HomePageAssert(homePageValidator);
	}

	public HomePageAssert headerNameEquals(String expectedHeaderName) {
		String actualHeaderName = actual.getHeaderName();
		softAssertions.assertThat(actualHeaderName)
		.isEqualTo(expectedHeaderName);
		return this;
	}

	public HomePageAssert logoSourceTextContains(String expectedLogoSourceText) {
		String actualLogoSourceText = actual.getLogoSourceText();
		softAssertions.assertThat(actualLogoSourceText)
		.contains(expectedLogoSourceText);
		return this;
	}

	public HomePageAssert isTimesheetsLinkPresent() {
		softAssertions.assertThat(actual.isTimesheetsLinkPresent())
		.withFailMessage(() -> "Timesheets link not present in Quick Launch section.")
		.isTrue();
		return this;
	}

	public void assertAll() {
		softAssertions.assertAll();
	}
}
