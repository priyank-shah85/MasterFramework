package com.ps.fixtures.addusers.templates;

import com.github.javafaker.Faker;
import com.ps.fixtures.addusers.entity.UserData;
import com.ps.pages.web.enums.addusercomponent.StatusType;
import com.ps.pages.web.enums.addusercomponent.UserRoleType;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class AddUserTemplate implements TemplateLoader{

	@Override
	public void load() {
		Fixture.of(UserData.class).addTemplate("valid",new Rule() {{
			add("userRole",random(UserRoleType.ADMIN, UserRoleType.ESS));
			add("status",random(StatusType.ENABLED, StatusType.DISABLED));
			add("employeeName", random(new Faker().name().fullName()));
			add("userName", random(new Faker().name().username()));
			add("password", random("abcd12345"));
			add("message", "Success message is not displayed.");
		}});
		
		Fixture.of(UserData.class).addTemplate("just_employeename",new Rule() {{
			add("employeeName", new Faker().name().fullName());
			add("message", "Error message is not displayed.");
		}});
		
	}
	
	

}
