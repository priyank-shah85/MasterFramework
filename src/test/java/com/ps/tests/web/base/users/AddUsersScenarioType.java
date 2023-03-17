package com.ps.tests.web.base.users;

import java.util.function.BiPredicate;

import com.ps.fixtures.addusers.entity.UserData;
import com.ps.pages.web.pagecomponents.adminpage.AddUserComponent;

import br.com.six2six.fixturefactory.Fixture;
import lombok.Getter;

@Getter
public enum AddUsersScenarioType {
	
	VALID(AddUsersPredicateFactory.getPredicate("valid"), Fixture.from(UserData.class).gimme("valid")),

	JUST_EMPLOYEE_NAME(AddUsersPredicateFactory.getPredicate("just_employeename"),
	                   Fixture.from(UserData.class).gimme("just_employeename"));

	private final BiPredicate<UserData, AddUserComponent> predicate;
	private final UserData userData;

	AddUsersScenarioType(BiPredicate<UserData, AddUserComponent> predicate, UserData userData) {
	    this.predicate = predicate;
	    this.userData = userData;
	}

}
