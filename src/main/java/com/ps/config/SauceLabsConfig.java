package com.ps.config;

import java.net.URL;

import org.aeonbits.owner.Config;

import com.ps.config.converters.StringToURLConverter;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
  "file:${user.dir}/src/test/resources/sauce-labs.properties"
})
public interface SauceLabsConfig extends Config{
	
	String username();
	
	String key();
	
	@DefaultValue("saucelabsendpoint")
	@ConverterClass(StringToURLConverter.class)
	URL sauceLabsURL();
	
	

}
