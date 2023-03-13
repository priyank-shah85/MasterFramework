package com.ps.config;

import java.net.URL;

import org.aeonbits.owner.Config;

import com.ps.config.converters.StringToBrowserTypeConverter;
import com.ps.config.converters.StringToMobileRemoteModeTypeConverter;
import com.ps.config.converters.StringToRemoteModeBrowserTypeConverter;
import com.ps.config.converters.StringToRunModeBrowserTypeConverter;
import com.ps.config.converters.StringToURLConverter;
import com.ps.enums.BrowserRemoteModeType;
import com.ps.enums.BrowserType;
import com.ps.enums.MobileRemoteModeType;
import com.ps.enums.RunModeType;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
	"system:properties",
	"system:env",
	"file:${user.dir}/src/test/resources/config.properties",
	"file:${user.dir}/src/test/resources/staging-config.properties",
	"file:${user.dir}/src/test/resources/dev-config.properties"
})
public interface FrameworkConfig extends Config{
	
	@DefaultValue("staging")
	String environment();
	
	@Key("${environment}.webUrl")
	String webUrl();

	@DefaultValue("CHROME")
	@ConverterClass(StringToBrowserTypeConverter.class)
	BrowserType browser();

	@Key("runModeBrowser")
	@ConverterClass(StringToRunModeBrowserTypeConverter.class)
	RunModeType browserRunMode();

	@Key("browserRemoteMode")
	@ConverterClass(StringToRemoteModeBrowserTypeConverter.class)
	BrowserRemoteModeType browserRemoteMode();

	@ConverterClass(StringToURLConverter.class)
	URL seleniumGridURL();

	@ConverterClass(StringToURLConverter.class)
	URL selenoidURL();
	
	@ConverterClass(StringToURLConverter.class)
	@DefaultValue("http://127.0.0.1:4723/wd/hub")
	URL localAppiumServerURL();
	
	@Key("runModeMobile")
	@ConverterClass(StringToRunModeBrowserTypeConverter.class)
	RunModeType mobileRunMode();
	
	@Key("mobileRemoteMode")
	@ConverterClass(StringToMobileRemoteModeTypeConverter.class)
	MobileRemoteModeType mobileRemoteMode();
}
