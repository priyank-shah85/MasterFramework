package com.ps.pages.web;

import org.openqa.selenium.By;

import static com.ps.utils.PageActionsHelper.*;

public class LoginPage {
	
	private static final By USER_NAME_TEXT_BOX = By.name("username");
	private static final By PASSWORD_TEXT_BOX = By.name("password");
	private static final By LOGIN_BUTTON = By.xpath("//button[@type='submit']");
	
	private LoginPage setUserNameTextBox(String userName) {
		waitAndSendKeys(USER_NAME_TEXT_BOX, userName);
		return this;
	}
	private LoginPage setPassswordTextBox(String password) {
		waitAndSendKeys(PASSWORD_TEXT_BOX, password);
		return this;
	}
	
	private NavigationMenuPage setLoginButton() {
		waitAndClick(LOGIN_BUTTON);
		return new NavigationMenuPage();
	}
	
	public NavigationMenuPage loginToApplication(String userName, String password) {
		return setUserNameTextBox(userName)
			.setPassswordTextBox(password)
			.setLoginButton();
	}
	
	
}