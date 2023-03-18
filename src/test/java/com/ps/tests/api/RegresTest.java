package com.ps.tests.api;

import java.io.IOException;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.google.common.base.Predicate;
import com.ps.api.RegresApi;
import com.ps.api.pojos.UserDetails;
import com.ps.api.pojos.UserResponseDetails;
import com.ps.tests.api.assertwrapper.ResponseAssert;
import com.ps.tests.api.testdata.UserTestData;

import io.restassured.response.Response;

public class RegresTest {
		
	
	void testListUsersApi() {
		Response response = RegresApi.getUsers();
		
		int actualStatusCode = response.statusCode();
		Assertions.assertThat(actualStatusCode)
			.isEqualTo(200);
	}
	
	@Test
	void postNewUser() throws StreamReadException, DatabindException, IOException {
		UserDetails userDetails = UserTestData.getUserDetails();
		Response response = RegresApi.postUsers(userDetails);
		
		Predicate<Response> predicate = res -> res.jsonPath()
				.getString("job")
				.equalsIgnoreCase("owner");
		
		ResponseAssert.assertThat(response)
			.statusCodeIs(201)
			.canBeDeserializedTo(UserResponseDetails.class)
			.hasKeyWithValue("job", "Owner")
			.hasKeyWithValue(predicate)
			.hasContentType("application/json; charset=utf-8")
			.assertAll();
	}

}