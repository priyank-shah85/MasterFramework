package com.ps.config.converters;

import java.lang.reflect.Method;
import java.net.URL;

import org.aeonbits.owner.Converter;

import lombok.SneakyThrows;

public class StringToURLConverter implements Converter<URL>{

	@SneakyThrows
	@Override
	public URL convert(Method method, String stringURL){

		return new URL(stringURL);
	}



}
