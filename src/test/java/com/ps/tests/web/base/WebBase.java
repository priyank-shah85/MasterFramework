package com.ps.tests.web.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import com.ps.driver.Driver;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

public class WebBase {

	@BeforeAll
	public static void beforeAll() {
		FixtureFactoryLoader.loadTemplates("com.ps.fixtures");
	}
	
	@BeforeEach
	public void setUp() {
		Driver.initDriverForWeb();
	}
	
	@AfterEach
	public void tearDown() {
		Driver.quitDriver();
	}

}
