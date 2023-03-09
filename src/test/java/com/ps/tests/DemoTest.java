package com.ps.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void testLogin() {
		System.out.println(com.ps.config.ConfigFactory.getConfig().browser());
		
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://google.com");
		//driver.quit();
	}

}
