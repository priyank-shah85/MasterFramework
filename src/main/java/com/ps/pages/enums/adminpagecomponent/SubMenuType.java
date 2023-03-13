package com.ps.pages.enums.adminpagecomponent;

public enum SubMenuType {
	
	USER_MANAGEMENT("User Management ");
	
	private final String name;

	public String getName() {
		return name;
	}
	
	SubMenuType(String name) {
		this.name = name;
	}

}
