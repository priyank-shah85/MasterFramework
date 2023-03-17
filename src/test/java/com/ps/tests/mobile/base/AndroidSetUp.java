package com.ps.tests.mobile.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import com.ps.driver.Driver;
import com.ps.enums.MobilePlatformType;

public class AndroidSetUp {
	
	@BeforeEach
	public void setUp() {
		Driver.initDriverForMobile(MobilePlatformType.ANDROID);
	}
	
	@AfterEach
	public void tearDown() {
		Driver.quitDriver();
	}

}
