package com.ps.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ps.config.factory.ConfigFactory;
import com.ps.driver.factory.web.remote.RemoteDriverFactory;

public class DemoTest {

	@Test
	public void testLogin() {
		WebDriver driver = RemoteDriverFactory.getDriver(ConfigFactory.getConfig().browserRemoteMode(),
				ConfigFactory.getConfig().browser());
		driver.get("https://google.com");

	}

}
