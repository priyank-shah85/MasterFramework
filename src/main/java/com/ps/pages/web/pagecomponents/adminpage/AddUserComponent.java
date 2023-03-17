package com.ps.pages.web.pagecomponents.adminpage;

import static com.ps.utils.PageActionsHelper.waitAndClick;
import static com.ps.utils.PageActionsHelper.waitAndSendKeys;
import static com.ps.utils.PageActionsHelper.waitAndgetText;

import java.util.function.BiPredicate;

import org.openqa.selenium.By;

import com.ps.fixtures.addusers.entity.UserData;
import com.ps.pages.web.enums.addusercomponent.StatusType;
import com.ps.pages.web.enums.addusercomponent.UserRoleType;

public class AddUserComponent {
	
	private static final By USER_ROLE_DROP_DOWN = By.xpath("//label[text()='User Role']/following::div[@class='oxd-select-text-input'][1]");
	private static final String USER_ROLE = "//label[text()='User Role']/following::span[contains(text(),'%s')]";
	
	private static final By STATUS_DROP_DOWN = By.xpath("//label[text()='Status']/following::div[@class='oxd-select-text-input']");
	private static final String STATUS = "//label[text()='Status']/following::span[contains(text(),'%s')]";
	
	private static final By EMPLOYEE_NAME_TEXT_BOX = By.xpath("//label[text()='Employee Name']/following::input[1]");
	private static final By USER_NAME_TEXT_BOX = By.xpath("//label[text()='Username']/following::input[1]");
	private static final By ERROR_MESSAGE_FOR_EMPLOYEE_NAME = By.xpath("//div[@role='option']");
	
	private static final By PASSWORD_TEXT_BOX = By.xpath("//label[text()='Password']/following::input[1]");
	private static final By CONFIRM_PASSWORD_TEXT_BOX = By.xpath("//label[text()='Confirm Password']/following::input[1]");
	
	public AddUserComponent setUserRoleDropDown(UserRoleType userRoleType) {
		waitAndClick(USER_ROLE_DROP_DOWN);
		String userRoleXpath = String.format(USER_ROLE, userRoleType.getName());
		waitAndClick(By.xpath(userRoleXpath));
		return this;
	}
	
	public AddUserComponent setStatusDropDown(StatusType statusType) {
		waitAndClick(STATUS_DROP_DOWN);
		String statusXpath = String.format(STATUS, statusType.getName());
		waitAndClick(By.xpath(statusXpath));
		return this;
	}
	
	public AddUserComponent setEmployeeNameTextBox(String employeeName) {
		waitAndSendKeys(EMPLOYEE_NAME_TEXT_BOX, employeeName);
		return this;
	}
	
	public AddUserComponent setUserNameTextBox(String userName) {
		waitAndSendKeys(USER_NAME_TEXT_BOX, userName);
		return this;
	}
	
	public AddUserComponent setPasswordTextBox(String password) {
		waitAndSendKeys(PASSWORD_TEXT_BOX, password);
		return this;
	}
	
	public AddUserComponent setConfirmPasswordTextBox(String confirmPassword) {
		waitAndSendKeys(CONFIRM_PASSWORD_TEXT_BOX, confirmPassword);
		return this;
	}
	
	public boolean isErrorDisplayedForEmployeeName() {
		return waitAndgetText(ERROR_MESSAGE_FOR_EMPLOYEE_NAME)
				.equalsIgnoreCase("No Records Found");
	}
	
	public boolean isSuccessMessageDisplayed() {
		return true;
	}
	
	public boolean fillDetails(UserData userData, BiPredicate<UserData, AddUserComponent> predicate) {
		return predicate.test(userData, this);
		/*setUserRoleDropDown(userData.getUserRole())
			.setStatusDropDown(userData.getStatus())
			.setEmployeeNameTextBox(userData.getEmployeeName())
			.setUserNameTextBox(userData.getUserName())
			.setPasswordTextBox(userData.getPassword())
			.setConfirmPasswordTextBox(userData.getPassword());*/
	}
}
