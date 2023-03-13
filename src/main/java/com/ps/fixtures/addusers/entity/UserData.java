package com.ps.fixtures.addusers.entity;

import com.ps.pages.enums.addusercomponent.StatusType;
import com.ps.pages.enums.addusercomponent.UserRoleType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Builder
public class UserData {
	
	private UserRoleType userRole;
	private StatusType status;
	private String employeeName;
	private String userName;
	private String password;
	private String message;
}
