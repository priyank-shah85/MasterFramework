package com.ps.tests.web.base.users;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.EnumSource.Mode;

import com.ps.pages.web.AdminPage;
import com.ps.pages.web.LoginPage;
import com.ps.tests.web.base.WebBase;

public class AddUsersTest extends WebBase{
	
	@ParameterizedTest
	@EnumSource(value = AddUsersScenarioType.class,
				names = {"VALID"},
				mode = Mode.INCLUDE)
	public void testAddUsers(AddUsersScenarioType addUsersScenarioType) {
		
		new LoginPage().loginToApplication("Admin", "admin123")
			.navigateToAdminPage();
		
		boolean isMessageDisplayed = new AdminPage().navigateToUsersPage()
			.getUserListComponent()
			.setAddButton()
			.fillDetails(addUsersScenarioType.getUserData(), addUsersScenarioType.getPredicate());
		
		Assertions.assertThat(isMessageDisplayed)
			.withFailMessage(addUsersScenarioType.getUserData().getMessage())
			.isTrue();
	}

}
