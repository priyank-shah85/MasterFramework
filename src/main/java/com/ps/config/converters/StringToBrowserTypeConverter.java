package com.ps.config.converters;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

import com.ps.enums.BrowserType;

public class StringToBrowserTypeConverter implements Converter<BrowserType>{

	@Override
	public BrowserType convert(Method method, String browserName) {
		Map<String, BrowserType> stringBrowserTypeMap = Map.of("CHROME", BrowserType.CHROME,
				"FIREFOX", BrowserType.FIREFOX);

		return stringBrowserTypeMap.getOrDefault(browserName.toUpperCase(), BrowserType.CHROME);
	}


}
