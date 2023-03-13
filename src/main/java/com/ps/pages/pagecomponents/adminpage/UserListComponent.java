package com.ps.pages.pagecomponents.adminpage;

import org.openqa.selenium.By;

import com.ps.utils.PageActionsHelper;

public class UserListComponent {
	
	private static final By ADD_BUTTON = By.xpath("//button[normalize-space()='Add']");

	public AddUserComponent setAddButton() {
		PageActionsHelper.waitAndClick(ADD_BUTTON);
		return new AddUserComponent();
	}

}
