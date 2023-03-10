package com.ps.tests;

import org.testng.annotations.BeforeMethod;

import com.ps.driver.Driver;

public class WebBase {

	@BeforeMethod
	public void setUp() {
		
		Driver.initDriver();

	}

}
