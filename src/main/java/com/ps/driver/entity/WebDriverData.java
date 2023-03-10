package com.ps.driver.entity;

import com.ps.enums.BrowserRemoteModeType;
import com.ps.enums.BrowserType;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class WebDriverData {
	
	private BrowserType browserType;
	private BrowserRemoteModeType browserRemoteModeType;

}
