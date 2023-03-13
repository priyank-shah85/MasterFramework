package com.ps.pages.enums.addusercomponent;

public enum UserRoleType {
	
	ADMIN("Admin"),
	ESS("ESS");
	
	private final String name;

	public String getName() {
		return name;
	}
	
	UserRoleType(String name) {
		this.name = name;
	}

}
