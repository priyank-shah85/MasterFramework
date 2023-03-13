package com.ps.tests.mobile.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ps.driver.Driver;

public class MobileBase {
	
	@BeforeMethod
	public void setUp() {
		Driver.initDriverForMobile();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quiteDriver();
	}

}
