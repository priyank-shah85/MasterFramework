package com.ps.api;

import com.ps.config.factory.ApiConfigFactory;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public final class BaseRequestSpecification {
	
	private BaseRequestSpecification() {}
	
	private static final String BASE_URL = ApiConfigFactory.getConfig().apiBaseUrl();
	
	public static RequestSpecification getDefaultRequestSpec() {
		return RestAssured.given()
			.baseUri(BASE_URL);
	}

}	
