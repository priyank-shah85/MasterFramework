package com.ps.api;

import com.ps.api.pojos.UserDetails;
import com.ps.config.factory.ApiConfigFactory;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public final class RegresApi {
	
	private RegresApi() {}
	
	private static final String LIST_USERS_ENDPOINT = ApiConfigFactory.getConfig().listUserEndpoint();
	private static final String CREATE_USERS_ENDPOINT = ApiConfigFactory.getConfig().createUserEndpoint();
	
	public static Response getUsers() {
		return BaseRequestSpecification.getDefaultRequestSpec()
				.queryParam("Page", 2)
				.get(LIST_USERS_ENDPOINT);
	}
	
	public static Response postUsers(UserDetails userDetails) {
		return BaseRequestSpecification.getDefaultRequestSpec()
				.contentType(ContentType.JSON)
				.body(userDetails)
				.post(CREATE_USERS_ENDPOINT);
	}

}
