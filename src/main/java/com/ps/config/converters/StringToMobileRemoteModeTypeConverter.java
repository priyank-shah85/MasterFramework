package com.ps.config.converters;

import java.lang.reflect.Method;

import org.aeonbits.owner.Converter;

import com.ps.enums.MobileRemoteModeType;

public class StringToMobileRemoteModeTypeConverter implements Converter<MobileRemoteModeType>{

	@Override
	public MobileRemoteModeType convert(Method method, String mobileRemoteMode) {
		return MobileRemoteModeType.valueOf(mobileRemoteMode.toUpperCase());
	}
	
	

}
