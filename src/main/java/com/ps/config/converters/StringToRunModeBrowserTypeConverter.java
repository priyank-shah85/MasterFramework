package com.ps.config.converters;

import java.lang.reflect.Method;

import org.aeonbits.owner.Converter;

import com.ps.enums.RunModeType;

public class StringToRunModeBrowserTypeConverter implements Converter<RunModeType>{

	@Override
	public RunModeType convert(Method method, String runMode) {

		return RunModeType.valueOf(runMode.toUpperCase());
	}


}
