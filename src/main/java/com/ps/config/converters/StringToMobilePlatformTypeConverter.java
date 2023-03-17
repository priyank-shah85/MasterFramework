package com.ps.config.converters;

import java.lang.reflect.Method;

import org.aeonbits.owner.Converter;

import com.ps.enums.MobilePlatformType;

public class StringToMobilePlatformTypeConverter implements Converter<MobilePlatformType> {

	@Override
	public MobilePlatformType convert(Method method, String platformType) {

		return MobilePlatformType.valueOf(platformType.toUpperCase());
	}
	
	

}
