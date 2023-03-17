package com.ps.tests.api;

import java.io.IOException;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.ps.api.RegresApi;
import com.ps.api.pojos.UserDetails;
import com.ps.tests.api.testdata.UserTestData;

import io.restassured.response.Response;

public class RegresTest {
		
	@Test
	void testListUsersApi() {
		Response response = RegresApi.getUsers();
		
		int actualStatusCode = response.statusCode();
		Assertions.assertThat(actualStatusCode)
			.isEqualTo(200);
	}
	
	
	void postNewUser() throws StreamReadException, DatabindException, IOException {
		UserDetails userDetails = UserTestData.getUserDetails();
		RegresApi.postUsers(userDetails);
		
		//assertions
	}

}