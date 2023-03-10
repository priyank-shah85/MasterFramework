package com.ps.driver.entity;

import com.ps.enums.MobilePlatformType;
import com.ps.enums.MobileRemoteModeType;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MobileDriverData {
	
	private MobilePlatformType mobilePlatformType;
	private MobileRemoteModeType mobileRemoteModeType;

}
