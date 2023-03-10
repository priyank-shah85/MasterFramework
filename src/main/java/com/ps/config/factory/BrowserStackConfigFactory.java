package com.ps.config.factory;

import org.aeonbits.owner.ConfigCache;

import com.ps.config.BrowserStackConfig;

public final class BrowserStackConfigFactory {

	private BrowserStackConfigFactory() {}

	public static BrowserStackConfig getConfig() {
		return ConfigCache.getOrCreate(BrowserStackConfig.class);
	}

}
