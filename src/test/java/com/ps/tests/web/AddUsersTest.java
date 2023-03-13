package com.ps.tests.web;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.ps.pages.AdminPage;
import com.ps.pages.LoginPage;
import com.ps.tests.web.base.WebBase;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import io.github.sskorol.core.DataSupplier;

public class AddUsersTest extends WebBase{
	
	@DataSupplier(runInParallel = true)
	public Stream<AddUsersScenarioType> getData(){
		FixtureFactoryLoader.loadTemplates("com.ps.fixtures");
		return Stream.of(AddUsersScenarioType.values());
	}
	
	@Test(dataProvider = "getData")
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
