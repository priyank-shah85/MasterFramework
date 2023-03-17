package com.ps.tests.api.testdata;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.ps.api.pojos.UserDetails;

public final class UserTestData {
	
	private UserTestData() {}
	
	public static UserDetails getUserDetails() throws StreamReadException, DatabindException, IOException {
		return new ObjectMapper()
				.readValue(new File(System.getProperty("user.dir") + "/src/test/resources/requests/post-user.json"), UserDetails.class)
				.setName(new Faker().name().firstName());
	}

}
