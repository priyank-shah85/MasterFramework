package com.ps.tests.mobile.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import com.ps.config.factory.ConfigFactory;
import com.ps.driver.Driver;
import com.ps.enums.MobilePlatformType;

public class MobileSetUp {
	
	private final MobilePlatformType mobilePlatformType = ConfigFactory.getConfig().mobilePlatformType();
	
	@BeforeEach
	public void setUp() {
		Driver.initDriverForMobile(mobilePlatformType);
	}
	
	@AfterEach
	public void tearDown() {
		Driver.quitDriver();
	}

}
