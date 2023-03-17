package com.ps.config.factory;

import org.aeonbits.owner.ConfigCache;

import com.ps.config.ApiConfig;

public final class ApiConfigFactory {

	private ApiConfigFactory() {}

	public static ApiConfig getConfig() {
		return ConfigCache.getOrCreate(ApiConfig.class);
	}
}
