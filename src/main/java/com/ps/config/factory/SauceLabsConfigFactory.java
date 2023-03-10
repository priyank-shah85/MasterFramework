package com.ps.config.factory;

import org.aeonbits.owner.ConfigCache;

import com.ps.config.SauceLabsConfig;

public final class SauceLabsConfigFactory {

	private SauceLabsConfigFactory() {}

	public static SauceLabsConfig getConfig() {
		return ConfigCache.getOrCreate(SauceLabsConfig.class);
	}

}
